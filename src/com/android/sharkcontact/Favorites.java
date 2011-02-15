package com.android.sharkcontact;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Favorites extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("常用联系人界面");

        setContentView(textview);
    }
}
