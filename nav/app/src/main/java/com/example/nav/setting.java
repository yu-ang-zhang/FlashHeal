package com.example.nav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class setting extends AppCompatActivity {
    private Button b;
    private Button c;
    private EditText age;
    private EditText height;
    private EditText current;
    private EditText goal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        age = findViewById(R.id.newa);
        height = findViewById(R.id.newh);
        current = findViewById(R.id.newcw);
        goal = findViewById(R.id.newgw);

        c = findViewById(R.id.confirm);
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

        b = findViewById(R.id.back);
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