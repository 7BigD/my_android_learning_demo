package com.kuaishou.helloworld.listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.kuaishou.helloworld.R;

public class ListViewActivity extends Activity {

    private ListView listView1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView1 = findViewById(R.id.listView_1);
        listView1.setAdapter(new MyListAdapter(ListViewActivity.this));

    }
}
