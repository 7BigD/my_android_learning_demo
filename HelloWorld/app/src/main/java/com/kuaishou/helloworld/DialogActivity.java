package com.kuaishou.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kuaishou.helloworld.util.ToastUtil;

public class DialogActivity extends AppCompatActivity {

    private Button btn_dialog1,btn_dialog2,btn_dialog3,btn_dialog4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        btn_dialog1 = findViewById(R.id.btn_DialogStyle1);
        btn_dialog2 = findViewById(R.id.btn_DialogStyle2);
        btn_dialog3 = findViewById(R.id.btn_DialogStyle3);
        btn_dialog4 = findViewById(R.id.btn_DialogStyle4);

        OnClick onClick = new OnClick();
        btn_dialog1.setOnClickListener(onClick);
        btn_dialog2.setOnClickListener(onClick);
        btn_dialog3.setOnClickListener(onClick);
        btn_dialog4.setOnClickListener(onClick);

    }

    class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_DialogStyle1:
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(DialogActivity.this);
                    builder1.setTitle("what do you like?");
//                    builder1.setI
                    break;

                case R.id.btn_DialogStyle2:
                    final String[] array2 = new String[]{"boy", "girl"};
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(DialogActivity.this);
                    builder2.setTitle("choose sex").setItems(array2, new DialogInterface.OnClickListener() {
                        /*
                        setItems(CharSequence[] items, final OnClickListener listener)
                        setItems  设置里面的选项 和  点击选项的效果。

                         */
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(array2[which], DialogActivity.this);
                            dialog.dismiss();
                        }
                    }).show();
                    break;
                case R.id.btn_DialogStyle3:
                    final String[] array3 = new String[]{"男","女"};   //"唱歌","跳舞","写代码"
                    AlertDialog.Builder builder3 = new AlertDialog.Builder(DialogActivity.this);
                    builder3.setTitle("请选择你的爱好").setSingleChoiceItems(array3, 0, new DialogInterface.OnClickListener(){

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(array3[which], DialogActivity.this);
                            dialog.dismiss();
                        }
                    }).setCancelable(false).show();
                    break;

                case R.id.btn_DialogStyle4:
                    final String[] array4 = new String[]{"唱歌","跳舞","写代码"};   //"唱歌","跳舞","写代码"
                    boolean[] isChoose = new boolean[]{false, false, true};
                    AlertDialog.Builder builder4 = new AlertDialog.Builder(DialogActivity.this);
                    builder4.setTitle("请选择你的兴趣").setMultiChoiceItems(array4, isChoose, new DialogInterface.OnMultiChoiceClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                        }
                    }).show();
            }

        }
    }

}