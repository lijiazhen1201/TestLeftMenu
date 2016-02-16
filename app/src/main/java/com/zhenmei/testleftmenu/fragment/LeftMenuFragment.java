package com.zhenmei.testleftmenu.fragment;

import android.view.View;

import com.zhenmei.testleftmenu.R;


/**
 * 侧边栏Fragment
 */
public class LeftMenuFragment extends BaseFragment {

	private View v;

	@Override
	public View initViews() {
		// TODO Auto-generated method stub
		v = View.inflate(mActivity, R.layout.fragment_left_menu, null);
		return v;
	}

}
