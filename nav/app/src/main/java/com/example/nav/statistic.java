package com.example.nav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class statistic extends AppCompatActivity {

    private Button b;
    private Button update;
    private Button set;
    private ProgressBar weight;
    private EditText current;
    private EditText goal;
    private TextView have;
    private TextView still;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);

        current = findViewById(R.id.newc);
        goal = findViewById(R.id.newg);
        weight = findViewById(R.id.weight);

        weight.setMax(UserJoinInfo.getUserWeight() - UserJoinInfo.getGoalweight());
        have = findViewById(R.id.havelost);
        still = findViewById(R.id.still);
        update = findViewById(R.id.up);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weight.setProgress(UserJoinInfo.getUserWeight() - Integer.parseInt(current.getText().toString()));
                have.setText(String.valueOf(UserJoinInfo.getUserWeight() - Integer.parseInt(current.getText().toString())));
                still.setText(String.valueOf(Integer.parseInt(current.getText().toString()) - UserJoinInfo.getGoalweight()));
            }
        });

        set = findViewById(R.id.se);

        b = findViewById(R.id.back);
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