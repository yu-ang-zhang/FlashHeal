package com.example.nav;

public class searchedfood {

    private String name;
    private double prot;
    private double carb;
    private double fat;
    private int cal;

    searchedfood(String name, double p, double f, double c, int cal){
        this.name = name;
        this.prot = p;
        this.fat = f;
        this. carb = c;
        this.cal =cal;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProt() {
        return prot;
    }

    public void setProt(double prot) {
        this.prot = prot;
    }

    public double getCarb() {
        return carb;
    }

    public void setCarb(double carb) {
        this.carb = carb;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }
}
