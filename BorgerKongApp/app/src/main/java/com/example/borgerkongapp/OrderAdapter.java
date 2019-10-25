package com.example.borgerkongapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {


    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.activity_view_order, parent, false);


        OrderViewHolder viewHolder = new OrderAdapter.OrderViewHolder(view);
        return viewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }

    public class OrderViewHolder extends RecyclerView.ViewHolder {
        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
