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
    
    private void createTabs() {
        createPhoneTab();
        createCallLogsTab();
        createFavoritesTab();

        getTabHost().setCurrentTab(0); //设置启动时默认激活的标签页
    }

    private void createPhoneTab() {
        addTabAsIntent("phone", 
                tabValue(R.string.phone_tab_title, R.drawable.ic_tab_artists), 
                new Intent(this, Phone.class));
    }

    private void createCallLogsTab() {
        addTabAsIntent("callLogs", 
                tabValue(R.string.call_logs_tab_title, R.drawable.ic_tab_artists), 
                new Intent(this, CallLogs.class));
    }

    private void createFavoritesTab() {
        addTabAsIntent("favorites", 
                tabValue(R.string.favorites_tab_title, R.drawable.ic_tab_artists), 
                new Intent(this, Favorites.class));
    }

    private void addTabAsIntent(String tabSpecName, Bundle tabValue, Intent intent) {
        TabHost.TabSpec spec = getTabHost().newTabSpec(tabSpecName);
        //设置标签的标题和图标
        spec.setIndicator(tabValue.getString("tabTitle"), getResources().getDrawable(tabValue.getInt("tabIcon"))); 
        //设置标签内容
        spec.setContent(intent); 

        getTabHost().addTab(spec);
    }

    private Bundle tabValue(int titleRes, int iconRes) {
        Bundle tab_value = new Bundle();
        tab_value.putString("tabTitle", getString(titleRes));
        tab_value.putInt("tabIcon", iconRes);

        return tab_value;
    }
}

