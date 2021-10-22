package com.example.nav;

import java.util.HashMap;
/**
 * storing favorite lunch information
 */
public class favorite_lu {
    /**
     * favorite meal name
     */
    private static String name;
    /**
     * favorite meal foods list
     */
    public static HashMap<String,Integer> l_foods;
    /**
     * favorite meal foods calories
     */
    private static double l_kaluli;
    /**
     * whether this is favorite
     */
    private static boolean fa = false;
    /**
     * set this meal is favorite
     */
    public static void setFa() {
        favorite_lu.fa = true;
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
        l_foods.put(foodname,weight);
    }
    /**
     * set meal calories
     */
    public static void setL_kaluli(double k) {
        l_kaluli = k;
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
    public static HashMap<String, Integer> getL_foods() {
        return l_foods;
    }
    /**
     * get meal calories
     */
    public static double getL_kaluli() {
        return l_kaluli;
    }
    /**
     * set meal name
     */
    public static void setName(String name) {
        favorite_lu.name = name;
    }
}
