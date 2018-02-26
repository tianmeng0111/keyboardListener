package com.tm.keyboardlistener;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * 点击键盘上的下箭头监听不到
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.et);
        et.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                Log.e(TAG, "onEditorAction: =====");
                return false;
            }
        });

    }

    public void go2(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    public void go3(View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

}
