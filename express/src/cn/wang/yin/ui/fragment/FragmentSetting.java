package cn.wang.yin.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cn.shui.chacha.express.R;

public class FragmentSetting extends Fragment {

	public FragmentSetting() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		if (container == null) {
			// Currently in a layout without a container, so no
			// reason to create our view.
			return null;
		}

		LayoutInflater myInflater = (LayoutInflater) getActivity()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View layout = myInflater.inflate(R.layout.frag_setting, container,
				false);

		return layout;
	}

}
