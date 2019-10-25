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


class Adapter extends RecyclerView.Adapter<Adapter.FoodViewHolder> {
    private ArrayList<Food> foodToAdapt;
    public  void setData(ArrayList<Food> foodToAdapt) {
        // This is basically a Setter that we use to give data to the adapter
        this.foodToAdapt =foodToAdapt;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.activity_menu, parent, false);


        FoodViewHolder viewHolder = new FoodViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        final Food foodAtPosition = foodToAdapt.get(position);

        holder.nameTextView.setText(foodAtPosition.getName());
        holder.foodImageView.setImageResource(foodAtPosition.getImageDrawableId());


        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, FoodDetail.class);
                intent.putExtra("foodID", foodAtPosition.getFoodID());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {
        public  View view;
        public TextView nameTextView;
        public ImageView foodImageView;

        public FoodViewHolder(View v) {
            super(v);
            view= v;
            nameTextView=v.findViewById(R.id.item);
            foodImageView=v.findViewById((R.id.imageView2));

        }

    }
}