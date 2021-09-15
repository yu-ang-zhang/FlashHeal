package com.example.flashheal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class confirm extends AppCompatActivity {

    TextView gendero;
    TextView ageo;
    TextView heighto;
    TextView weighto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        ToActivityDestroy.addDestoryActivity(this, "confirm");

        gendero = findViewById(R.id.genderoutput);
        ageo = findViewById(R.id.ageoutput);
        heighto = findViewById(R.id.heightoutput);
        weighto = findViewById(R.id.weightoutput);

        ageo.setText(UserJoinInfo.getUserAge()+" years old");
        heighto.setText(UserJoinInfo.getUserHeight()+" cm");
        weighto.setText(UserJoinInfo.getUserWeight()+" kg");
        if(UserJoinInfo.getUserGender()==true){
            gendero.setText("male");
        } else gendero.setText("female");
    }
}