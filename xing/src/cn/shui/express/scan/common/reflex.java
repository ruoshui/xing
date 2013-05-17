package cn.shui.express.scan.common;

import java.lang.reflect.Field;

import cn.shui.express.scan.utils.MyLog;

public class reflex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		MyLog bean = new MyLog();
		Class<? extends Object> c = bean.getClass(); // 获得实体类
		Field[] fs = c.getFields(); // 获得实体类属性数组
		// 循环遍历属性数组
		for (Field f : fs) {
			String tmp = f.getName();
			System.out.println(f.getGenericType());
			System.out.println("if(jo.getString(\""+tmp+"\")!=null)");
			System.out.println("bean.set" + tmp.substring(0, 1).toUpperCase()
					+ tmp.substring(1, tmp.length())
					+ "(jo.getString(\""+tmp+"\"));");
			//DateTime.datetime(2013, 5, 7, 7, 50, 38);
			//org.apache.axis2.databinding.types.soapencoding.DateTime.
			//System.out.println(f.getName());
		}
		System.out.println(fs.length);
	}

}
