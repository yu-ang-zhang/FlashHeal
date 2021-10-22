package com.example.nav;

import java.util.HashMap;
/**
 * storing recorded meal information
 */
public class recorded_breakfast {
    /**
     * meal name
     */
    private static String name;
    /**
     * meal foods
     */
    private static HashMap<String,Integer> b_foods;
    /**
     * meal calories
     */
    private static double b_kaluli;
    /**
     * whether is favorite
     */
    private static boolean favorite = false;
    /**
     * constructor
     */
    public recorded_breakfast(String b_name) {
        name = b_name;
        b_foods = new HashMap<>();
    }
    /**
     * set meal name
     */
    public static void setName(String name) {
        recorded_breakfast.name = name;
    }
    /**
     * add food into meal
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
     * check whether this meal is favorite
     */
    public static boolean isFavorite() {
        return favorite;
    }
}
