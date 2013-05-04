package cn.wang.yin.utils;

import org.apache.commons.lang.StringUtils;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;
import cn.ruo.shui.xing.client.android.common.CrashHandler;

public class PersonIntence extends Application {
	private static String addr;
	private static PersonIntence instance = null;
	public boolean bd_KeyRight = true;
	public static final String strKey = "76704AFCB361E05D0738DD3B3542D0A88236ECC1";

	@Override
	public void onCreate() {
		super.onCreate();
		CrashHandler crashHandler = CrashHandler.getInstance();
		crashHandler.init(getApplicationContext());
	}

	public PersonIntence() {

	}

	public static PersonIntence getInstance() {
		return instance;
	}

	public static void setInstance(PersonIntence instance) {
		PersonIntence.instance = instance;
	}

	public static String getAddr() {
		addr = StringUtils.isNotBlank(addr) ? addr : "Î»ÖÃÎ´Öª";
		return addr;
	}

	public static void setAddr(String addr) {
		PersonIntence.addr = addr;
	}

}
