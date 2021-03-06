package cn.shui.express.scan.common;

//--------------------------------- IMPORTS ------------------------------------
import cn.shui.express.scan.utils.PersonConstant;
import cn.shui.express.scan.utils.PersonDbUtils;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootupReceiver extends BroadcastReceiver {

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.content.BroadcastReceiver
	 * #onReceive(android.content.Context, android.content.Intent)
	 */
	@Override
	public void onReceive(Context context, Intent intent) {
		PersonDbUtils.init(context.getApplicationContext(), context
				.getSharedPreferences(PersonConstant.USER_AGENT_INFO,
						Context.MODE_PRIVATE));
		Intent inten = new Intent(context, HandlerService.class);
		inten.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startService(inten);

	}

}
