package com.example.borgerkongapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class menu extends AppCompatActivity {

    private ImageView foodImageView;
    private TextView nameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        // Get the intent that was used to travel to this activity
        Intent intent = getIntent();

        // Get the extra identified by "FoodID" that was put into the intent at the origin.
        int FoodID = intent.getIntExtra("FoodID", 0);

        // Now that we were passed the ID of the clicked item, we can get the rest of the data
        // from the "database".
        Food food = database.getFoodById(FoodID);

        foodImageView = findViewById(R.id.imageView2);
        nameTextView = findViewById(R.id.item);


        // Set the views to show the data of our object
        nameTextView.setText(food.getName());
        foodImageView.setImageResource(food.getImageDrawableId());


    }
}
