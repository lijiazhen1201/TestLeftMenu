package com.zhenmei.testleftmenu.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;
import com.zhenmei.testleftmenu.R;
import com.zhenmei.testleftmenu.fragment.LeftMenuFragment;
import com.zhenmei.testleftmenu.fragment.MainFragment;

public class MainActivity extends SlidingFragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setLeftMenu();
    }

    /**
     * 设置左侧边栏
     */
    private void setLeftMenu() {
        // 设置侧边栏的布局
        setBehindContentView(R.layout.left_menu);
        // 获取侧边栏的对象
        SlidingMenu left_menu = getSlidingMenu();
        // 设置全屏触摸可拖拉
        left_menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        // 设置侧边栏的模式，默认只显示左边栏，有三个待选参数
        // SlidingMenu.LEFT显示左边
        // SlidingMenu.RIGHT显示右边
        // SlidingMenu.LEFT_RIGHT左右都显示
        // left_menu.setMode(SlidingMenu.LEFT_RIGHT);
        // 设置右侧边栏的布局
        // left_menu.setSecondaryMenu(R.layout.left_menu);
        // 设置预留屏幕的宽度
        left_menu.setBehindOffset(300);

        setFragment();
    }

    /**
     * 设置Fragment
     */
    private void setFragment(){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fl_fragment, new MainFragment());
        ft.replace(R.id.fl_left_menu, new LeftMenuFragment());
        ft.commit();
    }

}
