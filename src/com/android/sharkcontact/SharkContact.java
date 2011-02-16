package com.android.sharkcontact;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class SharkContact extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        createTabs();
    }
    
    public void createTabs() {
        createPhoneTab();
        createCallLogTab();
        createFavoritesTab();

        getTabHost().setCurrentTab(0); //设置启动时默认激活的标签页
    }

    public void createPhoneTab() {
        Intent intent = new Intent().setClass(this, Phone.class);
        addTabAsIntent("phone", getString(R.string.phone_tab_title), R.drawable.ic_tab_artists, intent);
    }

    public void createCallLogTab() {
        Intent intent = new Intent().setClass(this, CallLogs.class);
        addTabAsIntent("call_log", getString(R.string.call_logs_tab_title), R.drawable.ic_tab_artists, intent);
    }

    public void createFavoritesTab() {
        Intent intent = new Intent().setClass(this, Favorites.class);
        addTabAsIntent("favorites", getString(R.string.favorites_tab_title), R.drawable.ic_tab_artists, intent);
    }

    public void addTabAsIntent(String tab_spec, String indicator_title, int icon_resource, Intent intent) {
        TabHost.TabSpec spec = getTabHost().newTabSpec(tab_spec);
        spec.setIndicator(indicator_title, getResources().getDrawable(icon_resource)); //设置标签的标题和图标
        spec.setContent(intent); //设置标签内容

        getTabHost().addTab(spec);
    }


}
