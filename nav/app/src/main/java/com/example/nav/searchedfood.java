package com.example.nav;
/**
 * searched food information
 */
public class searchedfood {
    /**
     * searched food name
     */
    private String name;
    /**
     * searched food protein
     */
    private double prot;
    /**
     * searched food carb
     */
    private double carb;
    /**
     * searched food fat
     */
    private double fat;
    /**
     * searched food calories
     */
    private int cal;
    /**
     * constructor
     */
    searchedfood(String name, double p, double f, double c, int cal){
        this.name = name;
        this.prot = p;
        this.fat = f;
        this. carb = c;
        this.cal =cal;
    }

    /**
     * get food name
     */
    public String getName() {
        return name;
    }
    /**
     * set food name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * get food protein
     */
    public double getProt() {
        return prot;
    }
    /**
     * get food carb
     */
    public double getCarb() {
        return carb;
    }
    /**
     * get food fat
     */
    public double getFat() {
        return fat;
    }
    /**
     * get food calorie
     */
    public int getCal() {
        return cal;
    }

}
