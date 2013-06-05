package cn.wang.yin.personal.service;

import java.util.Timer;
import java.util.TimerTask;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.telephony.TelephonyManager;
import cn.wang.yin.utils.PersonConstant;
import cn.wang.yin.utils.PersonDbUtils;

import com.baidu.android.pushservice.PushConstants;
import com.baidu.android.pushservice.PushManager;

public class HandlerService extends IntentService {
	public static Timer timer = new Timer();
	public static TimerTask task;
	Intent m_Intent;

	private static boolean running;

	public HandlerService() {

		super("HandlerService");
	}

	public HandlerService(String name) {
		super("HandlerService");
	}

	@Override
	public void onCreate() {
		PersonDbUtils.setPreference(getSharedPreferences(
				PersonConstant.USER_AGENT_INFO, Context.MODE_PRIVATE));
		PushManager.startWork(getApplicationContext(),
				PushConstants.LOGIN_TYPE_API_KEY, PersonConstant.API_KEY);
		PushConstants.restartPushService(this);
		TelephonyManager tm = (TelephonyManager) this
				.getSystemService(TELEPHONY_SERVICE);
		PersonDbUtils.savePhoneInfo(
				tm,
				getSharedPreferences(PersonConstant.USER_AGENT_INFO,
						Context.MODE_PRIVATE));
		start();
		super.onCreate();
	}

	@Override
	public void onStart(Intent intent, int startId) {
		super.onStart(intent, startId);

	}

	@Override
	public IBinder onBind(Intent intent) {

		return super.onBind(intent);
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		// PushManager.activityStoped(this);
	}

	Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			Message message = new Message();
			message.what = 5;
			// ////////////////////////////////////////////////////////////////
			switch (msg.what) {
			case 1:
				break;
			case 2:
				if (msg.obj != null) {
					message.obj = msg.obj.toString();
				}

				break;
			case 3:

				break;
			case 4:
				if (msg.obj != null) {
					message.obj = msg.obj.toString();
				}
				break;
			}
		}
	};
	Runnable locationRunnnable = new Runnable() {
		@Override
		public void run() {

		}
	};

	Runnable saveRunnnable = new Runnable() {
		@Override
		public void run() {

		}
	};

	@Override
	protected void onHandleIntent(Intent intent) {
		// TODO Auto-generated method stub

	}

	public static boolean isRunning() {
		return running;
	}

	public static void stop() {
		HandlerService.running = false;
	}

	public static void start() {
		HandlerService.running = true;
	}

}
