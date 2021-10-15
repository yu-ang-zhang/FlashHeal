package com.example.nav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class add_dinner extends AppCompatActivity {
    EditText food1;
    EditText food2;
    EditText food3;
    EditText food4;
    EditText food5;
    EditText food6;
    EditText weight1;
    EditText weight2;
    EditText weight3;
    EditText weight4;
    EditText weight5;
    EditText weight6;
    EditText name;
    databasehandler db;
    double kaluli;
    Intent intent;
    Button add;
    Button favorite;
    recorded_dinner d;
//    favorite_dinner fd;
    boolean f = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dinner);

        intent = new Intent(add_dinner.this, MainActivity.class);
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
        name = findViewById(R.id.dinner_name);
        db = new databasehandler(getApplicationContext());
        kaluli = 0;
        add = findViewById(R.id.add);
        favorite = findViewById(R.id.favorite);
        d = new recorded_dinner(name.getText().toString());
//        fd = new favorite_dinner();

        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(add_dinner.this,"now this meal is your favorite one",Toast.LENGTH_SHORT).show();
                favorite_dinner.setName(name.getText().toString());
                f = true;
                favorite_dinner.setFa();
                favorite_dinner.d_foods = new HashMap<>();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (food_items_model food : db.getAllfooditems()
                ) {
                    if(food.getfood_item().equals(food1.getText().toString() + " (100 g.)")){
                        kaluli += food.getcalorie() * Integer.parseInt(weight1.getText().toString())/100;
                        d.add(food1.getText().toString(),Integer.parseInt(weight1.getText().toString()));
                        if(f) favorite_dinner.add(food1.getText().toString(),Integer.parseInt(weight1.getText().toString()));
                    }
                    if(food.getfood_item().equals(food2.getText().toString() + " (100 g.)")){
                        kaluli += food.getcalorie() * Integer.parseInt(weight2.getText().toString())/100;
                        d.add(food2.getText().toString(),Integer.parseInt(weight2.getText().toString()));
                        if(f)favorite_dinner.add(food2.getText().toString(),Integer.parseInt(weight2.getText().toString()));
                    }
                    if(food.getfood_item().equals(food3.getText().toString() + " (100 g.)")){
                        kaluli += food.getcalorie() * Integer.parseInt(weight3.getText().toString())/100;
                        d.add(food3.getText().toString(),Integer.parseInt(weight3.getText().toString()));
                        if(f)favorite_dinner.add(food2.getText().toString(),Integer.parseInt(weight2.getText().toString()));

                    }
                    if(food.getfood_item().equals(food4.getText().toString() + " (100 g.)")){
                        kaluli += food.getcalorie() * Integer.parseInt(weight4.getText().toString())/100;
                        d.add(food4.getText().toString(),Integer.parseInt(weight4.getText().toString()));
                        if(f)favorite_dinner.add(food2.getText().toString(),Integer.parseInt(weight2.getText().toString()));

                    }
                    if(food.getfood_item().equals(food5.getText().toString() + " (100 g.)")){
                        kaluli += food.getcalorie() * Integer.parseInt(weight5.getText().toString())/100;
                        d.add(food5.getText().toString(),Integer.parseInt(weight5.getText().toString()));
                        if(f)favorite_dinner.add(food2.getText().toString(),Integer.parseInt(weight2.getText().toString()));

                    }
                    if(food.getfood_item().equals(food6.getText().toString() + " (100 g.)")){
                        kaluli += food.getcalorie() * Integer.parseInt(weight6.getText().toString())/100;
                        d.add(food6.getText().toString(),Integer.parseInt(weight6.getText().toString()));
                        if(f)favorite_dinner.add(food2.getText().toString(),Integer.parseInt(weight2.getText().toString()));

                    }
                }
                d.setD_kaluli(kaluli);
                if (f) {
                    favorite_dinner.setD_kaluli(kaluli);
                }
                d.setName(name.getText().toString());
                recordedmeal.setkaluli(kaluli);
                recordedmeal.addDinner(d);
                add_dinner.this.finish();
                startActivity(intent);
            }
        });
    }
}