package com.example.nav;

import java.util.HashMap;
/**
 * storing recorded meal information
 */
public class recorded_dinner {
    /**
     * meal name
     */
    private static String name;
    /**
     * meal foods
     */
    private static HashMap<String,Integer> d_foods;
    /**
     * meal calories
     */
    private static double d_kaluli;
    /**
     * whether is favorite
     */
    private static boolean favorite = false;

    /**
     * constructor
     */
    public recorded_dinner(String d_name) {
        recorded_dinner.name = d_name;
        recorded_dinner.d_foods = new HashMap<>();
    }
    /**
     * add food into meal
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
     * check whether this meal is favorite
     */
    public static boolean isFavorite() {
        return favorite;
    }
    /**
     * set meal name
     */
    public static void setName(String name) {
        recorded_dinner.name = name;
    }
}
