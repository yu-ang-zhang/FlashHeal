package com.example.nav;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Samarth on 23-Nov-16.
 */

public class datas extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "Foodmanager";

    // Food table name
    private static final String TABLE_FOOD = "Food";
    private static datas dbhelper;

    // Food Table Columns names
    private static final String KEY_ID= "id";
    private static final String FOOD_CATEGORY = "Food_category";
    private static final String FOOD_ITEM = "Food_item";
    private static final String  PROTEINS = "Proteins";
    private static final String  FAT = "Fat";
    private static final String  CARB = "carb";
    private static final String  CALORIES = "calories";

    public static synchronized datas getInstance(Context context) {
        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.

        if (dbhelper == null) {
            dbhelper = new datas(context.getApplicationContext());
        }
        return dbhelper;
    }


    public datas(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//        SQLiteDatabase db=this.getWritableDatabase();
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_FOOD_TABLE = "CREATE TABLE " + TABLE_FOOD +" (id INTEGER PRIMARY KEY AUTOINCREMENT,Food_category TEXT,Food_item TEXT,Proteins REAL,Fat REAL,carb REAL,calories REAL)";
        String drop = "DROP TABLE " + TABLE_FOOD;
        db.execSQL(drop);
        db.execSQL(CREATE_FOOD_TABLE);

        addfood(new food_items_model("Dairy and Egg Products","Boiled Egg",5.51f,4.65f,0.49f,68f),db);
        addfood(new food_items_model("Dairy and Egg Products","Curd",7.88f,2.32f,10.56f,94f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg Cutlets",4.6f,8.5f,11.5f,140f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg and Potato Curry",7f,15f,3f,200f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg Burji",9f,12.5f,7.5f,195f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg Cheese Toast",12f,9f,9f,170f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg Flip",9.5f,8.8f,17.6f,189f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg Fried Rice",4f,3f,28f,161f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg Masala",13.4f,15.2f,6.6f,216f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg Molee",16.35f,0.26f,1.1f,78f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg Omlette",11f,12f,0.6f,154f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg Omlette Sandwich",27f,9.4f,56.1f,392.7f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg on Potatoes",7f,13f,42f,320f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg on Tomatoes",21f,7f,9f,320f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg Pattice",4f,4f,1f,60f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg Sandwich",11f,13f,18f,233f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg Stew",26f,21f,41f,400f),db);
        addfood(new food_items_model("Dairy and Egg Products","Fried Egg",14f,15f,0.8f,196f),db);
        addfood(new food_items_model("Dairy and Egg Products","Sweet Omlette",17.79f,23.02f,35.7f,405f),db);
        addfood(new food_items_model("Dairy and Egg Products","Pan Rolls with Eggs",3.32f,2.24f,18.2f,107f),db);
        addfood(new food_items_model("Dairy and Egg Products","Plain Omlette",11f,7f,0f,160f),db);
        addfood(new food_items_model("Dairy and Egg Products","Poached Eggs",5.51f,4.36f,0.34f,64f),db);
        addfood(new food_items_model("Dairy and Egg Products","Scrambled Egg",6.5f,7.5f,0.75f,100f),db);
        addfood(new food_items_model("Dairy and Egg Products","Orange Souffle",2f,10f,3.2f,110f),db);


        addfood(new food_items_model("Dairy and Egg Products","Eggnog",4.6f,4.2f,8.1f,88f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, feta",14f,21f,4.1f,264f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, edam",25f,28f,1.4f,357f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, brie",21f,28f,0.5f,334f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, blue",21f,29f,2.3f,353f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, cream",6.2f,34f,5.5f,350f),db);
        addfood(new food_items_model("Dairy and Egg Products","Butter, salted",0.9f,81f,0.1f,717f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, fontina",26f,31f,1.6f,389f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, romano",32f,27f,3.6f,387f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, monterey",24f,30f,0.7f,373f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg, dried, yolk",34f,59f,0.7f,669f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg, dried, white",81f,0f,7.8f,382f),db);
        addfood(new food_items_model("Dairy and Egg Products","Sour cream, light",3.5f,11f,7.1f,136f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg, dried, whole",48f,44f,1.1f,592f),db);
        addfood(new food_items_model("Dairy and Egg Products","Whey, fluid, acid",0.8f,0.1f,5.1f,24f),db);
        addfood(new food_items_model("Dairy and Egg Products","Whey, dried, acid",12f,0.5f,73f,339f),db);
        addfood(new food_items_model("Dairy and Egg Products","Whey, fluid, sweet",0.9f,0.4f,5.1f,27f),db);
        addfood(new food_items_model("Dairy and Egg Products","Whey, dried, sweet",13f,1.1f,74f,353f),db);
        addfood(new food_items_model("Dairy and Egg Products","Milk, fluid, sheep",6f,7f,5.4f,108f),db);
        addfood(new food_items_model("Dairy and Egg Products","Butter, without salt",0.9f,81f,0.1f,717f),db);
        addfood(new food_items_model("Dairy and Egg Products","Sour cream, fat free",3.1f,0f,16f,74f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg, fresh, raw, yolk",16f,27f,3.6f,322f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, low fat, cream",7.9f,15f,8.1f,201f),db);
        addfood(new food_items_model("Dairy and Egg Products","Butter oil, anhydrous",0.3f,99f,0f,876f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg, fresh, raw, whole",13f,9.5f,0.7f,143f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg, fresh, raw, white",11f,0.2f,0.7f,52f),db);
        addfood(new food_items_model("Dairy and Egg Products","Sour cream, reduced fat",7f,14f,7f,181f),db);
        addfood(new food_items_model("Dairy and Egg Products","Milk, dried, buttermilk",34f,5.8f,49f,387f),db);
        addfood(new food_items_model("Dairy and Egg Products","Milk, fluid, low sodium",3.1f,3.5f,4.5f,61f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, fat free, cream",16f,1f,7.7f,105f),db);
        addfood(new food_items_model("Dairy and Egg Products","Yogurt, non-fat, vanilla",2.9f,0f,17f,78f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, grated, parmesan",28f,28f,14f,420f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg, fried, cooked, whole",14f,15f,0.8f,196f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg, omelet, cooked, whole",11f,12f,0.6f,154f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, nonfat, mozzarella",32f,0f,3.5f,141f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, shredded, parmesan",38f,27f,3.4f,415f),db);
        addfood(new food_items_model("Dairy and Egg Products","Milk, fluid, mature, human",1f,4.4f,6.9f,70f),db);
        addfood(new food_items_model("Dairy and Egg Products","Butter, with salt, whipped",0.5f,78f,2.9f,718f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg, poached, cooked, whole",13f,9.5f,0.7f,143f),db);
        addfood(new food_items_model("Dairy and Egg Products","Milk, fluid, indian buffalo",3.8f,6.9f,5.2f,97f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg, raw, fresh, whole, duck",13f,14f,1.5f,185f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cream, lowfat, half and half",3.3f,5f,3.3f,72f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cream, heavy whipping, fluid",2.8f,36f,2.7f,340f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cream, light whipping, fluid",2.2f,31f,3f,292f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, reduced fat, cheddar",27f,20f,4.1f,309f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg, raw, fresh, whole, goose",14f,13f,1.4f,185f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg, scrambled, cooked, whole",10f,11f,1.6f,149f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese substitute, mozzarella",11f,12f,24f,248f),db);
        addfood(new food_items_model("Dairy and Egg Products","Yogurt, nonfat, fruit variety",4.4f,0.2f,19f,95f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, whole milk, mozzarella",22f,22f,2.2f,300f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, low sodium, mozzarella",28f,17f,3.1f,280f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cream, fat free, half and half",2.6f,1.4f,9f,59f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg, raw, fresh, whole, turkey",14f,12f,1.2f,171f),db);
        addfood(new food_items_model("Dairy and Egg Products","Yogurt, nonfat milk, chocolate",3.5f,0f,24f,112f),db);
        addfood(new food_items_model("Dairy and Egg Products","Milk, whole, fluid, buttermilk",3.2f,3.3f,4.9f,62f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, part skim milk, ricotta",11f,7.9f,5.1f,138f),db);
        addfood(new food_items_model("Dairy and Egg Products","Yogurt, whole milk, fruit, Greek",7.3f,3f,12f,106f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, with vegetables, cottage",11f,4.2f,3f,95f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese spread, cream cheese base",7.1f,29f,3.5f,295f),db);
        addfood(new food_items_model("Dairy and Egg Products","Parmesan cheese topping, fat free",40f,5f,40f,370f),db);
        addfood(new food_items_model("Dairy and Egg Products","Milk, sweetened, condensed, canned",7.9f,8.7f,54f,321f),db);
        addfood(new food_items_model("Dairy and Egg Products","Milk, calcium reduced, nonfat, dry",36f,0.2f,52f,354f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg, pasteurized, frozen, raw, white",10f,0f,1f,48f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg, pasteurized, frozen, raw, whole",12f,10f,1f,147f),db);
        addfood(new food_items_model("Dairy and Egg Products","Milk, reduced sugar, lowfat, chocolate",3.4f,1f,7.7f,54f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg substitute, fat free, liquid or frozen",10f,0f,2f,48f),db);
        addfood(new food_items_model("Dairy and Egg Products","Cheese, part-skim, low moisture, mozzarella",24f,20f,5.6f,295f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg, pasteurized, sugared, frozen, raw, yolk",14f,23f,11f,307f),db);
        addfood(new food_items_model("Dairy and Egg Products","Milk, homemade, hot cocoa, chocolate beverage",3.5f,2.3f,11f,77f),db);
        addfood(new food_items_model("Dairy and Egg Products","Egg, glucose reduced, stabilized, dried, whole",48f,44f,2.4f,615f),db);
        addfood(new food_items_model("Dairy and Egg Products","Ice cream bar, covered with chocolate and nuts",5.6f,26f,12f,303f),db);
        addfood(new food_items_model("Dairy and Egg Products","Milk, reduced fat, cultured, fluid, buttermilk",4.1f,2f,5.3f,56f),db);
        addfood(new food_items_model("Dairy and Egg Products","Yogurt, with low calorie sweetener, lowfat, fruit",4.9f,1.4f,19f,105f),db);
        addfood(new food_items_model("Dairy and Egg Products","Milk, with added vitamin D, 3.25% milkfat, whole",3.2f,3.3f,4.8f,61f),db);



        addfood(new food_items_model("Spices and Herbs","Salt, table",0f,0f,0f,0f),db);
        addfood(new food_items_model("Spices and Herbs","Basil, fresh",3.2f,0.6f,2.7f,23f),db);
        addfood(new food_items_model("Spices and Herbs","Vinegar, cider",0f,0f,0.9f,21f),db);
        addfood(new food_items_model("Spices and Herbs","Vanilla extract",0.1f,0.1f,13f,288f),db);
        addfood(new food_items_model("Spices and Herbs","Saffron",11f,5.9f,65f,310f),db);
        addfood(new food_items_model("Spices and Herbs","Cardamom",11f,6.7f,68f,311f),db);
        addfood(new food_items_model("Spices and Herbs","Bay leaf",7.6f,8.4f,75f,313f),db);
        addfood(new food_items_model("Spices and Herbs","Spearmint, fresh",3.3f,0.7f,8.4f,44f),db);
        addfood(new food_items_model("Spices and Herbs","Spearmint, dried",20f,6f,52f,285f),db);
        addfood(new food_items_model("Spices and Herbs","Vinegar, red wine",0f,0f,0.3f,19f),db);
        addfood(new food_items_model("Spices and Herbs","Peppermint, fresh",3.8f,0.9f,15f,70f),db);
        addfood(new food_items_model("Spices and Herbs","Spices, cumin seed",18f,22f,44f,375f),db);
        addfood(new food_items_model("Spices and Herbs","Vinegar, distilled",0f,0f,0f,18f),db);
        addfood(new food_items_model("Spices and Herbs","Celery seed",18f,25f,41f,392f),db);
        addfood(new food_items_model("Spices and Herbs","Fennel seed",16f,15f,52f,345f),db);
        addfood(new food_items_model("Spices and Herbs","Curry powder",14f,14f,56f,325f),db);
        addfood(new food_items_model("Spices and Herbs","Onion powder",10f,1f,79f,341f),db);
        addfood(new food_items_model("Spices and Herbs","Dried, basil",23f,4.1f,48f,233f),db);
        addfood(new food_items_model("Spices and Herbs","Chili powder",13f,14f,50f,282f),db);
        addfood(new food_items_model("Spices and Herbs","White, pepper",10f,2f,69f,296f),db);
        addfood(new food_items_model("Spices and Herbs","Black, pepper",10f,3.3f,64f,251f),db);
        addfood(new food_items_model("Spices and Herbs","Garlic powder",17f,0.7f,73f,331f),db);
        addfood(new food_items_model("Spices and Herbs","Fenugreek seed",23f,6.4f,58f,323f),db);
        addfood(new food_items_model("Spices and Herbs","Ground, cloves",6f,13f,66f,274f),db);
        addfood(new food_items_model("Spices and Herbs","Coriander seed",12f,88f,55f,298f),db);
        addfood(new food_items_model("Spices and Herbs","Ground, nutmeg",5.8f,36f,49f,525f),db);
        addfood(new food_items_model("Spices and Herbs","Ground, ginger",9f,4.2f,72f,335f),db);
        addfood(new food_items_model("Spices and Herbs","Dried, parsley",27f,5.5f,51f,292f),db);
        addfood(new food_items_model("Spices and Herbs","Dried, chervil",23f,3.9f,49f,237f),db);
        addfood(new food_items_model("Spices and Herbs","Dried, oregano",9f,4.3f,69f,265f),db);
        addfood(new food_items_model("Spices and Herbs","Dried, rosemary",4.9f,15f,64f,331f),db);
        addfood(new food_items_model("Spices and Herbs","Dried, dill weed",20f,4.4f,56f,253f),db);
        addfood(new food_items_model("Spices and Herbs","Ground, cinnamon",4f,1.2f,81f,247f),db);
        addfood(new food_items_model("Spices and Herbs","Ground, allspice",6.1f,8.7f,72f,263f),db);
        addfood(new food_items_model("Spices and Herbs","Ground, turmeric",9.7f,3.3f,67f,312f),db);
        addfood(new food_items_model("Spices and Herbs","Poultry seasoning",9.6f,7.5f,66f,307f),db);
        addfood(new food_items_model("Spices and Herbs","Mustard, yellow, prepared",3.7f,3.3f,5.8f,60f),db);
        addfood(new food_items_model("Spices and Herbs","Ground, mustard seed",26f,36f,28f,508f),db);
        addfood(new food_items_model("Spices and Herbs","Dried, coriander leaf",22f,4.8f,5.2f,279f),db);
        addfood(new food_items_model("Spices and Herbs","Red or cayenne, pepper",12f,17f,57f,317f),db);
        addfood(new food_items_model("Spices and Herbs","Seasoning mix, original, chili, dry",11f,7.3f,5.7f,335f),db);


        addfood(new food_items_model("Fats and Oils","Animal fat, bacon grease",0f,100f,0f,897f),db);
        addfood(new food_items_model("Fats and Oils","Palm Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Canola Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Almond Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Fat, turkey",0f,100f,0f,900f),db);
        addfood(new food_items_model("Fats and Oils","Fat, chicken",0f,100f,0f,900f),db);
        addfood(new food_items_model("Fats and Oils","Mustard Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Coconut Oil",0f,99f,0f,892f),db);
        addfood(new food_items_model("Fats and Oils","Teaseed Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Hazelnut Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Rice bran Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Wheat germ Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Cocoa butter Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Fish oil, sardine",0f,100f,0f,902f),db);
        addfood(new food_items_model("Fats and Oils","Nutmeg butter Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Corn and canola Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Salad dressing, coleslaw",0.9f,33f,24f,390f),db);
        addfood(new food_items_model("Fats and Oils","Mayonnaise, made with tofu",6f,32f,3.1f,322f),db);
        addfood(new food_items_model("Fats and Oils","Vegetable oil, palm kernel",0f,100f,0f,862f),db);
        addfood(new food_items_model("Fats and Oils","Oat Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Butter replacement, powder, without fat",2f,1f,89f,373f),db);
        addfood(new food_items_model("Fats and Oils","Olive, peanut, corn Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Apricot kernel Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Avocado Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Grapeseed Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Salad or cooking, cottonseed Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Salad dressing, lite, buttermilk",1.3f,12f,21f,202f),db);
        addfood(new food_items_model("Fats and Oils","Salad dressing, light, mayonnaise-type",0.7f,10f,16f,158f),db);
        addfood(new food_items_model("Fats and Oils","Salad dressing, home recipe, french",0.1f,70f,3.4f,631f),db);
        addfood(new food_items_model("Fats and Oils","Salad dressing, fat-free, caesar",1.5f,0.2f,31f,131f),db);
        addfood(new food_items_model("Fats and Oils","Tomatoseed Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Sheanut Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Salad or cooking, olive Oil",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Salad or cooking, peanut Oil ",0f,100f,0f,884f),db);
        addfood(new food_items_model("Fats and Oils","Salad dressing, low calorie, caesar",0.3f,4.4f,19f,110f),db);
        addfood(new food_items_model("Fats and Oils","Salad dressing, reduced calorie, french dressing",0.4f,13f,27f,227f),db);
        addfood(new food_items_model("Fats and Oils","Vegetable oil-butter spread, reduced calorie",0f,53f,0f,465f),db);
        addfood(new food_items_model("Fats and Oils","Butter, with salt, stick, light",3.3f,55f,0f,499f),db);
        addfood(new food_items_model("Fats and Oils","Fish oil, herring",0f,100f,0f,902f),db);



        addfood(new food_items_model("Soups and Sauces","Coriander Chutney w/ coconut",1f,0f,3f,15f),db);
        addfood(new food_items_model("Soups and Sauces","Coconut Chutney",0.54f,4.98f,2.04f,52f),db);
        addfood(new food_items_model("Soups and Sauces","White Sauce",3.84f,10.63f,9.17f,147f),db);
        addfood(new food_items_model("Soups and Sauces","Tomato Chutney",0f,0f,8f,35f),db);
        addfood(new food_items_model("Soups and Sauces","Tomato Sauce",0.69f,0.08f,3.03f,13f),db);
        addfood(new food_items_model("Soups and Sauces","Minestrone Soup",5f,2f,18f,110f),db);
        addfood(new food_items_model("Soups and Sauces","Mulligatawny Soup",9.33f,13.73f,17.38f,228f),db);
        addfood(new food_items_model("Soups and Sauces","Mushroom Soup",1f,6f,9f,200f),db);
        addfood(new food_items_model("Soups and Sauces","Sweet and Sour Soup",3.22f,0.85f,14.42f,73f),db);
        addfood(new food_items_model("Soups and Sauces","Sweet Corn Soup",4.27f,2.17f,18.49f,101f),db);
        addfood(new food_items_model("Soups and Sauces","Tomato Soup",3.05f,2.93f,17.93f,102f),db);


        addfood(new food_items_model("Soups and Sauces","Barbecue Sauce",0.8f,0.6f,41f,172f),db);
        addfood(new food_items_model("Soups and Sauces","Dry, alfredo mix Sauce",15f,36f,37f,535f),db);
        addfood(new food_items_model("Soups and Sauces","Dry, cheese sauce mix Sauce",7.7f,18f,61f,438f),db);
        addfood(new food_items_model("Soups and Sauces","Horseradish Sauce",1.1f,51f,10f,503f),db);
        addfood(new food_items_model("Soups and Sauces","Original, BULL'S-EYE, barbecue Sauce",0.9f,0.7f,40f,170f),db);
        addfood(new food_items_model("Soups and Sauces","Medium, white, homemade Sauce",3.8f,11f,9.2f,147f),db);
        addfood(new food_items_model("Soups and Sauces","Original, SWEET BABY RAY'S, barbecue Sauce",1f,0.4f,46f,192f),db);
        addfood(new food_items_model("Soups and Sauces","Pepper or hot, ready-to-serve Sauce",0.5f,0.4f,1.8f,11f),db);
        addfood(new food_items_model("Soups and Sauces","Prepared-from-recipe, sweet and sour Sauce",1.8f,0.6f,17f,79f),db);
        addfood(new food_items_model("Soups and Sauces","Ready to serve, mild, red, enchilada Sauce",0.6f,0.9f,4.9f,30f),db);
        addfood(new food_items_model("Soups and Sauces","Ready-to-serve, cheese Sauce",6.7f,13f,6.8f,174f),db);
        addfood(new food_items_model("Soups and Sauces","Ready-to-serve, canned, pizza Sauce",2.2f,1.2f,8.7f,54f),db);
        addfood(new food_items_model("Soups and Sauces","Ready-to-serve, cocktail Sauce",1.4f,1.1f,28f,124f),db);
        addfood(new food_items_model("Soups and Sauces","Ready-to-serve, duck Sauce",0.4f,0.1f,61f,245f),db);
        addfood(new food_items_model("Soups and Sauces","Ready-to-serve, fish Sauce",5.1f,0f,3.6f,35f),db);
        addfood(new food_items_model("Soups and Sauces","Ready-to-serve, tartar Sauce",1f,17f,13f,211f),db);
        addfood(new food_items_model("Soups and Sauces","Ready-to-serve, verde, salsa Sauce",1.1f,0.9f,6.4f,38f),db);
        addfood(new food_items_model("Soups and Sauces","SMART SOUP, Moroccan Chick Pea",2f,1.1f,9.7f,51f),db);
        addfood(new food_items_model("Soups and Sauces","SMART SOUP, Thai Coconut Curry",0.8f,1.1f,6.5f,36f),db);
        addfood(new food_items_model("Soups and Sauces","Canned, low sodium, chicken broth Soup",2f,0.6f,1.2f,16f),db);
        addfood(new food_items_model("Soups and Sauces","Chinese restaurant, egg drop Soup",1.2f,0.6f,4.3f,27f),db);
        addfood(new food_items_model("Soups and Sauces","Condensed, canned, beef noodle Soup",3.9f,2.5f,7.2f,67f),db);
        addfood(new food_items_model("Soups and Sauces","Condensed, canned, black bean Soup",4.8f,1.3f,15f,91f),db);
        addfood(new food_items_model("Soups and Sauces","Condensed, canned, cheese Soup",0.8f,3.9f,11f,82f),db);
        addfood(new food_items_model("Soups and Sauces","Condensed, canned, cream of potato Soup",1.5f,1.9f,13f,74f),db);
        addfood(new food_items_model("Soups and Sauces","Condensed, canned, cream of onion Soup",2.2f,4.2f,10f,88f),db);
        addfood(new food_items_model("Soups and Sauces","Condensed, canned, cream of mushroom Soup",1.4f,5.3f,6.8f,79f),db);
        addfood(new food_items_model("Soups and Sauces","Condensed, canned, green, pea Soup",6.5f,2.2f,20f,125f),db);
        addfood(new food_items_model("Soups and Sauces","Condensed, canned, cream of celery Soup",1.3f,4.5f,7f,72f),db);
        addfood(new food_items_model("Soups and Sauces","Condensed, canned, cream of chicken Soup",2.4f,5.8f,7.2f,90f),db);
        addfood(new food_items_model("Soups and Sauces","Condensed, canned, tomato rice Soup",1.6f,2.1f,17f,93f),db);
        addfood(new food_items_model("Soups and Sauces","Condensed, canned, tomato Soup",1.5f,0.4f,15f,66f),db);
        addfood(new food_items_model("Soups and Sauces","Condensed, canned, vegetable beef Soup",4.5f,1.5f,8.1f,63f),db);
        addfood(new food_items_model("Soups and Sauces","Dry, chicken broth cubes Soup",15f,4.7f,24f,198f),db);
        addfood(new food_items_model("Soups and Sauces","Dry, cubed, beef broth Soup",17f,4f,16f,170f),db);
        addfood(new food_items_model("Soups and Sauces","Mix, dry, chicken noodle Soup",15f,6.5f,62f,377f),db);
        addfood(new food_items_model("Soups and Sauces","Mix, dry, onion Soup",7.5f,0.3f,65f,293f),db);
        addfood(new food_items_model("Soups and Sauces","Powder, dry, cream of vegetable Soup",8f,24f,52f,446f),db);
        addfood(new food_items_model("Soups and Sauces","Medium, salsa con queso, TOSTITOS Dip",2.9f,8.3f,12f,133f),db);
        addfood(new food_items_model("Soups and Sauces","Medium, Cheese 'n Salsa, OLD EL PASO Dip",2.7f,8.4f,11f,129f),db);
        addfood(new food_items_model("Soups and Sauces","Original flavor, bean, FRITO'S Dip",5.4f,3.7f,16f,119f),db);
        addfood(new food_items_model("Soups and Sauces","Thick, white, homemade Sauce",4f,14f,12f,186f),db);
        addfood(new food_items_model("Soups and Sauces","Thin, white, homemade Sauce",3.8f,6.7f,7.4f,105f),db);
        addfood(new food_items_model("Soups and Sauces","Tomato based, steak Sauce",1.3f,0.2f,22f,95f),db);
        addfood(new food_items_model("Soups and Sauces","Chinese restaurant, hot and sour Soup",2.6f,1.2f,4.4f,39f),db);
        addfood(new food_items_model("Soups and Sauces","Condensed, canned, chicken noodle Soup",2.4f,1.6f,6.1f,48f),db);
        addfood(new food_items_model("Soups and Sauces","Condensed, canned, chicken vegetable Soup",2.9f,2.3f,7f,61f),db);
        addfood(new food_items_model("Soups and Sauces","Condensed, canned, onion Soup",3.1f,1.4f,6.7f,46f),db);


        addfood(new food_items_model("Fruits","Amla",0.9f,0.1f,6.9f,96f),db);
        addfood(new food_items_model("Fruits","Fruit Chat",1f,1.28f,19.73f,85f),db);
        addfood(new food_items_model("Fruits","Jamun",0f,0f,0f,100f),db);
        addfood(new food_items_model("Fruits","Lychee",0.83f,0.44f,16.53f,66f),db);
        addfood(new food_items_model("Fruits","Zizyphus / Bor",1f,0f,17f,74f),db);
        addfood(new food_items_model("Fruits","Mulberry",1.44f,0.39f,9.8f,43f),db);
        addfood(new food_items_model("Fruits","Orange Duet",1f,0f,23f,90f),db);
        addfood(new food_items_model("Fruits","Pale Green Grapes",1f,0f,18f,69f),db);
        addfood(new food_items_model("Fruits","Seetaphal",1.7f,0.6f,25.2f,101f),db);

        addfood(new food_items_model("Fruits","Apple,raw with skin",0.3f,0.2f,13.8f,52f),db);
        addfood(new food_items_model("Fruits","Apple,raw without skin",0.3f,0.1f,12.8f,48f),db);
        addfood(new food_items_model("Fruits","Apricot",1.4f,0.4f,11f,48f),db);
        addfood(new food_items_model("Fruits","Avocado",2f,15f,9f,160f),db);
        addfood(new food_items_model("Fruits","Banana",1.1f,0.3f,23f,89f),db);
        addfood(new food_items_model("Fruits","Bilberry",0.7f,0.5f,11.5f,44f),db);
        addfood(new food_items_model("Fruits","Blackberry",1.4f,0.5f,10f,43f),db);
        addfood(new food_items_model("Fruits","Blackcurrant",1.4f,0.4f,15.4f,63.1f),db);
        addfood(new food_items_model("Fruits","Blueberry",0.7f,0.3f,14f,57f),db);
        addfood(new food_items_model("Fruits","Cherry",1f,0.3f,12f,50f),db);
        addfood(new food_items_model("Fruits","Coconut",3.3f,33f,15f,354f),db);
        addfood(new food_items_model("Fruits","Cranberry",0.4f,0.1f,12f,46f),db);
        addfood(new food_items_model("Fruits","Custard Apple",2.1f,0.3f,24f,94f),db);
        addfood(new food_items_model("Fruits","Date",2.5f,0.4f,75f,282f),db);
        addfood(new food_items_model("Fruits","Durian",1.5f,5f,27f,147f),db);
        addfood(new food_items_model("Fruits","Elderberry",0.7f,0.5f,18f,73f),db);
        addfood(new food_items_model("Fruits","Grape",0.6f,0.4f,17f,67f),db);
        addfood(new food_items_model("Fruits","Raisin",3.1f,0.5f,79f,299f),db);
        addfood(new food_items_model("Fruits","Grapefruit",0.8f,0.1f,11f,42f),db);
        addfood(new food_items_model("Fruits","Guava",2.6f,1f,14f,68f),db);
        addfood(new food_items_model("Fruits","Honeyberry",1.6f,0.3f,14f,60f),db);
        addfood(new food_items_model("Fruits","Huckleberry",0.4f,0.1f,9f,37f),db);
        addfood(new food_items_model("Fruits","Jackfruit",1.7f,0.6f,23f,95f),db);
        addfood(new food_items_model("Fruits","Kiwifruit",1.1f,0.5f,15f,61f),db);
        addfood(new food_items_model("Fruits","Lemon",1.1f,0.3f,9f,29f),db);
        addfood(new food_items_model("Fruits","Lime",0.7f,0.2f,11f,30f),db);
        addfood(new food_items_model("Fruits","Mango",0.8f,0.4f,15f,60f),db);
        addfood(new food_items_model("Fruits","Marionberry",1.4f,0.7f,15.6f,63.8f),db);
        addfood(new food_items_model("Fruits","Watermelon",0.6f,0.2f,8f,30f),db);
        addfood(new food_items_model("Fruits","Olive",0.8f,11f,6f,115f),db);
        addfood(new food_items_model("Fruits","Orange",0.9f,0.1f,12f,47f),db);
        addfood(new food_items_model("Fruits","Tangerine",0.8f,0.3f,13f,53f),db);
        addfood(new food_items_model("Fruits","Papaya",0.5f,0.3f,11f,43f),db);
        addfood(new food_items_model("Fruits","Peach",0.9f,0.3f,10f,39f),db);
        addfood(new food_items_model("Fruits","Pear",0.4f,0.1f,15f,57f),db);
        addfood(new food_items_model("Fruits","Plum",0.7f,0.3f,11f,46f),db);
        addfood(new food_items_model("Fruits","Pineapple",0.5f,0.1f,13f,50f),db);
        addfood(new food_items_model("Fruits","Pomegranate",1.7f,1.2f,19f,83f),db);
        addfood(new food_items_model("Fruits","Raspberry",1.2f,0.7f,12f,53f),db);
        addfood(new food_items_model("Fruits","Salmonberry",0.9f,0.3f,10f,47f),db);
        addfood(new food_items_model("Fruits","Salak",4f,1f,13f,82f),db);
        addfood(new food_items_model("Fruits","Satsuma",0.6f,0.3f,11.2f,45f),db);
        addfood(new food_items_model("Fruits","Star fruit",1f,0.3f,7f,31f),db);
        addfood(new food_items_model("Fruits","Strawberry",0.7f,0.3f,8f,33f),db);
        addfood(new food_items_model("Fruits","Tamarind",2.8f,0.6f,63f,239f),db);
        addfood(new food_items_model("Fruits","Sapodilla",0.4f,1.1f,20f,83f),db);

        addfood(new food_items_model("Vegetables","Coriander Leaves",2f,1f,4f,23f),db);
        addfood(new food_items_model("Vegetables","Lime Split",0f,4f,12f,86f),db);
        addfood(new food_items_model("Vegetables","Yam / Fried Kand",0f,0f,0f,185f),db);
        addfood(new food_items_model("Vegetables","Yam / Kand",1.53f,0.17f,27.88f,118f),db);
        addfood(new food_items_model("Vegetables","Sweet Potato",1.57f,0.05f,20.12f,86f),db);
        addfood(new food_items_model("Vegetables","Mix Vegetables",2.9f,0.6f,7.9f,49f),db);
        addfood(new food_items_model("Vegetables","Padval/Snake Gourd",2f,0f,2f,20f),db);

        addfood(new food_items_model("Vegetables","Artichoke",3.3f,0.2f,11f,47f),db);
        addfood(new food_items_model("Vegetables","Ash gourd / white gourd",0.4f,0.2f,3f,13f),db);
        addfood(new food_items_model("Vegetables","Beans - green Beans",21f,1.2f,63f,347f),db);
        addfood(new food_items_model("Vegetables","Beetroot",1.6f,0.2f,10f,43f),db);
        addfood(new food_items_model("Vegetables","Bitter Gourd",1f,0.17f,3.7f,17f),db);
        addfood(new food_items_model("Vegetables","Brussels sprouts",3.4f,0.3f,9f,43f),db);
        addfood(new food_items_model("Vegetables","Butternut Squash",1f,0.1f,12f,45f),db);
        addfood(new food_items_model("Vegetables","Capsicum",2f,0.2f,9f,40f),db);
        addfood(new food_items_model("Vegetables","Cluster beans",3f,0f,11f,16f),db);
        addfood(new food_items_model("Vegetables","Collards",3f,0.6f,5f,32f),db);
        addfood(new food_items_model("Vegetables","Corn / Maize",9f,4.7f,74f,365f),db);
        addfood(new food_items_model("Vegetables","Drumstick Moringa",2.1f,0.2f,8.5f,37f),db);
        addfood(new food_items_model("Vegetables","Fenugreek leaves",23f,6f,58f,323f),db);
        addfood(new food_items_model("Vegetables","Mustard greens",2.9f,0.4f,4.7f,27f),db);
        addfood(new food_items_model("Vegetables","Peppers",2f,0.2f,9f,40f),db);
        addfood(new food_items_model("Vegetables","Pumpkin",1f,0.1f,7f,26f),db);
        addfood(new food_items_model("Vegetables","Ridgegourd",0.7f,0.3f,14f,56f),db);
        addfood(new food_items_model("Vegetables","Spinach",2.9f,0.4f,3.6f,23f),db);
        addfood(new food_items_model("Vegetables","Snake gourd",1.5f,1.5f,10f,100f),db);
        addfood(new food_items_model("Vegetables","Turnips",0.9f,0.1f,6f,28f),db);
        addfood(new food_items_model("Vegetables","Asparagus",2.2f,0.1f,4f,20f),db);
        addfood(new food_items_model("Vegetables","Bell Pepper",2f,0.2f,9f,40f),db);
        addfood(new food_items_model("Vegetables","Broccoli",2.8f,0.4f,7f,34f),db);
        addfood(new food_items_model("Vegetables","Carrot",1f,0.2f,10f,41f),db);
        addfood(new food_items_model("Vegetables","Cauliflower",2f,0.3f,5f,25f),db);
        addfood(new food_items_model("Vegetables","Celery",0.7f,0.2f,3f,16f),db);
        addfood(new food_items_model("Vegetables","Cucumber",0.7f,0.1f,3.6f,16f),db);
        addfood(new food_items_model("Vegetables","Green Beans",1.8f,0.1f,7f,31f),db);
        addfood(new food_items_model("Vegetables","Green Cabbage",1f,0f,5f,25f),db);
        addfood(new food_items_model("Vegetables","Green Onion",1.8f,0.2f,7f,32f),db);
        addfood(new food_items_model("Vegetables","Iceberg Lattice",0.9f,0.1f,3f,14f),db);
        addfood(new food_items_model("Vegetables","Leaf Lettuce",1.4f,0.2f,2.9f,15f),db);
        addfood(new food_items_model("Vegetables","Mushrooms",3.1f,0.3f,3.3f,22f),db);
        addfood(new food_items_model("Vegetables","Onion",1.1f,0.1f,9f,40f),db);
        addfood(new food_items_model("Vegetables","Potato",2f,0.1f,17f,77f),db);
        addfood(new food_items_model("Vegetables","Radishes",0.7f,0.1f,3.4f,16f),db);
        addfood(new food_items_model("Vegetables","Summer Squash",1.2f,0.2f,3.4f,16f),db);
        addfood(new food_items_model("Vegetables","Sweet Corn",3.2f,1.2f,19f,86f),db);
        addfood(new food_items_model("Vegetables","Sweet Potato",1.6f,0.1f,20f,86f),db);
        addfood(new food_items_model("Vegetables","Tomato",1f,0.2f,3.9f,18f),db);
        addfood(new food_items_model("Vegetables","Brinjal",1f,0.2f,6f,25f),db);
        addfood(new food_items_model("Vegetables","Peas",5f,0.4f,14f,81f),db);
        addfood(new food_items_model("Vegetables","Lady's finger/Okra",1.9f,0.2f,7f,33f),db);
        addfood(new food_items_model("Vegetables","Lemon",1.1f,0.3f,9f,29f),db);
        addfood(new food_items_model("Vegetables","Bottle guard",0.6f,0f,3.4f,14f),db);


        addfood(new food_items_model("Nut and Seed Products","Anjir Nuts",3.3f,0.93f,63.87f,249f),db);
        addfood(new food_items_model("Nut and Seed Products","Groundnuts",25.8f,49.2f,16.1f,567f),db);
        addfood(new food_items_model("Nut and Seed Products","Soyanuts Plain",35.22f,25.4f,33.55f,471f),db);
        addfood(new food_items_model("Nut and Seed Products","Phansi / French Beans",27f,3f,96f,510f),db);
        addfood(new food_items_model("Nut and Seed Products","Pistachios",20.61f,44.44f,27.97f,557f),db);
        addfood(new food_items_model("Nut and Seed Products","Pork and Bean Sprouts",2.7f,7.5f,1.05f,93f),db);
        addfood(new food_items_model("Nut and Seed Products","Roasted Chana",18.64f,6.26f,58.5f,355f),db);
        addfood(new food_items_model("Nut and Seed Products","Salted Pista",21.3f,45.9f,26.7f,568f),db);

        addfood(new food_items_model("Nut and Seed Products","Pecans",9.2f,72f,14f,691f),db);
        addfood(new food_items_model("Nut and Seed Products","Almonds",21f,50f,22f,579f),db);
        addfood(new food_items_model("Nut and Seed Products","Raw, acorns",6.2f,24f,41f,387f),db);
        addfood(new food_items_model("Nut and Seed Products","Almond paste",9f,28f,48f,458f),db);
        addfood(new food_items_model("Nut and Seed Products","Raw, cashew nuts",18f,44f,30f,553f),db);
        addfood(new food_items_model("Nut and Seed Products","English, walnuts",15f,65f,14f,654f),db);
        addfood(new food_items_model("Nut and Seed Products","Dried, butternuts",25f,57f,12f,612f),db);
        addfood(new food_items_model("Nut and Seed Products","Hazelnuts or filberts",15f,61f,17f,628f),db);
        addfood(new food_items_model("Nut and Seed Products","Full fat, acorn flour",7.5f,30f,55f,501f),db);
        addfood(new food_items_model("Nut and Seed Products","Dried, pinyon, pine nuts",12f,61f,19f,629f),db);
        addfood(new food_items_model("Nut and Seed Products","Seeds, dried, breadnut tree seeds",8.6f,1.7f,79f,367f),db);
        addfood(new food_items_model("Nut and Seed Products","Seeds, dried, whole, sesame seeds",18f,50f,23f,573f),db);
        addfood(new food_items_model("Nut and Seed Products","Roasted, chinese, chestnuts",4.5f,1.2f,52f,239f),db);
        addfood(new food_items_model("Nut and Seed Products","Roasted, japanese, chestnuts",3f,0.8f,45f,201f),db);
        addfood(new food_items_model("Nut and Seed Products","Seeds, dried, sunflower seed kernels",21f,51f,20f,584f),db);
        addfood(new food_items_model("Nut and Seed Products","Blanched, hazelnuts or filberts",14f,61f,17f,629f),db);
        addfood(new food_items_model("Nut and Seed Products","Seeds, partially defatted, sesame flour",40f,12f,35f,382f),db);
        addfood(new food_items_model("Nut and Seed Products","Unpeeled, raw, european, chestnuts",2.4f,2.3f,46f,213f),db);
        addfood(new food_items_model("Nut and Seed Products","With salt added, plain, cashew butter",12f,53f,30f,609f),db);
        addfood(new food_items_model("Nut and Seed Products","With salt added, dry roasted, pecans",9.5f,74f,14f,710f),db);
        addfood(new food_items_model("Nut and Seed Products","With salt added, dry roasted, walnuts",14f,61f,18f,643f),db);
        addfood(new food_items_model("Nut and Seed Products","With salt added, oil roasted, almonds",21f,55f,18f,607f),db);
        addfood(new food_items_model("Nut and Seed Products","Boiled and steamed, japanese, chestnuts",0.8f,0.2f,13f,56f),db);
        addfood(new food_items_model("Nut and Seed Products","Seeds, with salt added, sunflower seed butter",17f,55f,23f,617f),db);
        addfood(new food_items_model("Nut and Seed Products","Boiled and steamed, european, chestnuts",2f,1.4f,28f,131f),db);
        addfood(new food_items_model("Nut and Seed Products","Without salt added, plain, cashew butter",18f,49f,28f,587f),db);
        addfood(new food_items_model("Nut and Seed Products","Without salt added, dry roasted, almonds",21f,53f,21f,598f),db);
        addfood(new food_items_model("Nut and Seed Products","Without salt added, oil roasted, almonds",21f,55f,18f,607f),db);
        addfood(new food_items_model("Nut and Seed Products","With salt added, oil roasted, cashew nuts",17f,48f,30f,581f),db);
        addfood(new food_items_model("Nut and Seed Products","With salt added, dry roasted, cashew nuts",15f,46f,33f,574f),db);
        addfood(new food_items_model("Nut and Seed Products","Creamed, dried (desiccated), coconut meat",5.3f,69f,22f,684f),db);
        addfood(new food_items_model("Nut and Seed Products","With salt added, with peanuts, dry roasted, mixed nuts",17f,51f,25f,594f),db);
        addfood(new food_items_model("Nut and Seed Products","Without salt added, dry roasted, hazelnuts or filberts",15f,62f,18f,646f),db);
        addfood(new food_items_model("Nut and Seed Products","With salt added, with peanuts, oil roasted, mixed nuts",20f,54f,21f,607f),db);
        addfood(new food_items_model("Nut and Seed Products","Packaged, flaked, sweetened, dried (desiccated), coconut meat",3.1f,28f,52f,456f),db);
        addfood(new food_items_model("Nut and Seed Products","Raw (liquid expressed from grated meat and water), coconut milk",2.3f,24f,5.5f,230f),db);
        addfood(new food_items_model("Nut and Seed Products","Seeds, with salt added, dry roasted, sunflower seed kernels from shell",19f,50f,15f,546f),db);
        addfood(new food_items_model("Nut and Seed Products","Seeds, from roasted and toasted kernels (most common type), tahini, sesame butter",17f,54f,21f,595f),db);
        addfood(new food_items_model("Nut and Seed Products","Seeds, raw, breadfruit seeds",7.4f,5.6f,29f,191f),db);
        addfood(new food_items_model("Nut and Seed Products","Raw, chinese, chestnuts",4.2f,1.1f,49f,224f),db);
        addfood(new food_items_model("Nut and Seed Products","Seeds, without salt, oil roasted, sunflower seed kernels",20f,51f,23f,592f),db);
        addfood(new food_items_model("Nut and Seed Products","Seeds, without salt, dry roasted, sunflower seed kernels",19f,50f,24f,582f),db);
        addfood(new food_items_model("Nut and Seed Products","Lightly salted, with peanuts, oil roasted, mixed nuts",20f,54f,21f,607f),db);
        addfood(new food_items_model("Nut and Seed Products","Seeds, with salt added, roasted, whole, pumpkin and squash seeds",19f,19f,54f,446f),db);
        addfood(new food_items_model("Nut and Seed Products","Without salt added, without peanuts, oil roasted, mixed nuts",16f,56f,22f,615f),db);
        addfood(new food_items_model("Nut and Seed Products","Without salt, all flavors except macadamia, wheat-based, formulated",13f,62f,21f,647f),db);



        addfood(new food_items_model("Restaurant Foods","Aloo Gobi Veg",2f,3.2f,16f,70f),db);
        addfood(new food_items_model("Restaurant Foods","Aloo Mutter",7f,13.5f,16.5f,190f),db);
        addfood(new food_items_model("Restaurant Foods","Aloo Palak",1.5f,2.4f,10f,75f),db);
        addfood(new food_items_model("Restaurant Foods","Aloo Parantha",3f,5f,26f,162f),db);
        addfood(new food_items_model("Restaurant Foods","Boondi Raita",3f,5f,5.5f,80f),db);
        addfood(new food_items_model("Restaurant Foods","Bread Upma",0f,0f,0f,160f),db);
        addfood(new food_items_model("Restaurant Foods","Brinjal & Potato",5f,8f,32f,222f),db);
        addfood(new food_items_model("Restaurant Foods","Brinjal Bharta",2.1f,4.7f,13.7f,105.3f),db);
        addfood(new food_items_model("Restaurant Foods","Butter Dosa Plain",4f,12f,28f,200f),db);
        addfood(new food_items_model("Restaurant Foods","Butter Idli",3f,7f,1f,80f),db);
        addfood(new food_items_model("Restaurant Foods","Butter Nan",0f,0f,50f,235f),db);
        addfood(new food_items_model("Restaurant Foods","Butter Uttapam",14f,20f,50f,500f),db);
        addfood(new food_items_model("Restaurant Foods","Coconut Rice",7f,21f,61f,453f),db);
        addfood(new food_items_model("Restaurant Foods","Cooked Moong Dal",3.8f,7.2f,23f,214.6f),db);
        addfood(new food_items_model("Restaurant Foods","Cooked Muth / Mothbeans",7f,0.7f,20f,120f),db);
        addfood(new food_items_model("Restaurant Foods","Cooked Soya Bean",24.8f,13.3f,14.8f,258f),db);
        addfood(new food_items_model("Restaurant Foods","Cooked Tur Dal",10.4f,5.3f,29.2f,194.3f),db);
        addfood(new food_items_model("Restaurant Foods","Cucumber Raita",3f,0f,2.5f,25.2f),db);
        addfood(new food_items_model("Restaurant Foods","Curd Rice",8f,6f,44f,250f),db);
        addfood(new food_items_model("Restaurant Foods","Dahi Batata Puri",12.3f,9.2f,64.1f,378f),db);
        addfood(new food_items_model("Restaurant Foods","Dahi Bhalle",5.5f,8.4f,25.5f,194f),db);
        addfood(new food_items_model("Restaurant Foods","Dahi Vada",5f,8f,11f,140f),db);
        addfood(new food_items_model("Restaurant Foods","Dal Dhokli",18f,3f,50f,300f),db);
        addfood(new food_items_model("Restaurant Foods","Dal Fried",18f,25f,0f,450f),db);
        addfood(new food_items_model("Restaurant Foods","Dal Makhani",15f,5f,43f,520f),db);
        addfood(new food_items_model("Restaurant Foods","Dal Soup",12f,3f,35f,220f),db);
        addfood(new food_items_model("Restaurant Foods","Dry Paneer Tikka",0f,0f,0f,39f),db);
        addfood(new food_items_model("Restaurant Foods","Dum Aloo",8f,7f,37f,180f),db);
        addfood(new food_items_model("Restaurant Foods","French Beans, Peas & Onion",1.59f,2.44f,8.66f,58f),db);
        addfood(new food_items_model("Restaurant Foods","Fried Brinjal",4f,14f,0f,176f),db);
        addfood(new food_items_model("Restaurant Foods","Fried Chana Dal",30f,10f,60f,350f),db);
        addfood(new food_items_model("Restaurant Foods","Fried Chicken",30f,12f,1.8f,246f),db);
        addfood(new food_items_model("Restaurant Foods","Ghee Dosa",0f,0f,0f,250f),db);
        addfood(new food_items_model("Restaurant Foods","Gobi Paratha",9f,6f,46f,269f),db);
        addfood(new food_items_model("Restaurant Foods","Green Salad",1.52f,0.24f,3.2f,17f),db);
        addfood(new food_items_model("Restaurant Foods","Kadhai Chicken",15f,15f,5f,250f),db);
        addfood(new food_items_model("Restaurant Foods","Kadhi",4.5f,5.5f,10.5f,107f),db);
        addfood(new food_items_model("Restaurant Foods","Kaju Mutter Masala",0f,0f,0f,272f),db);
        addfood(new food_items_model("Restaurant Foods","Kaju Puri",13f,12f,26f,249f),db);
        addfood(new food_items_model("Restaurant Foods","Kashmiri Pulav",20f,34f,84f,720f),db);
        addfood(new food_items_model("Restaurant Foods","Khichdi",4.08f,1.19f,22.85f,116f),db);
        addfood(new food_items_model("Restaurant Foods","Kulcha",9f,2f,59f,294f),db);
        addfood(new food_items_model("Restaurant Foods","Lemon Rice",14f,20f,94f,300f),db);
        addfood(new food_items_model("Restaurant Foods","Veg Malai Kofta",4f,21f,13f,250f),db);
        addfood(new food_items_model("Restaurant Foods","Veg Soup",2f,0f,14f,64f),db);
        addfood(new food_items_model("Restaurant Foods","Veg Stew",3.9f,1.5f,15f,94f),db);
        addfood(new food_items_model("Restaurant Foods","Waldorf Salad",2f,3f,5f,54f),db);
        addfood(new food_items_model("Restaurant Foods","Small Puri",3f,3f,17f,107f),db);
        addfood(new food_items_model("Restaurant Foods","Stuffed Capsicum",30f,12f,24f,337f),db);
        addfood(new food_items_model("Restaurant Foods","Stuffed Potatoes",5.57f,6.44f,18.27f,151f),db);
        addfood(new food_items_model("Restaurant Foods","Tandoori Roti with ghee",0f,0f,0f,147f),db);
        addfood(new food_items_model("Restaurant Foods","Tandoori Roti without ghee",6f,1f,32f,75f),db);
        addfood(new food_items_model("Restaurant Foods","Thalipeeth",0f,0f,0f,135f),db);
        addfood(new food_items_model("Restaurant Foods","Tinda Cooked",6f,2f,25f,135f),db);
        addfood(new food_items_model("Restaurant Foods","Tomato Pulav",14f,4f,106f,516f),db);
        addfood(new food_items_model("Restaurant Foods","Tomato Onion Raita",4f,1f,6f,50f),db);
        addfood(new food_items_model("Restaurant Foods","Tomato Rasam",5f,2f,15f,45f),db);
        addfood(new food_items_model("Restaurant Foods","Upma",25f,11f,77f,364f),db);
        addfood(new food_items_model("Restaurant Foods","Veg Biryani",0f,0f,0f,250f),db);
        addfood(new food_items_model("Restaurant Foods","Veg Kolhapuri",8f,34f,22f,448f),db);
        addfood(new food_items_model("Restaurant Foods","Veg Korma",30f,77f,480f,2699f),db);
        addfood(new food_items_model("Restaurant Foods","Veg Pulav",6f,10f,3f,121f),db);
        addfood(new food_items_model("Restaurant Foods","Masala Dosa",38f,78f,86f,1178f),db);
        addfood(new food_items_model("Restaurant Foods","Medu Vada",40f,6f,4f,229f),db);
        addfood(new food_items_model("Restaurant Foods","Mexican Rice",1.38f,3.45f,11.76f,82f),db);
        addfood(new food_items_model("Restaurant Foods","Mexican Tacos",9f,13f,20f,226f),db);
        addfood(new food_items_model("Restaurant Foods","Misal",15f,12f,32f,279f),db);
        addfood(new food_items_model("Restaurant Foods","Mysore Masala Dosa",8f,27f,13f,322f),db);
        addfood(new food_items_model("Restaurant Foods","Mysore Sada Dosa",4f,2f,28f,152f),db);
        addfood(new food_items_model("Restaurant Foods","Onion Uttapam",7f,1f,41f,200f),db);
        addfood(new food_items_model("Restaurant Foods","Palak Paneer",26f,155f,12f,300f),db);
        addfood(new food_items_model("Restaurant Foods","Paneer Bhurji",0f,10f,0f,100f),db);
        addfood(new food_items_model("Restaurant Foods","Mutter Paneer ",82f,17f,25f,580f),db);
        addfood(new food_items_model("Restaurant Foods","Paper Dosa",41f,19f,5f,380f),db);
        addfood(new food_items_model("Restaurant Foods","Paratha",44f,9f,39f,358f),db);
        addfood(new food_items_model("Restaurant Foods","Muli Paratha",26f,2f,0f,120f),db);
        addfood(new food_items_model("Restaurant Foods","Pakoda Kadhi",4.8f,2.5f,9f,148f),db);
        addfood(new food_items_model("Restaurant Foods","Pav Bhaji",32f,32f,218f,1308f),db);
        addfood(new food_items_model("Restaurant Foods","Payasam",60f,51f,45f,1000f),db);
        addfood(new food_items_model("Restaurant Foods","Pea Pulav",16f,8f,112f,770f),db);
        addfood(new food_items_model("Restaurant Foods","Phulka with ghee",3f,3f,21f,121f),db);
        addfood(new food_items_model("Restaurant Foods","Plain Butter Dosa",41f,19f,5f,380f),db);
        addfood(new food_items_model("Restaurant Foods","Plain Nan",10f,7f,56f,340f),db);
        addfood(new food_items_model("Restaurant Foods","Pomfret Curry",3.5f,20f,15f,240f),db);
        addfood(new food_items_model("Restaurant Foods","Pomfret Fry",28f,28f,116f,810f),db);
        addfood(new food_items_model("Restaurant Foods","Pongal",9f,5f,47f,268f),db);
        addfood(new food_items_model("Restaurant Foods","Pork Curry",10f,1.8f,5.3f,40f),db);
        addfood(new food_items_model("Restaurant Foods","Pork Stew",24f,7f,27f,272f),db);
        addfood(new food_items_model("Restaurant Foods","Pork Vindaloo",38f,7f,36f,379f),db);
        addfood(new food_items_model("Restaurant Foods","Prawn Curry",32f,1.7f,0f,150f),db);
        addfood(new food_items_model("Restaurant Foods","Prawn Pulao",26f,23f,82f,656f),db);
        addfood(new food_items_model("Restaurant Foods","Ragi Roti",2f,5f,31f,186f),db);
        addfood(new food_items_model("Restaurant Foods","Rajmah Cooked",13f,0.9f,38f,210f),db);
        addfood(new food_items_model("Restaurant Foods","Rava Masala Dosa",11f,42f,69f,385f),db);
        addfood(new food_items_model("Restaurant Foods","Rava Sada Dosa",2f,2f,13f,83f),db);
        addfood(new food_items_model("Restaurant Foods","Ravas Curry",0f,0f,0f,404f),db);
        addfood(new food_items_model("Restaurant Foods","Ravas Fry",0f,0f,0f,120f),db);
        addfood(new food_items_model("Restaurant Foods","Rice Boiled",0f,0f,0f,100f),db);
        addfood(new food_items_model("Restaurant Foods","Roasted Mutton",33f,11f,0f,234f),db);
        addfood(new food_items_model("Restaurant Foods","Roomali Roti",2f,1f,10f,80f),db);
        addfood(new food_items_model("Restaurant Foods","Phulka w/o Ghee",0f,0f,4f,20f),db);
        addfood(new food_items_model("Restaurant Foods","Sardine Curry",44f,44f,36f,700f),db);
        addfood(new food_items_model("Restaurant Foods","Sardine Fry",17f,34f,533f,2400f),db);
        addfood(new food_items_model("Restaurant Foods","Seer Curry",19f,1f,46f,260f),db);
        addfood(new food_items_model("Restaurant Foods","Seer Fry",18f,7.1f,0f,136f),db);
        addfood(new food_items_model("Restaurant Foods","Shahi Kababs",6f,9f,1f,111f),db);
        addfood(new food_items_model("Restaurant Foods","Shark Curry",22f,142f,460f,3100f),db);
        addfood(new food_items_model("Restaurant Foods","Shark Fry",18.62f,13.82f,6.39f,228f),db);
        addfood(new food_items_model("Restaurant Foods","Shark Stew",16.98f,5.9f,21.77f,209f),db);
        addfood(new food_items_model("Restaurant Foods","Shepu / Suva Bhaji",4f,18f,10f,212f),db);
        addfood(new food_items_model("Restaurant Foods","Shrimp Curry",6f,9f,25f,210f),db);
        addfood(new food_items_model("Restaurant Foods","Shrimp Rice",16f,16f,44f,354f),db);
        addfood(new food_items_model("Restaurant Foods","Murg Masala",49f,60f,114f,1206f),db);
        addfood(new food_items_model("Restaurant Foods","Mint Raita",0f,0f,0f,450f),db);
        addfood(new food_items_model("Restaurant Foods","Mix Vegetable Raita",32f,13f,0f,250f),db);
        addfood(new food_items_model("Restaurant Foods","Onion Raita",8f,8f,12f,150f),db);
        addfood(new food_items_model("Restaurant Foods","Pineapple Raita",0f,0f,29f,120f),db);
        addfood(new food_items_model("Restaurant Foods","Potato Raita",14.4f,1.2f,0f,200f),db);
        addfood(new food_items_model("Restaurant Foods","Palak Raita",0f,0f,0f,100f),db);


        addfood(new food_items_model("Restaurant Foods","Breaded and fried, shrimp, family style",13f,19f,22f,308f),db);
        addfood(new food_items_model("Restaurant Foods","Arroz con habichuelas colorados (Rice And Red Beans), Latino",4f,3.5f,24f,142f),db);
        addfood(new food_items_model("Restaurant Foods","APPLEBEE'S, chili",13f,9.8f,4.6f,157f),db);
        addfood(new food_items_model("Restaurant Foods","DENNY'S, coleslaw",1f,15f,11f,183f),db);
        addfood(new food_items_model("Restaurant Foods","DENNY'S, onion rings",5.3f,22f,41f,385f),db);
        addfood(new food_items_model("Restaurant Foods","DENNY'S, hash browns",2.5f,9f,27f,197f),db);
        addfood(new food_items_model("Restaurant Foods","APPLEBEE'S, coleslaw",0.8f,7.1f,13f,120f),db);
        addfood(new food_items_model("Restaurant Foods","DENNY'S, french fries",3.4f,14f,35f,282f),db);
        addfood(new food_items_model("Restaurant Foods","DENNY'S, chicken strips",19f,15f,22f,295f),db);
        addfood(new food_items_model("Restaurant Foods","CRACKER BARREL, coleslaw",0.9f,13f,13f,175f),db);
        addfood(new food_items_model("Restaurant Foods","APPLEBEE'S, french fries",3.3f,13f,40f,290f),db);
        addfood(new food_items_model("Restaurant Foods","DENNY'S, top sirloin steak",29f,7.3f,0.1f,182f),db);
        addfood(new food_items_model("Restaurant Foods","CRACKER BARREL, steak fries",3.3f,13f,31f,255f),db);
        addfood(new food_items_model("Restaurant Foods","DENNY'S, golden fried shrimp",14f,20f,21f,319f),db);
        addfood(new food_items_model("Restaurant Foods","APPLEBEE'S, mozzarella sticks",15f,18f,23f,316f),db);
        addfood(new food_items_model("Restaurant Foods","T.G.I. FRIDAY'S, french fries",3.7f,15f,37f,296f),db);
        addfood(new food_items_model("Restaurant Foods","APPLEBEE'S, Double Crunch Shrimp",12f,19f,26f,323f),db);
        addfood(new food_items_model("Restaurant Foods","Pork, tamale, Latino",7.4f,9f,16f,174f),db);
        addfood(new food_items_model("Restaurant Foods","Tripe soup, Latino",8.6f,2.6f,4.1f,74f),db);
        addfood(new food_items_model("Restaurant Foods","APPLEBEE'S, hand battered, fish",13f,9.1f,17f,202f),db);
        addfood(new food_items_model("Restaurant Foods","DENNY'S, spaghetti and meatballs",7.8f,8.5f,16f,170f),db);
        addfood(new food_items_model("Restaurant Foods","CARRABBA'S ITALIAN GRILL, lasagne",10f,11f,12f,191f),db);
        addfood(new food_items_model("Restaurant Foods","T.G.I. FRIDAY'S, fried mozzarella",16f,19f,25f,333f),db);
        addfood(new food_items_model("Restaurant Foods","DENNY'S, mozzarella cheese sticks",14f,18f,27f,324f),db);
        addfood(new food_items_model("Restaurant Foods","Coleslaw, family style",0.9f,12f,12f,159f),db);
        addfood(new food_items_model("Restaurant Foods","Sesame chicken, Chinese",14f,14f,27f,293f),db);
        addfood(new food_items_model("Restaurant Foods","Lemon chicken, Chinese",12f,14f,21f,252f),db);
        addfood(new food_items_model("Restaurant Foods","Refried beans, Mexican",6.9f,6.8f,17f,156f),db);
        addfood(new food_items_model("Restaurant Foods","Orange chicken, Chinese",14f,13f,22f,262f),db);
        addfood(new food_items_model("Restaurant Foods","Black bean soup, Latino",5.1f,2.6f,15f,103f),db);
        addfood(new food_items_model("Restaurant Foods","APPLEBEE'S, 9 oz house sirloin steak",27f,9.1f,0f,189f),db);
        addfood(new food_items_model("Restaurant Foods","Cheese enchilada, Mexican",11f,18f,15f,273f),db);
        addfood(new food_items_model("Restaurant Foods","Kung pao chicken, Chinese",9.8f,7f,6.9f,129f),db);
        addfood(new food_items_model("Restaurant Foods","Cheese quesadilla, Mexican",16f,23f,24f,368f),db);
        addfood(new food_items_model("Restaurant Foods","Lasagna with meat, Italian",11f,11f,11f,185f),db);
        addfood(new food_items_model("Restaurant Foods","Chicken chow mein, Chinese",6.8f,2.8f,8.3f,85f),db);
        addfood(new food_items_model("Restaurant Foods","French fries, family style",3.5f,14f,37f,289f),db);
        addfood(new food_items_model("Restaurant Foods","CRACKER BARREL, thick-cut, onion rings",4.8f,16f,41f,327f),db);
        addfood(new food_items_model("Restaurant Foods","Sirloin steak, family style",30f,8.5f,0f,195f),db);
        addfood(new food_items_model("Restaurant Foods","Beef and vegetables, Chinese",7.1f,5.3f,7.3f,105f),db);
        addfood(new food_items_model("Restaurant Foods","Assorted, egg rolls, Chinese",8.3f,12f,27f,250f),db);
        addfood(new food_items_model("Restaurant Foods","Sweet and sour pork, Chinese",8.9f,16f,23f,270f),db);
        addfood(new food_items_model("Restaurant Foods","Shrimp and vegetables, Chinese",5.9f,4.1f,4.5f,78f),db);
        addfood(new food_items_model("Restaurant Foods","General tso's chicken, Chinese",13f,16f,24f,295f),db);
        addfood(new food_items_model("Restaurant Foods","CRACKER BARREL, farm raised catfish platter",23f,17f,5.3f,266f),db);
        addfood(new food_items_model("Restaurant Foods","Sweet and sour chicken, Chinese",10f,13f,24f,250f),db);
        addfood(new food_items_model("Restaurant Foods","OLIVE GARDEN, spaghetti with pomodoro sauce",4.3f,1.9f,17f,102f),db);
        addfood(new food_items_model("Restaurant Foods","APPLEBEE'S, from kids' menu, chicken tenders",19f,16f,18f,296f),db);
        addfood(new food_items_model("Restaurant Foods","Restaurant, prepared, beef, empanadas, Latino",11f,18f,31f,335f),db);
        addfood(new food_items_model("Restaurant Foods","OLIVE GARDEN, chicken parmigiana without pasta",15f,11f,12f,211f),db);
        addfood(new food_items_model("Restaurant Foods","T.G.I. FRIDAY'S, classic sirloin steak (10 oz)",31f,7.8f,0.5f,196f),db);
        addfood(new food_items_model("Restaurant Foods","OLIVE GARDEN, cheese ravioli with marinara sauce",7.4f,5.6f,20f,159f),db);
        addfood(new food_items_model("Restaurant Foods","DENNY'S, fried, battered or breaded, fish fillet",14f,12f,17f,234f),db);
        addfood(new food_items_model("Restaurant Foods","Bunuelos (fried yeast bread), Latino",8f,26f,49f,462f),db);
        addfood(new food_items_model("Restaurant Foods","Spaghetti and meatballs, family style",7.8f,8.5f,16f,170f),db);
        addfood(new food_items_model("Restaurant Foods","T.G.I. FRIDAY'S, from kids' menu, chicken fingers",18f,21f,18f,330f),db);
        addfood(new food_items_model("Restaurant Foods","CRACKER BARREL, fried, chicken tenderloin platter",18f,15f,20f,293f),db);
        addfood(new food_items_model("Restaurant Foods","CARRABBA'S ITALIAN GRILL, spaghetti with meat sauce",5.9f,3.9f,16f,122f),db);
        addfood(new food_items_model("Restaurant Foods","Chicken parmesan without pasta, Italian",16f,11f,11f,204f),db);
        addfood(new food_items_model("Restaurant Foods","Chili with meat and beans, family style",13f,9.8f,4.6f,157f),db);
        addfood(new food_items_model("Restaurant Foods","Pupusas del cerdo (pupusas, pork), Latino",12f,10f,23f,232f),db);
        addfood(new food_items_model("Restaurant Foods","Arepa (unleavened cornmeal bread), Latino",5.5f,5.4f,37f,219f),db);
        addfood(new food_items_model("Restaurant Foods","Prepared, entree, chicken and rice, Latino",12f,5.1f,20f,174f),db);
        addfood(new food_items_model("Restaurant Foods","DENNY'S, from kid's menu, star shaped, chicken nuggets",16f,29f,14f,377f),db);
        addfood(new food_items_model("Restaurant Foods","Pupusas con queso (pupusas, cheese), Latino",12f,13f,22f,256f),db);
        addfood(new food_items_model("Restaurant Foods","CRACKER BARREL, from kid's menu, macaroni n' cheese plate",6.5f,12f,16f,192f),db);
        addfood(new food_items_model("Restaurant Foods","CARRABBA'S ITALIAN GRILL, cheese ravioli with marinara sauce",8f,6f,18f,156f),db);
        addfood(new food_items_model("Restaurant Foods","Fried, battered or breaded, fish fillet, family style",13f,11f,17f,219f),db);
        addfood(new food_items_model("Restaurant Foods","ON THE BORDER, cheese and lettuce, soft taco with ground beef",13f,11f,19f,229f),db);
        addfood(new food_items_model("Restaurant Foods","CRACKER BARREL, from kid's menu, fried, chicken tenderloin platter",19f,15f,20f,294f),db);
        addfood(new food_items_model("Restaurant Foods","CARRABBA'S ITALIAN GRILL, chicken parmesan without cavatappi pasta",19f,11f,7.8f,206f),db);
        addfood(new food_items_model("Restaurant Foods","Restaurant, cheese and lettuce, soft taco with ground beef, Mexican",13f,11f,18f,219f),db);
        addfood(new food_items_model("Restaurant Foods","Spanish rice, Mexican",3.3f,5.3f,31f,185f),db);
        addfood(new food_items_model("Restaurant Foods","Cheese tamales, Mexican",9f,12f,18f,216f),db);

        addfood(new food_items_model("Baby Foods","Milk",3.4f,1f,5f,42f),db);
        addfood(new food_items_model("Baby Foods","Milk w/ Bournvita",14f,15f,10f,200f),db);
        addfood(new food_items_model("Baby Foods","Milk w/ Complan",0f,0f,0f,400f),db);
        addfood(new food_items_model("Baby Foods","Milk w/ Horlicks",9.6f,4.3f,27f,189f),db);
        addfood(new food_items_model("Baby Foods","Milk w/ Kesar",6f,6f,24f,178f),db);

        addfood(new food_items_model("Baby Foods","Apple-cranberry juice",0f,0f,11f,46f),db);
        addfood(new food_items_model("Baby Foods","Tropical fruit medley",0.3f,0.1f,12f,51f),db);
        addfood(new food_items_model("Baby Foods","Toddler, dices, apples",0.2f,0.1f,12f,51f),db);
        addfood(new food_items_model("Baby Foods","Junior, peaches, fruit",0.9f,0.3f,14f,65f),db);
        addfood(new food_items_model("Baby Foods","Apple and prune, juice",0.2f,0.1f,18f,72f),db);
        addfood(new food_items_model("Baby Foods","Apple and peach, juice",0.2f,0.1f,11f,43f),db);
        addfood(new food_items_model("Baby Foods","Junior, cherry cobbler",0.3f,0.1f,19f,78f),db);
        addfood(new food_items_model("Baby Foods","Orange and apple, juice",0.4f,0.2f,10f,43f),db);
        addfood(new food_items_model("Baby Foods","Strained, chicken, meat",14f,7.9f,0.1f,130f),db);
        addfood(new food_items_model("Baby Foods","Strained, peaches, fruit",0.9f,0.3f,14f,65f),db);
        addfood(new food_items_model("Baby Foods","Orange and banana, juice",0.7f,0.1f,12f,50f),db);
        addfood(new food_items_model("Baby Foods","Apple-sweet potato, juice",0.3f,0.1f,11f,48f),db);
        addfood(new food_items_model("Baby Foods","Orange and apricot, juice",0.8f,0.1f,11f,46f),db);
        addfood(new food_items_model("Baby Foods","Junior, squash, vegetables",0.8f,0.2f,5.7f,24f),db);
        addfood(new food_items_model("Baby Foods","Orange and pineapple, juice",0.5f,0.1f,12f,48f),db);
        addfood(new food_items_model("Baby Foods","Junior, tutti frutti, fruit",0.4f,0.4f,16f,69f),db);
        addfood(new food_items_model("Baby Foods","Beef with vegetables, dinner",2f,6.9f,6.4f,96f),db);
        addfood(new food_items_model("Baby Foods","Strained, mixed fruit yogurt",0.8f,0.8f,16f,75f),db);
        addfood(new food_items_model("Baby Foods","Pasta with vegetables, dinner",1.7f,2.1f,8.4f,60f),db);
        addfood(new food_items_model("Baby Foods","Toddler, beef lasagna, dinner",4.2f,2.1f,10f,77f),db);
        addfood(new food_items_model("Baby Foods","Strained,banana yogurt,dessert",1.1f,0.5f,17f,78f),db);
        addfood(new food_items_model("Baby Foods","Dry, with bananas,mixed,cereal",11f,4.6f,77f,391f),db);
        addfood(new food_items_model("Baby Foods","Strained,with egg yolks, cereal",1.9f,1.8f,7f,51f),db);
        addfood(new food_items_model("Baby Foods","Strained,bananas and rice,plums",1.1f,0.3f,13f,57f),db);
        addfood(new food_items_model("Baby Foods","Strained, corn and sweet potatoes",1.3f,0.3f,15f,68f),db);
        addfood(new food_items_model("Baby Foods","Junior, creamed, corn, vegetables",1.4f,0.4f,16f,65f),db);
        addfood(new food_items_model("Baby Foods","Junior, pears and pineapple, fruit",0.3f,0.2f,11f,44f),db);
        addfood(new food_items_model("Baby Foods","Junior, apple and blueberry, fruit",0.2f,0.2f,17f,62f),db);
        addfood(new food_items_model("Baby Foods","Junior, sweet potatoes, vegetables",1.1f,0.1f,14f,60f),db);
        addfood(new food_items_model("Baby Foods","Junior, vegetables and ham, dinner",2f,1.9f,8.6f,60f),db);
        addfood(new food_items_model("Baby Foods","Strained, blueberry yogurt, dessert",0.5f,0.7f,17f,77f),db);
        addfood(new food_items_model("Baby Foods","Junior, vegetables and beef, dinner",2.2f,3.6f,8.8f,77f),db);
        addfood(new food_items_model("Baby Foods","Toddler, beef with vegetables, meat",3.5f,2.1f,8.7f,68f),db);
        addfood(new food_items_model("Baby Foods","Strained, banana with mixed berries",1f,0.4f,21f,92f),db);
        addfood(new food_items_model("Baby Foods","Toddler, fruit medley, juice treats",0f,0f,87f,347f),db);
        addfood(new food_items_model("Baby Foods","Junior, bananas with tapioca, fruit",0.4f,0.2f,18f,67f),db);
        addfood(new food_items_model("Baby Foods","Strained, apple and raspberry, fruit",0.2f,0.2f,16f,58f),db);
        addfood(new food_items_model("Baby Foods","Strained, apples and chicken, dinner",2.2f,1.4f,11f,65f),db);
        addfood(new food_items_model("Baby Foods","Strained, apple and blueberry, fruit",0.2f,0.2f,16f,61f),db);
        addfood(new food_items_model("Baby Foods","Strained, vegetables and beef, dinner",2.2f,3.6f,8.8f,77f),db);
        addfood(new food_items_model("Baby Foods","Strained, bananas with tapioca, fruit",0.4f,0.1f,15f,56f),db);
        addfood(new food_items_model("Baby Foods","Junior, vegetables and turkey, dinner",1.7f,1.7f,7.6f,53f),db);
        addfood(new food_items_model("Baby Foods","Strained, vegetables and lamb, dinner",2f,2f,6.9f,52f),db);
        addfood(new food_items_model("Baby Foods","Strained, creamed, spinach, vegetables",2.5f,1.3f,5.7f,37f),db);
        addfood(new food_items_model("Baby Foods","Junior, applesauce and cherries, fruit",0f,0f,14f,51f),db);
        addfood(new food_items_model("Baby Foods","Strained, vegetables and bacon, dinner",1.9f,3f,8.8f,69f),db);
        addfood(new food_items_model("Baby Foods","Junior, pears, fruit",0.3f,0.1f,12f,44f),db);
        addfood(new food_items_model("Baby Foods","Dry, rice and apples",6.7f,2.4f,87f,396f),db);
        addfood(new food_items_model("Baby Foods","Strained, veal, meat",13f,2.5f,1.5f,81f),db);
        addfood(new food_items_model("Baby Foods","Apple and plum, juice",0.1f,0f,12f,49f),db);
        addfood(new food_items_model("Baby Foods","Apple - cherry, juice",0.2f,0.1f,11f,47f),db);
        addfood(new food_items_model("Baby Foods","Peach yogurt, dessert",0.9f,0.2f,18f,76f),db);
        addfood(new food_items_model("Baby Foods","Fruit supreme dessert",0.5f,0.2f,17f,73f),db);
        addfood(new food_items_model("Baby Foods","Junior, beef, meat",12f,2.5f,2.4f,81f),db);
        addfood(new food_items_model("Baby Foods","Fruit, baby, cookie",6.8f,13f,74f,435f),db);
        addfood(new food_items_model("Baby Foods","Apple-banana juice",0.2f,0.1f,12f,51f),db);
        addfood(new food_items_model("Baby Foods","Junior, ham, meat",11f,3.8f,3.7f,97f),db);
        addfood(new food_items_model("Baby Foods","Arrowroot, cookies",7.6f,10f,75f,424f),db);
        addfood(new food_items_model("Baby Foods","Junior, lamb, meat",15f,5.2f,0f,112f),db);
        addfood(new food_items_model("Baby Foods","Cookies",12f,13f,67f,433f),db);
        addfood(new food_items_model("Baby Foods","Pretzels",11f,2f,82f,397f),db);
        addfood(new food_items_model("Baby Foods","Pear, juice",0f,0f,12f,47f),db);
        addfood(new food_items_model("Baby Foods","Apple, juice",0f,0.1f,12f,47f),db);
        addfood(new food_items_model("Baby Foods","Orange, juice",0.6f,0.3f,10f,45f),db);
        addfood(new food_items_model("Baby Foods","Toddler, carrots",0.6f,0.3f,5.2f,26f),db);
        addfood(new food_items_model("Baby Foods","Toddler, potatoes",1f,0.1f,12f,52f),db);
        addfood(new food_items_model("Baby Foods","Teething biscuits",11f,4.2f,76f,392f),db);


        addfood(new food_items_model("Beverages","Almond MilkShake",1.59f,3.78f,1.488f,43f),db);
        addfood(new food_items_model("Beverages","Almond MilkShake with Icecream",3.59f,17.78f,43.488f,343f),db);
//addfood(new food_items_model("Beverages","Anjir MilkShake",f,f,f,f),db);
//addfood(new food_items_model("Beverages","Anjir MilkShake with Icecream",f,f,f,f),db);
        addfood(new food_items_model("Beverages","Apple MilkShake",0.16f,0.29f,30.61f,123f),db);
        addfood(new food_items_model("Beverages","Apple MilkShake with Icecream",2.16f,14.29f,72.61f,423f),db);
        addfood(new food_items_model("Beverages","Banana Milkshake",13f,11f,32f,282f),db);
        addfood(new food_items_model("Beverages","Beer",1.17f,0f,9f,109f),db);
        addfood(new food_items_model("Beverages","Black Coffee",0f,0f,0f,0f),db);
        addfood(new food_items_model("Beverages","Black Tea",1.33f,1.18f,2.12f,24f),db);
        addfood(new food_items_model("Beverages","Brandy",0f,0f,0f,517.5f),db);
        addfood(new food_items_model("Beverages","Butter milk",6.85f,1.82f,9.91f,83f),db);
        addfood(new food_items_model("Beverages","Coca Cola",0.22f,0.06f,30.06f,116f),db);
        addfood(new food_items_model("Beverages","Cocktail",3f,28f,21f,340f),db);
        addfood(new food_items_model("Beverages","Coconut Milk",8.3f,8.38f,11.65f,155f),db);
        addfood(new food_items_model("Beverages","Coconut Water",1.4f,0f,8.1f,41f),db);
        addfood(new food_items_model("Beverages","Coffee",0.3f,0.05f,0.1f,3f),db);
        addfood(new food_items_model("Beverages","Coke",0f,0f,11f,139f),db);
        addfood(new food_items_model("Beverages","Cold Coffee",0.46f,0.21f,1.19f,9f),db);
        addfood(new food_items_model("Beverages","Cold Coffee with Icecream",0.46f,0.21f,1.19f,9f),db);
        addfood(new food_items_model("Beverages","Condensed Milk",0.51f,0.56f,3.51f,21f),db);
        addfood(new food_items_model("Beverages","Cow's Milk",6.64f,6.7f,9.32f,124f),db);
        addfood(new food_items_model("Beverages","Dryfruit Milkshake",0f,0f,0f,0f),db);
        addfood(new food_items_model("Beverages","Dryfruit Milkshake with Icecream",2f,14f,42f,300f),db);
        addfood(new food_items_model("Beverages","Fanta",0f,0f,0f,156f),db);
        addfood(new food_items_model("Beverages","Grape juice",1.48f,0.21f,39.46f,161f),db);
//addfood(new food_items_model("Beverages","Kaju Anjir Milkshake",f,f,f,f),db);
//addfood(new food_items_model("Beverages","Kaju Milkshake",f,f,f,f),db);
//addfood(new food_items_model("Beverages","Kashmiri Soda",f,f,f,f),db);
//addfood(new food_items_model("Beverages","Kesar Pista Milkshake",f,f,f,f),db);
        addfood(new food_items_model("Beverages","Lemonade",0.22f,0.13f,32.8f,126f),db);
//addfood(new food_items_model("Beverages","Lichee Milkshake",f,f,f,f),db);
//addfood(new food_items_model("Beverages","Lichee Milkshake with Icecream",f,f,f,f),db);
        addfood(new food_items_model("Beverages","Limca",0f,0f,27f,110f),db);
        addfood(new food_items_model("Beverages","Mango Juice",0f,0f,0f,135f),db);
        addfood(new food_items_model("Beverages","Mango Milkshake",9f,1f,48f,237f),db);
        addfood(new food_items_model("Beverages","Mango Milkshake with Icecream",11f,15f,90f,537f),db);
//addfood(new food_items_model("Beverages","Mandeli Curry",f,f,f,f),db);
        addfood(new food_items_model("Beverages","Martini",0.08f,0f,3.89f,463f),db);
        addfood(new food_items_model("Beverages","Vodka",0f,0f,0f,434f),db);
        addfood(new food_items_model("Beverages","Watermelon Juice",1.54f,0.38f,19.02f,76f),db);
        addfood(new food_items_model("Beverages","Whisky",0f,0f,0.03f,71f),db);
        addfood(new food_items_model("Beverages","Wine",0.14f,0f,5.17f,165f),db);
        addfood(new food_items_model("Beverages","Strawberry Milkshake",0f,0f,0f,190f),db);
        addfood(new food_items_model("Beverages","Strawberry Milkshake with Icecream",2f,14f,42f,490f),db);
        addfood(new food_items_model("Beverages","Sugarcane Juice",4f,4f,10f,130f),db);
        addfood(new food_items_model("Beverages","Sweet Lassi",25f,5f,30f,234f),db);
        addfood(new food_items_model("Beverages","Tea",0f,0f,0.8f,0f),db);
        addfood(new food_items_model("Beverages","Thumps Up",11f,2f,0f,57f),db);
        addfood(new food_items_model("Beverages","Tomato Juice",1.95f,0.13f,10.9f,44f),db);
//        addfood(new food_items_model("Beverages","Vanila Milkshake with Icecream",f,f,f,f),db);
        addfood(new food_items_model("Beverages","Vanilla Milkshake",9.27f,7.27f,42.61f,269f),db);
        addfood(new food_items_model("Beverages","Orange Juice",11.27f,21.27f,84.61f,529f),db);
        addfood(new food_items_model("Beverages","Pepsi",2f,7f,34f,210f),db);
        addfood(new food_items_model("Beverages","Pepsi",6f,9f,2f,200f),db);
        addfood(new food_items_model("Beverages","Pineapple Juice",0.95f,0.32f,33.94f,140f),db);
        addfood(new food_items_model("Beverages","Pineapple Milkshake",0.95f,0.32f,33.94f,140f),db);
        addfood(new food_items_model("Beverages","Pineapple Milkshake w/icecream",2.95f,14.32f,75.94f,440f),db);
        addfood(new food_items_model("Beverages","Pomegranate Juice",0.8f,0f,29f,120f),db);
//addfood(new food_items_model("Beverages","Rimzim",f,f,f,f),db);
        addfood(new food_items_model("Beverages","Rum",0f,0f,0f,65f),db);
        addfood(new food_items_model("Beverages","Salty Lassi",11.4f,3.3f,20f,150f),db);
        addfood(new food_items_model("Beverages","Scotch",0f,0f,0.01f,26f),db);
        addfood(new food_items_model("Beverages","Sherry",0.1f,0f,3.4f,45f),db);
//addfood(new food_items_model("Beverages","Sitaphal Milkshake",f,f,f,f),db);
//addfood(new food_items_model("Beverages","Sitaphal Milkshake w/icecream",f,f,f,f),db);
//addfood(new food_items_model("Beverages","Skimmed Tea w/No Milk",f,f,f,f),db);
//addfood(new food_items_model("Beverages","Skimmed Tea w/No Sugar",f,f,f,f),db);


        addfood(new food_items_model("Beverages","Water, generic, bottled",0f,0f,0f,0f),db);
        addfood(new food_items_model("Beverages","Beverages, cola, ZEVIA",0f,0f,1.1f,0f),db);
        addfood(new food_items_model("Beverages","Chocolate syrup",2.1f,1.1f,65f,279f),db);
        addfood(new food_items_model("Beverages","Powder, Lemonade",0f,1.1f,98f,376f),db);
        addfood(new food_items_model("Beverages","Well, tap, water",0f,0f,0f,0f),db);
        addfood(new food_items_model("Beverages","Rose, wine",0.4f,0f,3.8f,83f),db);
        addfood(new food_items_model("Beverages","Rice (sake)",0.5f,0f,5f,134f),db);
        addfood(new food_items_model("Beverages","Light, wine",0.1f,0f,1.2f,49f),db);
        addfood(new food_items_model("Beverages","Light, beer",0.2f,0f,1.6f,29f),db);
        addfood(new food_items_model("Beverages","Non-alcoholic, Wine",0.5f,0f,1.1f,6f),db);
        addfood(new food_items_model("Beverages","Canned, grape drink",0f,0f,16f,61f),db);
        addfood(new food_items_model("Beverages","Brewed, Oolong, tea",0f,0f,0.2f,1f),db);
        addfood(new food_items_model("Beverages","Orange juice drink",0.2f,0f,13f,54f),db);
        addfood(new food_items_model("Beverages","Green tea",0f,0.2f,6.2f,27f),db);
        addfood(new food_items_model("Beverages","Unsweetened, ready to drink, green, tea",0f,0f,0f,0f),db);
        addfood(new food_items_model("Beverages","Prepared with tap water, brewed, coffee",0.1f,0f,0f,1f),db);
        addfood(new food_items_model("Beverages","Diet, lemon, decaffeinated, instant, tea",3.3f,0.6f,85f,338f),db);
        addfood(new food_items_model("Beverages","Prepared with whole milk, chocolate syrup",3.1f,3f,13f,90f),db);
        addfood(new food_items_model("Beverages","Unsweetened, decaffeinated, instant, tea",20f,0f,59f,315f),db);
        addfood(new food_items_model("Beverages","Lemon-lime soda, carbonated",0.1f,0f,10f,41f),db);
        addfood(new food_items_model("Beverages","Unsweetened, ready-to-drink, Coconut water",0.2f,0f,4.2f,18f),db);
        addfood(new food_items_model("Beverages","Lemon, ready-to-drink, black, tea, NESTEA",0f,0f,9.1f,36f),db);
        addfood(new food_items_model("Beverages","Frozen concentrate, fruit punch juice drink",0.3f,0.7f,43f,175f),db);
        addfood(new food_items_model("Beverages","Powder, breakfast type, orange-flavor drink",0f,0f,99f,386f),db);
        addfood(new food_items_model("Beverages","Prepared with tap water, brewed, black, tea",0f,0f,0.3f,1f),db);
        addfood(new food_items_model("Beverages","Lemonade, Minute Maid, The COCA-COLA company",0f,0f,12f,46f),db);
        addfood(new food_items_model("Beverages","Whey and milk based, Chocolate-flavored drink",0.6f,0.4f,11f,49f),db);
        addfood(new food_items_model("Beverages","Restaurant-prepared, espresso, brewed, coffee",0.1f,0.2f,1.7f,9f),db);
        addfood(new food_items_model("Beverages","Prepared with water, unsweetened, instant, tea",0.1f,0f,0.2f,1f),db);
        addfood(new food_items_model("Beverages","Lemon, ready-to-drink, black, tea, LIPTON BRISK",0f,0f,8.8f,35f),db);
        addfood(new food_items_model("Beverages","Canned, without added nutrients, fruit punch drink",0f,0f,12f,48f),db);
        addfood(new food_items_model("Beverages","Prepared with whole milk, powder, Eggnog-flavor mix",2.9f,3f,14f,95f),db);
        addfood(new food_items_model("Beverages","Prepared with fat free milk, powder, chocolate malt",3.3f,0.2f,8.6f,49f),db);
        addfood(new food_items_model("Beverages","Prepared with water, sweetened, lemon, instant, tea",0f,0.1f,8.6f,35f),db);
        addfood(new food_items_model("Beverages","Prepared with water, decaffeinated, instant, coffee",0.1f,0f,0.4f,2f),db);
        addfood(new food_items_model("Beverages","Ready-to-drink, nutritional drink, Boost plus, NESTLE",5.4f,5.4f,17f,138f),db);
        addfood(new food_items_model("Beverages","Alcoholic beverage, Semillon, white, table, wine",0.1f,0f,3.1f,82f),db);
        addfood(new food_items_model("Beverages","Cocoa mix, Rich Chocolate Hot Cocoa Mix, NESTLE",3f,15f,75f,400f),db);
        addfood(new food_items_model("Beverages","Alcoholic beverage, 63 proof, coffee, liqueur",0.1f,0.3f,32f,308f),db);
        addfood(new food_items_model("Beverages","Powder, chocolate, malted drink mix",5.1f,4.8f,87f,411f),db);
        addfood(new food_items_model("Beverages","Alcoholic Beverage, Mouvedre, red, table, wine",0.1f,0f,2.6f,88f),db);
        addfood(new food_items_model("Beverages","Alcoholic Beverage, Barbera, red, table, wine",0.1f,0f,2.8f,85f),db);
        addfood(new food_items_model("Beverages","Without caffeine, cola, carbonated",0f,0f,11f,41f),db);
        addfood(new food_items_model("Beverages","Alcoholic Beverage, Merlot, red, table, wine",0.1f,0f,2.5f,83f),db);
        addfood(new food_items_model("Beverages","Alcoholic beverage, 80 proof, rum, distilled",0f,0f,0f,231f),db);
        addfood(new food_items_model("Beverages","Powder, no sugar added, Cocoa mix",15f,3f,72f,377f),db);
        addfood(new food_items_model("Beverages","Horchata",0.5f,0.7f,12f,54f),db);
        addfood(new food_items_model("Beverages","Sweetened, mocha, instant, coffee",5.3f,16f,74f,460f),db);
        addfood(new food_items_model("Beverages","Diet Cranberry Juice, OCEAN SPRAY",0.1f,0f,0.8f,4f),db);
        addfood(new food_items_model("Beverages","Decaffeinated, brewed, green, tea",0f,0f,0f,0f),db);
        addfood(new food_items_model("Beverages","Powder, unsweetened, instant, tea",20f,0f,59f,315f),db);
        addfood(new food_items_model("Beverages","Beverages, diet, lemon, ready-to-drink, tea",0f,0f,0.4f,2f),db);
        addfood(new food_items_model("Beverages","Alcoholic Beverage, Syrah, red, table, wine",0.1f,0f,2.6f,83f),db);
        addfood(new food_items_model("Beverages","Unsweetened, lemon tea",7.4f,0.2f,79f,345f),db);
        addfood(new food_items_model("Beverages","Alcoholic beverage, BUD LIGHT, light, beer",0.3f,0f,1.3f,29f),db);
        addfood(new food_items_model("Beverages","Alcoholic beverage, low carb, light, beer",0.2f,0f,0.7f,27f),db);
        addfood(new food_items_model("Beverages","Alcoholic beverages, higher alcohol, beer",0.9f,0f,0.3f,58f),db);
        addfood(new food_items_model("Beverages","Limeade, Lemonada, MINUTE MAID",0f,0f,14f,50f),db);
        addfood(new food_items_model("Beverages","Alcoholic beverage, sweet, dessert, wine",0.2f,0f,14f,160f),db);
        addfood(new food_items_model("Beverages","Alcoholic beverage, canned, whiskey sour",0f,0f,13f,119f),db);
        addfood(new food_items_model("Beverages","Canned, Clam and tomato juice",0.6f,0.2f,11f,48f),db);
        addfood(new food_items_model("Beverages","With chicory, instant, coffee",9.3f,0.2f,79f,355f),db);
        addfood(new food_items_model("Beverages","Sugar free, AMP, Energy drink",0f,0f,1f,2f),db);
        addfood(new food_items_model("Beverages","No pulp, light, Orange juice",0.2f,0f,5.4f,21f),db);
        addfood(new food_items_model("Beverages","Light Cranberry, OCEAN SPRAY",0.2f,0f,4.7f,19f),db);
        addfood(new food_items_model("Beverages","Alcoholic beverage, dry, dessert, wine",0.2f,0f,12f,152f),db);
        addfood(new food_items_model("Beverages","Alcoholic beverage, all, regular, beer",0.5f,0f,3.6f,43f),db);
        addfood(new food_items_model("Beverages","Alcoholic beverage, white, table, wine",0.1f,0f,2.6f,82f),db);
        addfood(new food_items_model("Beverages","Kiwi Strawberry Juice Drink",0f,0f,12f,47f),db);
        addfood(new food_items_model("Beverages","Lemonade, prepared with water, powder",0f,0f,3.6f,14f),db);
        addfood(new food_items_model("Beverages","Ready to drink, black, tea",0f,0f,0f,0f),db);
        addfood(new food_items_model("Beverages","Protein powder whey based",78f,1.6f,6.3f,352f),db);
        addfood(new food_items_model("Beverages","Alcoholic beverage, red, table, wine",0.1f,0f,2.6f,85f),db);
        addfood(new food_items_model("Beverages","Canned, grape juice drink",0f,0f,15f,57f),db);
        addfood(new food_items_model("Beverages","Alcoholic beverage, canned, daiquiri",0f,0f,16f,125f),db);
        addfood(new food_items_model("Beverages","Alcoholic beverage, all, table, wine",0.1f,0f,2.7f,83f),db);
        addfood(new food_items_model("Beverages","Lemonade, white, frozen concentrate",0.2f,0.7f,50f,196f),db);
        addfood(new food_items_model("Beverages","Cranberry juice cocktail",0f,0.3f,12f,52f),db);
        addfood(new food_items_model("Beverages","Cran Grape, OCEAN SPRAY",0.2f,0f,13f,54f),db);
        addfood(new food_items_model("Beverages","Tonic water, carbonated",0f,0f,8.8f,34f),db);
        addfood(new food_items_model("Beverages","Lemonade, pink, frozen concentrate",0.2f,0.7f,49f,192f),db);
        addfood(new food_items_model("Beverages","RED BULL, Energy drink",0.5f,0f,10f,43f),db);
        addfood(new food_items_model("Beverages","Alcoholic beverage, cooking, wine",0.5f,0f,6.3f,50f),db);
        addfood(new food_items_model("Beverages","Unsweetened, rice milk",0.3f,1f,9.2f,47f),db);
        addfood(new food_items_model("Beverages","Grape soda, carbonated",0f,0f,11f,43f),db);
        addfood(new food_items_model("Beverages","Root beer, carbonated",0f,0f,11f,41f),db);
        addfood(new food_items_model("Beverages","Citrus, Energy drink",0f,0f,11f,45f),db);
        addfood(new food_items_model("Beverages","Club soda, carbonated",0f,0f,0f,0f),db);
        addfood(new food_items_model("Beverages","Brewed, hibiscus, tea",0f,0f,0f,0f),db);
        addfood(new food_items_model("Beverages","Drinking, tap, water",0f,0f,0f,0f),db);



        addfood(new food_items_model("Legumes and Legume Products","Papad",26f,3.3f,60f,371f),db);
        addfood(new food_items_model("Legumes and Legume Products","Okara",3.5f,1.7f,12f,76f),db);
        addfood(new food_items_model("Legumes and Legume Products","Natto",19f,11f,23f,211f),db);
        addfood(new food_items_model("Legumes and Legume Products","Tempeh",20f,11f,7.6f,192f),db);
        addfood(new food_items_model("Legumes and Legume Products","Tofu yogurt",3.5f,1.8f,16f,94f),db);
        addfood(new food_items_model("Legumes and Legume Products","Tofu, fried",19f,20f,8.9f,270f),db);
        addfood(new food_items_model("Legumes and Legume Products","Meat extender",42f,3f,35f,311f),db);
        addfood(new food_items_model("Legumes and Legume Products","Tempeh, cooked",20f,11f,7.6f,195f),db);
        addfood(new food_items_model("Legumes and Legume Products","Bacon, meatless",12f,30f,5.3f,309f),db);
        addfood(new food_items_model("Legumes and Legume Products","Chicken, meatless",24f,13f,3.6f,224f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Nog, soymilk",2.5f,1.6f,12f,74f),db);
        addfood(new food_items_model("Legumes and Legume Products","Soy flour, low-fat",50f,8.9f,31f,372f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Chai, soymilk",2.6f,1.4f,7.8f,53f),db);
        addfood(new food_items_model("Legumes and Legume Products","Vegetarian fillets",23f,18f,9f,290f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Plain, soymilk",2.9f,1.7f,3.3f,41f),db);
        addfood(new food_items_model("Legumes and Legume Products","Soy flour, defatted",51f,1.2f,34f,327f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Mocha, soymilk",2.1f,1.4f,9.1f,58f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Coffee, soymilk",2.1f,1.4f,10f,62f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Plain soy yogurt",2.6f,1.8f,9.7f,66f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Peach soy yogurt",2.4f,1.2f,19f,94f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Vanilla, soymilk",2.5f,1.4f,4.1f,41f),db);
        addfood(new food_items_model("Legumes and Legume Products","Hummus, home prepared",4.9f,8.6f,20f,177f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanuts, raw, spanish",26f,50f,16f,570f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Hazelnut Creamer",0f,6.7f,20f,133f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Original Creamer",0f,6.7f,6.7f,100f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanut flour, low fat",34f,22f,31f,248f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanut flour, defatted",52f,0.6f,35f,327f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanuts, raw, virginia",25f,49f,17f,563f),db);
        addfood(new food_items_model("Legumes and Legume Products","Chickpea flour (besan)",22f,6.7f,58f,387f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Chocolate, soymilk",2.1f,1.4f,9.5f,58f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanuts, raw, all types",26f,49f,16f,567f),db);
        addfood(new food_items_model("Legumes and Legume Products","Soy flour, raw, full-fat",38f,21f,32f,434f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Plus Fiber, soymilk",2.5f,1.4f,5.8f,41f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Blueberry soy yogurt",2.4f,1.2f,17f,88f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Raspberry soy yogurt",2.4f,1.2f,18f,88f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Light Plain, soymilk",2.5f,.8f,3.3f,29f),db);
        addfood(new food_items_model("Legumes and Legume Products","Lupins, raw, mature seeds",36f,9.7f,40f,371f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Unsweetened, soymilk",2.9f,1.7f,1.7f,29f),db);
        addfood(new food_items_model("Legumes and Legume Products","Vermicelli, made from soy",0.1f,.1f,82f,331f),db);
        addfood(new food_items_model("Legumes and Legume Products","Luncheon slices, meatless",18f,11f,4.4f,189f),db);
        addfood(new food_items_model("Legumes and Legume Products","Sandwich spread, meatless",8f,9f,9f,149f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Strawberry soy yogurt",2.4f,1.2f,18f,94f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Very Vanilla, soymilk",2.5f,1.7f,7.8f,53f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Light Vanilla, soymilk",2.5f,.8f,4.1f,33f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK French Vanilla Creamer",0f,6.7f,20f,133f),db);
        addfood(new food_items_model("Legumes and Legume Products","Soybeans, raw, mature seeds",36f,20f,30f,446f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Black Cherry soy yogurt",2.4f,1.2f,17f,88f),db);
        addfood(new food_items_model("Legumes and Legume Products","Mothbeans, raw, mature seeds",23f,1.6f,62f,343f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanut spread, reduced sugar",25f,55f,14f,650f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanut butter, reduced sodium",24f,50f,22f,590f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Light Chocolate, soymilk",2.1f,4.6f,9.1f,49f),db);
        addfood(new food_items_model("Legumes and Legume Products","Mung beans, raw, mature seeds",24f,1.2f,63f,347f),db);
        addfood(new food_items_model("Legumes and Legume Products","HOUSE FOODS Premium Soft Tofu",6.4f,2.7f,2.2f,59f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, raw, mature seeds, navy",22f,1.5f,61f,337f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, raw, mature seeds, pink",21f,1.1f,64f,343f),db);
        addfood(new food_items_model("Legumes and Legume Products","Mungo beans, raw, mature seeds",25f,1.6f,59f,341f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, with beef, canned, baked",6.4f,3.5f,17f,121f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, with pork, canned, baked",5.2f,1.6f,20f,106f),db);
        addfood(new food_items_model("Legumes and Legume Products","Refried beans, fat-free, canned",5.3f,.5f,14f,79f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, raw, mature seeds, pinto",21f,1.2f,63f,347f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, raw, mature seeds, black",22f,1.4f,62f,141f),db);
        addfood(new food_items_model("Legumes and Legume Products","Soymilk (All flavors), enhanced",2.9f,2f,3.5f,45f),db);
        addfood(new food_items_model("Legumes and Legume Products","PACE, Traditional Refried Beans",4.2f,0f,11f,67f),db);
        addfood(new food_items_model("Legumes and Legume Products","Soymilk, unfortified, chocolate",2.3f,1.5f,10f,63f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, raw, mature seeds, white",23f,.9f,60f,333f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, raw, mature seeds, french",19f,2f,64f,343f),db);
        addfood(new food_items_model("Legumes and Legume Products","Soy sauce made from soy (tamari)",11f,.1f,5.6f,60f),db);
        addfood(new food_items_model("Legumes and Legume Products","Tofu, prepared with nigari, hard",13f,10f,4.4f,145f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Banana-Strawberry soy yogurt",2.4f,1.2f,17f,88f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, with franks, canned, baked",6.8f,6.6f,15f,142f),db);
        addfood(new food_items_model("Legumes and Legume Products","Yardlong beans, raw, mature seeds",24f,1.3f,62f,347f),db);
        addfood(new food_items_model("Legumes and Legume Products","Refried beans, vegetarian, canned",5.3f,.9f,14f,83f),db);
        addfood(new food_items_model("Legumes and Legume Products","Chicken, fried, breaded, meatless",21f,13f,8.5f,234f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, canned, mature seeds, navy",7.5f,.4f,20f,113f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanut butter with omega-3, creamy",24f,54f,17f,608f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanut butter, reduced fat, smooth",26f,34f,36f,520f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, canned, mature seeds, white",7.3f,.3f,21f,114f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, no salt added, canned, baked",4.8f,.4f,20f,105f),db);
        addfood(new food_items_model("Legumes and Legume Products","Soy protein isolate, potassium type",88f,.5f,2.6f,321f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, drained solids, canned, pinto",7f,.9f,20f,114f),db);
        addfood(new food_items_model("Legumes and Legume Products","SILK Vanilla soy yogurt (family size)",2.6f,1.8f,14f,79f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanut butter, with salt, chunk style",24f,50f,22f,589f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, raw, mature seeds, red, kidney",23f,1.1f,61f,337f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peas, raw, mature seeds, split, green",24f,1.2f,64f,352f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, liquid from stewed kidney beans",1.8f,3.2f,2.8f,47f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanut butter, with salt, smooth style",22f,51f,22f,598f),db);
        addfood(new food_items_model("Legumes and Legume Products","Tofu, prepared with nigari, extra firm",10f,5.3f,1.2f,83f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, raw, mature seeds, black turtle",21f,0.9f,63f,339f),db);
        addfood(new food_items_model("Legumes and Legume Products","Soybeans, salted, roasted, mature seeds",39f,25f,30f,469f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanut butter, without salt, chunk style",24f,50f,22f,589f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, raw, mature seeds, great northern",22f,1.1f,62f,339f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanuts, with salt, oil-roasted, spanish",28f,49f,17f,579f),db);
        addfood(new food_items_model("Legumes and Legume Products","Veggie burgers or soyburgers, unprepared",16f,6.3f,14f,177f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanut butter, without salt, smooth style",22f,51f,22f,598f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, plain or vegetarian, canned, baked",4.8f,.4f,21f,94f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanuts, with salt, oil-roasted, valencia",27f,51f,16f,589f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanuts, with salt, oil-roasted, virginia",26f,49f,20f,578f),db);
        addfood(new food_items_model("Legumes and Legume Products","Tofu, prepared with calcium sulfate, fried",19f,20f,8.9f,270f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanuts, with salt, dry-roasted, all types",24f,50f,21f,587f),db);
        addfood(new food_items_model("Legumes and Legume Products","Broadbeans (fava beans), raw, mature seeds",26f,1.5f,58f,341f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanuts, without salt, oil-roasted, spanish",28f,49f,17f,579f),db);
        addfood(new food_items_model("Legumes and Legume Products","Yokan, prepared from adzuki beans and sugar",3.3f,.1f,61f,260f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, canned, mature seeds, great northern",7.4f,.4f,21f,114f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, raw, mature seeds, all types, kidney",24f,.8f,60f,333f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, raw, mature seeds, royal red, kidney",25f,.5f,58f,329f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, cooked, ranch style, barbecue, chili",5f,1f,17f,97f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanuts, without salt, oil-roasted, virginia",26f,49f,20f,578f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanuts, without salt, oil-roasted, valencia",27f,51f,16f,589f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanuts, without salt, dry-roasted, all types",24f,50f,21f,587f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanuts, without salt, oil-roasted, all types",28f,53f,15f,599f),db);
        addfood(new food_items_model("Legumes and Legume Products","Soybeans, without salt, boiled, mature cooked",18f,9f,8.4f,172f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peanuts, with salt, boiled, cooked, all types",14f,22f,21f,318f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, sweetened, canned, mature seeds, adzuki",3.8f,0f,55f,237f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, canned, mature seeds, all types, kidney",5.2f,.6f,15f,84f),db);
        addfood(new food_items_model("Legumes and Legume Products","Soy protein concentrate, produced by acid wash",64f,.5f,25f,328f),db);
        addfood(new food_items_model("Legumes and Legume Products","Soy sauce made from hydrolyzed vegetable protein",7f,.5f,7.8f,60f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, with salt, boiled, cooked, mature seeds, french",7.1f,.8f,24f,129f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, solids and liquids, canned, mature seeds, pinto",4.6f,.6f,15f,82f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, without salt, boiled, cooked, mature seeds, pink",9.1f,.5f,28f,149f),db);
        addfood(new food_items_model("Legumes and Legume Products","Peas, without salt, boiled, cooked, mature seeds, split",8.3f,.4f,21f,118f),db);
        addfood(new food_items_model("Legumes and Legume Products","Beans, without salt, boiled, cooked, mature seeds, pinto",9f,.7f,26f,143f),db);
        addfood(new food_items_model("Legumes and Legume Products","Miso",13f,6f,25f,198f),db);


        addfood(new food_items_model("Beverages","Almond MilkShake",1.59f,3.78f,1.488f,43f),db);
        addfood(new food_items_model("Beverages","Almond MilkShake with Icecream",3.59f,17.78f,43.488f,343f),db);
//addfood(new food_items_model("Beverages","Anjir MilkShake",f,f,f,f),db);
//addfood(new food_items_model("Beverages","Anjir MilkShake with Icecream",f,f,f,f),db);
        addfood(new food_items_model("Beverages","Apple MilkShake",0.16f,0.29f,30.61f,123f),db);
        addfood(new food_items_model("Beverages","Apple MilkShake with Icecream",2.16f,14.29f,72.61f,423f),db);
        addfood(new food_items_model("Beverages","Banana Milkshake",13f,11f,32f,282f),db);
        addfood(new food_items_model("Beverages","Beer",1.17f,0f,9f,109f),db);
        addfood(new food_items_model("Beverages","Black Coffee",0f,0f,0f,0f),db);
        addfood(new food_items_model("Beverages","Black Tea",1.33f,1.18f,2.12f,24f),db);
        addfood(new food_items_model("Beverages","Brandy",0f,0f,0f,517.5f),db);
        addfood(new food_items_model("Beverages","Butter milk",6.85f,1.82f,9.91f,83f),db);
        addfood(new food_items_model("Beverages","Coca Cola",0.22f,0.06f,30.06f,116f),db);
        addfood(new food_items_model("Beverages","Cocktail",3f,28f,21f,340f),db);
        addfood(new food_items_model("Beverages","Coconut Milk",8.3f,8.38f,11.65f,155f),db);
        addfood(new food_items_model("Beverages","Coconut Water",1.4f,0f,8.1f,41f),db);
        addfood(new food_items_model("Beverages","Coffee",0.3f,0.05f,0.1f,3f),db);
        addfood(new food_items_model("Beverages","Coke",0f,0f,11f,139f),db);
        addfood(new food_items_model("Beverages","Cold Coffee",0.46f,0.21f,1.19f,9f),db);
        addfood(new food_items_model("Beverages","Cold Coffee with Icecream",0.46f,0.21f,1.19f,9f),db);
        addfood(new food_items_model("Beverages","Condensed Milk",0.51f,0.56f,3.51f,21f),db);
        addfood(new food_items_model("Beverages","Cow's Milk",6.64f,6.7f,9.32f,124f),db);
        addfood(new food_items_model("Beverages","Dryfruit Milkshake",0f,0f,0f,0f),db);
        addfood(new food_items_model("Beverages","Dryfruit Milkshake with Icecream",2f,14f,42f,300f),db);
        addfood(new food_items_model("Beverages","Fanta",0f,0f,0f,156f),db);
        addfood(new food_items_model("Beverages","Grape juice",1.48f,0.21f,39.46f,161f),db);
//addfood(new food_items_model("Beverages","Kaju Anjir Milkshake",f,f,f,f),db);
//addfood(new food_items_model("Beverages","Kaju Milkshake",f,f,f,f),db);
//addfood(new food_items_model("Beverages","Kashmiri Soda",f,f,f,f),db);
//addfood(new food_items_model("Beverages","Kesar Pista Milkshake",f,f,f,f),db);
        addfood(new food_items_model("Beverages","Lemonade",0.22f,0.13f,32.8f,126f),db);
//addfood(new food_items_model("Beverages","Lichee Milkshake",f,f,f,f),db);
//addfood(new food_items_model("Beverages","Lichee Milkshake with Icecream",f,f,f,f),db);
        addfood(new food_items_model("Beverages","Limca",0f,0f,27f,110f),db);
        addfood(new food_items_model("Beverages","Mango Juice",0f,0f,0f,135f),db);
        addfood(new food_items_model("Beverages","Mango Milkshake",9f,1f,48f,237f),db);
        addfood(new food_items_model("Beverages","Mango Milkshake with Icecream",11f,15f,90f,537f),db);
//addfood(new food_items_model("Beverages","Mandeli Curry",f,f,f,f),db);
        addfood(new food_items_model("Beverages","Martini",0.08f,0f,3.89f,463f),db);
        addfood(new food_items_model("Beverages","Vodka",0f,0f,0f,434f),db);
        addfood(new food_items_model("Beverages","Watermelon Juice",1.54f,0.38f,19.02f,76f),db);
        addfood(new food_items_model("Beverages","Whisky",0f,0f,0.03f,71f),db);
        addfood(new food_items_model("Beverages","Wine",0.14f,0f,5.17f,165f),db);
        addfood(new food_items_model("Beverages","Strawberry Milkshake",0f,0f,0f,190f),db);
        addfood(new food_items_model("Beverages","Strawberry Milkshake with Icecream",2f,14f,42f,490f),db);
        addfood(new food_items_model("Beverages","Sugarcane Juice",4f,4f,10f,130f),db);
        addfood(new food_items_model("Beverages","Sweet Lassi",25f,5f,30f,234f),db);
        addfood(new food_items_model("Beverages","Tea",0f,0f,0.8f,0f),db);
        addfood(new food_items_model("Beverages","Thumps Up",11f,2f,0f,57f),db);
        addfood(new food_items_model("Beverages","Tomato Juice",1.95f,0.13f,10.9f,44f),db);
        addfood(new food_items_model("Beverages","Vanilla Milkshake",9.27f,7.27f,42.61f,269f),db);
        addfood(new food_items_model("Beverages","Orange Juice",11.27f,21.27f,84.61f,529f),db);
        addfood(new food_items_model("Beverages","Papaya Juice",0.44f,0.39f,37.9f,149f),db);
        addfood(new food_items_model("Beverages","Pepsi",2f,7f,34f,210f),db);
        addfood(new food_items_model("Beverages","Pepsi",6f,9f,2f,200f),db);
        addfood(new food_items_model("Beverages","Pineapple Juice",0.95f,0.32f,33.94f,140f),db);
        addfood(new food_items_model("Beverages","Pineapple Milkshake",0.95f,0.32f,33.94f,140f),db);
        addfood(new food_items_model("Beverages","Pineapple Milkshake w/icecream",2.95f,14.32f,75.94f,440f),db);
        addfood(new food_items_model("Beverages","Pomegranate Juice",0.8f,0f,29f,120f),db);
//addfood(new food_items_model("Beverages","Rimzim",f,f,f,f),db);
        addfood(new food_items_model("Beverages","Rum",0f,0f,0f,65f),db);
        addfood(new food_items_model("Beverages","Salty Lassi",11.4f,3.3f,20f,150f),db);
        addfood(new food_items_model("Beverages","Scotch",0f,0f,0.01f,26f),db);
        addfood(new food_items_model("Beverages","Sherry",0.1f,0f,3.4f,45f),db);
//addfood(new food_items_model("Beverages","Sitaphal Milkshake",f,f,f,f),db);
//addfood(new food_items_model("Beverages","Sitaphal Milkshake w/icecream",f,f,f,f),db);
//addfood(new food_items_model("Beverages","Skimmed Tea w/No Milk",f,f,f,f),db);
//addfood(new food_items_model("Beverages","Skimmed Tea w/No Sugar",f,f,f,f),db);


        addfood(new food_items_model("Sausages and Luncheon Meats","Beef, reduced sodium, bologna",12f,28f,2f,310f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Barbecue loaf, beef, pork",16f,8.9f,6.4f,173f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Beef sausage, cooked, fresh",18f,28f,0.4f,332f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Beef sausage, precooked",16f,38f,0f,405f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Beef, canned, corned beef, cured",27f,15f,0f,250f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Beef, chopped beef, smoked, cured",20f,4.4f,1.9f,133f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Beef, dried, cured",31f,1.9f,2.8f,153f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Beef, pastrami, cured",22f,5.8f,0.4f,147f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Bacon and beef sticks",29f,44f,0.8f,517f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Bacon, low sodium, turkey",13f,20f,4.8f,253f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Beef, smoked, cooked, sausage, cured",14f,27f,2.4f,312f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Bratwurst, cooked, veal",14f,32f,0f,341f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Beerwurst, pork and beef, beer salami",14f,23f,3.8f,277f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Beerwurst, pork, beer salami",14f,19f,2.1f,238f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Blood sausage",15f,35f,1.3f,379f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Bologna, low fat, beef and pork",12f,19f,2.6f,230f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Bologna, beef",11f,26f,4.3f,299f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Bologna, lite, pork and turkey",13f,16f,3.5f,211f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Bologna, pork",15f,20f,0.7f,247f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Bologna, turkey and beef, pork",12f,29f,6.7f,336f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Bratwurst, cooked, chicken",19f,10f,0f,176f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Headcheese, pork",14f,11f,0f,157f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Cheesefurter, beef, pork, cheese smokie",14f,29f,1.5f,328f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Ham and cheese spread",16f,19f,2.3f,245f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Ham, canned, chopped",16f,19f,0.3f,239f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Ham, minced",16f,21f,1.8f,263f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Ham salad spread",8.7f,16f,11f,216f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Ham and cheese loaf or roll",14f,19f,4f,241f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Ham, cooked, smoked, honey",18f,2.4f,7.3f,122f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Frankfurter, pork",13f,24f,0.3f,269f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Frankfurter, heated, meat",9.8f,24f,4.9f,278f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Frankfurter, low sodium",12f,29f,1.8f,312f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Chorizo, pork and beef",24f,38f,1.9f,455f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Chicken breast, prepackaged, sliced, rotisserie seasoned, deli",17f,1.9f,2.9f,98f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Chicken spread",18f,18f,4.1f,158f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Honey roll sausage, beef",19f,11f,2.2f,182f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Meatballs, Italian style, frozen",14f,22f,81f,286f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Luxury loaf, pork",18f,4.8f,4.9f,41f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Mortadella, pork, beef",16f,25f,3.1f,311f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Macaroni and cheese loaf, pork and beef, chicken",12f,15f,12f,228f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Pork and beef sausage, cooked, fresh",14f,36f,2.7f,396f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Pickle and pimiento loaf, pork",11f,16f,8.5f,225f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Polish sausage, pork",14f,29f,1.6f,326f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Picnic loaf, beef, pork",15f,17f,4.8f,232f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Ovenroastedchicken breast roll",15f,7.7f,1.8f,134f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Olive loaf, pork",12f,17f,9.2f,235f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Luncheon meat, canned, pork",13f,30f,2.1f,334f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Luncheon sausage, pork and beef",15f,21f,1.6f,260f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Liver sausage, pork, liverwurst",14f,29f,2.2f,326f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Pork sausage, panfried,cooked, reduced fat, link/patty",21f,20f,0.2f,267f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Pork sausage, cooked, reduced sodium",9.4f,22f,8.1f,271f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Sandwich spread, beef, pork",7.7f,17f,12f,235f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Poultry salad sandwich spread",12f,14f,7.4f,200f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Pork sausage, microwaved, fully cooked, link/patty",15f,42f,0.6f,438f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Pork sausage, unprepared, link/patty",15f,25f,0.9f,288f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Roast beef spread",15f,16f,3.7f,223f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Roast beef, sliced, prepackaged, deli style",19f,3.7f,0.6f,115f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Pork sausage, unheated, fully cooked, link/patty",13f,37f,0.7f,392f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Salami, turkey, cooked",19f,9.2f,1.6f,172f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Sausage, cooked, pork, Italian",19f,27f,4.3f,344f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Sausage, pork and beef, smoked link sausage",12f,29f,2.4f,320f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Sausage, lower sodium, Italian style, chicken or turkey",21f,4.5f,14f,183f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Sausage, smoked, hot, turkey",15f,8.8f,4.7f,158f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Sausage, pork, beef, chicken, canned, Vienna",11f,19f,2.6f,230f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Sausage, links, sweet, Italian",16f,8.4f,2.1f,149f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Sausage, hot, beef with chicken, Polish",18f,19f,3.6f,259f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Sausage, raw, pork, Italian",14f,31f,0.7f,346f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Sausage, mild, breakfast links, turkey",15f,18f,1.6f,235f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Sausage, pork and beef, smoked link sausage",12f,29f,2.4f,320f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Sausage, smoked, pork and beef, Polish",12f,27f,2f,301f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Scrapple, pork",8.1f,14f,14f,213f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Turkey bacon, unprepared",16f,17f,1.9f,226f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Turkey breast, luncheon meat, prepackaged or deli, low salt",22f,0.8f,3.5f,109f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Turkey breast, prepackaged, sliced",16f,2.4f,2.3f,100f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Sausage, with cheddar cheese, sticks, pork and beef, summer",19f,38f,1.8f,426f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Sausage, smoked, skinless, pork, beef, chicken",14f,14f,8.1f,216f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Smoked link sausage, pork",12f,28f,0.9f,309f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Sausage, smoked, turkey, Italian",15f,8.8f,4.7f,158f),db);
        addfood(new food_items_model("Sausages and Luncheon Meats","Sausage, smoked, with cheddar cheese, pork and beef",13f,26f,2.1f,296f),db);

        addfood(new food_items_model("Baked Products","Arrowroot Biscuits",0.34f,0.68f,3.63f,22f),db);
        addfood(new food_items_model("Baked Products","Baked Beans on Toast",14.4f,6.0f,65.5f,339.5f),db);
        addfood(new food_items_model("Baked Products","Baked Potato",2.5f,0.1f,21f,93f),db);
        addfood(new food_items_model("Baked Products","Baked Corn",3.32f,1.28f,25.11f,108f),db);
        addfood(new food_items_model("Baked Products","Baked Sev",20f,36.9f,34.4f,541.4f),db);
//addfood(new food_items_model("Baked Products","Baked Soya Puri",f,f,f,f),db);
        addfood(new food_items_model("Baked Products","Baked Stuffed Potato",8f,20f,48f,400f),db);
        addfood(new food_items_model("Baked Products","Big White Bread",2.29f,0.99f,15.18f,80f),db);
        addfood(new food_items_model("Baked Products","Bourbon Biscuit",0.7f,3.1f,9.2f,67f),db);
        addfood(new food_items_model("Baked Products","Bread Butter",3.66f,3.15f,20.7f,126f),db);
        addfood(new food_items_model("Baked Products","Bread Jam",3.2f,1.47f,22.45f,117f),db);
        addfood(new food_items_model("Baked Products","Brown Bread Butter",1f,2f,7f,115f),db);
        addfood(new food_items_model("Baked Products","Bun Bread",5f,1.5f,26f,130f),db);
        addfood(new food_items_model("Baked Products","Butter Cookies",0.49f,1.94f,5.9f,43f),db);
        addfood(new food_items_model("Baked Products","Butter Toast",4.4f,6.3f,18f,136f),db);
        addfood(new food_items_model("Baked Products","Cream Cracker",0.8f,1.2f,54f,35f),db);
//addfood(new food_items_model("Baked Products","Date Heart Biscuit",f,f,f,f),db);
        addfood(new food_items_model("Baked Products","Elaichi Cream Biscuit",3f,9f,37f,234f),db);
        addfood(new food_items_model("Baked Products","Fruit Bread",1.76f,4.23f,22.37f,132f),db);
        addfood(new food_items_model("Baked Products","Garlic Bread Stick",4f,4f,28f,160f),db);
        addfood(new food_items_model("Baked Products","Ginger Biscuit",0.58f,1.15f,7.4f,41f),db);
        addfood(new food_items_model("Baked Products","Glucose Biscuit",0.2f,0.5f,9.8f,15.9f),db);
        addfood(new food_items_model("Baked Products","Good Day Biscuit",2f,4f,19f,125f),db);
        addfood(new food_items_model("Baked Products","Marie Biscuit",0.3f,0.5f,3.4f,19f),db);
        addfood(new food_items_model("Baked Products","Whole Wheat Ginger Biscuit",0.6f,1.5f,6f,38.8f),db);
//addfood(new food_items_model("Baked Products","Whole Wheat Lime Biscuit",f,f,f,f),db);
        addfood(new food_items_model("Baked Products","Small White Bread",1.91f,0.82f,12.65f,66f),db);
        addfood(new food_items_model("Baked Products","Tiger Glucose Biscuit",0.25f,0.5f,3f,18f),db);
        addfood(new food_items_model("Baked Products","Top Biscuits",2f,4f,9f,66f),db);
        addfood(new food_items_model("Baked Products","Nut and Raisin wheat Biscuit",1.06f,3.15f,7.71f,60f),db);
        addfood(new food_items_model("Baked Products","Mava cake",234f,8f,60f,1493f),db);
        addfood(new food_items_model("Baked Products","Monginis Slice Cake",3.5f,20f,53f,411f),db);
        addfood(new food_items_model("Baked Products","Pineapple Cake",4f,14f,58f,367f),db);
        addfood(new food_items_model("Baked Products","Pineapple Upside Down",4f,13.9f,58.1f,367f),db);
        addfood(new food_items_model("Baked Products","Millet Biscuit",7f,25f,67f,115f),db);
        addfood(new food_items_model("Baked Products","Monaco Biscuit",0.2f,0.6f,2f,14f),db);
        addfood(new food_items_model("Baked Products","Nan Khatai",14f,4.5f,21f,140f),db);
        addfood(new food_items_model("Baked Products","Nice Biscuits",1f,2f,5f,250f),db);


        addfood(new food_items_model("Baked Products","Cookies, refrigerated dough, peanut butter",8.2f,25f,52f,458f),db);
        addfood(new food_items_model("Baked Products","Pancakes, prepared from recipe, buttermilk",6.8f,9.3f,29f,227f),db);
        addfood(new food_items_model("Baked Products","Pancakes, incomplete, dry mix, whole wheat",11f,1.3f,74f,350f),db);
        addfood(new food_items_model("Baked Products","Bread, toasted, (includes gluten), protein",13f,2.4f,48f,270f),db);
        addfood(new food_items_model("Baked Products","Rolls, reduced-calorie, hamburger or hotdog",8.3f,2f,42f,196f),db);
        addfood(new food_items_model("Baked Products","Cookies, refrigerated dough, chocolate chip",4f,21f,61f,451f),db);
        addfood(new food_items_model("Baked Products","Waffles, ready-to-heat, frozen, gluten-free",2.7f,8.8f,43f,263f),db);
        addfood(new food_items_model("Baked Products","Cookies, baked, refrigerated dough, oatmeal",6f,21f,66f,471f),db);
        addfood(new food_items_model("Baked Products","Pie, commercially prepared, chocolate creme",4.2f,22f,38f,353f),db);
        addfood(new food_items_model("Baked Products","Pie, commercially prepared, coconut custard",5.9f,13f,30f,260f),db);
        addfood(new food_items_model("Baked Products","Pancakes, prepared, complete, dry mix, plain",5.2f,2.5f,37f,194f),db);
        addfood(new food_items_model("Baked Products","Cookies, prepared from recipe, peanut butter",9f,24f,59f,475f),db);
        addfood(new food_items_model("Baked Products","Cookies, vanilla sandwich with creme filling",4.5f,20f,72f,483f),db);
        addfood(new food_items_model("Baked Products","Cake, fat-free, commercially prepared, pound",5.4f,1.2f,61f,283f),db);
        addfood(new food_items_model("Baked Products","Biscuits, baked, frozen, plain or buttermilk",6.2f,11f,54f,338f),db);
        addfood(new food_items_model("Baked Products","Cake, dry mix, enriched, white, pudding-type",3.9f,9.5f,81f,423f),db);
        addfood(new food_items_model("Baked Products","Waffles, ready-to-heat, frozen, chocolate chip",5.8f,10f,46f,297f),db);
        addfood(new food_items_model("Baked Products","Pancakes, prepared, incomplete, dry mix, plain",7.8f,7.7f,29f,218f),db);
        addfood(new food_items_model("Baked Products","Cookies, lowfat, plain or honey, graham crackers",5.7f,5.7f,78f,386f),db);
        addfood(new food_items_model("Baked Products","Biscuits, prepared, dry mix, plain or buttermilk",7.3f,12f,48f,335f),db);
        addfood(new food_items_model("Baked Products","Cookies, enriched, commercially prepared, butter",6.1f,19f,69f,467f),db);
        addfood(new food_items_model("Baked Products","Rolls, wheat/cracked wheat, hamburger or hot dog",12f,3.6f,47f,269f),db);
        addfood(new food_items_model("Baked Products","Cookies, regular, commercially prepared, oatmeal",6.2f,18f,69f,450f),db);
        addfood(new food_items_model("Baked Products","Crackers, sandwich-type with cheese filling, rye",9.2f,22f,61f,481f),db);
        addfood(new food_items_model("Baked Products","Muffin, low-fat, commercially prepared, blueberry",4.2f,4.2f,50f,255f),db);
        addfood(new food_items_model("Baked Products","Cake, prepared from recipe, pineapple upside-down",3.5f,12f,51f,319f),db);
        addfood(new food_items_model("Baked Products","Cookies, regular, sugar wafers with creme filling",3.8f,23f,71f,502f),db);
        addfood(new food_items_model("Baked Products","Waffle, toasted, ready-to-heat, frozen, buttermilk",7.4f,9.5f,48f,309f),db);
        addfood(new food_items_model("Baked Products","Cookies, baked, refrigerated dough, chocolate chip",4.9f,23f,68f,492f),db);
        addfood(new food_items_model("Baked Products","Crackers, multi-seeded and multigrain, gluten-free",11f,16f,66f,453f),db);
        addfood(new food_items_model("Baked Products","Cookies, without lemon juice and rind, ladyfingers",11f,9.1f,60f,363f),db);
        addfood(new food_items_model("Baked Products","Cookies, soft-type, commercially prepared, oatmeal",6.1f,15f,66f,409f),db);
        addfood(new food_items_model("Baked Products","Cake, prepared from recipe without frosting, white",5.4f,12f,57f,357f),db);
        addfood(new food_items_model("Baked Products","Cookies, unenriched, commercially prepared, butter",6.1f,19f,69f,467f),db);
        addfood(new food_items_model("Baked Products","Bread, toasted, commercially prepared, whole-wheat",16f,4.1f,51f,306f),db);
        addfood(new food_items_model("Baked Products","Pie, no-bake type, prepared from mix, coconut cream",2.8f,18f,29f,276f),db);
        addfood(new food_items_model("Baked Products","Cake, prepared from recipe, biscuit-type, shortcake",6.1f,14f,49f,346f),db);
        addfood(new food_items_model("Baked Products","Cake, prepared from recipe without frosting, yellow",5.3f,15f,53f,361f),db);
        addfood(new food_items_model("Baked Products","Cookies, with raisins, prepared from recipe, oatmeal",6.5f,16f,68f,435f),db);
        addfood(new food_items_model("Baked Products","Cookie, chocolate-coated, with peanut butter filling",8.1f,35f,53f,562f),db);
        addfood(new food_items_model("Baked Products","Cookies, sugar free, with creme filling, sugar wafer",3.6f,29f,66f,531f),db);
        addfood(new food_items_model("Baked Products","Bread, egg",9.5f,6f,48f,287f),db);
        addfood(new food_items_model("Baked Products","Pie, peach",1.9f,10f,33f,224f),db);

        addfood(new food_items_model("Fast Food","Aloo Chat",0f,0f,65f,240f),db);
        addfood(new food_items_model("Fast Food","Aloo Tikki",37f,29f,85f,750f),db);
        addfood(new food_items_model("Fast Food","American Choupsey",6f,10f,0f,120f),db);
        addfood(new food_items_model("Fast Food","Bhatura",8f,10f,36f,261f),db);
        addfood(new food_items_model("Fast Food","Boiled Noodles",11f,2f,68f,1390f),db);
        addfood(new food_items_model("Fast Food","Bread Roll",11f,6f,52f,310f),db);
        addfood(new food_items_model("Fast Food","Hakka Noodles with Prawn",0f,0f,0f,180f),db);
        addfood(new food_items_model("Fast Food","Hamburger",17f,14f,24f,295f),db);
        addfood(new food_items_model("Fast Food","Veg Burger",16f,6f,14f,177f),db);
        addfood(new food_items_model("Fast Food","Veg Kababs",21f,7f,4f,190f),db);
        addfood(new food_items_model("Fast Food","Veg Noodles",26f,6f,11f,251f),db);
        addfood(new food_items_model("Fast Food","Veg Pattice",12f,7f,1f,110f),db);
        addfood(new food_items_model("Fast Food","Moong Dal Chila",0f,3f,5f,36f),db);
        addfood(new food_items_model("Fast Food","Moong Dal Kachori",6f,13f,76f,437f),db);
        addfood(new food_items_model("Fast Food","Moong Dal Vada",19f,48f,121f,915f),db);
        addfood(new food_items_model("Fast Food","Mutton Samosa",0f,0f,0f,125f),db);
        addfood(new food_items_model("Fast Food","Mutton Sandwich",0f,0f,0f,70f),db);
        addfood(new food_items_model("Fast Food","Paneer Pakoda",0f,0f,0f,270f),db);
        addfood(new food_items_model("Fast Food","Paneer Sandwich",0f,0f,0f,300f),db);
        addfood(new food_items_model("Fast Food","Pani Puri",1f,1f,20f,100f),db);
        addfood(new food_items_model("Fast Food","Papdi",0f,0f,0f,1f),db);
        addfood(new food_items_model("Fast Food","Papdi Chat",4f,0f,57f,235f),db);
        addfood(new food_items_model("Fast Food","Pau Wada",0f,2f,0f,15f),db);
        addfood(new food_items_model("Fast Food","Plain Dhokla",14f,0f,21f,140f),db);
        addfood(new food_items_model("Fast Food","Plain Pizza",0f,0f,125f,125f),db);
        addfood(new food_items_model("Fast Food","Plain Poha",4.3f,11f,4.3f,125f),db);
        addfood(new food_items_model("Fast Food","Plain Uttapam",7f,1f,35f,170f),db);
        addfood(new food_items_model("Fast Food","Pork Cutlets",20f,5f,14f,187f),db);
        addfood(new food_items_model("Fast Food","Potato Bhajia",0f,0f,0f,46f),db);
        addfood(new food_items_model("Fast Food","Prawn Cutlets",21f,1f,0f,99f),db);
        addfood(new food_items_model("Fast Food","Prawn Fry",20f,20f,16f,324f),db);
        addfood(new food_items_model("Fast Food","Prawn Biryani",15f,18f,38f,380f),db);
        addfood(new food_items_model("Fast Food","Pudi Chutney",13f,7f,13f,160f),db);
        addfood(new food_items_model("Fast Food","Puri Bhaji",9f,5f,55f,207f),db);
        addfood(new food_items_model("Fast Food","Rasam",3f,4f,0f,50f),db);
        addfood(new food_items_model("Fast Food","Rava Dhokla",1f,1f,13f,72f),db);
        addfood(new food_items_model("Fast Food","Rava Idli",2f,2f,14f,70f),db);
        addfood(new food_items_model("Fast Food","Roasted Chivda",3f,13f,10f,167f),db);
        addfood(new food_items_model("Fast Food","Russian Sandwich",2.67f,9.15f,15.16f,152f),db);
        addfood(new food_items_model("Fast Food","Sabudana Khichdi",8f,20f,71f,486f),db);
        addfood(new food_items_model("Fast Food","Sabudana Vada",0f,0f,25f,121f),db);
        addfood(new food_items_model("Fast Food","Sambar",14f,11f,56f,308f),db);
        addfood(new food_items_model("Fast Food","Semiya Payasam",11f,7f,45f,280f),db);


        addfood(new food_items_model("Fast Food","Regular patty; double decker bun with condiments and special sauce, cheeseburger; double",12f,14f,22f,261f),db);
        addfood(new food_items_model("Fast Food","KFC, biscuit",7.5f,17f,44f,358f),db);
        addfood(new food_items_model("Fast Food","Regular patty; double decker bun with condiments and special sauce, hamburger; single",12f,13f,23f,259f),db);
        addfood(new food_items_model("Fast Food","Vegetables and mayonnaise, large patty; with condiments, cheeseburger; double",16f,16f,13f,253f),db);
        addfood(new food_items_model("Fast Food","School Lunch, frozen, TONY'S SMARTPIZZA Whole Grain 4x6 Pepperoni Pizza 50/50 Cheese, pizza",12f,8.2f,29f,238f),db);
        addfood(new food_items_model("Fast Food","Vegetables and mayonnaise, large patty; with condiments, hamburger; single",11f,12f,17f,226f),db);
        addfood(new food_items_model("Fast Food","Patty and bun; with condiments and vegetables, regular, cheeseburger; double",13f,15f,23f,285f),db);
        addfood(new food_items_model("Fast Food","KFC, skin and breading removed, meat only, Drumstick, ORIGINAL RECIPE, Fried Chicken",26f,7.7f,0.1f,175f),db);
        addfood(new food_items_model("Fast Food","KFC, skin and breading removed, meat only, Thigh, ORIGINAL RECIPE, Fried Chicken",23f,9.3f,0f,175f),db);
        addfood(new food_items_model("Fast Food","KFC, skin and breading removed, meat only, Wing, ORIGINAL RECIPE, Fried Chicken",29f,10f,1.8f,216f),db);
        addfood(new food_items_model("Fast Food","KFC, skin and breading removed, meat only, Breast, EXTRA CRISPY, Fried Chicken",27f,4.8f,0.3f,153f),db);
        addfood(new food_items_model("Fast Food","KFC, skin and breading removed, meat only, Thigh, EXTRA CRISPY, Fried Chicken",22f,10f,0f,179f),db);
        addfood(new food_items_model("Fast Food","School Lunch, cooked, frozen, whole grain, thick crust, cheese topping, pizza",15f,9.3f,28f,254f),db);
        addfood(new food_items_model("Fast Food","With condiments and vegetables, large patty, cheeseburger; double",15f,17f,15f,273f),db);
        addfood(new food_items_model("Fast Food","KFC, meat and skin with breading, Wing, EXTRA CRISPY, Fried Chicken",21f,23f,12f,337f),db);
        addfood(new food_items_model("Fast Food","KFC, meat and skin with breading, Thigh, EXTRA CRISPY, Fried Chicken",17f,22f,10f,309f),db);
        addfood(new food_items_model("Fast Food","SUBWAY, SUBWAY CLUB sub on white bread with lettuce and tomato",11f,2.4f,20f,146f),db);
        addfood(new food_items_model("Fast Food","School Lunch, frozen, TONY'S Breakfast Pizza Sausage, pizza",10f,10f,27f,240f),db);
        addfood(new food_items_model("Fast Food","Skin and breading from all pieces, Fried Chicken",14f,29f,20f,398f),db);
        addfood(new food_items_model("Fast Food","Meat and skin and breading, Thigh, Fried Chicken",19f,18f,8.7f,274f),db);
        addfood(new food_items_model("Fast Food","SUBWAY, cold cut sub on white bread with lettuce and tomato",11f,10f,20f,214f),db);
        addfood(new food_items_model("Fast Food","SUBWAY, meatball marinara sub on white bread (no toppings)",9.8f,8.5f,26f,219f),db);
        addfood(new food_items_model("Fast Food","BURGER KING, Egg and Cheese, CROISSAN'WICH with Sausage",12f,22f,16f,308f),db);
        addfood(new food_items_model("Fast Food","Soft, cheese and lettuce, taco with beef",9.3f,9.8f,20f,206f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Premium Grilled Chicken Classic Sandwich",14f,4.3f,22f,183f),db);
        addfood(new food_items_model("Fast Food","PIZZA HUT  Super Supreme Pizza, Hand-Tossed Crust",11f,11f,26f,248f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, McCHICKEN Sandwich (without mayonnaise)",11f,8.5f,31f,240f),db);
        addfood(new food_items_model("Fast Food","DOMINO'S  Cheese Pizza, Ultimate Deep Dish Crust",11f,9.8f,33f,265f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Premium Crispy Chicken Classic Sandwich",12f,8.7f,25f,228f),db);
        addfood(new food_items_model("Fast Food","KFC, Skin and Breading, EXTRA CRISPY, Fried Chicken",11f,37f,23f,464f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Bacon Ranch Salad with Grilled Chicken",10f,3.1f,3.6f,81f),db);
        addfood(new food_items_model("Fast Food","Pizza, cooked, frozen, thin crust, cheese topping",12f,11f,29f,263f),db);
        addfood(new food_items_model("Fast Food","Fast foods, and beef, cheese, with beans, burrito",7f,6.8f,23f,180f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, DOUBLE QUARTER POUNDER with Cheese",17f,16f,14f,262f),db);
        addfood(new food_items_model("Fast Food","DOMINO'S Cheese Pizza, Crunchy Thin Crust",12f,15f,28f,298f),db);
        addfood(new food_items_model("Fast Food","PIZZA HUT Cheese Pizza, Hand-Tossed Crust",12f,11f,31f,271f),db);
        addfood(new food_items_model("Fast Food","PIZZA HUT Cheese Pizza, Hand-Tossed Crust",12f,10f,33f,275f),db);
        addfood(new food_items_model("Fast Food","WENDY'S, single, DAVE'S Hot 'N Juicy 1/4 LB",14f,16f,18f,268f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Southern Style Chicken Biscuit",12f,15f,31f,304f),db);
        addfood(new food_items_model("Fast Food","Breaded and fried, onion rings",3.9f,25f,44f,411f),db);
        addfood(new food_items_model("Fast Food","With egg and sausage, biscuit",11f,21f,21f,312f),db);
        addfood(new food_items_model("Fast Food","PIZZA HUT Cheese Pizza, Stuffed Crust",12f,12f,30f,274f),db);
        addfood(new food_items_model("Fast Food","WENDY'S, Ultimate Chicken Grill Sandwich",15f,5f,19f,179f),db);
        addfood(new food_items_model("Fast Food","PIZZA HUT Pepperoni Pizza, Pan Crust",12f,14f,30f,298f),db);
        addfood(new food_items_model("Fast Food","With egg and bacon, biscuit",11f,21f,19f,305f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, QUARTER POUNDER with Cheese",15f,14f,20f,258f),db);
        addfood(new food_items_model("Fast Food","Biscuit with egg and steak",12f,19f,14f,277f),db);
        addfood(new food_items_model("Fast Food","PIZZA HUT, parmesan garlic, breadstick",12f,13f,44f,343f),db);
        addfood(new food_items_model("Fast Food","WENDY'S, without cheese, Jr. Hamburger",13f,8.8f,28f,243f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, McFLURRY with OREO cookies",4f,5.7f,26f,165f),db);
        addfood(new food_items_model("Fast Food","PIZZA HUT Sausage Pizza, Pan Crust",11f,14f,30f,287f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, NEWMAN'S OWN Cobb Dressing",1.7f,14f,15f,196f),db);
        addfood(new food_items_model("Fast Food","BURGER KING, Original Chicken Sandwich",12f,15f,26f,286f),db);
        addfood(new food_items_model("Fast Food","BURGER KING, no cheese, DOUBLE WHOPPER",14f,16f,14f,252f),db);
        addfood(new food_items_model("Fast Food","PIZZA HUT Cheese Pizza, Pan Crust",12f,13f,30f,280f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Tangy Honey Mustard Sauce",1.3f,5.8f,29f,167f),db);
        addfood(new food_items_model("Fast Food","PIZZA HUT Cheese Pizza, Pan Crust",11f,11f,33f,276f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Crispy, RANCH SNACK WRAP",11f,15f,23f,275f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Sausage Biscuit with Egg",11f,22f,19f,311f),db);
        addfood(new food_items_model("Fast Food","WENDY'S, with cheese, CLASSIC DOUBLE",17f,14f,12f,241f),db);
        addfood(new food_items_model("Fast Food","With chicken, quesadilla",15f,15f,24f,294f),db);
        addfood(new food_items_model("Fast Food","BURGER KING, Premium Fish Sandwich",10f,12f,27f,260f),db);
        addfood(new food_items_model("Fast Food","Fast foods, with chicken, quesadilla",15f,15f,24f,294f),db);
        addfood(new food_items_model("Fast Food","BURGER KING, with cheese, WHOPPER",11f,15f,17f,250f),db);
        addfood(new food_items_model("Fast Food","WEND'YS, Crispy Chicken Sandwich",12f,14f,26f,278f),db);
        addfood(new food_items_model("Fast Food","BURGER KING, Double Cheeseburger",17f,16f,17f,282f),db);
        addfood(new food_items_model("Fast Food","BURGER KING, french toast sticks",6f,18f,41f,349f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Hotcakes and Sausage",7.8f,13f,38f,294f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Double Cheeseburger",16f,16f,19f,282f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Sweet 'N Sour Sauce",0.7f,1.1f,39f,170f),db);
        addfood(new food_items_model("Fast Food","With beans, burrito",6.5f,6.2f,33f,206f),db);
        addfood(new food_items_model("Fast Food","With cheese, nachos",4.3f,22f,35f,343f),db);
        addfood(new food_items_model("Fast Food","BURGER KING, Hash Brown Rounds",2.8f,19f,29f,302f),db);
        addfood(new food_items_model("Fast Food","With chili, hotdog",12f,12f,27f,260f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, McCHICKEN Sandwich",10f,13f,28f,273f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Strawberry Sundae",3.2f,4f,28f,158f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Chicken McNUGGETS",16f,15f,20f,302f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Hot Fudge Sundae",4.1f,5.9f,30f,186f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Sausage McMUFFIN",13f,21f,25f,333f),db);
        addfood(new food_items_model("Fast Food","Caramel, sundae",4.7f,6f,32f,196f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Sausage Burrito",11f,16f,23f,277f),db);
        addfood(new food_items_model("Fast Food","BURGER KING, Chicken Strips",18f,15f,20f,292f),db);
        addfood(new food_items_model("Fast Food","KFC, Crispy Chicken Strips",20f,15f,14f,274f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Barbeque Sauce",1.6f,1.2f,37f,165f),db);
        addfood(new food_items_model("Fast Food","BURGER KING, french fries",3.2f,12f,39f,280f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, BIG BREAKFAST",10f,19f,18f,285f),db);
        addfood(new food_items_model("Fast Food","BURGER KING, Cheeseburger",15f,15f,24f,286f),db);
        addfood(new food_items_model("Fast Food","Hush puppies",6.2f,13f,40f,296f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Egg McMUFFIN",14f,9.7f,22f,228f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, french fries",3.4f,15f,43f,323f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Cheeseburger",13f,12f,28f,263f),db);
        addfood(new food_items_model("Fast Food","BURGER KING, Hamburger",15f,11f,27f,261f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Side Salad",1f,0.2f,4.3f,20f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Hash Brown",2.5f,16f,29f,271f),db);
        addfood(new food_items_model("Fast Food","WENDY'S, french fries",3.7f,14f,40f,301f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, Hamburger",13f,10f,30f,264f),db);
        addfood(new food_items_model("Fast Food","KFC, Popcorn Chicken",18f,22f,21f,351f),db);
        addfood(new food_items_model("Fast Food","McDONALD'S, BIG MAC",12f,15f,20f,257f),db);
        addfood(new food_items_model("Fast Food","POPEYES, biscuit",6f,24f,41f,401f),db);


        addfood(new food_items_model("Poultry Products","Emu, raw, oyster",23f,4.9f,0f,141f),db);
        addfood(new food_items_model("Poultry Products","Emu, raw, ground",23f,4f,0f,134f),db);
        addfood(new food_items_model("Poultry Products","Ostrich, raw, fan",22f,2.7f,0f,117f),db);
        addfood(new food_items_model("Poultry Products","Goose, raw, liver",16f,4.3f,6.3f,133f),db);
        addfood(new food_items_model("Poultry Products","Ground turkey, raw",20f,7.7f,0f,148f),db);
        addfood(new food_items_model("Poultry Products","Ostrich, raw, round",22f,2.4f,0f,116f),db);
        addfood(new food_items_model("Poultry Products","Ostrich, raw, oyster",22f,3.7f,0f,125f),db);
        addfood(new food_items_model("Poultry Products","Chicken, raw, ground",17f,8.1f,0f,143f),db);
        addfood(new food_items_model("Poultry Products","Ostrich, raw, ground",20f,8.7f,0f,165f),db);
        addfood(new food_items_model("Poultry Products","Emu, raw, fan fillet",23f,0.8f,0f,103f),db);
        addfood(new food_items_model("Poultry Products","Chicken, boiled, feet",19f,15f,0.2f,215f),db);
        addfood(new food_items_model("Poultry Products","Emu, raw, inside drum",22f,1.5f,0f,108f),db);
        addfood(new food_items_model("Poultry Products","Emu, raw, flat fillet",22f,0.7f,0f,102f),db);
        addfood(new food_items_model("Poultry Products","Ground turkey, cooked",27f,10f,0f,203f),db);
        addfood(new food_items_model("Poultry Products","Ostrich, raw, top loin",22f,3f,0f,119f),db);
        addfood(new food_items_model("Poultry Products","Turkey and gravy, frozen",5.9f,2.6f,4.6f,67f),db);
        addfood(new food_items_model("Poultry Products","Ostrich, cooked, top loin",28f,3.9f,0f,155f),db);
        addfood(new food_items_model("Poultry Products","Quail, raw, meat and skin",20f,12f,0f,192f),db);
        addfood(new food_items_model("Poultry Products","Ground turkey, raw, fat free",24f,2f,0f,112f),db);
        addfood(new food_items_model("Poultry Products","Turkey, raw, meat only, whole",23f,1.9f,0.1f,112f),db);
        addfood(new food_items_model("Poultry Products","Dove, cooked (includes squab)",24f,13f,0f,213f),db);
        addfood(new food_items_model("Poultry Products","Ostrich, cooked, outside strip",29f,3.8f,0f,156f),db);
        addfood(new food_items_model("Poultry Products","Duck, raw, meat and skin, wild",17f,15f,0f,211f),db);
        addfood(new food_items_model("Poultry Products","Duck, raw, liver, domesticated",19f,4.6f,3.5f,136f),db);
        addfood(new food_items_model("Poultry Products","Chicken patty, uncooked, frozen",14f,20f,14f,292f),db);
        addfood(new food_items_model("Poultry Products","Chicken, raw, meat only, stewing",21f,6.3f,0f,148f),db);
        addfood(new food_items_model("Poultry Products","Chicken, raw, all classes, heart",16f,9.3f,0.7f,153f),db);
        addfood(new food_items_model("Poultry Products","Chicken, raw, all classes, liver",17f,4.8f,0.7f,119f),db);
        addfood(new food_items_model("Poultry Products","Pheasant, raw, meat only, breast",24f,3.3f,0f,133f),db);
        addfood(new food_items_model("Poultry Products","Turkey, raw, meat and skin, whole",22f,5.6f,0.1f,143f),db);
        addfood(new food_items_model("Poultry Products","Turkey, raw, all classes, gizzard",19f,3.4f,0f,111f),db);
        addfood(new food_items_model("Poultry Products","Duck, raw, meat only, breast, wild",20f,4.3f,0f,123f),db);
        addfood(new food_items_model("Poultry Products","Turkey, raw, meat and skin, dark meat",20f,9f,0.2f,161f),db);
        addfood(new food_items_model("Poultry Products","Turkey, with broth, meat only, canned",24f,6.9f,1.5f,169f),db);
        addfood(new food_items_model("Poultry Products","Chicken, raw, skin (drumsticks and thighs)",9.6f,44f,0.8f,440f),db);
        addfood(new food_items_model("Poultry Products","Chicken breast tenders, uncooked, breaded",15f,16f,15f,263f),db);
        addfood(new food_items_model("Poultry Products","Chicken, simmered, cooked, giblets, capons",26f,5.4f,0.8f,164f),db);
        addfood(new food_items_model("Poultry Products","Chicken, raw, meat only, cornish game hens",20f,3.3f,0f,116f),db);
        addfood(new food_items_model("Poultry Products","Turkey, raw, meat only, thigh, retail parts",21f,3.7f,0f,116f),db);
        addfood(new food_items_model("Poultry Products","Chicken, raw, meat only, broilers or fryers",21f,3.1f,0f,119f),db);
        addfood(new food_items_model("Poultry Products","Chicken, simmered, cooked, giblets, roasting",27f,5.2f,0.9f,165f),db);
        addfood(new food_items_model("Poultry Products","Chicken, raw, meat only, dark meat, roasting",19f,3.6f,0f,113f),db);
        addfood(new food_items_model("Poultry Products","Turkey, simmered, cooked, all classes, gizzard",26f,4.6f,0f,155f),db);
        addfood(new food_items_model("Poultry Products","Chicken, stewed, meat only, broilers or fryers",27f,6.7f,0f,177f),db);
        addfood(new food_items_model("Poultry Products","Chicken, raw, separable fat, broilers or fryers",3.7f,68f,0f,629f),db);
        addfood(new food_items_model("Poultry Products","Chicken, simmered, cooked, all classes, gizzard",30f,2.7f,0f,154f),db);
        addfood(new food_items_model("Poultry Products","Turkey, roasted, skin from whole (light and dark)",24f,39f,0.6f,459f),db);
        addfood(new food_items_model("Poultry Products","Turkey, roasted, meat only, from whole bird, thigh",28f,6f,0f,165f),db);
        addfood(new food_items_model("Poultry Products","Turkey, raw, meat and skin, drumstick, retail parts",20f,6.8f,0f,141f),db);
        addfood(new food_items_model("Poultry Products","Goose, roasted, cooked, meat and skin, domesticated",25f,22f,0f,305f),db);
        addfood(new food_items_model("Poultry Products","Chicken, raw, meat and skin, wing, broilers or fryers",18f,13f,0f,191f),db);
        addfood(new food_items_model("Poultry Products","Chicken, raw, meat and skin, neck, broilers or fryers",14f,26f,0f,297f),db);
        addfood(new food_items_model("Poultry Products","Chicken, raw, meat and skin, back, broilers or fryers",14f,29f,0f,319f),db);
        addfood(new food_items_model("Poultry Products","Chicken, braised, cooked, skin (drumsticks and thighs)",15f,43f,0f,443f),db);
        addfood(new food_items_model("Poultry Products","Chicken, roasted, cooked, skin (drumsticks and thighs)",17f,44f,0f,462f),db);
        addfood(new food_items_model("Poultry Products","Chicken, roasted, cooked, meat only, cornish game hens",23f,3.9f,0f,134f),db);
        addfood(new food_items_model("Poultry Products","Chicken, roasted, cooked, meat only, light meat, roasting",27f,4.1f,0f,153f),db);
        addfood(new food_items_model("Poultry Products","Turkey, roasted, cooked, meat and skin, back, all classes",27f,14f,0.2f,244f),db);
        addfood(new food_items_model("Poultry Products","Turkey, roasted, cooked, meat only, drumstick, retail parts",29f,6.5f,0f,173f),db);
        addfood(new food_items_model("Poultry Products","Chicken, roasted, cooked, meat and skin, broilers or fryers",27f,14f,0f,239f),db);
        addfood(new food_items_model("Poultry Products","Chicken, raw, meat and skin, light meat, broilers or fryers",20f,11f,0f,186f),db);
        addfood(new food_items_model("Poultry Products","Turkey, roasted, cooked, meat and skin, breast, all classes",29f,7.4f,0f,189f),db);
        addfood(new food_items_model("Poultry Products","Chicken, fried, cooked, meat only, back, broilers or fryers",30f,15f,5.7f,288f),db);
        addfood(new food_items_model("Poultry Products","Turkey, roasted, cooked, meat and skin, breast, retail parts",29f,5.3f,0.1f,164f),db);
        addfood(new food_items_model("Poultry Products","Turkey, roasted, cooked, meat and skin, dark meat from whole",27f,10f,0.1f,206f),db);
        addfood(new food_items_model("Poultry Products","Chicken, roasted, cooked, meat only, wing, broilers or fryers",30f,8.1f,0f,203f),db);
        addfood(new food_items_model("Poultry Products","Chicken, fried, cooked, meat only, breast, broilers or fryers",33f,4.7f,0.5f,187f),db);
        addfood(new food_items_model("Poultry Products","Chicken, stewed, cooked, meat only, thigh, broilers or fryers",25f,9.8f,0f,195f),db);
        addfood(new food_items_model("Poultry Products","Chicken, stewed, cooked, meat only, breast, broilers or fryers",29f,3f,0f,151f),db);
        addfood(new food_items_model("Poultry Products","Chicken, raw, with added solution, meat only, thigh, dark meat",19f,3.7f,0f,110f),db);
        addfood(new food_items_model("Poultry Products","Chicken, roasted, cooked, meat only, breast, broilers or fryers",31f,3.6f,0f,165f),db);
        addfood(new food_items_model("Poultry Products","Chicken, stewed, cooked, meat and skin, leg, broilers or fryers",24f,13f,0f,220f),db);
        addfood(new food_items_model("Poultry Products","Chicken, stewed, cooked, meat and skin, wing, broilers or fryers",23f,17f,0f,249f),db);
        addfood(new food_items_model("Poultry Products","Chicken, batter, fried, cooked, meat and skin, broilers or fryers",23f,17f,9.4f,289f),db);
        addfood(new food_items_model("Poultry Products","Chicken, stewed, cooked, meat and skin, thigh, broilers or fryers",23f,15f,0f,232f),db);
        addfood(new food_items_model("Poultry Products","Chicken, roasted, cooked, meat and skin, back, broilers or fryers",26f,21f,0f,300f),db);
        addfood(new food_items_model("Poultry Products","Chicken, stewed, cooked, meat and skin, breast, broilers or fryers",27f,7.4f,0f,184f),db);
        addfood(new food_items_model("Poultry Products","Chicken, roasted, cooked, meat only, light meat, broilers or fryers",31f,4.5f,0f,173f),db);
        addfood(new food_items_model("Poultry Products","Chicken, roasted, cooked, meat and skin, breast, broilers or fryers",30f,7.8f,0f,197f),db);
        addfood(new food_items_model("Poultry Products","Chicken, raw, meat and skin and giblets and neck, broilers or fryers",18f,15f,0.1f,213f),db);
        addfood(new food_items_model("Poultry Products","Chicken, roasted, cooked, meat and skin and giblets and neck, capons",28f,12f,0f,226f),db);
        addfood(new food_items_model("Poultry Products","Chicken, stewed, cooked, meat and skin, dark meat, broilers or fryers",24f,15f,0f,233f),db);
        addfood(new food_items_model("Poultry Products","Chicken, stewed, cooked, and giblets and neck, meat and skin, stewing",25f,12f,0f,214f),db);
        addfood(new food_items_model("Poultry Products","Turkey, raw, with added solution, meat and skin, breast, retail parts",21f,6.8f,0f,144f),db);
        addfood(new food_items_model("Poultry Products","Turkey, raw, with added solution, meat and skin, dark meat from whole",18f,11f,0.2f,169f),db);
        addfood(new food_items_model("Poultry Products","Chicken, roasted, cooked, meat and skin, dark meat, broilers or fryers",26f,16f,0f,253f),db);
        addfood(new food_items_model("Poultry Products","Chicken, flour, fried, cooked, meat and skin, wing, broilers or fryers",26f,22f,2.4f,321f),db);
        addfood(new food_items_model("Poultry Products","Chicken, raw, meat only, boneless, skinless, breast, broiler or fryers",23f,2.6f,0f,120f),db);



        addfood(new food_items_model("Snacks","Aloo Pattice",2.95f,8.34f,11.99f,135f),db);
        addfood(new food_items_model("Snacks","Batatawada",4.8f,6.9f,25.6f,128f),db);
        addfood(new food_items_model("Snacks","Cucumber Poha",16f,32f,72f,632f),db);
        addfood(new food_items_model("Snacks","Dhokla Sandwich",4f,5f,22f,150f),db);
        addfood(new food_items_model("Snacks","Drumstick",53.6f,22.12f,0f,428f),db);
        addfood(new food_items_model("Snacks","Drumstick Leaves",2.213f,0.391f,4.683f,25.196f),db);
        addfood(new food_items_model("Snacks","Finger Chips",0.12f,0.67f,0.9f,10f),db);
        addfood(new food_items_model("Snacks","Fish Cutlet",22.19f,11.75f,24.71f,299f),db);
        addfood(new food_items_model("Snacks","Fish Fingers (100 gms)",10.70f,8.80f,12.10f,203f),db);
//addfood(new food_items_model("Snacks","Fried Tricolor Sandwich",f,f,f,f),db);
        addfood(new food_items_model("Snacks","Fry Idli",1.91f,1.65f,7.67f,53f),db);
        addfood(new food_items_model("Snacks","Grilled Cheese Sandwich",9.16f,5.77f,27.85f,291f),db);
        addfood(new food_items_model("Snacks","Grilled Chicken in Lemon Sauce",27.6f,4.9f,3.8f,172.3f),db);
//addfood(new food_items_model("Snacks","Handvi",f,f,f,f),db);
//addfood(new food_items_model("Snacks","Hyderabadi Sandwich",f,f,f,f),db);
        addfood(new food_items_model("Snacks","Idli",1.91f,0.19f,7.89f,40f),db);
        addfood(new food_items_model("Snacks","Indian Pau",3.74f,5.10f,18.80f,137f),db);
        addfood(new food_items_model("Snacks","Jwar Khakra",1.99f,2.42f,10.17f,66f),db);
//addfood(new food_items_model("Snacks","Khakra W/o Ghee",f,f,f,f),db);
        addfood(new food_items_model("Snacks","Khaman Dhokla",2.88f,1.54f,9.17f,60f),db);
        addfood(new food_items_model("Snacks","Khandvi",4.4f,4.8f,11.9f,103f),db);
        addfood(new food_items_model("Snacks","Kurmura",7f,0.9f,87.77f,383f),db);
        addfood(new food_items_model("Snacks","Khasta Kachori",5f,11f,21f,201f),db);
        addfood(new food_items_model("Snacks","Macaroni",23.18f,4.72f,112.18f,590f),db);
        addfood(new food_items_model("Snacks","Macaroni Cheese Fritters",30.9f,13.3f,53.0f,460.6f),db);
        addfood(new food_items_model("Snacks","Mackerel Curry",12.79f,7.82f,0.23f,126f),db);
        addfood(new food_items_model("Snacks","Mackerel Fried",17.48f,16.26f,7.01f,248f),db);
//addfood(new food_items_model("Snacks","Mackerel Molee",f,f,f,f),db);
//addfood(new food_items_model("Snacks","Mackerel Stew",f,f,f,f),db);
        addfood(new food_items_model("Snacks","Wheat Khakra",2.0f,4.0f,10.5f,86.0f),db);
//addfood(new food_items_model("Snacks","SoyaBhel",f,f,f,f),db);
        addfood(new food_items_model("Snacks","Spring Roll",1.99f,2.84f,7.44f,63f),db);
        addfood(new food_items_model("Snacks","Sukha Bhel",5f,2f,50f,275f),db);
//addfood(new food_items_model("Snacks","Sweet & Sour Paneer",f,f,f,f),db);
        addfood(new food_items_model("Snacks","Sweet & Sour Veg",12.87f,0.68f,58.9f,292f),db);
        addfood(new food_items_model("Snacks","Veg Cheese Toast",4.0f,11.0f,17.0f,180.0f),db);
        addfood(new food_items_model("Snacks","Veg Chops",5.72f,0.3f,26.18f,130f),db);
//addfood(new food_items_model("Snacks","Veg Chow Chow",f,f,f,f),db);
        addfood(new food_items_model("Snacks","Veg Cutlets",20f,20f,100f,500f),db);
        addfood(new food_items_model("Snacks","Veg Frankie",6f,5f,28f,165f),db);
        addfood(new food_items_model("Snacks","Masala Khakra",7f,7f,15f,144f),db);
//addfood(new food_items_model("Snacks","Masala Kurmura",f,f,f,f),db);
//addfood(new food_items_model("Snacks","Masala Potato Waffers",f,f,f,f),db);
        addfood(new food_items_model("Snacks","Masala Peanuts",51.6f,98.48f,32.26f,1134f),db);
        addfood(new food_items_model("Snacks","Mathia",2f,0f,6f,35f),db);
        addfood(new food_items_model("Snacks","Mathri",0f,3f,4f,40f),db);
        addfood(new food_items_model("Snacks","Methi Kakhra",4f,8f,22f,176f),db);
        addfood(new food_items_model("Snacks","Methi Thepla",4f,5f,17f,127f),db);
        addfood(new food_items_model("Snacks","Navratna Kurma",5.3f,20.1f,21.8f,275.2f),db);
//        addfood(new food_items_model("Snacks","Oilfree Ragi Khakra",f,f,f,f),db);
        addfood(new food_items_model("Snacks","Onion Bhajia",0.55f,0.55f,1.86f,14f),db);
        addfood(new food_items_model("Snacks","Onion Pakoda",4f,10f,10f,315f),db);
        addfood(new food_items_model("Snacks","Onion Poha",16f,32f,72f,632f),db);
        addfood(new food_items_model("Snacks","Oondhiu",10f,5f,56f,288f),db);
        addfood(new food_items_model("Snacks","Phafada",0f,2f,15f,87f),db);
        addfood(new food_items_model("Snacks","Plain Bread Stick",1.2f,0.95f,6.84f,41f),db);
        addfood(new food_items_model("Snacks","Popcorn",18f,56.2f,114.4f,1000f),db);
//addfood(new food_items_model("Snacks","Potato Chips",f,f,f,f),db);
//addfood(new food_items_model("Snacks","Pudina Potato Waffers",f,f,f,f),db);
        addfood(new food_items_model("Snacks","Punjabi Khakra",2f,1f,10f,63f),db);
        addfood(new food_items_model("Snacks","Punjabi Samosa",5f,13.2f,28.4f,252f),db);
        addfood(new food_items_model("Snacks","Puran Poli",10f,9f,57f,349f),db);
        addfood(new food_items_model("Snacks","Ragda Pattice",8f,13f,47f,333f),db);
        addfood(new food_items_model("Snacks","Rasberry Cream Biscuit",0f,5f,0f,83f),db);
        addfood(new food_items_model("Snacks","Roasted Papad",2.3f,0.29f,5.39f,33f),db);
//addfood(new food_items_model("Snacks","Salty Potato Waffers",f,f,f,f),db);
//addfood(new food_items_model("Snacks","Sev",f,f,f,f),db);
//addfood(new food_items_model("Snacks","Sev Kurmura",f,f,f,f),db);
//addfood(new food_items_model("Snacks","Sev Puri",f,f,f,f),db);


        addfood(new food_items_model("Snacks","Tortilla chips, salted, plain, yellow",6.6f,22f,67f,497f),db);
        addfood(new food_items_model("Snacks","Tortilla chips, baked without fat, low fat",11f,5.7f,80f,415f),db);
        addfood(new food_items_model("Snacks","Snacks, with peanuts, caramel-coated, popcorn",6.4f,7.8f,81f,400f),db);
        addfood(new food_items_model("Snacks","Breakfast bar, corn flake crust with fruit",4.4f,7.5f,73f,377f),db);
        addfood(new food_items_model("Snacks","Breakfast bars, coconut (include granola bar), raisins, sugar, oats",9.8f,18f,67f,464f),db);
        addfood(new food_items_model("Snacks","Cheese puffs and twists, low fat, baked, corn based",8.5f,12f,72f,432f),db);
        addfood(new food_items_model("Snacks","M0ilk and cereal bar",6.5f,11f,72f,413f),db);
        addfood(new food_items_model("Snacks","Granola bar, peanut butter, milk chocolate coated, soft",9.6f,31f,54f,536f),db);
        addfood(new food_items_model("Snacks","Popcorn, fat-free, sugar syrup/caramel",2f,1.4f,90f,381f),db);
        addfood(new food_items_model("Snacks","Popcorn, low fat and sodium, microwave",13f,9.5f,73f,429f),db);
        addfood(new food_items_model("Snacks","Popcorn, made with palm oil, regular (butter) flavor, microwave",8.4f,30f,57f,535f),db);
        addfood(new food_items_model("Snacks","Potato chips, reduced fat, without salt",7.1f,21f,68f,487f),db);
        addfood(new food_items_model("Snacks","Rice and Wheat cereal bar",9.1f,9.1f,73f,409f),db);
        addfood(new food_items_model("Snacks","Rice crackers",10f,5f,83f,416f),db);
        addfood(new food_items_model("Snacks","Snack, Mixed Berry Bar",13f,11f,59f,383f),db);
        addfood(new food_items_model("Snacks","Banana chips",2.3f,34f,58f,519f),db);
        addfood(new food_items_model("Snacks","Baked, restructured, white, potato chips",5f,18f,71f,469f),db);
        addfood(new food_items_model("Snacks","Barbecue-flavor, chips, extruded, corn-based",7f,33f,56f,523f),db);
        addfood(new food_items_model("Snacks","Brown rice chips",8.2f,2.8f,82f,384f),db);
        addfood(new food_items_model("Snacks","Cakes, popcorn",9.7f,3.1f,80f,384f),db);
        addfood(new food_items_model("Snacks","Cheese-flavor, popcorn",9.3f,33f,52f,526f),db);
        addfood(new food_items_model("Snacks","Cheese-flavor, potato chips",8.5f,27f,58f,496f),db);
        addfood(new food_items_model("Snacks","Chocolate chip, crisped rice bar",5.1f,14f,73f,404f),db);
        addfood(new food_items_model("Snacks","Chocolate chip, milk chocolate coating, coated, soft, granola bars",5.8f,25f,64f,466f),db);
        addfood(new food_items_model("Snacks","Chocolate chip, uncoated, soft, granola bars",5.7f,17f,70f,418f),db);
        addfood(new food_items_model("Snacks","Corn cakes",8.1f,2.4f,83f,387f),db);
        addfood(new food_items_model("Snacks","Corn, brown rice, rice cakes",8.4f,3.2f,81f,385f),db);
        addfood(new food_items_model("Snacks","Crunchy Almond/Brown Sugar, KELLOGG'S Low Fat Granola Bar, KELLOGG",8f,7.4f,78f,390f),db);
        addfood(new food_items_model("Snacks","Fruit, NUTRI-GRAIN Cereal Bars, KELLOGG'S",4.2f,8.7f,68f,365f),db);
        addfood(new food_items_model("Snacks","Light (baked with less oil), tortilla chips",8.7f,15f,73f,465f),db);
        addfood(new food_items_model("Snacks","Lightly salted, potato chips",6.7f,35f,54f,560f),db);
        addfood(new food_items_model("Snacks","Low fat, microwave, popcorn",13f,9.5f,72f,424f),db);
        addfood(new food_items_model("Snacks","Onion-flavor, extruded, corn-based",7.7f,23f,65f,499f),db);
        addfood(new food_items_model("Snacks","Plain, bagel chips",12f,15f,66f,451f),db);
        addfood(new food_items_model("Snacks","Plain, CORNNUTS, KRAFT",8.5f,16f,72f,446f),db);
        addfood(new food_items_model("Snacks","Potato sticks",6.7f,34f,53f,522f),db);
        addfood(new food_items_model("Snacks","Plain, rice cracker brown rice",8.2f,2.8f,82f,387f),db);
        addfood(new food_items_model("Snacks","Reduced fat, made from dried potatoes, potato chips",4.6f,26f,65f,502f),db);
        addfood(new food_items_model("Snacks","Reduced fat, potato chips",7.1f,21f,67f,471f),db);
        addfood(new food_items_model("Snacks","Salt added, white popcorn, oil-popped, popcorn",9f,28f,57f,500f),db);
        addfood(new food_items_model("Snacks","Salted, fat free, potato chips",9.6f,0.6f,84f,379f),db);
        addfood(new food_items_model("Snacks","Salted, made with unenriched flour, plain, hard, pretzels",9.1f,3.5f,79f,381f),db);
        addfood(new food_items_model("Snacks","Salted, pita chips",12f,15f,68f,457f),db);
        addfood(new food_items_model("Snacks","Salted, soy chips or crisps",27f,7.4f,53f,385f),db);
        addfood(new food_items_model("Snacks","Salted, yucca (cassava) chips",1.3f,26f,69f,515f),db);
        addfood(new food_items_model("Snacks","Smoked, beef sticks",22f,50f,5.4f,550f),db);
        addfood(new food_items_model("Snacks","Unsalted, low fat, tortilla chips",11f,5.7f,80f,416f),db);
        addfood(new food_items_model("Snacks","Unsalted, plain, brown rice, rice cakes",8.2f,2.8f,82f,387f),db);
        addfood(new food_items_model("Snacks","Unsalted, multigrain, brown rice, rice cakes",8.5f,3.5f,80f,387f),db);
        addfood(new food_items_model("Snacks","Unsalted, oil-popped, home-prepared, popcorn",9f,28f,58f,500f),db);
        addfood(new food_items_model("Snacks","Very low sodium, corn cakes",8.1f,2.4f,83f,387f),db);
        addfood(new food_items_model("Snacks","White corn, unsalted, tortilla chips",7.8f,23f,65f,503f),db);
        addfood(new food_items_model("Snacks","Tortilla chips, baked without fat, low fat",11f,5.7f,80f,415f),db);
        addfood(new food_items_model("Snacks","Tortilla chips, salted, plain, yellow",6.6f,22f,67f,497f),db);
        addfood(new food_items_model("Snacks","Unsalted, plain, potato chips",7f,35f,53f,536f),db);
        addfood(new food_items_model("Snacks","Unsalted, regular, trail mix",14f,29f,45f,462f),db);
        addfood(new food_items_model("Snacks","Unsalted, sweet potato chips",2.9f,32f,57f,532f),db);
        addfood(new food_items_model("Snacks","Without peanuts, caramel-coated, popcorn",3.8f,13f,79f,431f),db);

        addfood(new food_items_model("Sweets","Aam Ras",0f,0f,32f,137f),db);
        addfood(new food_items_model("Sweets","Adi Rasam",0f,0f,0f,120f),db);
        addfood(new food_items_model("Sweets","Apple Pie",1.9f,11f,34f,237f),db);
        addfood(new food_items_model("Sweets","Badam Pista ICC",14f,24f,2f,280f),db);
        addfood(new food_items_model("Sweets","Banana Custard",22f,4f,62f,371f),db);
        addfood(new food_items_model("Sweets","Banana Fritters",5.89f,24.94f,40.23f,400f),db);
        addfood(new food_items_model("Sweets","Banana Chips",2.3f,34f,58f,519f),db);
        addfood(new food_items_model("Sweets","Banana Walnut Cake",0f,0f,0f,637f),db);
        addfood(new food_items_model("Sweets","Sandesh Bengali Sweet",27f,14f,5f,246f),db);
        addfood(new food_items_model("Sweets","Besan Laddoo",0f,0f,0f,157f),db);
        addfood(new food_items_model("Sweets","Black Currant ICC",6f,2f,40f,200f),db);
        addfood(new food_items_model("Sweets","Black Currants",0f,0f,0f,35f),db);
        addfood(new food_items_model("Sweets","Black Forest Cake",1.03f,5.38f,16.34f,114f),db);
        addfood(new food_items_model("Sweets","Black Magic Cake",0f,15f,21f,306f),db);
        addfood(new food_items_model("Sweets","Bread & Butter Pudding",10.54f,9.48f,46.52f,306f),db);
        addfood(new food_items_model("Sweets","Bread Pudding",7.5f,7.2f,33.7f,220f),db);
        addfood(new food_items_model("Sweets","Bundi Ladoo (1 piece(50 g.))",0f,0f,0f,180f),db);
        addfood(new food_items_model("Sweets","Burfi",3.01f,5.32f,17.08f,125f),db);
        addfood(new food_items_model("Sweets","Butterscotch ICC",28f,13f,32f,340f),db);
        addfood(new food_items_model("Sweets","Coconut Barfi",18f,4f,46f,280f),db);
        addfood(new food_items_model("Sweets","Coconut Chikki",1f,6f,9f,92f),db);
        addfood(new food_items_model("Sweets","Cornetto King Cone",0f,0f,0f,120f),db);
        addfood(new food_items_model("Sweets","Fruit Custard",0f,0f,0f,346f),db);
        addfood(new food_items_model("Sweets","Date & Walnut Cake",0f,7f,0f,70f),db);
        addfood(new food_items_model("Sweets","Dudh Pak",20f,1f,48f,238f),db);
        addfood(new food_items_model("Sweets","Dudhi Halwa",2f,1f,14f,80f),db);
        addfood(new food_items_model("Sweets","Eggless Chocolate Cake",22f,16f,38f,378f),db);
        addfood(new food_items_model("Sweets","Falooda",5f,5f,24f,135f),db);
        addfood(new food_items_model("Sweets","Fatless Chocolate Cake",11f,4.5f,85f,400f),db);
        addfood(new food_items_model("Sweets","Fruit Cake",1.25f,3.91f,26.49f,139f),db);
        addfood(new food_items_model("Sweets","Fruit Triffle",0f,0f,0f,600f),db);
        addfood(new food_items_model("Sweets","Gems",0f,0f,1f,4f),db);
        addfood(new food_items_model("Sweets","Groundnut Chikki",16f,52f,24f,658f),db);
        addfood(new food_items_model("Sweets","Groundnut Ladoo",3f,4f,4f,57f),db);
        addfood(new food_items_model("Sweets","Gulab Jamun",0f,0f,0f,50f),db);
        addfood(new food_items_model("Sweets","Jalebi",0f,25f,55f,150f),db);
        addfood(new food_items_model("Sweets","Jam",0f,0f,17f,67f),db);
        addfood(new food_items_model("Sweets","Jelly",0f,0f,30f,110f),db);
        addfood(new food_items_model("Sweets","Jelly Custard",4f,3f,25f,135f),db);
        addfood(new food_items_model("Sweets","Jelly with Fruit",0f,0f,10f,40f),db);
        addfood(new food_items_model("Sweets","Kaju Katli",1f,3f,6f,57f),db);
        addfood(new food_items_model("Sweets","Kajudraksha ICC",3f,12f,20f,190f),db);
        addfood(new food_items_model("Sweets","Kesar Pista ICC",3f,11f,13f,160f),db);
        addfood(new food_items_model("Sweets","Kheer",10f,10f,35f,200f),db);
        addfood(new food_items_model("Sweets","Khoa",20f,26f,25f,413f),db);
        addfood(new food_items_model("Sweets","Kurmura Chikki",6f,6f,83f,414f),db);
        addfood(new food_items_model("Sweets","Kurmura Ladoo",2f,0f,20f,85f),db);
        addfood(new food_items_model("Sweets","Lychee ICC",6f,26f,48f,440f),db);
        addfood(new food_items_model("Sweets","Magaj",6f,27f,40f,420f),db);
        addfood(new food_items_model("Sweets","Mal Pua",2f,10f,42f,340f),db);
        addfood(new food_items_model("Sweets","Malai Peda",0f,0f,0f,620f),db);
        addfood(new food_items_model("Sweets","Mango Duet",17f,3f,57f,322f),db);
        addfood(new food_items_model("Sweets","Mango ICC",1.2f,3.2f,18.3f,120f),db);
        addfood(new food_items_model("Sweets","Mango Shrikhand",42.10f,52.63f,71.05f,986.8f),db);
        addfood(new food_items_model("Sweets","Marshmallow Pudding",64f,42f,25f,751f),db);
        addfood(new food_items_model("Sweets","Watermelon ICC",66f,9f,87f,675f),db);
        addfood(new food_items_model("Sweets","Vanilla Softy",3.89f,6.12f,24.11f,164f),db);
        addfood(new food_items_model("Sweets","Sponge Cake",4.6f,2.71f,36.35f,187f),db);
        addfood(new food_items_model("Sweets","Strawberry ICC",3.5f,8.2f,30f,210f),db);
        addfood(new food_items_model("Sweets","Strawberry Cake",12f,3f,53f,180f),db);
        addfood(new food_items_model("Sweets","Sweet Dalia in Milk",248f,19f,80f,1430f),db);
        addfood(new food_items_model("Sweets","Til Chikki",0f,0f,0f,20f),db);
        addfood(new food_items_model("Sweets","Til Ladoo",1f,4f,9f,77f),db);
        addfood(new food_items_model("Sweets","Tutty Fruity ICC",4f,16f,36f,300f),db);
        addfood(new food_items_model("Sweets","Vanila ICC",3.8f,13f,27f,214f),db);
        addfood(new food_items_model("Sweets","Modak",3f,8f,31f,195f),db);
        addfood(new food_items_model("Sweets","Mohanthal",69f,22f,67f,915f),db);
        addfood(new food_items_model("Sweets","Moong Dal Halwa",4f,50f,33f,600f),db);
        addfood(new food_items_model("Sweets","Mysore Pak",0f,1f,6f,40f),db);
        addfood(new food_items_model("Sweets","Nestle Kit Kat Small",7f,26f,65f,518f),db);
        addfood(new food_items_model("Sweets","Peda White",41f,11f,79f,572f),db);
        addfood(new food_items_model("Sweets","Perk Cadburys",2f,0f,27f,1f),db);
        addfood(new food_items_model("Sweets","Phirni",112f,22f,205f,1480f),db);
        addfood(new food_items_model("Sweets","Pineapple ICC",8f,28f,60f,520f),db);
        addfood(new food_items_model("Sweets","Pista ICC",8f,20f,30f,340f),db);
        addfood(new food_items_model("Sweets","Rabdi",6f,0f,18f,100f),db);
        addfood(new food_items_model("Sweets","Raspberry ICC",6f,16f,38f,320f),db);
        addfood(new food_items_model("Sweets","Rasgulla",0f,0f,0f,1f),db);
        addfood(new food_items_model("Sweets","Rava Ladoo",32f,911f,567f,1543f),db);
        addfood(new food_items_model("Sweets","Sesame Ladoo",1f,4f,9f,77f),db);
        addfood(new food_items_model("Sweets","Shahi Rice Kheer",8f,6.8f,47.6f,282f),db);
        addfood(new food_items_model("Sweets","Shakarpara",7.5f,50f,105f,866f),db);
        addfood(new food_items_model("Sweets","Sheera",53f,11f,23f,600f),db);
        addfood(new food_items_model("Sweets","Shrikhand",7.49f,4.03f,28.95f,178f),db);
        addfood(new food_items_model("Sweets","Sitafal ICC",5f,23f,40f,400f),db);


        addfood(new food_items_model("Sweets","Honey",0.3f,0f,82f,304f),db);
        addfood(new food_items_model("Sweets","Jellies",0.2f,0f,70f,266f),db);
        addfood(new food_items_model("Sweets","Molasses",0f,0.1f,75f,290f),db);
        addfood(new food_items_model("Sweets","Syrup, Cane",0f,0f,73f,269f),db);
        addfood(new food_items_model("Sweets","Chewing gum",0f,0.3f,97f,360f),db);
        addfood(new food_items_model("Sweets","Fruit syrup",0f,0f,85f,341f),db);
        addfood(new food_items_model("Sweets","Syrups, malt",6.2f,0f,71f,318f),db);
        addfood(new food_items_model("Sweets","Sugars, maple",0.1f,.2f,91f,354f),db);
        addfood(new food_items_model("Sweets","Candies, hard",0f,.2f,98f,394f),db);
        addfood(new food_items_model("Sweets","Sugars, brown",0.1f,0f,98f,380f),db);
        addfood(new food_items_model("Sweets","Sherbet, orange",1.1f,2f,30f,144f),db);
        addfood(new food_items_model("Sweets","Syrups, sorghum",0f,0f,75f,290f),db);
        addfood(new food_items_model("Sweets","Sugars, powdered",0f,0f,100f,389f),db);
        addfood(new food_items_model("Sweets","Candies, caramels",4.6f,8.1f,77f,382f),db);
        addfood(new food_items_model("Sweets","Syrups, grenadine",0f,0f,67f,268f),db);
        addfood(new food_items_model("Sweets","Candies, Tamarind",0f,0f,92f,368f),db);
        addfood(new food_items_model("Sweets","Sugars, granulated",0f,0f,100f,387f),db);
        addfood(new food_items_model("Sweets","Syrups, dark, corn",0f,0f,78f,286f),db);
        addfood(new food_items_model("Sweets","Syrups, sugar free",0.8f,0f,12f,52f),db);
        addfood(new food_items_model("Sweets","Toppings, pineapple",0.1f,.1f,66f,253f),db);
        addfood(new food_items_model("Sweets","Candies, peanut bar",16f,34f,47f,522f),db);
        addfood(new food_items_model("Sweets","Toppings, strawberry",0.2f,.1f,66f,254f),db);
        addfood(new food_items_model("Sweets","Fruit butters, apple",0.4f,.3f,42f,173f),db);
        addfood(new food_items_model("Sweets","Candies, butterscotch",0f,3.3f,90f,391f),db);
        addfood(new food_items_model("Sweets","Candies, marshmallows",1.8f,.2f,81f,318f),db);
        addfood(new food_items_model("Sweets","Egg custards, dry mix",6.9f,6.4f,83f,410f),db);
        addfood(new food_items_model("Sweets","Chewing gum, sugarless",0f,.4f,95f,268f),db);
        addfood(new food_items_model("Sweets","Candies, sesame crunch",12f,33f,50f,516f),db);
        addfood(new food_items_model("Sweets","Sweetener, agave, syrup",0.1f,.5f,76f,310f),db);
        addfood(new food_items_model("Sweets","Toppings, nuts in syrup",4.5f,22f,58f,448f),db);
        addfood(new food_items_model("Sweets","Candies, milk chocolate",7.7f,30f,59f,535f),db);
        addfood(new food_items_model("Sweets","Syrup, chocolate, NESTLE",0f,0f,67f,269f),db);
        addfood(new food_items_model("Sweets","Candies, sweet chocolate",3.9f,34f,60f,507f),db);
        addfood(new food_items_model("Sweets","Candies, white chocolate",5.9f,32f,59f,539f),db);
        addfood(new food_items_model("Sweets","Frozen yogurts, chocolate",3f,3.6f,22f,127f),db);
        addfood(new food_items_model("Sweets","Jams and preserves, apricot",0.7f,.2f,64f,242f),db);
        addfood(new food_items_model("Sweets","Candies, unsweetened, carob",8.2f,31f,56f,540f),db);
        addfood(new food_items_model("Sweets","Pie fillings, cherry, canned",0.4f,.1f,28f,115f),db);
        addfood(new food_items_model("Sweets","Puddings, ready-to-eat, rice",3.2f,2.2f,18f,108f),db);
        addfood(new food_items_model("Sweets","Candies, with almonds, nougat",3.3f,1.7f,92f,398f),db);
        addfood(new food_items_model("Sweets","Syrups, fudge-type, chocolate",4.6f,8.9f,63f,350f),db);
        addfood(new food_items_model("Sweets","Candies, sugar-coated almonds",10f,18f,68f,474f),db);
        addfood(new food_items_model("Sweets","Syrups, pancake, table blends",0f,0f,61f,234f),db);
        addfood(new food_items_model("Sweets","Snacks, pieces, fruit leather",1f,2.7f,83f,359f),db);
        addfood(new food_items_model("Sweets","Flan, dry mix, caramel custard",0f,0f,92f,348f),db);
        addfood(new food_items_model("Sweets","Puddings, ready-to-eat, vanilla",1.5f,3.8f,23f,130f),db);
        addfood(new food_items_model("Sweets","Pie fillings, canned, blueberry",0.4f,.2f,44f,181f),db);
        addfood(new food_items_model("Sweets","Puddings, ready-to-eat, tapioca",2f,3.9f,22f,130f),db);
        addfood(new food_items_model("Sweets","Gelatins, unsweetened, dry powder",86f,.1f,0f,335f),db);
        addfood(new food_items_model("Sweets","Frostings, dry mix, fluffy, white",2.3f,0f,95f,371f),db);
        addfood(new food_items_model("Sweets","Candies, vanilla with nuts, fudge",3f,14f,75f,435f),db);
        addfood(new food_items_model("Sweets","Desserts, dry mix, vanilla, rennin",0f,0f,99f,383f),db);
        addfood(new food_items_model("Sweets","Puddings, instant, dry mix, banana",0f,.6f,93f,367f),db);
        addfood(new food_items_model("Sweets","Baking chocolate, squares, mexican",3.6f,16f,77f,426f),db);
        addfood(new food_items_model("Sweets","Chocolate-flavored hazelnut spread",5.4f,30f,62f,541f),db);
        addfood(new food_items_model("Sweets","Puddings, instant, dry mix, vanilla",0f,.6f,93f,377f),db);
        addfood(new food_items_model("Sweets","Puddings, regular, dry mix, vanilla",0.3f,.4f,94f,379f),db);
        addfood(new food_items_model("Sweets","Candies, soft fruit and nut squares",2.3f,9.5f,74f,390f),db);
        addfood(new food_items_model("Sweets","Frostings, dry mix, creamy, vanilla",0.3f,4.9f,94f,410f),db);
        addfood(new food_items_model("Sweets","Frozen yogurts, soft-serve, vanilla",4f,5.6f,24f,159f),db);
        addfood(new food_items_model("Sweets","Puddings, instant, dry mix, chocolate",2.3f,1.9f,88f,378f),db);
        addfood(new food_items_model("Sweets","Sweeteners, liquid, fructose, tabletop",0f,0f,76f,279f),db);
        addfood(new food_items_model("Sweets","Jellies, home preserved, reduced sugar",0.3f,0f,46f,179f),db);
        addfood(new food_items_model("Sweets","Desserts, unsweetened, tablets, rennin",1f,.1f,20f,84f),db);
        addfood(new food_items_model("Sweets","Candies, starch jelly pieces, gumdrops",0f,0f,99f,396f),db);
        addfood(new food_items_model("Sweets","Candies, milk chocolate coated peanuts",13f,34f,50f,519f),db);
        addfood(new food_items_model("Sweets","Candies, milk chocolate coated raisins",4.1f,15f,68f,390f),db);
        addfood(new food_items_model("Sweets","Candies, prepared-from-recipe, truffles",6.2f,34f,45f,510f),db);
        addfood(new food_items_model("Sweets","Candies, sweet chocolate coated fondant",2.2f,9.3f,80f,366f),db);
        addfood(new food_items_model("Sweets","Candies, with rice cereal, milk chocolate",7.6f,29f,60f,511f),db);
        addfood(new food_items_model("Sweets","Puddings, with no added salt, dry mix, tapioca",0.1f,.1f,94f,369f),db);
        addfood(new food_items_model("Sweets","Syrups, reduced-calorie, pancake, table blends",0f,0f,45f,165f),db);
        addfood(new food_items_model("Sweets","Milk dessert, chocolate, milk-fat free, frozen",4.3f,1f,38f,167f),db);
        addfood(new food_items_model("Sweets","Egg custards, prepared with whole milk, dry mix",4f,4f,18f,122f),db);
        addfood(new food_items_model("Sweets","Puddings, prepared with whole milk, dry mix, tapioca",2.8f,2.9f,19f,115f),db);
        addfood(new food_items_model("Sweets","Puddings, prepared with whole milk, regular, dry mix, coconut cream",3f,3.8f,18f,114f),db);
        addfood(new food_items_model("Sweets","Ice cream sandwich",4.3f,8.6f,37f,237f),db);
        addfood(new food_items_model("Sweets","Ice cream sundae cone",3f,14f,29f,254f),db);
        addfood(new food_items_model("Sweets","Ice cream cookie sandwich",3.7f,7.4f,40f,240f),db);
        addfood(new food_items_model("Sweets","Ice cream, chocolate, soft serve, light",3.4f,3.7f,23f,141f),db);
        addfood(new food_items_model("Sweets","Ice cream sandwich, no sugar added, light, vanilla",5.7f,2.9f,43f,200f),db);
        addfood(new food_items_model("Sweets","Ice cream bar, with crunch coating, stick or nugget",2.1f,25f,37f,358f),db);
        addfood(new food_items_model("Sweets","Ice cream, added peanuts and chocolate sauce, cone, no sugar added, lowfat",5.3f,9.3f,40f,265f),db);
        addfood(new food_items_model("Sweets","Ice cream cone, flavors other than chocolate, with nuts, chocolate covered",5.2f,22f,34f,354f),db);


        addfood(new food_items_model("Cereals ,Grains and Pasta","Bajra Roti",4f,2f,20f,105f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Chana",9f,2.6f,27f,165f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Masoor",18f,0f,40f,232f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Moong Dal",7f,0.4f,19f,105f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Muth / Mothbeans",12f,0f,0f,100f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rajmah",15f,1f,40f,225f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Soya Bean",17f,9f,10f,173f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Tur Dal",7f,0.4f,23f,121f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Urad Dal",24f,1.5f,60f,350f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Cooked Chana Dal",15f,5.4f,50f,300f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Corn Flakes w/o Milk",10f,0f,120f,540f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Jawar Roti",10f,2f,73f,104f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Kabuli Chhole",9f,3f,27f,164f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Roasted Corn(1 cup)",5f,2f,29f,132f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","White Oats",2.4f,1.5f,13.2f,75f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Sprouted Moong Salad",4f,0f,13f,59f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Thepla",10f,15f,60f,350f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Salty Dalia in Water",11f,11f,66f,412f),db);

        addfood(new food_items_model("Cereals ,Grains and Pasta","Noodles, without added salt, cooked, unenriched, egg",4.5f,2.1f,25f,138f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Noodles, with added salt, enriched, cooked, egg",4.5f,2.1f,25f,138f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Amaranth grain, cooked",3.8f,1.6f,19f,102f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Amaranth grain, uncooked",14f,7f,65f,371f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Arrowroot flour",0.3f,0.1f,88f,357f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Barley flour or meal",11f,1.6f,75f,345f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Barley malt flour",10f,1.8f,78f,361f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Barley, hulled",12f,2.3f,73f,354f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Buckwheat",13f,3.4f,72f,343f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Bulgur, cooked",3.1f,0.2f,19f,83f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Bulgur, dry",12f,1.3f,76f,342f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Corn flour, blue (harina de maiz morado), whole-grain",8.8f,5.1f,74f,364f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Corn flour, enriched, masa, yellow",8.5f,3.7f,77f,363f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Corn flour, unenriched, degermed, yellow",5.6f,1.4f,83f,375f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Corn flour, white, enriched, masa",8.5f,3.7f,77f,363f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Corn grain, white",9.4f,4.7f,74f,365f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Corn grain, yellow",9.4f,4.7f,74f,365f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Corn flour, white, whole-grain",6.9f,3.9f,77f,361f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Corn flour, yellow, whole-grain",6.9f,3.9f,77f,361f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Cornstarch",0.3f,0.1f,91f,381f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Macaroni, cooked, enriched, vegetable",4.5f,0.1f,27f,128f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Macaroni, dry, enriched, vegetable",13f,1f,75f,367f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Millet flour",11f,4.3f,75f,382f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Millet, cooked",3.5f,1f,24f,119f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Millet, raw",11f,4.2f,73f,378f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Noodles, Chinese restaurant, crunchy, flat",10f,32f,52f,521f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Noodles, chow mein, chinese",8.1f,15f,73f,475f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Noodles, cooked, enriched, egg",4.5f,2.1f,25f,138f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Noodles, cooked, enriched, spinach, egg",5f,1.6f,24f,132f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Noodles, cooked, soba, japanese",5.1f,0.1f,21f,99f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Noodles, cooked, somen, japanese",4f,0.2f,28f,131f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Noodles, dry, enriched, spinach, egg",15f,4.6f,70f,382f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Noodles, dry, soba, japanese",14f,0.7f,75f,336f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Noodles, enriched, dry, egg",14f,4.4f,71f,384f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Noodles, unenriched, dry, egg",14f,4.4f,71f,384f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Oat bran, cooked",3.2f,0.9f,11f,40f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Oat bran, raw",17f,7f,66f,246f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Oats",17f,6.9f,66f,389f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Oat flour, partially debranned",15f,9.1f,66f,404f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Pasta, cooked, corn, gluten-free",2.6f,0.7f,28f,126f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Pasta, as purchased, plain, fresh-refrigerated",11f,2.3f,55f,288f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Pasta, as purchased, spinach, fresh-refrigerated",11f,2.1f,56f,289f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Pasta, cooked, corn and rice flour, gluten-free",3.2f,1f,38f,179f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Pasta, cooked, made with egg, homemade",5.3f,1.7f,24f,130f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Pasta, cooked, made without egg, homemade",4.4f,1f,25f,124f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Pasta, cooked, plain, fresh-refrigerated",5.2f,1.1f,25f,131f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Pasta, dry, whole-wheat",14f,2.9f,73f,352f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Pasta, enriched, dry",13f,1.5f,75f,371f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Pasta, unenriched, dry",13f,1.5f,75f,371f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Pasta, with added salt, enriched, cooked",5.8f,0.9f,31f,157f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Pasta, with added salt, unenriched, cooked",5.8f,0.9f,31f,157f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Pasta, without added salt, enriched, cooked",5.8f,0.9f,31f,157f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Pasta, without added salt, unenriched, cooked",5.8f,0.9f,31f,157f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice bran, crude",13f,21f,50f,316f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice noodles, dry",6f,0.6f,80f,364f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice noodles, cooked",1.8f,0.2f,24f,108f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice flour, brown",7.2f,2.8f,76f,363f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, Chinese restaurant, steamed, white",3.2f,0.3f,34f,151f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, cooked, enriched, medium-grain, white",2.4f,0.2f,29f,130f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, cooked without salt, unenriched, regular, long-grain, white",2.7f,0.3f,28f,130f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, cooked, enriched, parboiled, long-grain, white",2.9f,0.4f,26f,123f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, cooked, enriched, short-grain, white",2.4f,0.2f,29f,130f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, cooked, long-grain, brown",2.7f,1f,26f,123f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, cooked, medium-grain, brown",2.3f,0.8f,2f,112f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, dry, enriched, parboiled, long-grain, white",7.5f,1f,81f,374f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, dry, enriched, precooked or instant, long-grain, white",7.8f,0.9f,82f,380f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, dry, unenriched, parboiled, long-grain, white",7.5f,1f,81f,374f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, enriched, raw, medium-grain, white",6.6f,0.6f,79f,360f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, enriched, raw, regular, long-grain, white",7.1f,0.7f,80f,365f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, raw, medium-grain, brown",7.5f,2.7f,76f,362f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, uncooked, enriched, short-grain, white",6.5f,0.5f,79f,358f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, uncooked, unenriched, glutinous, white",6.8f,0.6f,82f,370f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, unenriched, cooked, medium-grain, white",2.4f,0.2f,29f,130f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, unenriched, raw, regular, long-grain, white",7.1f,0.7f,80f,365f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rice, unenriched, raw, short-grain, white",6.5f,0.5f,79f,358f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rye flour, dark",16f,2.2f,69f,325f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rye flour, light",9.8f,1.3f,77f,357f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rye flour, medium",11f,1.5f,75f,349f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Rye grain",10f,1.6f,76f,338f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Semolina, enriched",13f,1.1f,73f,360f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Semolina, unenriched",13f,1.1f,73f,360f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Spaghetti, cooked, spinach",4.6f,0.6f,26f,130f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Spelt, cooked",5.5f,0.9f,26f,127f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Spelt, uncooked",15f,2.4f,70f,338f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Teff, cooked",3.9f,0.7f,20f,101f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Teff, uncooked",13f,2.4f,73f,367f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Wheat flour, enriched, bread, white",12f,1.7f,73f,361f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Wheat flour, enriched, cake, white",8.2f,0.9f,78f,362f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Wheat flour, enriched, tortilla mix, white",9.7f,11f,67f,405f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Wheat flour, soft wheat, whole-grain",9.6f,2f,74f,332f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Wheat flour, bleached, enriched, all-purpose, white",10f,1f,76f,364f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Wheat flour, unenriched, all-purpose, white",10f,1f,76f,364f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Wheat flour, whole-grain",13f,2.5f,72f,340f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Wheat flours, unenriched, bread",12f,1.7f,73f,361f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Wheat, durum",14f,2.5f,71f,339f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Wheat, hard white",11f,1.7f,76f,342f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Wheat, soft red winter",10f,1.6f,74f,331f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Wheat, soft white",11f,2f,75f,340f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Wheat, sprouted",7.5f,1.3f,43f,198f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Wild rice, cooked",4f,0.3f,21f,101f),db);
        addfood(new food_items_model("Cereals ,Grains and Pasta","Wild rice, raw",15f,1.1f,75f,357f),db);


//        db.close(); // Closing database connection
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_FOOD);

        // Create tables again
        onCreate(db);
    }

    /**,
     * All CRUD(Create, Read, Update, Delete) Operations
     */

    // Adding new contact
    public void addfood(food_items_model food_item) {
        SQLiteDatabase db = this.getWritableDatabase();

        try {
            ContentValues values = new ContentValues();
            values.put(FOOD_CATEGORY, food_item.getfood_category());
            values.put(FOOD_ITEM, food_item.getfood_item());
            values.put(PROTEINS, food_item.getproteins());
            values.put(FAT, food_item.getfat());
            values.put(CARB, food_item.getcarb());
            values.put(CALORIES, food_item.getcalorie());

            db.insertOrThrow(TABLE_FOOD, null, values);
//            db.close(); // Closing database connection
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void addfood(food_items_model food_item, SQLiteDatabase db ) {
//        db=getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(FOOD_CATEGORY, food_item.getfood_category());
        values.put(FOOD_ITEM, food_item.getfood_item());
        values.put(PROTEINS, food_item.getproteins());
        values.put(FAT, food_item.getfat());
        values.put(CARB, food_item.getcarb());
        values.put(CALORIES, food_item.getcalorie());

        db.insert(TABLE_FOOD, null, values);
    }

    // Getting single food item
    public food_items_model getfood_item(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_FOOD, new String[] { KEY_ID, FOOD_CATEGORY,
                        FOOD_ITEM, PROTEINS, FAT, CARB, CALORIES }, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        assert cursor != null;
        food_items_model food_item = new food_items_model(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2),Float.parseFloat(cursor.getString(3)),
                Float.parseFloat(cursor.getString(4)),Float.parseFloat(cursor.getString(5)),Float.parseFloat(cursor.getString(6)));
        // return contact
        return food_item;
    }

    public List<String> getfood_category_list() {

        List<String> food_category_list=new ArrayList<>();
        food_category_list.add("Dairy and Egg Products");   //done//
        food_category_list.add("Spices and Herbs");//done//
        food_category_list.add("Fats and Oils");//done//
        food_category_list.add("Soups and Sauces");//done//
        food_category_list.add("Fruits");//done//
        food_category_list.add("Vegetables");//done//
        food_category_list.add("Nut and Seed Products");//done//
        food_category_list.add("Restaurant Foods");
        food_category_list.add("Baby Foods");//done//
        food_category_list.add("Beverages");//done//
        food_category_list.add("Legumes and Legume Products");
        food_category_list.add("Sausages and Luncheon Meats");
        food_category_list.add("Baked Products");
        food_category_list.add("Fast Food");//done//
        food_category_list.add("Poultry Products");
        food_category_list.add("Snacks");
        food_category_list.add("Sweets");//done//
        food_category_list.add("Cereals ,Grains and Pasta");

        return food_category_list;
    }

    public List<food_items_model> getAllfood_items(String food_category) {
        List<food_items_model> food_item_list = new ArrayList<>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_FOOD;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        while(cursor.moveToNext())
        {
            Log.i("Cursor row value",cursor.getPosition()+"");
            if(cursor.getString(cursor.getColumnIndex(FOOD_CATEGORY)).
                    equals(food_category))
            {
                while (cursor.getString(cursor.getColumnIndex(FOOD_CATEGORY)).
                        equals(food_category))
                {
                    food_items_model food_item = new food_items_model();
                    food_item.setfood_category(cursor.getString(cursor.getColumnIndex(FOOD_CATEGORY)));
                    food_item.setfood_item(cursor.getString(cursor.getColumnIndex(FOOD_ITEM)));
                    food_item.setproteins(Float.parseFloat(cursor.getString(cursor.getColumnIndex(PROTEINS))));
                    food_item.setfat(Float.parseFloat(cursor.getString(cursor.getColumnIndex(FAT))));
                    food_item.setcarb(Float.parseFloat(cursor.getString(cursor.getColumnIndex(CARB))));
                    food_item.setcalorie(Float.parseFloat(cursor.getString(cursor.getColumnIndex(CALORIES))));
                    food_item_list.add(food_item);
                    cursor.moveToNext();
                    if(cursor.getPosition()==cursor.getCount()) break;
                }
            }
            if(food_item_list.size()!=0) return food_item_list;
        }
        return food_item_list;
    }


    public List<food_items_model> getAllfooditems() {
        List<food_items_model> food_itemList = new ArrayList<>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_FOOD;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                food_items_model food_item = new food_items_model();
                food_item.setfood_category(cursor.getString(cursor.getColumnIndex(FOOD_CATEGORY)));
                food_item.setfood_item(cursor.getString(cursor.getColumnIndex(FOOD_ITEM)));
                food_item.setproteins(Float.parseFloat(cursor.getString(cursor.getColumnIndex(PROTEINS))));
                food_item.setfat(Float.parseFloat(cursor.getString(cursor.getColumnIndex(FAT))));
                food_item.setcarb(Float.parseFloat(cursor.getString(cursor.getColumnIndex(CARB))));
                food_item.setcalorie(Float.parseFloat(cursor.getString(cursor.getColumnIndex(CALORIES))));
                // Adding contact to list
                food_itemList.add(food_item);
            } while (cursor.moveToNext());
        }

        // return contact list
        return food_itemList;
    }


    public String getFoodCategory(String FoodItem)
    {
        Cursor cursor=null;
        String food_Catg="";
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            cursor = db.rawQuery("SELECT Food_category FROM Food WHERE Food_item=?", new String[] {FoodItem + ""});
            if(cursor.getCount() > 0) {
                cursor.moveToFirst();
                food_Catg = cursor.getString(cursor.getColumnIndex("Food_category"));
            }
            return food_Catg;
        }finally {
            cursor.close();
        }
    }

    public int getFoodItemId(String FoodItem)
    {
        Cursor cursor=null;
        int food_item_id=0;
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            cursor = db.rawQuery("SELECT id FROM Food WHERE Food_item=?", new String[] {FoodItem + ""});
            if(cursor.getCount() > 0) {
                cursor.moveToFirst();
                food_item_id = cursor.getInt(cursor.getColumnIndex("id"));
            }
            return food_item_id;
        }finally {
            cursor.close();
        }
    }

    // Updating single contact
    public int updatefood(food_items_model food_item) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(FOOD_CATEGORY, food_item.getfood_category());
        values.put(FOOD_ITEM, food_item.getfood_item());
        values.put(PROTEINS, food_item.getproteins());
        values.put(FAT, food_item.getfat());
        values.put(CARB, food_item.getcarb());
        values.put(CALORIES, food_item.getcalorie());

        // updating row
        return db.update(TABLE_FOOD, values, FOOD_CATEGORY + " = ?",
                new String[] { food_item.getfood_category() });
    }

    // Deleting single contact
    public void deletefood(food_items_model food_item) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_FOOD, FOOD_CATEGORY + " = ?",
                new String[] { food_item.getfood_category() });
        db.close();
    }

    // Getting contacts Count
    public int getfoodCount() {
        String countQuery = "SELECT  * FROM " + TABLE_FOOD;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }

}

