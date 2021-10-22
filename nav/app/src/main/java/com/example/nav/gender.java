package com.example.nav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
/**
 * choose user gender
 */
public class gender extends AppCompatActivity{
    /**
     * jump to next page
     */
    private Intent intent_next;

    /**
     * initialize activity.
     * using findViewById(int) to retrieve the widgets in that UI that need to interact with programmatically.
     * using setOnClickListener() to active button.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        ToActivityDestroy.addDestoryActivity(this, "gender");

        intent_next=new Intent(gender.this, moreBioInfo.class);

        ImageButton male = findViewById(R.id.male);
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserJoinInfo.setUserGender(true);
                gender.this.finish();
                startActivity(intent_next);
            }
        });

        ImageButton female = findViewById(R.id.female);
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserJoinInfo.setUserGender(false);
                gender.this.finish();
                startActivity(intent_next);
            }
        });
    }
}