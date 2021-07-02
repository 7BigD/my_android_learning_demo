package com.kuaishou.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.kuaishou.helloworld.util.ToastUtil;

public class ToastActivity extends AppCompatActivity {

    private Button mBtnToast1,mBtnToast2,mBtnToast3,mBtnToast4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        mBtnToast1 = findViewById(R.id.btn_toast_1);
        mBtnToast2 = findViewById(R.id.btn_toast_2);
        mBtnToast3 = findViewById(R.id.btn_toast_3);
        mBtnToast4 = findViewById(R.id.btn_toast_4);

        OnClick onClick = new OnClick();
        mBtnToast1.setOnClickListener(onClick);
        mBtnToast2.setOnClickListener(onClick);
        mBtnToast3.setOnClickListener(onClick);
        mBtnToast4.setOnClickListener(onClick);

    }

    class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_toast_1:
                    Toast toast = Toast.makeText(getApplicationContext(), "toast", Toast.LENGTH_LONG);
                    toast.show();
                    break;
                case R.id.btn_toast_2:
                    Toast toastMid = Toast.makeText(ToastActivity.this, "居中Toast", Toast.LENGTH_SHORT);
                    toastMid.setGravity(Gravity.CENTER, 0, 0);
                    toastMid.show();
                    break;
                case R.id.btn_toast_3:
                    Toast toastCustom = new Toast(getApplicationContext());
                    LayoutInflater inflater = LayoutInflater.from(ToastActivity.this);
                    View view = inflater.inflate(R.layout.layout_toast, null);
                    /*
                    view.findViewById  设置view 里面的 imageView、textView
                     */
                    ImageView imageView = view.findViewById(R.id.iv_toast);
                    TextView textView = view.findViewById(R.id.tv_toast);
                    imageView.setImageResource(R.drawable.ic_kuaishou);
                    textView.setText("hello world! 自定义");
                    toastCustom.setView(view);
                    toastCustom.setDuration(Toast.LENGTH_LONG);
                    toastCustom.show();
                    break;
                case R.id.btn_toast_4:
                    ToastUtil.showMsg("不会排队", getApplicationContext());
            }
        }
    }
}