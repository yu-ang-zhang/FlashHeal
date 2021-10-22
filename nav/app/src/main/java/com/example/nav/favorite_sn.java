package com.example.nav;

import java.util.HashMap;
/**
 * storing favorite snack information
 */
public class favorite_sn {
    /**
     * favorite meal name
     */
    private static String name;
    /**
     * favorite meal foods list
     */
    public static HashMap<String,Integer> s_foods;
    /**
     * favorite meal foods calories
     */
    private static double s_kaluli;
    /**
     * whether this is favorite
     */
    private static boolean fa = false;
    /**
     * set this meal is favorite
     */
    public static void setFa() {
        favorite_sn.fa = true;
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
        s_foods.put(foodname,weight);
    }
    /**
     * set meal calories
     */
    public static void setS_kaluli(double k) {
        s_kaluli = k;
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
    public static HashMap<String, Integer> getS_foods() {
        return s_foods;
    }
    /**
     * get meal calories
     */
    public static double getS_kaluli() {
        return s_kaluli;
    }
    /**
     * set meal name
     */
    public static void setName(String name) {
        favorite_sn.name = name;
    }
}
