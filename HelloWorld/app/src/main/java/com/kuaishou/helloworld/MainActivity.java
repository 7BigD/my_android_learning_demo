package com.kuaishou.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kuaishou.helloworld.gridview.GridViewActivity;
import com.kuaishou.helloworld.listview.ListViewActivity;
import com.kuaishou.helloworld.recyclerview.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnTextView;
    private Button btnTextView2;
    private Button btnEditText;
    private Button btnRadio;
    private Button btnImageView;
    private Button btnListView;
    private Button btnGridView;
    private Button btnRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTextView = findViewById(R.id.btn_textview);
        btnTextView2 = findViewById(R.id.btn_textview2);
        btnEditText = findViewById(R.id.btn_textview3);
        btnRadio = findViewById(R.id.btn_radio);
        btnImageView = findViewById(R.id.btn_imageView);
        btnListView = findViewById(R.id.btn_listView);
        btnGridView = findViewById(R.id.btn_gridView);
        btnRecyclerView = findViewById(R.id.btn_recyclerView);
        listeners();

    }

    private void listeners() {
        OnClick onClick = new OnClick();
        btnTextView.setOnClickListener(onClick);
        btnTextView2.setOnClickListener(onClick);
        btnEditText.setOnClickListener(onClick);
        btnRadio.setOnClickListener(onClick);
        btnImageView.setOnClickListener(onClick);
        btnListView.setOnClickListener(onClick);
        btnGridView.setOnClickListener(onClick);
        btnRecyclerView.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {
        Intent intent = null;
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_textview:
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
//                嵌套类  MainActivity.this  调用外部类的对象。
                    break;
                case R.id.btn_textview2:
                    intent = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_textview3:
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radio:
                    intent = new Intent(MainActivity.this, RadioActivity.class);
                    break;
                case R.id.btn_imageView:
                    intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;
                case R.id.btn_listView:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridView:
                    intent = new Intent(MainActivity.this, GridViewActivity.class);
                    break;
                case R.id.btn_recyclerView:
                    intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}