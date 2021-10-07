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

public class confirm extends AppCompatActivity {

    TextView gendero;
    TextView ageo;
    TextView heighto;
    TextView weighto;
    private Intent intent_next;
    private Button next;
    private Button back;


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

        intent_next = new Intent(confirm.this,MainActivity.class);

        next = (Button) findViewById(R.id.confirm_button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                confirm.this.finish();
                startActivity(intent_next);
            }
        });
    }
}