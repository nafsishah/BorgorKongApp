package com.example.borgerkongapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class database {
    /***
     * Retrieves an Article object using the provided id.
     */
    public static Food getFoodById(int FoodID) {

        return food.get(FoodID);
    }

    /***
     * Return an ArrayList containing all the articles in the database.
     */
    public static ArrayList<Food> getAllFood() {
        return new ArrayList<Food>((List) Arrays.asList(food.values().toArray()));
    }


    // You can ignore everything below this for now.
    private static final HashMap<Integer, Food> food = new HashMap<>();

    static {
        food.put(1, new Food(
                1,
                "Bopper",
                R.drawable.bopper,
                "The Bopper® is 100% hormone-free Aussie beef, " +
                        "flame-grilled that gives you the irresistible smoky, BBQ flavour. " +
                        "Loaded with crisp fresh lettuce, ripe hand-cut tomatoes, onion, pickles," +
                        " mayo and tomato sauce on a toasted sesame seed bun. An Aussie legend for over 40 years.",
                11.99
        ));
        food.put(2, new Food(
                2,
                "Bopper Junior",
                R.drawable.boppperjr,
                "It's just like the legendary Bopper®, only smaller. " +
                        "Same great flame-grilled Australian beef with no added hormones, " +
                        "ripe hand-cut tomato, fresh lettuce, onion, pickles, mayo and tomato " +
                        "sauce on a toasted sesame seed bun.",
                9.99

        ));

        food.put(3, new Food(
                3,
                "Onion Rings",
                R.drawable.onionrings,
                "Freshly battered, crispy onion rings. You'll cry if you miss out!",
                4.99
        ));

        food.put(4, new Food(
                4,
                "Fries",
                R.drawable.fries,
                "Our thick cut chips are deliciously seasoned, delivering a crispier" +
                        " crunch on the outside, fluffy and hot on the inside.",
                3.99
        ));

        food.put(5, new Food(
                5,
                "Chicken Supreme",
                R.drawable.chickenburger,
                "Flame-grilled chicken breast fillet, topped with fresh salad and our " +
                        "creamy Ranch dressing on a toasted sesame seed bun. If you love chicken, " +
                        "you will love our succulent flame-grilled breast fillet chicken burger.",
                10.99
        ));

        food.put(6, new Food(
                6,
                "Bacon Burger",
                R.drawable.baconburger,
                "On an Artisan Brioche bun, stacked high with Cheddar cheese, " +
                        "crispy bacon topped with a smokey BBQ sauce and pickles.",
                10.99
        ));

        food.put(7, new Food(
                7,
                "Fish Burger",
                R.drawable.fish,
                "Tasty fish burgers, topped with crunchy coleslaw, rocket and tartare sauce",
                9.99
        ));

        food.put(8, new Food(
                8,
                "Cheese Burger",
                R.drawable.cheeseburger,
                "Classic combo of a flame-grilled Aussie beef patty topped with cheese," +
                        " crunchy pickle, mustard and tomato sauce, served on a freshly toasted " +
                        "sesame seed bun. Basic - but brilliant",
                8.99
        ));

        food.put(9, new Food(
                9,
                "Frozen Coke",
                R.drawable.frozencoke,
                "Cool down with a thirst-quenching Frozen Coke® made extra cold",
                1.499
        ));

        food.put(10, new Food(
                10,
                "Ice-cream",
                R.drawable.icecream,
                "Rich creamy vanilla soft serve in a crispy cone.",
                1.25
        ));

        food.put(11, new Food(
                11,
                "Family Meal",
                R.drawable.family,
                "The Bopper® Family Value Bundle includes two 100% Aussie beef " +
                        "flamed-grilled Boppers®, two 100% Aussie beef, flamed-grilled BBQ " +
                        "Cheeseburgers, six 100% chicken breast nuggets, two serves of large " +
                        "thick cut chips and four small drinks.",
                34.99
        ));

        food.put(12, new Food(
                12,
                "Double Bopper",
                R.drawable.doublebopper,
                "Think of a Bopper®. Think of the crispy lettuce and ripe tomato. " +
                        "Think of the freshly-toasted sesame seed bun. Think of the flame-grilled " +
                        "Aussie beef. Now double it.",
                13.99
        ));

        food.put(13, new Food(
                13,
                "Double Chicken",
                R.drawable.chickensupreme,
                "2 flame grilled Aussie chicken breast and premium eye bacon, " +
                        "topped with creamy Caesar sauce, parmesan cheese, tomato and lettuce on " +
                        "a toasted sesame seed bun.",
                12.99
        ));
        food.put(14, new Food(
                14,
                "Apple Pie",
                R.drawable.applepie,
                "Crisp pastry, lovingly filled with aussie apples for that extra sweet " +
                        "taste. Served piping hot.",
                3.49

        ));

        food.put(15, new Food(
                15,
                "Cake",
                R.drawable.cake,
                "Chocolate lovers, lose yourself with our Belgian Chocolate Lava Cake." +
                        " The Belgian Chocolate Lava Cake is warm with an oozing chocolate centre " +
                        "and sprinkled with CADBURY® FLAKE® pieces, it’s the perfect escape. ",
                4.49
        ));


    }
}
