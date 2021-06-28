package com.kuaishou.helloworld.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.kuaishou.helloworld.R;

public class MyListAdapter extends BaseAdapter {

    /*
    这里不懂*********
     */

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyListAdapter(Context context) {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView tvTitle, tvTime, tvContent;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.layout_list_item, null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.imageView_1);
            holder.tvTitle = convertView.findViewById(R.id.ll_tv_time);
            holder.tvTime = convertView.findViewById(R.id.ll_tv_time);
            holder.tvTime = convertView.findViewById(R.id.ll_tv_content);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        // fuzhi// 赋值
        holder.tvTitle.setText("this is the title!");
        holder.tvTime.setText("2020-22-22");

        Glide.with(mContext).load("https://pics1.baidu.com/feed/42166d224f4a20a4304a97477ca9a225700ed0d9.jpeg?token=e9c2b2039468a91b2390cdbab04884d8").into(holder.imageView);
        return convertView;
    }
}
