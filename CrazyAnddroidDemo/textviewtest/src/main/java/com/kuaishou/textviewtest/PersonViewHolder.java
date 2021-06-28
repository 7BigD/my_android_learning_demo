package com.kuaishou.textviewtest;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {

    View rootView;
    TextView nameTv;
    TextView descTv;
    ImageView headerIv;
    private RecyclerView.Adapter adapter;

    public PersonViewHolder(@NonNull View itemView, View rootView, TextView nameTv, TextView descTv, ImageView headerIv, RecyclerView.Adapter adapter) {
        super(itemView);
        this.rootView = rootView;
        this.nameTv = nameTv;
        this.descTv = descTv;
        this.headerIv = headerIv;
        this.adapter = adapter;
    }
}
