package cn.shui.express.scan.common;

/**
 * 瀹炴椂杞﹀喌
 * 
 * @author itte_wangyin
 * 
 */
public class VehicleMechine {
	public String obdtime = "--";// OBD鏃堕棿 鑼冨洿锛�
	public String speed = "--";// 褰撳墠閫熷害 鑼冨洿锛�-255
	public String voltage = "--";// 鐢靛帇 鑼冨洿锛�1.5-15.0
	public String errcount = "--";// 鏁呴殰鐮佷釜鏁�鑼冨洿锛歯ull
	public String errstatus = "--";// 鏁呴殰鐘舵� 鑼冨洿锛歯ull
	public String watertmp = "--";// 姘存俯 鑼冨洿锛�40-110
	public String enginespd = "--";// 鍙戝姩鏈鸿浆閫�鑼冨洿锛�-5000
	public String jdjqmwz = "--";// 缁濆鑺傛皵闂ㄤ綅缃�鑼冨洿锛�-100
	public String errinfo = "--";// 閿欒淇℃伅 鑼冨洿锛�
	public String oil = "--";// 娌圭娑蹭綅 鑼冨洿锛�-100
	public String mileage = "--";// 褰撳墠閲岀▼ 鑼冨洿锛�
	public String period = "--";// 淇濆吇鍛ㄦ湡 鑼冨洿锛�
	public String nextmileage = "--";// 涓嬫淇濆吇閲岀▼ 鑼冨洿锛�
	public String avgoile = "--";// 鐧惧叕閲屽钩鍧囨补鑰�鑼冨洿锛�-50
	public String totleMile = "--";// 鎬昏椹堕噷绋�鑼冨洿锛歯ull
	public String totleUserOile = "--";// 鎬绘补鑰�鑼冨洿锛歯ull
	// 鏁呴殰鍚庤椹堕噷绋�
	// 鍙戝姩鏈鸿繍琛屾椂闂�
	// 杞﹀鐜娓╁害
	// 杞﹀澶ф皵鍘嬪姏
	// 杩涙皵鍘嬪姏
	// 杩涙皵娓╁害
	// 鐕冩补鍘嬪姏绌烘皵娴侀噺
	// 娌归棬韪╄笍浣嶇疆
	// 鍙戝姩鏈鸿礋杞�
	// 闀挎湡鐕冩补淇
	// 鐐圭伀鎻愬墠瑙�
	public String	eckqzt="--";//浜屾绌烘皵鐘舵�
	public String	ycgqwz="--";//姘т紶鎰熷櫒浣嶇疆
	public String	fdjqdsj="--";//鍙戝姩鏈哄惎鍔ㄦ椂闂达紙绉掞級
	public String	gzlc="--";//鏁呴殰鎸囩ず鐏縺娲荤姸鎬佷笅鐨勮椹堕噷绋�
	public String	qgygyl="--";//鐩稿浜庢绠＄湡绌哄害鐨勬补杞ㄥ帇鍔涳紙鍗冨笗锛�
	public String	dqygyl="--";//鐩稿浜庡ぇ姘斿帇鍔涚殑娌硅建鍘嬪姏锛堝崈甯曪級
	public String	fqxhkd="--";//搴熸皵鍐嶅惊鐜郴缁熸寚浠ゅ紑搴︼紙%锛�
	public String	egrkdwc="--";//EGR寮�害璇樊
	public String	zfcxkz="--";//钂稿彂鍐叉礂鎺у埗鎸囦护
	public String	zfxtzqyl="--";//钂稿彂绯荤粺鐨勮捀姹藉帇鍔�
	public String	dqy="--";//澶ф皵鍘嬶紙鍗冨笗锛�
	public String	xdjqmwz="--";//鐩稿鑺傛皵闂ㄤ綅缃�
	public String	hjkqwd="--";//鐜绌烘皵娓╁害
	public String	jdjqmb="--";//缁濆杩涙皵闂ㄤ綅缃瓸
	public String	jdjqmc="--";//缁濆杩涙皵闂ㄤ綅缃瓹
	public String	jstbd="--";//鍔犻�韪忔澘浣嶇疆D
	public String	jstbe="--";//鍔犻�韪忔澘浣嶇疆E
	public String	jstbf="--";//鍔犻�韪忔澘浣嶇疆F
	public String	jqmkzq="--";//鑺傛皵闂ㄦ墽琛屽櫒鎺у埗鎸囦护
	public String	gzdyxsj="--";//鏁呴殰鎸囩ず鐏浜庢縺娲荤姸鎬佷笅鐨勫彂鍔ㄦ満杩愯浆鏃堕棿
	public String	ygjdylc1="--";//娌硅建缁濆鍘嬪姏C1
	public String	jstbc2="--";//鍔犻�韪忔澘鐩稿浣嶇疆C2
	public String	fdjjywd="--";//鍙戝姩鏈烘満娌规俯搴�

	public String getObdtime() {
		return obdtime;
	}

	public void setObdtime(String obdtime) {
		this.obdtime = obdtime;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getVoltage() {
		return voltage;
	}

	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}

	public String getErrcount() {
		return errcount;
	}

	public void setErrcount(String errcount) {
		this.errcount = errcount;
	}

	public String getErrstatus() {
		return errstatus;
	}

	public void setErrstatus(String errstatus) {
		this.errstatus = errstatus;
	}

	public String getWatertmp() {
		return watertmp;
	}

	public void setWatertmp(String watertmp) {
		this.watertmp = watertmp;
	}

	public String getEnginespd() {
		return enginespd;
	}

	public void setEnginespd(String enginespd) {
		this.enginespd = enginespd;
	}

	public String getJdjqmwz() {
		return jdjqmwz;
	}

	public void setJdjqmwz(String jdjqmwz) {
		this.jdjqmwz = jdjqmwz;
	}

	public String getErrinfo() {
		return errinfo;
	}

	public void setErrinfo(String errinfo) {
		this.errinfo = errinfo;
	}

	public String getOil() {
		return oil;
	}

	public void setOil(String oil) {
		this.oil = oil;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getNextmileage() {
		return nextmileage;
	}

	public void setNextmileage(String nextmileage) {
		this.nextmileage = nextmileage;
	}

	public String getAvgoile() {
		return avgoile;
	}

	public void setAvgoile(String avgoile) {
		this.avgoile = avgoile;
	}

	public String getTotleMile() {
		return totleMile;
	}

	public void setTotleMile(String totleMile) {
		this.totleMile = totleMile;
	}

	public String getTotleUserOile() {
		return totleUserOile;
	}

	public void setTotleUserOile(String totleUserOile) {
		this.totleUserOile = totleUserOile;
	}

	public String getEckqzt() {
		return eckqzt;
	}

	public void setEckqzt(String eckqzt) {
		this.eckqzt = eckqzt;
	}

	public String getYcgqwz() {
		return ycgqwz;
	}

	public void setYcgqwz(String ycgqwz) {
		this.ycgqwz = ycgqwz;
	}

	public String getFdjqdsj() {
		return fdjqdsj;
	}

	public void setFdjqdsj(String fdjqdsj) {
		this.fdjqdsj = fdjqdsj;
	}

	public String getGzlc() {
		return gzlc;
	}

	public void setGzlc(String gzlc) {
		this.gzlc = gzlc;
	}

	public String getQgygyl() {
		return qgygyl;
	}

	public void setQgygyl(String qgygyl) {
		this.qgygyl = qgygyl;
	}

	public String getDqygyl() {
		return dqygyl;
	}

	public void setDqygyl(String dqygyl) {
		this.dqygyl = dqygyl;
	}

	public String getFqxhkd() {
		return fqxhkd;
	}

	public void setFqxhkd(String fqxhkd) {
		this.fqxhkd = fqxhkd;
	}

	public String getEgrkdwc() {
		return egrkdwc;
	}

	public void setEgrkdwc(String egrkdwc) {
		this.egrkdwc = egrkdwc;
	}

	public String getZfcxkz() {
		return zfcxkz;
	}

	public void setZfcxkz(String zfcxkz) {
		this.zfcxkz = zfcxkz;
	}

	public String getZfxtzqyl() {
		return zfxtzqyl;
	}

	public void setZfxtzqyl(String zfxtzqyl) {
		this.zfxtzqyl = zfxtzqyl;
	}

	public String getDqy() {
		return dqy;
	}

	public void setDqy(String dqy) {
		this.dqy = dqy;
	}

	public String getXdjqmwz() {
		return xdjqmwz;
	}

	public void setXdjqmwz(String xdjqmwz) {
		this.xdjqmwz = xdjqmwz;
	}

	public String getHjkqwd() {
		return hjkqwd;
	}

	public void setHjkqwd(String hjkqwd) {
		this.hjkqwd = hjkqwd;
	}

	public String getJdjqmb() {
		return jdjqmb;
	}

	public void setJdjqmb(String jdjqmb) {
		this.jdjqmb = jdjqmb;
	}

	public String getJdjqmc() {
		return jdjqmc;
	}

	public void setJdjqmc(String jdjqmc) {
		this.jdjqmc = jdjqmc;
	}

	public String getJstbd() {
		return jstbd;
	}

	public void setJstbd(String jstbd) {
		this.jstbd = jstbd;
	}

	public String getJstbe() {
		return jstbe;
	}

	public void setJstbe(String jstbe) {
		this.jstbe = jstbe;
	}

	public String getJstbf() {
		return jstbf;
	}

	public void setJstbf(String jstbf) {
		this.jstbf = jstbf;
	}

	public String getJqmkzq() {
		return jqmkzq;
	}

	public void setJqmkzq(String jqmkzq) {
		this.jqmkzq = jqmkzq;
	}

	public String getGzdyxsj() {
		return gzdyxsj;
	}

	public void setGzdyxsj(String gzdyxsj) {
		this.gzdyxsj = gzdyxsj;
	}

	public String getYgjdylc1() {
		return ygjdylc1;
	}

	public void setYgjdylc1(String ygjdylc1) {
		this.ygjdylc1 = ygjdylc1;
	}

	public String getJstbc2() {
		return jstbc2;
	}

	public void setJstbc2(String jstbc2) {
		this.jstbc2 = jstbc2;
	}

	public String getFdjjywd() {
		return fdjjywd;
	}

	public void setFdjjywd(String fdjjywd) {
		this.fdjjywd = fdjjywd;
	}

}
