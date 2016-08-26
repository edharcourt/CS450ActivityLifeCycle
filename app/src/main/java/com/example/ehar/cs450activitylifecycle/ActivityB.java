package com.example.ehar.cs450activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by ehar on 8/26/16.
 */
public class ActivityB extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Toast.makeText(
                getApplicationContext(),
                extras.getString("NAME"),
                Toast.LENGTH_SHORT).show();
        }
    }
}
