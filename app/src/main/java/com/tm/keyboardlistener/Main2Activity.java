package com.tm.keyboardlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.tm.keyboardlistener.view.AdjustSizeLinearLayout;

/**
 * 重写跟布局onSizeChanged方法
 */
public class Main2Activity extends AppCompatActivity {

    AdjustSizeLinearLayout ll;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ll = (AdjustSizeLinearLayout) findViewById(R.id.adjust_ll);
        et = (EditText) findViewById(R.id.et);

        ll.setSoftKeyBoardListener(new AdjustSizeLinearLayout.SoftkeyBoardListener() {
            @Override
            public void keyBoardVisable(int move) {

            }

            @Override
            public void keyBoardInvisable(int move) {

            }
        });
    }
}
