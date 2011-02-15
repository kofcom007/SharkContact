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
    
    public void createTabs(){
        TabHost tabHost = getTabHost();  // The activity TabHost
        Intent intent;  // Reusable Intent for each tab

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, Phone.class);

        // Initialize a TabSpec for each tab and add it to the TabHost
        addTabAsIntent(tabHost, "phone", "电话", R.drawable.ic_tab_artists, intent);

        // Do the same for the other tabs
        intent = new Intent().setClass(this, CallLog.class);
        addTabAsIntent(tabHost, "call_log", "通话记录-", R.drawable.ic_tab_artists, intent);

        intent = new Intent().setClass(this, Favorites.class);
        addTabAsIntent(tabHost, "favorites", "常用联系人", R.drawable.ic_tab_artists, intent);

        tabHost.setCurrentTab(0); //设置启动时默认激活的标签页
    }

    public void addTabAsIntent(TabHost tab_host, String tab_spec, String indicator_title, int icon_resource, Intent intent){
        TabHost.TabSpec spec;

        spec = tab_host.newTabSpec(tab_spec).setIndicator(indicator_title, getResources().getDrawable(icon_resource)).setContent(intent);
        tab_host.addTab(spec);
    }
}
