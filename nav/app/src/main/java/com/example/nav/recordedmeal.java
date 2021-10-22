package com.example.nav;

import java.util.ArrayList;
import java.util.HashMap;
/**
 * storing recorded meal information
 */
public class recordedmeal {
    /**
     * meal calories
     */
    private static double mealkaluli;
    /**
     * recorded breakfast list
     */
    private static ArrayList<recorded_breakfast> breakfasts = new ArrayList<>();
    /**
     * recorded lunch list
     */
    private static ArrayList<recorded_lunch> lunchs = new ArrayList<>();
    /**
     * recorded dinner list
     */
    private static ArrayList<recorded_dinner> dinners = new ArrayList<>();
    /**
     * recorded snack list
     */
    private static ArrayList<recorded_snack> snacks = new ArrayList<>();
    private static recorded_breakfast f_b = new recorded_breakfast("");
    private static recorded_lunch f_l = new recorded_lunch("");
    private static recorded_dinner f_d = new recorded_dinner("");
    private static recorded_snack f_s = new recorded_snack("");
    /**
     * researched food list
     */
    private static ArrayList<searchedfood> searchedfoods = new ArrayList<>();
    /**
     * record a new meal
     */
    public static void addBreakfast(recorded_breakfast breakfast){
        breakfasts.add(breakfast);
    }
    /**
     * record a new meal
     */
    public static void addLunch(recorded_lunch lunch){
        lunchs.add(lunch);
    }
    /**
     * record a new meal
     */
    public static void addDinner(recorded_dinner dinner){
        dinners.add(dinner);
    }
    /**
     * record a new meal
     */
    public static void addSnack(recorded_snack snack){
        snacks.add(snack);
    }
    /**
     * record a new search
     */
    public static void addFood(searchedfood food) {
        int i = 0;
        if (searchedfoods.size()<3) {
            searchedfoods.add(food);
        }
        else {
            searchedfoods.set(i%3,food);
            i++;
        }
    }
    /**
     * set all meal calories
     */
    public static double setkaluli(double kaluli){return mealkaluli+=kaluli;}
    /**
     * get all meal calories
     */
    public static double getMealkaluli(){return mealkaluli;}
    /**
     * get all recorded breakfast
     */
    public static ArrayList<recorded_breakfast> getBreakfasts() {
        return breakfasts;
    }
    /**
     * get all recorded lunch
     */
    public static ArrayList<recorded_lunch> getLunchs() {
        return lunchs;
    }
    /**
     * get all recorded dinner
     */
    public static ArrayList<recorded_dinner> getDinners() {
        return dinners;
    }
    /**
     * get all recorded snack
     */
    public static ArrayList<recorded_snack> getSnacks() {
        return snacks;
    }
    /**
     * get all searched food
     */
    public static ArrayList<searchedfood> getSearchedfoods() {
        return searchedfoods;
    }

}
