package com.kuaishou.io;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences("count", Context.MODE_PRIVATE);
        int count = sharedPreferences.getInt("count", 0);
        Toast.makeText(this, "程序之前被打开了" + count + "次", Toast.LENGTH_LONG);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("count", ++count);
        editor.apply();
    }
}