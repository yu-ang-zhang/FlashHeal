package com.example.nav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class recipeshow extends AppCompatActivity {

    private TextView name;
    private TextView ingredients;
    private TextView directions;
    private TextView calories;
    private recipedata d;
    private Button b;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipeshow);
        name = findViewById(R.id.name);
        ingredients = findViewById(R.id.ingredients);
        directions = findViewById(R.id.directions);
        calories = findViewById(R.id.calories);
        d = new recipedata(getApplicationContext());
        List<recipe_items_model> recipes = d.getAllrecipes();
        Random random = new Random();
        int n = random.nextInt(recipes.size());
        recipe_items_model recipe = recipes.get(n);
        name.setText(recipe.getRecipe_name());
        ingredients.setText(recipe.getfood_item());
        directions.setText(recipe.getCookingrecipe());
        calories.setText(String.valueOf(recipe.getcalorie()));
        b = findViewById(R.id.back);
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