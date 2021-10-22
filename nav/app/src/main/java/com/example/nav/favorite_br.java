package com.example.nav;

import java.util.HashMap;

/**
 * storing favorite breakfast information
 */
public class favorite_br {
    /**
     * favorite meal name
     */
    private static String name;
    /**
     * favorite meal foods list
     */
    public static HashMap<String,Integer> b_foods;
    /**
     * favorite meal foods calories
     */
    private static double b_kaluli;
    /**
     * whether this is favorite
     */
    private static boolean fa = false;
    /**
     * set this meal is favorite
     */
    public static void setFa() {
        favorite_br.fa = true;
    }
    /**
     * check whether this meal is favorite
     */
    public static boolean isFa() {
        return fa;
    }
    /**
     * add meal food
     */
    public static void add(String foodname, Integer weight){
        b_foods.put(foodname,weight);
    }
    /**
     * set meal calories
     */
    public static void setB_kaluli(double k) {
        b_kaluli = k;
    }
    /**
     * get meal name
     */
    public static String getName() {
        return name;
    }
    /**
     * get meal foods
     */
    public static HashMap<String, Integer> getB_foods() {
        return b_foods;
    }
    /**
     * get meal calories
     */
    public static double getB_kaluli() {
        return b_kaluli;
    }
    /**
     * set meal name
     */
    public static void setName(String name) {
        favorite_br.name = name;
    }
}
