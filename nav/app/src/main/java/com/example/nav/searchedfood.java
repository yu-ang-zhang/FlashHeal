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

    public double getCarb() {
        return carb;
    }

    public double getFat() {
        return fat;
    }

    public int getCal() {
        return cal;
    }

}
