package com.android.sharkcontact;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class CallLogs extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("电话记录");

        setContentView(textview);
    }
}
