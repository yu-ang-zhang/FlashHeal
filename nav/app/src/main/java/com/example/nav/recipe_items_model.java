package com.example.nav;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * storing recipe information used in recipe database
 */
public class recipe_items_model implements Parcelable {
    /**
     * recipe name
     */
    public String recipe_name;
    /**
     * recipe id
     */
    public int id;
    /**
     * recipe ingredients
     */
    public String food_item;
    /**
     * recipe cooking directions
     */
    public String cookingrecipe;
    /**
     * recipe calories
     */
    public int calorie;
    /**
     * constructor
     */
    public recipe_items_model(){}
    /**
     * constructor
     */
    public recipe_items_model(String recipe_name, String food_item, String cooking, int calorie){
        this.recipe_name = recipe_name;
        this.food_item= food_item;
        this.cookingrecipe = cooking;
        this.calorie=calorie;
    }
    /**
     * set recipe item id
     */
    public void setId(int id)
    {
        this.id=id;
    }
    /**
     * get recipe item name
     */
    public String getRecipe_name(){
        return this.recipe_name;
    }
    /**
     * set recipe item id
     */
    public void setRecipe_name(String food_category){
        this.recipe_name = food_category;
    }
    /**
     * get recipe item ingredients
     */
    public String getfood_item(){
        return this.food_item;
    }
    /**
     * set recipe item ingredients
     */
    public void setfood_item(String food_item){
        this.food_item = food_item;
    }
    /**
     * set recipe item cooking directions
     */
    public void setCookingrecipe(String cookingrecipe){this.cookingrecipe = cookingrecipe;};
    /**
     * get recipe item cooking directions
     */
    public String getCookingrecipe(){return this.cookingrecipe;}
    /**
     * get recipe item calorie
     */
    public float getcalorie(){
        return  this.calorie;
    }
    /**
     * set recipe item calorie
     */
    public void setcalorie(int calorie){
        this.calorie = calorie;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeFloat(calorie);
        dest.writeString(recipe_name);
        dest.writeString(food_item);
        dest.writeString(cookingrecipe);
    }
    private recipe_items_model(Parcel in)
    {
        recipe_name=in.readString();
        food_item=in.readString();
        cookingrecipe=in.readString();
        calorie=in.readInt();
    }
    public  final Creator<recipe_items_model> CREATOR = new Creator<recipe_items_model>() {
        @Override
        public recipe_items_model createFromParcel(Parcel in) {
            return new recipe_items_model(in);
        }

        @Override
        public recipe_items_model[] newArray(int size) {
            return new recipe_items_model[size];
        }
    };
}
