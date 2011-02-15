package com.android.sharkcontact;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Phone extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("拨打电话和联系人界面");

        setContentView(textview);
    }
}
