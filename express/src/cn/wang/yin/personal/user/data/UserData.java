package cn.wang.yin.personal.user.data;

import java.util.ArrayList;
import java.util.List;

import cn.shui.express.scan.hessian.bean.Express;

public class UserData {

	private List<Express> lep;
	public static Express express;
	/**
	 * Ӧ�ñ���װ���ֻ����룬���û���¼���ֻ�����û�й�ϵ
	 */
	private String userPhoneNum;

	// private LocationInfo locationInfo;
	private boolean runing = false;

	public UserData() {
		try {
			this.lep = new ArrayList();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean isRuning() {
		return runing;
	}

	public void setRuning(boolean runing) {
		this.runing = runing;
	}

	public String getUserPhoneNum() {
		return userPhoneNum;
	}

	public void setUserPhoneNum(String userPhoneNum) {
		this.userPhoneNum = userPhoneNum;
	}

	public List<Express> getLep() {
		return lep;
	}

	public void setLep(List<Express> lep) {
		this.lep = lep;
	}

	public static Express getExpress() {
		return express;
	}

	public static void setExpress(Express express) {
		UserData.express = express;
	}

}
