package com.example.nav;

import java.util.ArrayList;
import java.util.HashMap;

public class recordedmeal {

    private static double mealkaluli;
    private static ArrayList<recorded_breakfast> breakfasts;
    private static ArrayList<recorded_lunch> lunchs;
    private static ArrayList<recorded_dinner> dinners;
    private static ArrayList<recorded_snack> snacks;
    private static ArrayList<searchedfood> searchedfoods;

    public static void addBreakfast(recorded_breakfast breakfast){
        breakfasts.add(breakfast);
    }

    public static void addLunch(recorded_lunch lunch){
        lunchs.add(lunch);
    }

    public static void addDinner(recorded_dinner dinner){
        dinners.add(dinner);
    }

    public static void addSnack(recorded_snack snack){
        snacks.add(snack);
    }

    public static void addFood(searchedfood food) {searchedfoods.add(food);}

    public static double setkaluli(double kaluli){return mealkaluli+=kaluli;}

    public static double getMealkaluli(){return mealkaluli;}
}
