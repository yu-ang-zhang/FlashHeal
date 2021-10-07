package com.example.nav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class add_snack extends AppCompatActivity {

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
    recorded_snack s;

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
        s = new recorded_snack(name.getText().toString());
        db = new databasehandler(getApplicationContext());
        kaluli = 0;
        add = findViewById(R.id.add);
        favorite = findViewById(R.id.favorite);

        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s.setFavorite();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (food_items_model food : db.getAllfooditems()
                ) {
                    if (food.getfood_item().equals(food1.getText().toString() + " (100 g.)")) {
                        kaluli += food.getcalorie() * Integer.parseInt(weight1.getText().toString()) / 100;
                        s.add(food1.getText().toString(), food.getcalorie() * Integer.parseInt(weight1.getText().toString()) / 100);
                    }
                    if (food.getfood_item().equals(food2.getText().toString() + " (100 g.)")) {
                        kaluli += food.getcalorie() * Integer.parseInt(weight2.getText().toString()) / 100;
                        s.add(food2.getText().toString(), food.getcalorie() * Integer.parseInt(weight2.getText().toString()) / 100);
                    }
                    if (food.getfood_item().equals(food3.getText().toString() + " (100 g.)")) {
                        kaluli += food.getcalorie() * Integer.parseInt(weight3.getText().toString()) / 100;
                        s.add(food3.getText().toString(), food.getcalorie() * Integer.parseInt(weight3.getText().toString()) / 100);
                    }
                    if (food.getfood_item().equals(food4.getText().toString() + " (100 g.)")) {
                        kaluli += food.getcalorie() * Integer.parseInt(weight4.getText().toString()) / 100;
                        s.add(food4.getText().toString(), food.getcalorie() * Integer.parseInt(weight4.getText().toString()) / 100);
                    }
                    if (food.getfood_item().equals(food5.getText().toString() + " (100 g.)")) {
                        kaluli += food.getcalorie() * Integer.parseInt(weight5.getText().toString()) / 100;
                        s.add(food5.getText().toString(), food.getcalorie() * Integer.parseInt(weight5.getText().toString()) / 100);
                    }
                    if (food.getfood_item().equals(food6.getText().toString() + " (100 g.)")) {
                        kaluli += food.getcalorie() * Integer.parseInt(weight6.getText().toString()) / 100;
                        s.add(food6.getText().toString(), food.getcalorie() * Integer.parseInt(weight6.getText().toString()) / 100);
                    }
                }
                s.setS_kaluli(kaluli);
                recordedmeal.setkaluli(kaluli);
                add_snack.this.finish();
                startActivity(intent);
            }
        });
    }
}