package com.example.nav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private EditText username;
    private Button button_login;
    private Intent intent_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ToActivityDestroy.addDestoryActivity(this, "login");

        username=(EditText)findViewById(R.id.UserName) ;

        intent_login=new Intent(login.this,gender.class);

        button_login=(Button)findViewById(R.id.button_login);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(login.this,"welcome "+username.getText().toString(),Toast.LENGTH_SHORT).show();
                login.this.finish();
                startActivity(intent_login);
            }
        });
    }
}