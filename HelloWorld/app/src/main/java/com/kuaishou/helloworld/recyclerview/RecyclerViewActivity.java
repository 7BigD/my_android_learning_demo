package com.kuaishou.helloworld.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kuaishou.helloworld.R;

public class RecyclerViewActivity extends AppCompatActivity {

    private Button buttonLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        buttonLinearLayout = findViewById(R.id.btn_linearLaylout);
        buttonLinearLayout.setOnClickListener(new MyOnClickListener());


    }

    class MyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(RecyclerViewActivity.this, LinearRecyclerViewActivity.class);
            startActivity(intent);
        }
    }


}