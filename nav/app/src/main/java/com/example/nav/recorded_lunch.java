package com.example.nav;

import java.util.HashMap;
/**
 * storing recorded meal information
 */
public class recorded_lunch {
    /**
     * meal name
     */
    private static String name;
    /**
     * meal foods
     */
    private static HashMap<String,Integer> l_foods;
    /**
     * meal calories
     */
    private static double l_kaluli;
    /**
     * whether is favorite
     */
    private static boolean favorite = false;
    /**
     * constructor
     */
    public recorded_lunch(String l_name) {
        name = l_name;
        l_foods = new HashMap<>();
    }
    /**
     * add food into meal
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
     * check whether this meal is favorite
     */
    public static boolean isFavorite() {
        return favorite;
    }
    /**
     * set meal name
     */
    public static void setName(String name) {
        recorded_lunch.name = name;
    }
}
