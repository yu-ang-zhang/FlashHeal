package com.example.nav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
/**
 * track weight change
 */
public class statistic extends AppCompatActivity {
    /**
     * a progress bar showing weight change
     */
    private ProgressBar weight;
    /**
     * update new current weight
     */
    private EditText current;
    /**
     * how many kg have lost
     */
    private TextView have;
    /**
     * how many kg still needed to be lost
     */
    private TextView still;
    /**
     * jump to next page
     */
    private Intent intent;

    /**
     * initialize activity.
     * using findViewById(int) to retrieve the widgets in that UI that need to interact with programmatically.
     * using setOnClickListener() to active button.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);

        current = findViewById(R.id.newc);
        weight = findViewById(R.id.weight);
        weight.setMax(UserJoinInfo.getUserWeight() - UserJoinInfo.getGoalweight());
        have = findViewById(R.id.havelost);
        still = findViewById(R.id.still);
        Button update = findViewById(R.id.up);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weight.setProgress(UserJoinInfo.getUserWeight() - Integer.parseInt(current.getText().toString()));
                have.setText(String.valueOf(UserJoinInfo.getUserWeight() - Integer.parseInt(current.getText().toString())));
                still.setText(String.valueOf(Integer.parseInt(current.getText().toString()) - UserJoinInfo.getGoalweight()));
            }
        });

        Button set = findViewById(R.id.se);

        Button b = findViewById(R.id.back);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(statistic.this,MainActivity.class);
                statistic.this.finish();
                startActivity(intent);
            }
        });
    }
}