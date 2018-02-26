package com.tm.keyboardlistener;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * https://github.com/yescpu/KeyboardChangeListener
 *
 */
public class Main3Activity extends AppCompatActivity implements KeyboardChangeListener.KeyBoardListener {

    private static final String TAG = "Main3Activity";

    private KeyboardChangeListener mKeyboardChangeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mKeyboardChangeListener = new KeyboardChangeListener(this);
        mKeyboardChangeListener.setKeyBoardListener(this);
    }

    @Override
    public void onKeyboardChange(boolean isShow, int keyboardHeight) {
        Log.e(TAG, "onKeyboardChange() called with: " + "isShow = [" + isShow + "], keyboardHeight = [" + keyboardHeight + "]");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mKeyboardChangeListener.destroy();
    }
}
