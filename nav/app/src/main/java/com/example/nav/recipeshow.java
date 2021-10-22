package com.example.nav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;
import java.util.Random;
/**
 * recipe displayed in this page
 */
public class recipeshow extends AppCompatActivity {
    /**
     * jump to next page
     */
    private Intent intent;

    /**
     * initialize activity.
     * using findViewById(int) to retrieve the widgets in that UI that need to interact with programmatically.
     * using setOnClickListener() to active button.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipeshow);
        TextView name = findViewById(R.id.name);
        TextView ingredients = findViewById(R.id.ingredients);
        TextView directions = findViewById(R.id.directions);
        TextView calories = findViewById(R.id.calories);
        recipedata d = new recipedata(getApplicationContext());
        List<recipe_items_model> recipes = d.getAllrecipes();
        Random random = new Random();
        int n = random.nextInt(recipes.size());
        recipe_items_model recipe = recipes.get(n);
        name.setText(recipe.getRecipe_name());
        ingredients.setText(recipe.getfood_item());
        directions.setText(recipe.getCookingrecipe());
        calories.setText(String.valueOf(recipe.getcalorie()));
        Button b = findViewById(R.id.back);
        intent = new Intent(recipeshow.this,MainActivity.class);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recipeshow.this.finish();
                startActivity(intent);
            }
        });
    }
}