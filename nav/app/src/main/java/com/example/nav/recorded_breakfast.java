package com.example.nav;

import java.util.HashMap;

public class recorded_breakfast {



    private static String name;
    private static HashMap<String,Integer> b_foods;
    private static double b_kaluli;
    private static boolean favorite = false;

    public recorded_breakfast(String b_name) {
        name = b_name;
        b_foods = new HashMap<>();
    }
    public static void setName(String name) {
        recorded_breakfast.name = name;
    }
    public static void add(String foodname, Integer weight){
        b_foods.put(foodname,weight);
    }

    public static void setB_kaluli(double k) {
        b_kaluli = k;
    }

    public static void setFavorite() {favorite = true;}

    public static String getName() {
        return name;
    }

    public static HashMap<String, Integer> getB_foods() {
        return b_foods;
    }

    public static double getB_kaluli() {
        return b_kaluli;
    }

    public static boolean isFavorite() {
        return favorite;
    }
}
