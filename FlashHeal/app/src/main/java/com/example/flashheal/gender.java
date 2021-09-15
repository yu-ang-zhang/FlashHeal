package com.example.flashheal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class gender extends AppCompatActivity{

    private ImageButton Male;
    private ImageButton Female;
    private Intent intent_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        ToActivityDestroy.addDestoryActivity(this, "gender");

        intent_next=new Intent(gender.this, moreBioInfo.class);

        Male = findViewById(R.id.male);
        Male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserJoinInfo.setUserGender(true);
                gender.this.finish();
                startActivity(intent_next);
            }
        });

        Female = findViewById(R.id.female);
        Female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserJoinInfo.setUserGender(false);
                gender.this.finish();
                startActivity(intent_next);
            }
        });
    }
}