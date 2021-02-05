package com.ashishbharam.fragments;
/* 
Created by Ashish Bharam on 04-Feb-21 at 01:35 PM.
Copyright (c) 2021 Ashish Bharam. All rights reserved.
*/

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MyViewHolder> {

    private Context context;
    private List<String> tempList;

    public RVAdapter(Context context, List<String> tempList) {
        this.context = context;
        this.tempList = tempList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String s = tempList.get(position);
        holder.tvname.setText(s);
    }

    @Override
    public int getItemCount() {
        return tempList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvname;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvname = itemView.findViewById(R.id.rv_item_textView1);
        }
    }
}
