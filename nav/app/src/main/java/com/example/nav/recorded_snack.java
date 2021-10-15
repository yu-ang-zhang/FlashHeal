package com.example.nav;

import java.util.HashMap;

public class recorded_snack {

    private static String name;
    private static HashMap<String,Integer> s_foods;
    private static double s_kaluli;
    private static boolean favorite = false;

    public recorded_snack(String b_name) {
        name = b_name;
        s_foods = new HashMap<>();
    }

    public static void add(String foodname, Integer weight){
        s_foods.put(foodname,weight);
    }

    public static void setS_kaluli(double k) {
        s_kaluli = k;
    }

    public static void setFavorites() {favorite = true;}

    public static String getName() {
        return name;
    }

    public static HashMap<String, Integer> getS_foods() {
        return s_foods;
    }

    public static double getS_kaluli() {
        return s_kaluli;
    }

    public static boolean isFavorite() {
        return favorite;
    }

    public static void setName(String name) {
        recorded_snack.name = name;
    }
}
