package com.example.nav;

import java.util.HashMap;

public class favorite_dinner {
    private static String name;
    public static HashMap<String,Integer> d_foods;
    private static double d_kaluli;

    private static boolean fa = false;

    public static void setFa() {
        favorite_dinner.fa = true;
    }

    public static boolean isFa() {
        return fa;
    }

    public static void add(String foodname, Integer weight){
        d_foods.put(foodname,weight);
    }

    public static void setD_kaluli(double k) {
        d_kaluli = k;
    }


    public static String getName() {
        return name;
    }

    public static HashMap<String, Integer> getD_foods() {
        return d_foods;
    }

    public static double getD_kaluli() {
        return d_kaluli;
    }
    public static void setName(String name) {
        favorite_dinner.name = name;
    }
}
