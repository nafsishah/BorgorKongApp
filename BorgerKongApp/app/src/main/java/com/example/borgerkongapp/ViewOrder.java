package com.example.borgerkongapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewOrder extends AppCompatActivity {

    private TextView foodTextView;
    private TextView descriptionTextView;
    private ImageView foodImageView;
    private TextView priceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_order);

        Intent intent = getIntent();
        int foodID = intent.getIntExtra("foodID", 0);

        Food food = database.getFoodById(foodID);
        foodImageView = findViewById(R.id.food_ImageView);
        descriptionTextView=findViewById(R.id.description_food);
        priceTextView=findViewById(R.id.price);

        foodTextView.setText(food.getName());
        foodImageView.setImageResource(food.getImageDrawableId());
        descriptionTextView.setText(food.getDescription());

        String finalPrice = new Double(food.getPrice()).toString();
        priceTextView.setText("$" + finalPrice);



    }
}
