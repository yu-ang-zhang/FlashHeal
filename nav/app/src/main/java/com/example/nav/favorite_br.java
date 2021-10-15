package com.example.nav;

import java.util.HashMap;

public class favorite_br {

    private static String name;
    public static HashMap<String,Integer> b_foods;
    private static double b_kaluli;
    private static boolean fa = false;

    public static void setFa() {
        favorite_br.fa = true;
    }

    public static boolean isFa() {
        return fa;
    }

    public static void add(String foodname, Integer weight){
        b_foods.put(foodname,weight);
    }

    public static void setB_kaluli(double k) {
        b_kaluli = k;
    }

    public static String getName() {
        return name;
    }

    public static HashMap<String, Integer> getB_foods() {
        return b_foods;
    }

    public static double getB_kaluli() {
        return b_kaluli;
    }

    public static void setName(String name) {
        favorite_br.name = name;
    }
}
