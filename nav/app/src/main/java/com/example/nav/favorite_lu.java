package com.example.nav;

import java.util.HashMap;

public class favorite_lu {
    private static String name;
    public static HashMap<String,Integer> l_foods;
    private static double l_kaluli;
    private static boolean fa = false;

    public static void setFa() {
        favorite_lu.fa = true;
    }

    public static boolean isFa() {
        return fa;
    }

    public static void add(String foodname, Integer weight){
        l_foods.put(foodname,weight);
    }

    public static void setL_kaluli(double k) {
        l_kaluli = k;
    }

    public static String getName() {
        return name;
    }

    public static HashMap<String, Integer> getL_foods() {
        return l_foods;
    }

    public static double getL_kaluli() {
        return l_kaluli;
    }

    public static void setName(String name) {
        favorite_lu.name = name;
    }
}
