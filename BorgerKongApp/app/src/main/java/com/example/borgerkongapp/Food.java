package com.example.borgerkongapp;

import android.graphics.drawable.Drawable;

public class Food {
    // unique identifier of an article
    private int foodID;

    // Title of the food
    private String name;

    // Resource ID of associated image (e.g. R.drawable.my_image)
    private int imageDrawableId;

    private String description;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    public int getFoodID() {

        return foodID;
    }

    public void setFoodID(int foodID) {

        this.foodID = foodID;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {

        this.name = name;
    }

    public int getImageDrawableId() {

        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {

        this.imageDrawableId = imageDrawableId;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Food(int foodID, String name, int imageDrawableId, String description, double price) {
        this.foodID = foodID;
        this.name = name;
        this.imageDrawableId = imageDrawableId;
        this.description=description;
        this.price=price;

    }
}
