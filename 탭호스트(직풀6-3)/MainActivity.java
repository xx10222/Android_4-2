package com.cookandroid.tabhost6_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.text.style.TabStopSpan;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("TAG1").setIndicator("강아지");
        tabSpec1.setContent(R.id.imageView1);
        tabHost.addTab(tabSpec1);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("TAG2").setIndicator("고양이");
        tabSpec2.setContent(R.id.imageView2);
        tabHost.addTab(tabSpec2);

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("TAG3").setIndicator("토끼");
        tabSpec3.setContent(R.id.imageView3);
        tabHost.addTab(tabSpec3);

        TabHost.TabSpec tabSpec4 = tabHost.newTabSpec("TAG4").setIndicator("말");
        tabSpec4.setContent(R.id.imageView4);
        tabHost.addTab(tabSpec4);

        tabHost.setCurrentTab(0);
    }
}