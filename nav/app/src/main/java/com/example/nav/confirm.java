package com.example.nav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * information confirmation page
 */
public class confirm extends AppCompatActivity {

    /**
     * show gender
     */
    TextView gendero;
    /**
     * show age
     */
    TextView ageo;
    /**
     * show height
     */
    TextView heighto;
    /**
     * show weight
     */
    TextView weighto;
    /**
     * jump to next page
     */
    private Intent intent_next;
    /**
     * go to next page by this button
     */
    private Button next;
    /**
     * go to previous page by this button
     */
    private Button back;


    /**
     * initialize activity.
     * using findViewById(int) to retrieve the widgets in that UI that need to interact with programmatically.
     * using setOnClickListener() to active button.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        ToActivityDestroy.addDestoryActivity(this, "confirm");

        gendero = findViewById(R.id.genderoutput);
        ageo = findViewById(R.id.ageoutput);
        heighto = findViewById(R.id.heightoutput);
        weighto = findViewById(R.id.weightoutput);

        ageo.setText(UserJoinInfo.getUserAge().toString()+" years old");
        heighto.setText(UserJoinInfo.getUserHeight().toString()+" cm");
        weighto.setText(UserJoinInfo.getUserWeight().toString()+" kg");
        if(UserJoinInfo.getUserGender()==true){
            gendero.setText("male");
        } else gendero.setText("female");

        next = (Button) findViewById(R.id.confirm_button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_next = new Intent(confirm.this,MainActivity.class);
                confirm.this.finish();
                startActivity(intent_next);
            }
        });

        back = (Button) findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_next = new Intent(confirm.this,moreBioInfo.class);
                confirm.this.finish();
                startActivity(intent_next);
            }
        });
    }
}