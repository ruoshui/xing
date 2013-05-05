package cn.shui.express.scan.common;

import org.apache.commons.lang.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
import cn.shui.express.scan.encode.EncodeActivity;
import cn.shui.express.scan.utils.MyLog;
import cn.shui.express.scan.utils.PersonConstant;
import cn.shui.express.scan.utils.PersonDbUtils;

import com.baidu.android.pushservice.PushConstants;

/**
 * Push消息处理receiver
 */
public class PushMessageReceiver extends BroadcastReceiver {
	/** TAG to Log */
	public static final String TAG = PushMessageReceiver.class.getSimpleName();

	AlertDialog.Builder builder;

	/**
	 * 
	 * 
	 * @param context
	 *            Context
	 * @param intent
	 *            接收的intent
	 */
	@Override
	public void onReceive(final Context context, Intent intent) {

		Log.d(TAG, ">>> Receive intent: \r\n" + intent);

		if (intent.getAction().equals(PushConstants.ACTION_MESSAGE)) {

		} else if (intent.getAction().equals(PushConstants.ACTION_RECEIVE)) {
			// 获取方法
			final String method = intent
					.getStringExtra(PushConstants.EXTRA_METHOD);
			// 方法返回错误�?您需要恰当处理�?比如，方法为bind时，若失败，�?��重新bind,即重新调用startWork
			final int errorCode = intent
					.getIntExtra(PushConstants.EXTRA_ERROR_CODE,
							PushConstants.ERROR_SUCCESS);
			// 返回内容
			final String content = new String(
					intent.getByteArrayExtra(PushConstants.EXTRA_CONTENT));

			// 用户在此自定义处理消�?以下代码为demo界面展示�?

			Log.d(TAG, "onMessage: method : " + method);
			Log.d(TAG, "onMessage: result : " + errorCode);
			Log.d(TAG, "onMessage: content : " + content);
			JSONObject jsonContent;
			try {
				jsonContent = new JSONObject(content);
				JSONObject params = jsonContent
						.getJSONObject("response_params");
				String userid = params.getString("user_id");
				PersonDbUtils.init(context.getApplicationContext(), context
						.getSharedPreferences(PersonConstant.USER_AGENT_INFO,
								Context.MODE_PRIVATE));
				if (StringUtils.isNotBlank(userid)) {
					PersonDbUtils.putValue(
							PersonConstant.USER_AGENT_INFO_BDUID, userid,
							PersonDbUtils.getPreference());
					MyLog.i(TAG, userid);
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// context.startActivity(responseIntent);

			// 可�?。�?知用户点击事件处�?
		} else if (intent.getAction().equals(
				PushConstants.ACTION_RECEIVER_NOTIFICATION_CLICK)) {
			
			Log.d(TAG, "intent=" + intent.toUri(0));
			Intent aIntent = new Intent();
			aIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			aIntent.setClass(context, EncodeActivity.class);
			String title = intent
					.getStringExtra(PushConstants.EXTRA_NOTIFICATION_TITLE);
			aIntent.putExtra(PushConstants.EXTRA_NOTIFICATION_TITLE, title);
			String content = intent
					.getStringExtra(PushConstants.EXTRA_NOTIFICATION_CONTENT);
			aIntent.putExtra(PushConstants.EXTRA_NOTIFICATION_CONTENT, content);
			MyLog.i(TAG, "接收到推送消息" + "\t" + intent.getDataString() + "\t"
					+ intent.getAction()+"\t"+title+"\t"+content);
			context.startActivity(aIntent);

		}

	}

}
