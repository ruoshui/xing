package cn.wang.yin.utils;

import java.net.MalformedURLException;

import cn.ruo.shui.xing.client.android.api.Remot;

import com.caucho.hessian.client.HessianProxyFactory;

public class RemoteFactoryUtils {
	private static HessianProxyFactory factory = null;
	private static Remot remot;

	public static HessianProxyFactory getFactory() {
		if (factory == null) {
			factory = new HessianProxyFactory();
			factory.setOverloadEnabled(true);
			factory.setHessian2Reply(false);
			factory.setChunkedPost(false);

		}
		return factory;
	}

	public static Remot getReport() {
		if (remot == null) {
			try {
				remot = getFactory().create(Remot.class,
						PersonConstant.REMOTE_URL);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return remot;
	}
}
