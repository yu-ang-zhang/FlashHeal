package com.example.nav;

import java.util.HashMap;
/**
 * storing recorded meal information
 */
public class recorded_snack {
    /**
     * meal name
     */
    private static String name;
    /**
     * meal foods
     */
    private static HashMap<String,Integer> s_foods;
    /**
     * meal calories
     */
    private static double s_kaluli;
    /**
     * whether is favorite
     */
    private static boolean favorite = false;

    /**
     * constructor
     */
    public recorded_snack(String b_name) {
        name = b_name;
        s_foods = new HashMap<>();
    }
    /**
     * add food into meal
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
     * check whether this meal is favorite
     */
    public static boolean isFavorite() {
        return favorite;
    }
    /**
     * set meal name
     */
    public static void setName(String name) {
        recorded_snack.name = name;
    }
}
