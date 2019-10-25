package com.example.borgerkongapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FoodDetail extends AppCompatActivity {

    private TextView foodTextView;
    private TextView descriptionTextView;
    private ImageView foodImageView;
    private TextView priceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        Intent intent = getIntent();
        int foodID = intent.getIntExtra("foodID", 0);

        Food food = database.getFoodById(foodID);

        foodTextView = findViewById(R.id.title_food);
        foodImageView = findViewById(R.id.food_ImageView);
        descriptionTextView=findViewById(R.id.description_food);
        priceTextView=findViewById(R.id.price);

        foodTextView.setText(food.getName());
        foodImageView.setImageResource(food.getImageDrawableId());
        descriptionTextView.setText(food.getDescription());


        String finalPrice = new Double(food.getPrice()).toString();
        priceTextView.setText("$" + finalPrice);

        Button add = findViewById((R.id.add));
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity((new Intent(FoodDetail.this,orderDetails.class)));

            }
        });

        Button toast = findViewById((R.id.add));
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Item Added!", Toast.LENGTH_SHORT).show();
            }
        });

        Button button = findViewById(R.id.viewOrder);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FoodDetail.this, ViewOrder.class));

            }
        });


    }
}
