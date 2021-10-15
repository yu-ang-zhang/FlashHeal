package com.example.nav;

import java.util.HashMap;

public class recorded_lunch {

    private static String name;
    private static HashMap<String,Integer> l_foods;
    private static double l_kaluli;
    private static boolean favorite = false;

    public recorded_lunch(String l_name) {
        name = l_name;
        l_foods = new HashMap<>();
    }

    public static void add(String foodname, Integer weight){
        l_foods.put(foodname,weight);
    }

    public static void setL_kaluli(double k) {
        l_kaluli = k;
    }

    public static void setFavorite() {favorite = true;}

    public static String getName() {
        return name;
    }

    public static HashMap<String, Integer> getL_foods() {
        return l_foods;
    }

    public static double getL_kaluli() {
        return l_kaluli;
    }

    public static boolean isFavorite() {
        return favorite;
    }

    public static void setName(String name) {
        recorded_lunch.name = name;
    }
}
