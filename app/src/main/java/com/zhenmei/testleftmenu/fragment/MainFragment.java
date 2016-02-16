package com.zhenmei.testleftmenu.fragment;


import android.view.View;

import com.zhenmei.testleftmenu.R;

/**
 * 主页面Fragment
 */
public class MainFragment extends BaseFragment {

	private View v;

	@Override
	public View initViews() {
		// TODO Auto-generated method stub
		v = View.inflate(mActivity, R.layout.fragment_main, null);
		return v;
	}

}
