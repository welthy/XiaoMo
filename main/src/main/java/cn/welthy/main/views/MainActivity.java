package cn.welthy.main.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.welthy.main.R;
import cn.welthy.main.adapters.MainBannerAdapter;
import cn.welthy.main.adapters.MainVPAdapter;
import cn.welthy.main.views.fragments.AndroidFragment;
import cn.welthy.main.views.fragments.JavaFragment;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.banner)
    Banner mBanner;
    @BindView(R.id.vp_module)
    ViewPager mVPModule;
    @BindView(R.id.tablayout_module)
    TabLayout mTabLayout;

    private List<Bitmap> mBannerBitmaps;
    private MainBannerAdapter mMainBannerAdapter;
    private List<String> tabs;
    private List<Fragment> mFragments;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        initEvent();
    }

    private void initView() {
        ButterKnife.bind(this);
    }

    private void initData() {
        mBannerBitmaps = new ArrayList<>();
        mBannerBitmaps.add(BitmapFactory.decodeResource(getResources(), R.mipmap.zjn02));
        mBannerBitmaps.add(BitmapFactory.decodeResource(getResources(), R.mipmap.zjn03));
        mBannerBitmaps.add(BitmapFactory.decodeResource(getResources(), R.mipmap.zjn04));

        tabs = new ArrayList<>();
        tabs.add("Android");
        tabs.add("Java");
        tabs.add("Kotlin");
        tabs.add("Iot");

        mFragments = new ArrayList<>();
        mFragments.add(new AndroidFragment());
        mFragments.add(new JavaFragment());
    }

    private void initEvent() {
        mMainBannerAdapter = new MainBannerAdapter(mBannerBitmaps);
        mBanner.setAdapter(mMainBannerAdapter).setIndicator(new CircleIndicator(this));

//        for (int i=0;i<tabs.size(); i++) {
//            mTabLayout.addTab(mTabLayout.newTab().setText(tabs.get(i)));
//        }
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);

        MainVPAdapter vpAdapter = new MainVPAdapter(getSupportFragmentManager(),0,mFragments,tabs);
        mVPModule.setAdapter(vpAdapter);
        mVPModule.setCurrentItem(0);
    }
}