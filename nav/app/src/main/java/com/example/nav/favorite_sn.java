package com.example.nav;

import java.util.HashMap;

public class favorite_sn {
    private static String name;
    public static HashMap<String,Integer> s_foods;
    private static double s_kaluli;
    private static boolean fa = false;

    public static void setFa() {
        favorite_sn.fa = true;
    }

    public static boolean isFa() {
        return fa;
    }

    public static void add(String foodname, Integer weight){
        s_foods.put(foodname,weight);
    }

    public static void setS_kaluli(double k) {
        s_kaluli = k;
    }

    public static String getName() {
        return name;
    }

    public static HashMap<String, Integer> getS_foods() {
        return s_foods;
    }

    public static double getS_kaluli() {
        return s_kaluli;
    }

    public static void setName(String name) {
        favorite_sn.name = name;
    }
}
