package com.example.nav;

import java.util.HashMap;

public class recorded_dinner {
    private static String name;
    private static HashMap<String,Float> d_foods;
    private static double d_kaluli;
    private static boolean favorite = false;


    public recorded_dinner(String d_name) {
        name = d_name;
        d_foods = new HashMap<>();
    }

    public static void add(String foodname, Float foodkaluli){
        d_foods.put(foodname,foodkaluli);
    }

    public static void setD_kaluli(double k) {
        d_kaluli = k;
    }

    public static void setFavorite() {favorite = true;}

}
