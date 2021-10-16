package com.example.nav;

import java.util.ArrayList;
import java.util.HashMap;

public class recordedmeal {

    private static double mealkaluli;
    private static ArrayList<recorded_breakfast> breakfasts = new ArrayList<>();
    private static ArrayList<recorded_lunch> lunchs = new ArrayList<>();
    private static ArrayList<recorded_dinner> dinners = new ArrayList<>();
    private static ArrayList<recorded_snack> snacks = new ArrayList<>();
    private static recorded_breakfast f_b = new recorded_breakfast("");
    private static recorded_lunch f_l = new recorded_lunch("");
    private static recorded_dinner f_d = new recorded_dinner("");
    private static recorded_snack f_s = new recorded_snack("");
    private static ArrayList<searchedfood> searchedfoods = new ArrayList<>();

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

    public static void addFood(searchedfood food) {
        int i = 0;
        if (searchedfoods.size()<3) {
            searchedfoods.add(food);
        }
        else {
            searchedfoods.set(i%3,food);
            i++;
        }
    }

    public static double setkaluli(double kaluli){return mealkaluli+=kaluli;}

    public static double getMealkaluli(){return mealkaluli;}

    public static ArrayList<recorded_breakfast> getBreakfasts() {
        return breakfasts;
    }

    public static ArrayList<recorded_lunch> getLunchs() {
        return lunchs;
    }

    public static ArrayList<recorded_dinner> getDinners() {
        return dinners;
    }

    public static ArrayList<recorded_snack> getSnacks() {
        return snacks;
    }

    public static ArrayList<searchedfood> getSearchedfoods() {
        return searchedfoods;
    }

    public static recorded_breakfast getF_b() {
        return f_b;
    }

}
