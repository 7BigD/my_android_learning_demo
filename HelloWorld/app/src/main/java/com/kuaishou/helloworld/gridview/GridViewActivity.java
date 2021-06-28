package com.kuaishou.helloworld.gridview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.kuaishou.helloworld.R;

public class GridViewActivity extends AppCompatActivity {

    private GridView gn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        gn = findViewById(R.id.gv);
        gn.setAdapter(new MyGrudViewAdapter(GridViewActivity.this));
        gn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this, "click pos:" + position, Toast.LENGTH_SHORT).show();
            }
        });
        gn.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this, "long click pos:" + position, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
