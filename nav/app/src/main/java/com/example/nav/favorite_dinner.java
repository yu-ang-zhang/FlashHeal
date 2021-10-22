package com.example.nav;

import java.util.HashMap;
/**
 * storing favorite dinner information
 */
public class favorite_dinner {
    /**
     * favorite meal name
     */
    private static String name;
    /**
     * favorite meal foods list
     */
    public static HashMap<String,Integer> d_foods;
    /**
     * favorite meal foods calories
     */
    private static double d_kaluli;
    /**
     * whether this is favorite
     */
    private static boolean fa = false;
    /**
     * set this meal is favorite
     */
    public static void setFa() {
        favorite_dinner.fa = true;
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
        d_foods.put(foodname,weight);
    }
    /**
     * set meal calories
     */
    public static void setD_kaluli(double k) {
        d_kaluli = k;
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
    public static HashMap<String, Integer> getD_foods() {
        return d_foods;
    }
    /**
     * get meal calories
     */
    public static double getD_kaluli() {
        return d_kaluli;
    }
    /**
     * set meal name
     */
    public static void setName(String name) {
        favorite_dinner.name = name;
    }
}
