package com.kuaishou.textviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListViewActivity extends AppCompatActivity {

    private String[] names = new String[]{"虎头", "2号人物", "3号人物", "李白"};
    private String[] descs = new String[]{"可爱的小孩", "擅长音乐", "擅长文学", "浪漫主义诗人"};
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = findViewById(R.id.idListView);
        List<Map<String, Object>> listItems = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            HashMap<String, Object> mapItem = new HashMap<>();
            mapItem.put("personName", names[i]);
            mapItem.put("describe", descs[i]);
            listItems.add(mapItem);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems, R.layout.simple_item, new String[]{"personName", "describe"}, new int[]{R.id.name, R.id.describe});
        listView.setAdapter(simpleAdapter);

    }
}