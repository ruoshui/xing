package cn.wang.yin.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.shui.chacha.express.R;
import cn.shui.express.scan.hessian.bean.Express;
import cn.shui.express.scan.hessian.bean.ExpressData;
import cn.wang.yin.hessian.api.Remot;
import cn.wang.yin.utils.PersonConstant;
import cn.wang.yin.utils.PersonDbUtils;
import cn.wang.yin.utils.PersonStringUtils;
import cn.wang.yin.utils.RemoteFactoryUtils;

import com.caucho.hessian.client.HessianProxyFactory;

public class FragmentExpress extends Fragment {
	EditText editText1;
	Button button1;
	String num = "";
	private ProgressDialog p_dialog;
	LinearLayout express_list;
	public static final int SUCCESS = 101;
	public static final int FAIL = 102;
	List<String> all = new ArrayList();
	private static Express tmp = null;

	public FragmentExpress() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		if (container == null) {
			return null;
		}

		LayoutInflater myInflater = (LayoutInflater) getActivity()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View layout = myInflater.inflate(R.layout.express, container, false);

		// layout.setContentView(R.layout.express);
		editText1 = (EditText) layout.findViewById(R.id.editText1);
		button1 = (Button) layout.findViewById(R.id.button1);
		express_list = (LinearLayout) layout.findViewById(R.id.express_list);
		p_dialog = new ProgressDialog(getActivity());
		p_dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
		p_dialog.setMessage("正在查询");
		p_dialog.setTitle("请稍后");

		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String express_num = editText1.getText().toString();
				if (StringUtils.isNotBlank(express_num)) {
					num = express_num;
					p_dialog.show();
					new Thread(submitRunnable).start();
				}
			}
		});

		return layout;
	}

	public void fresh(Set<ExpressData> datas) {
		LayoutInflater inflater = (LayoutInflater) getActivity()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		express_list.removeAllViews();
		for (ExpressData bean : datas) {
			View child = inflater.inflate(R.layout.express_sinagle, null);
			TextView textView1 = (TextView) child.findViewById(R.id.textView1);
			ImageView imageView1 = (ImageView) child
					.findViewById(R.id.imageView1);
			TextView textView2 = (TextView) child.findViewById(R.id.textView2);
			textView1.setText(""
					+ PersonStringUtils.pareDateToString(bean.getFtime()));
			textView2.setText("" + bean.getContext());
			express_list.addView(child);
		}

	}

	@Override
	public void onPause() {

		super.onPause();
	}

	Handler hand = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			if (p_dialog != null) {
				p_dialog.dismiss();
			}
			switch (msg.what) {
			case SUCCESS: {
				if (msg.obj != null) {
					// Set<ExpressData> datas = (Set<ExpressData>) msg.obj;
					Express bean = (Express) msg.obj;
					tmp = bean;
					fresh(bean.getExpressDatas());
					new Thread(saveRunnable).start();
				}
			}
				break;
			case FAIL: {
				AlertDialog dialog = new AlertDialog.Builder(getActivity())
						.setTitle("锟斤拷示")
						.setMessage("锟斤拷时锟斤拷锟斤拷锟斤拷锟皆ｏ拷")
						.setPositiveButton("确锟斤拷",
								new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										dialog.dismiss();
									}
								}).create();
				dialog.show();
			}
				break;
			}

			super.handleMessage(msg);
		}

	};

	Runnable saveRunnable = new Runnable() {

		@Override
		public void run() {
			if (tmp != null) {
				Log.e("save", "锟斤拷始");
				SQLiteDatabase read = PersonDbUtils.getInstance()
						.getReadableDatabase();
				Cursor cur = read.query(true, "express", new String[] { "id" },
						"nu=?", new String[] { tmp.getNu() }, null, null, null,
						null);
				try {

					if (cur.moveToFirst()) {
						int id = cur.getInt(0);
						if (read != null) {
							read.close();
						}
						SQLiteDatabase write = PersonDbUtils.getInstance()
								.getWritableDatabase();
						ContentValues args = new ContentValues();
						// args.put("id", id);
						args.put("nu", tmp.getNu());
						args.put("updatetime", PersonStringUtils
								.pareDateToString(tmp.getUpdatetime()));
						write.update("express", args, "id" + "=" + id, null);
						if (write != null) {
							write.close();
						}
					} else {
						SQLiteDatabase write = PersonDbUtils.getInstance()
								.getWritableDatabase();
						ContentValues initialValues = new ContentValues();
						initialValues.put("nu", tmp.getNu());
						initialValues.put("updatetime", PersonStringUtils
								.pareDateToString(tmp.getUpdatetime()));
						write.insert("express", null, initialValues);
						if (write != null) {
							write.close();
						}
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (read != null) {
						read.close();
					}
				}

			}
		}
	};
	Runnable submitRunnable = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub

			Message msg = new Message();
			msg.what = SUCCESS;
			Remot remot = null;
			try {
				// remot = RemoteFactoryUtils.getReport();
				HessianProxyFactory factory = RemoteFactoryUtils.getFactory();
				remot = factory.create(Remot.class, PersonConstant.REMOTE_URL);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				msg.what = FAIL;
				e.printStackTrace();
			}
			try {
				// 锟斤拷询锟斤拷锟斤拷锟斤拷偷牡锟街�
				// http://www.kuaidi100.com/autonumber/auto?num=5045205409800

				Express bean = remot.scanExpress(num);
				// Set<ExpressData> datas = bean.getExpressDatas();
				msg.obj = bean;
			} catch (Exception e) {
				msg.what = FAIL;
				e.printStackTrace();
			}
			hand.sendMessage(msg);
		}

	};

	Runnable scanrunnable = new Runnable() {
		@Override
		public void run() {
		}
	};
}
