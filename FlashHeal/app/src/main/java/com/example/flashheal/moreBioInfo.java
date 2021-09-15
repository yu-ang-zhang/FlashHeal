package com.example.flashheal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class moreBioInfo extends AppCompatActivity {

    EditText agei;
    EditText heighti;
    EditText weighti;
    String height;
    String weight;
    String age;
    Button next;
    Intent intent_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_bio_info);
        ToActivityDestroy.addDestoryActivity(this, "moreBioInfo");

        intent_next=new Intent(moreBioInfo.this, confirm.class);

        agei = findViewById(R.id.ageinput);
        heighti = findViewById(R.id.heightinput);
        weighti = findViewById(R.id.weightinput);
        next = findViewById(R.id.NextStep3);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                height=heighti.getText().toString();
                weight=weighti.getText().toString();
                age = agei.getText().toString();
                //将身高体重存入临时存储区
                UserJoinInfo.setUserHeight(height);
                UserJoinInfo.setUserWeight(weight);
                UserJoinInfo.setUserAge(age);
                moreBioInfo.this.finish();
                startActivity(intent_next);
            }
        });
    }
}