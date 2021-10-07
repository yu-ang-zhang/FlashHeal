package com.example.nav;

import java.util.HashMap;

public class recorded_snack {

    private static String name;
    private static HashMap<String,Float> s_foods;
    private static double b_kaluli;
    private static boolean favorite = false;

    public recorded_snack(String b_name) {
        name = b_name;
        s_foods = new HashMap<>();
    }

    public static void add(String foodname, Float foodkaluli){
        s_foods.put(foodname,foodkaluli);
    }

    public static void setS_kaluli(double k) {
        b_kaluli = k;
    }

    public static void setFavorite() {favorite = true;}

}
