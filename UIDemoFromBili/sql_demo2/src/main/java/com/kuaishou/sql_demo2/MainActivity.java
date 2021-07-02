package com.kuaishou.sql_demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity{

    private static final String TAG = "MainActivity";
    private EditText mAccount;
    private EditText mPassword;
    private Button mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 第一步，找到控件
        initView();
//        第二步，给login设置点击事件
        initListener();
    }

    /*
    给按钮设置监听
     */
    private void initListener() {
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handlerLoginEvent(v);
            }
        });
        // 第二种设置点击事件的方法
//        就是让当前activity implements View.OnClickListener
//        mLogin.setOnClickListener(this);
    }

    // 第三步，拿到界面数据。include：account and password
    private void handlerLoginEvent(View v) {
        String accountText = mAccount.getText().toString();
        String passwordText = mPassword.getText().toString();
        // 保存账号密码
        saveUserInfo(accountText, passwordText);
    }

    private void saveUserInfo(String accountText, String passwordText) {
        Log.d(TAG, "saveUserInfo: 保存用户信息");

        File filesDir = this.getFilesDir();
        File file1 = new File(filesDir, "info.txt");

//        File file = new File("info.txt");
        FileOutputStream fileOutputStream = null;

        try {
            if (!file1.exists()) {
                file1.createNewFile();
            }
            fileOutputStream = new FileOutputStream(file1);
            fileOutputStream.write((accountText + "\n" + passwordText).getBytes());
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

    /*@Override
        public void onClick(View v) {
        }*/

    private void initView() {
        mAccount = this.findViewById(R.id.et_account);
        mPassword = this.findViewById(R.id.et_password);
        mLogin = this.findViewById(R.id.bt_login);
    }


}