package com.example.nav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/**
 * input more information about user
 */
public class moreBioInfo extends AppCompatActivity {
    /**
     * input age
     */
    EditText agei;
    /**
     * input height
     */
    EditText heighti;
    /**
     * input current weight
     */
    EditText cweighti;
    /**
     * input goal weight
     */
    EditText gweighti;
    /**
     * height text
     */
    String height;
    /**
     * current weight text
     */
    String cweight;
    /**
     * goal weight text
     */
    String gweight;
    /**
     * age text
     */
    String age;
    /**
     * go to next page by this button
     */
    Button next;
    /**
     * jump to next page
     */
    Intent intent_next;

    /**
     * initialize activity.
     * using findViewById(int) to retrieve the widgets in that UI that need to interact with programmatically.
     * using setOnClickListener() to active button.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_bio_info);
        ToActivityDestroy.addDestoryActivity(this, "moreBioInfo");

        intent_next=new Intent(moreBioInfo.this, confirm.class);

        agei = findViewById(R.id.ageinput);
        heighti = findViewById(R.id.heightinput);
        cweighti = findViewById(R.id.currentweightinput);
        gweighti = findViewById(R.id.goalweightinput);
        next = findViewById(R.id.NextStep3);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                height=heighti.getText().toString();
                cweight=cweighti.getText().toString();
                gweight=gweighti.getText().toString();
                age = agei.getText().toString();
                UserJoinInfo.setUserHeight(Integer.parseInt(height));
                UserJoinInfo.setUserWeight(Integer.parseInt(cweight));
                UserJoinInfo.setGoalweight(Integer.parseInt(gweight));
                UserJoinInfo.setUserAge(Integer.parseInt(age));
                UserJoinInfo.setKaluli(UserJoinInfo.getUserGender(),Integer.parseInt(age),Integer.parseInt(cweight));
                moreBioInfo.this.finish();
                startActivity(intent_next);
            }
        });
    }
}