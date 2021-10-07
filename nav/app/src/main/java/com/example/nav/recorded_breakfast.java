package com.example.nav;

import java.util.HashMap;

public class recorded_breakfast {

    private static String name;
    private static HashMap<String,Float> b_foods;
    private static double b_kaluli;
    private static boolean favorite = false;

    public recorded_breakfast(String b_name) {
        name = b_name;
        b_foods = new HashMap<>();
    }

    public static void add(String foodname, Float foodkaluli){
        b_foods.put(foodname,foodkaluli);
    }

    public static void setB_kaluli(double k) {
        b_kaluli = k;
    }

    public static void setFavorite() {favorite = true;}
}
