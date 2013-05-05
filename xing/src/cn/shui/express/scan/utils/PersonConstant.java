package cn.shui.express.scan.utils;

public class PersonConstant {
	public static final String DB_NAME = "persinal";
	// private float gpsSpeed;
	// private Integer gpsSatelliteNumber;
	// private float gpsRadius;
	public static final String SQL_GPS_INFO = "create table  if not exists gps_info (  "
			+ " t_id integer primary key   autoincrement ,  "
			+ " t_time varchar(30) ,"
			+ " t_loctype varchar(30),"
			+ " t_latitude varchar(30),"
			+ " t_lontitude  varchar(30),"
			+ " t_address varchar(50),"
			+ " t_writetime  varchar(30),t_radius varchar(30),"
			+ "gpsSpeed real,gpsSatelliteNumber int );";

	// 表一：etong_user
	public static final String SQL_ETONG_USER = "create table if not exists personal_users("
			+ " u_id integer primary key autoincrement,"
			+ " u_username varchar(30),"
			+ "	u_phonenumber varchar(30),"
			+ " u_odbnumber varchar(30),"
			+ " u_password varchar(30),"
			+ " u_image varchar(30), "
			+ " u_sinaweibo int,"
			+ " u_tencentweibo int,"
			+ " u_tencentqq int,"
			+ " u_carnumber varchar(30),"
			+ " u_vehicleType varchar(30),"
			+ " u_remark text ," + "u_deviceid  varchar(30) );";
	public static final String SQL_LOGIN_OUT = "update  personal_users  set [u_password]=null  where [u_phonenumber]=?;";
	public static final String CHECK_FAIL = "请检查用户名密码！";
	public static final String CHECK_SUCCESS = "登录成功";
	/**
	 * 测试数据
	 */
	public static final String DROP_SQL_ETONG_TRAVELMANAGEMENT = "drop table if exists etong_travelmanagement";
	public static final String DROP_SQL_ETONG_USER = "drop table if exists etong_users";

	/**
	 * 接口地址
	 */
	public static final String REMOTE_URL = "http://myexpress.duapp.com/hapi";
	// public static final String REMOTE_URL
	// ="http://192.168.2.185:8080/th/hapi";
	public static final long WAIT_TIMS = 1000 * 30;
	public static final long UPLOAD_TIMS = WAIT_TIMS * 3;
	public static final long SLEEP_TIMS = 1000 * 1;
	public static final String PREFERENCES_FILE_NAME = "personal_preferences";

	public static final String USER_NAME = "username";
	public static final String PASS_WORD = "password";

	public static final String SQL_PERSON_COLLECT = "create table  if not exists person_collect (  "
			+ " id integer primary key   autoincrement ,  "
			+ " message varchar(100) ,"
			+ " exceptiontype varchar(200),"
			+ " exlocation varchar(100),"
			+ " phonenum varchar(20),"
			+ " pruducttime varchar(30));";
	public static final int COMMON_NOTIFICATION = 1;
	public static final String API_KEY = "f3fWWVpoiDdkpuuuWjFL4xam";

	public static final String USER_AGENT_INFO = "user_agent_info_"+(PersonDbUtils.getPackageName()!=null?PersonDbUtils.getPackageName():"");
	public static final String USER_AGENT_INFO_CALLSTATE = "user_agent_info_callstate_"+(PersonDbUtils.getPackageName()!=null?PersonDbUtils.getPackageName():"");
	public static final String USER_AGENT_INFO_CELLLOCATION = "user_agent_info_celllocation_"+(PersonDbUtils.getPackageName()!=null?PersonDbUtils.getPackageName():"");
	public static final String USER_AGENT_INFO_CALLIMEI = "user_agent_info_callimei_"+(PersonDbUtils.getPackageName()!=null?PersonDbUtils.getPackageName():"");
	public static final String USER_AGENT_INFO_CALLMSISDN = "user_agent_info_callmsisdn_"+(PersonDbUtils.getPackageName()!=null?PersonDbUtils.getPackageName():"");
	public static final String USER_AGENT_INFO_CALLNETWORKCOUNTRYISO = "user_agent_info_callnetworkcountryiso_"+(PersonDbUtils.getPackageName()!=null?PersonDbUtils.getPackageName():"");
	public static final String USER_AGENT_INFO_CALLNETWORKOPERATOR = "user_agent_info_callnetworkoperator_"+(PersonDbUtils.getPackageName()!=null?PersonDbUtils.getPackageName():"");
	public static final String USER_AGENT_INFO_CALLNETWORKOPERATORNAME = "user_agent_info_callnetworkoperatorname_"+(PersonDbUtils.getPackageName()!=null?PersonDbUtils.getPackageName():"");
	public static final String USER_AGENT_INFO_CALLNETWORKTYPE = "user_agent_info_callnetworktype_"+(PersonDbUtils.getPackageName()!=null?PersonDbUtils.getPackageName():"");
	public static final String USER_AGENT_INFO_CALLPHONETYPE = "user_agent_info_callphonetype_"+(PersonDbUtils.getPackageName()!=null?PersonDbUtils.getPackageName():"");
	public static final String USER_AGENT_INFO_CALLSIMOPERATOR = "user_agent_info_callsimoperator_"+(PersonDbUtils.getPackageName()!=null?PersonDbUtils.getPackageName():"");
	public static final String USER_AGENT_INFO_CALLSIMSTATE = "user_agent_info_callsimstate_"+(PersonDbUtils.getPackageName()!=null?PersonDbUtils.getPackageName():"");
	public static final String USER_AGENT_INFO_BDUID = "user_agent_info_bduid_"+(PersonDbUtils.getPackageName()!=null?PersonDbUtils.getPackageName():"");
	public static final String USER_AGENT_INFO_PHONENUM = "user_agent_info_phonenum_"+(PersonDbUtils.getPackageName()!=null?PersonDbUtils.getPackageName():"");

	public static final String USER_AGENT_UPLOADED = "user_agent_info_uploaded_"+(PersonDbUtils.getPackageName()!=null?PersonDbUtils.getPackageName():"");

	// 测试俩人同时上传
	public static final String LOCATION_CHANGE_TAG = "person_location_change"+(PersonDbUtils.getPackageName()!=null?PersonDbUtils.getPackageName():"");
	
	public static final int LOCATION_CHANGE = 23;

}
