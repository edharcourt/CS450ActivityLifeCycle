package com.example.ehar.cs450activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private TextView tv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.greeting);

        tv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getApplicationContext(),
                        R.string.toast_message,
                        Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, ActivityB.class);
                intent.putExtra("NAME", "Ed Harcourt");
                startActivity(intent);
            }
        });
    }
}
