package com.example.nav;

import java.util.HashMap;

public class recorded_lunch {

    private static String name;
    private static HashMap<String,Float> l_foods;
    private static double l_kaluli;
    private static boolean favorite = false;

    public recorded_lunch(String l_name) {
        name = l_name;
        l_foods = new HashMap<>();
    }

    public static void add(String foodname, Float foodkaluli){
        l_foods.put(foodname,foodkaluli);
    }

    public static void setL_kaluli(double k) {
        l_kaluli = k;
    }

    public static void setFavorite() {favorite = true;}

}
