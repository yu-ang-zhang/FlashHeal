package com.example.nav;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * model stroing food information used in food database
 */

public class food_items_model implements Parcelable {
    /**
     * food category
     */
    public String food_category;
    /**
     * auto-generated id
     */
    public int id;
    /**
     * food name
     */
    public String food_item;
    /**
     * food protein
     */
    public float proteins;
    /**
     * food fat
     */
    public float fat;
    /**
     * food carb
     */
    public float carb;
    /**
     * food calories
     */
    public float calorie;
    /**
     * constructor
     */
    public food_items_model(){

    }
    /**
     * constructor
     */
    public food_items_model(String food_category, String food_item, float proteins, float fat, float carb, float calorie){
        this.food_category = food_category;
        this.food_item= food_item;
        this.proteins = proteins;
        this.carb=carb;
        this.calorie=calorie;
        this.fat=fat;
    }
    /**
     * set food item id
     */
    public void setId(int id)
    {
        this.id=id;
    }
    /**
     * get food item category
     */
    public String getfood_category(){
        return this.food_category;
    }
    /**
     * set food item category
     */
    public void setfood_category(String food_category){
        this.food_category = food_category;
    }
    /**
     * get food item name
     */
    public String getfood_item(){
        return this.food_item;
    }
    /**
     * set food item name
     */
    public void setfood_item(String food_item){
        this.food_item = food_item;
    }
    /**
     * get food item protein
     */
    public float getproteins(){
        return this.proteins;
    }
    /**
     * set food item protein
     */
    public void setproteins(float proteins){
        this.proteins = proteins;
    }
    /**
     * get food item fat
     */
    public float getfat(){
        return this.fat;
    }
    /**
     * set food item fat
     */
    public void setfat(float fat){
        this.fat = fat;
    }
    /**
     * get food item carb
     */
    public float getcarb(){
        return this.carb;
    }
    /**
     * set food item carb
     */
    public void setcarb(float carb){
        this.carb = carb;
    }
    /**
     * get food item calorie
     */
    public float getcalorie(){
        return  this.calorie;
    }
    /**
     * set food item calorie
     */
    public void setcalorie(float calorie){
        this.calorie = calorie;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeFloat(proteins);
        dest.writeFloat(calorie);
        dest.writeFloat(carb);
        dest.writeFloat(fat);
        dest.writeString(food_category);
        dest.writeString(food_item);
    }
    private food_items_model(Parcel in)
    {
        food_category=in.readString();
        food_item=in.readString();
        proteins=in.readFloat();
        carb=in.readFloat();
        calorie=in.readFloat();
        fat=in.readFloat();
    }
    public  final Creator<food_items_model> CREATOR = new Creator<food_items_model>() {
        @Override
        public food_items_model createFromParcel(Parcel in) {
            return new food_items_model(in);
        }

        @Override
        public food_items_model[] newArray(int size) {
            return new food_items_model[size];
        }
    };
}
