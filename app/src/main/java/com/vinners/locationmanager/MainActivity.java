package com.vinners.locationmanager;

import android.app.Activity;
import android.os.Bundle;

import com.vinners.locationmanager.location.LocationHelper;

public class MainActivity extends Activity {

    private LocationHelper locationHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
