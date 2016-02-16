# TestLeftMenu

## 使用SlidingMenu实现侧边栏效果

**SlidingMenu下载地址：**

[https://github.com/jfeinstein10/SlidingMenu](https://github.com/jfeinstein10/SlidingMenu)

下载完毕后导入自己工程

* eclipse以library形式添加

右键自己的工程，选择Properties-->Android-->Library-->Add

* studio以Module形式添加

Import Module-->ProjectStructure-->Dependencies-->Module dependency

1. 将要添加侧边栏的Activity继承自SlidingFragmentActivity，重写onCreate方法。注意这里的onCreate方法必须用public修饰

		public class MainActivity extends SlidingFragmentActivity {
		
		    @Override
		    public void onCreate(Bundle savedInstanceState) {
		        super.onCreate(savedInstanceState);
		        setContentView(R.layout.activity_main);
		    }
		｝
		
2. 设置侧边栏

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
	    }
	    
3.添加Fragment

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