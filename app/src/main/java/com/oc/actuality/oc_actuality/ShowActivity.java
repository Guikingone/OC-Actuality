package com.oc.actuality.oc_actuality;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Guillaume on 10/07/2016.
 */
public class ShowActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
