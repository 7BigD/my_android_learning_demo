package com.kuaishou.helloworld.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.kuaishou.helloworld.R;

import java.util.List;

public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.LinearViewHolder> {


    private Context mcontext;

    private List<String> list;

    public LinearAdapter(Context context) {
        this.mcontext = context;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;

        public LinearViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textview_title);
        }
    }

    @Override
    public LinearViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new LinearViewHolder(LayoutInflater.from(mcontext).inflate(R.layout.layout_linear_item, parent, false));
    }


    @Override
    public void onBindViewHolder(LinearViewHolder holder, int position) {
        holder.textView.setText("hello,cyclerView");
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
