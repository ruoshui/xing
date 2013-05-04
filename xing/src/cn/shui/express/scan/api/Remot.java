package cn.shui.express.scan.api;

import java.io.File;
import java.util.List;

import cn.shui.express.scan.hessian.bean.Express;
import cn.shui.express.scan.hessian.bean.GpsInfo;
import cn.shui.express.scan.hessian.bean.PhoneInfo;

public interface Remot {
	// public User Hession(String name);

	public String Test(String name);

	/**
	 * �����ϴ�GPS����
	 * @param gps
	 * @return
	 */
	public boolean uploadGps(GpsInfo gps);

	/**
	 * �����ϴ�
	 * @param listGps
	 * @return
	 */
	public int uploadGps(List<GpsInfo> listGps);

	public String mm();

	public String saveFile(File file);
	/**
	 * �ϴ��û��ֻ���Ϣ
	 * @param phone
	 * @return
	 */
	public int uploadPhoneInfo(PhoneInfo phone);
	/**
	 * ��ѯ��ݵ���
	 * @param expressNum
	 * @return
	 */
	public Express scanExpress(String expressNum);
}