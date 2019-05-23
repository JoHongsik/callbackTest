package com.example.callbacktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button TossCallback_btn;
    private  callbackTestClass calllbackTestClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TossCallback_btn = (Button) findViewById(R.id.TossCallback);

        calllbackTestClass = new callbackTestClass();
        TossCallback_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calllbackTestClass.callbackMethod(listener);
            }
        });

    }
    callbackTestInterface listener = new callbackTestInterface() {
        @Override
        public void btnClicked() {
            Toast.makeText(MainActivity.this, "callback!!", Toast.LENGTH_SHORT).show();
        }
    };
}
