package com.kuaishou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

//    private static final String TAG = ;
    public static final String TAG ="caculator_layout";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caculator_layout);
    }

    public void onClickOne(View view) {
        Log.d(TAG, "onClickOne: onClick");
    }
}