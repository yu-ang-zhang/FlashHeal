package com.example.nav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

/**
 * page of record a new snack
 * can set the snack as favorite
 */
public class add_snack extends AppCompatActivity {
    /**
     * input food names to record
     */
    EditText food1;
    EditText food2;
    EditText food3;
    EditText food4;
    EditText food5;
    EditText food6;
    /**
     * input food weights to record
     */
    EditText weight1;
    EditText weight2;
    EditText weight3;
    EditText weight4;
    EditText weight5;
    EditText weight6;
    /**
     * name this meal
     */
    EditText name;
    /**
     * database
     */
    databasehandler db;
    /**
     * calories of this meal
     */
    double kaluli;
    /**
     * jump to next page
     */
    Intent intent;
    /**
     * record this meal by this button
     */
    Button add;
    /**
     * set to favorite by this button
     */
    Button favorite;
    /**
     * a new recorded_snack class
     */
    recorded_snack s;
    /**
     * this meal is not favorite
     */
    boolean f = false;

    /**
     * initialize activity.
     * using findViewById(int) to retrieve the widgets in that UI that need to interact with programmatically.
     * using setOnClickListener() to active button.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_snack);

        intent = new Intent(add_snack.this, MainActivity.class);
        food1 = findViewById(R.id.food1);
        food2 = findViewById(R.id.food2);
        food3 = findViewById(R.id.food3);
        weight1 = findViewById(R.id.weight1);
        weight2 = findViewById(R.id.weight2);
        weight3 = findViewById(R.id.weight3);
        food4 = findViewById(R.id.food4);
        food5 = findViewById(R.id.food5);
        food6 = findViewById(R.id.food6);
        weight4 = findViewById(R.id.weight4);
        weight5 = findViewById(R.id.weight5);
        weight6 = findViewById(R.id.weight6);
        name = findViewById(R.id.snack_name);
        db = new databasehandler(getApplicationContext());
        kaluli = 0;
        add = findViewById(R.id.add);
        favorite = findViewById(R.id.favorite);
        s = new recorded_snack(name.getText().toString());

        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(add_snack.this,"now this meal is your favorite one",Toast.LENGTH_SHORT).show();
                favorite_sn.setName(name.getText().toString());
                f = true;
                favorite_sn.setFa();
                favorite_sn.s_foods = new HashMap<>();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (food_items_model food : db.getAllfooditems()
                ) {
                    if(food.getfood_item().equals(food1.getText().toString() + " (100 g.)")){
                        kaluli += food.getcalorie() * Integer.parseInt(weight1.getText().toString())/100;
                        s.add(food1.getText().toString(),Integer.parseInt(weight1.getText().toString()));
                        if(f) favorite_sn.add(food1.getText().toString(),Integer.parseInt(weight1.getText().toString()));
                    }
                    if(food.getfood_item().equals(food2.getText().toString() + " (100 g.)")){
                        kaluli += food.getcalorie() * Integer.parseInt(weight2.getText().toString())/100;
                        s.add(food2.getText().toString(),Integer.parseInt(weight2.getText().toString()));
                        if(f) favorite_sn.add(food1.getText().toString(),Integer.parseInt(weight1.getText().toString()));

                    }
                    if(food.getfood_item().equals(food3.getText().toString() + " (100 g.)")){
                        kaluli += food.getcalorie() * Integer.parseInt(weight3.getText().toString())/100;
                        s.add(food3.getText().toString(),Integer.parseInt(weight3.getText().toString()));
                        if(f) favorite_sn.add(food1.getText().toString(),Integer.parseInt(weight1.getText().toString()));

                    }
                    if(food.getfood_item().equals(food4.getText().toString() + " (100 g.)")){
                        kaluli += food.getcalorie() * Integer.parseInt(weight4.getText().toString())/100;
                        s.add(food4.getText().toString(),Integer.parseInt(weight4.getText().toString()));
                        if(f) favorite_sn.add(food1.getText().toString(),Integer.parseInt(weight1.getText().toString()));

                    }
                    if(food.getfood_item().equals(food5.getText().toString() + " (100 g.)")){
                        kaluli += food.getcalorie() * Integer.parseInt(weight5.getText().toString())/100;
                        s.add(food5.getText().toString(),Integer.parseInt(weight5.getText().toString()));
                        if(f) favorite_sn.add(food1.getText().toString(),Integer.parseInt(weight1.getText().toString()));

                    }
                    if(food.getfood_item().equals(food6.getText().toString() + " (100 g.)")){
                        kaluli += food.getcalorie() * Integer.parseInt(weight6.getText().toString())/100;
                        s.add(food6.getText().toString(),Integer.parseInt(weight6.getText().toString()));
                        if(f) favorite_sn.add(food1.getText().toString(),Integer.parseInt(weight1.getText().toString()));

                    }
                }
                s.setS_kaluli(kaluli);
                if (f) {
                    favorite_sn.setS_kaluli(kaluli);
                }
                s.setName(name.getText().toString());
                recordedmeal.setkaluli(kaluli);
                recordedmeal.addSnack(s);
                add_snack.this.finish();
                startActivity(intent);
            }
        });
    }
}