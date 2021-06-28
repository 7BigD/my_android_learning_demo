package com.kuaishou.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class MainActivity extends AppCompatActivity {

    int[] names = new int[] {
            R.id.tv_1,
            R.id.tv_2,
            R.id.tv_3,
            R.id.tv_4,
            R.id.tv_5,
            R.id.tv_6
    };
    TextView[] views = new TextView[names.length];

    private int currentColor = 0;
    class MyHandler extends Handler{
        private WeakReference<MainActivity> activity;

        public MyHandler(WeakReference<MainActivity> activity) {
            this.activity = activity;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}