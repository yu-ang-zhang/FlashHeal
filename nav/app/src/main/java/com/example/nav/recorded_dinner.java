package com.example.nav;

import java.util.HashMap;

public class recorded_dinner {
    private static String name;
    private static HashMap<String,Integer> d_foods;
    private static double d_kaluli;
    private static boolean favorite = false;


    public recorded_dinner(String d_name) {
        recorded_dinner.name = d_name;
        recorded_dinner.d_foods = new HashMap<>();
    }

    public static void add(String foodname, Integer weight){
        d_foods.put(foodname,weight);
    }

    public static void setD_kaluli(double k) {
        d_kaluli = k;
    }

    public static void setFavorite() {favorite = true;}

    public static String getName() {
        return name;
    }

    public static HashMap<String, Integer> getD_foods() {
        return d_foods;
    }

    public static double getD_kaluli() {
        return d_kaluli;
    }

    public static boolean isFavorite() {
        return favorite;
    }

    public static void setName(String name) {
        recorded_dinner.name = name;
    }
}
