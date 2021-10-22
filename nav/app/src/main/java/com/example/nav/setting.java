package com.example.nav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
/**
 * update user information
 */
public class setting extends AppCompatActivity {
    /**
     * new user age
     */
    private EditText age;
    /**
     * new user height
     */
    private EditText height;
    /**
     * new user current weight
     */
    private EditText current;
    /**
     * new user goal weight
     */
    private EditText goal;

    /**
     * initialize activity.
     * using findViewById(int) to retrieve the widgets in that UI that need to interact with programmatically.
     * using setOnClickListener() to active button.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        age = findViewById(R.id.newa);
        height = findViewById(R.id.newh);
        current = findViewById(R.id.newcw);
        goal = findViewById(R.id.newgw);

        Button c = findViewById(R.id.confirm);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(setting.this,"succesee",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(setting.this, MainActivity.class);
                UserJoinInfo.setUserHeight(Integer.parseInt(height.getText().toString()));
                UserJoinInfo.setUserWeight(Integer.parseInt(current.getText().toString()));
                UserJoinInfo.setGoalweight(Integer.parseInt(goal.getText().toString()));
                UserJoinInfo.setUserAge(Integer.parseInt(age.getText().toString()));
                UserJoinInfo.setKaluli(UserJoinInfo.getUserGender(),Integer.parseInt(age.getText().toString()),Integer.parseInt(current.getText().toString()));
                setting.this.finish();
                startActivity(intent);
            }
        });

        Button b = findViewById(R.id.back);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(setting.this, MainActivity.class);
                setting.this.finish();
                startActivity(intent);
            }
        });
    }
}