package com.example.nav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Map;

public class snack extends AppCompatActivity
{
    private ImageButton back;
    private ImageButton add;
    private Intent intent;
    private TextView rname;
    private TextView rfw;
    private TextView rcl;
    private TextView name;
    private TextView fw;
    private TextView cl;

    private Fragment fg1,fg2;
    private FragmentManager fManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);
        fManager = getSupportFragmentManager();
        rname = findViewById(R.id.rname);
        rfw = findViewById(R.id.rfandw);
        rcl = findViewById(R.id.rcalories);

        String string = "";

        if(recordedmeal.getSnacks().size()!=0){
            rname.setText(recordedmeal.getSnacks().get(recordedmeal.getSnacks().size()-1).getName());
            for (Map.Entry e:recordedmeal.getSnacks().get(recordedmeal.getSnacks().size()-1).getS_foods().entrySet()
            ) {
                string += e.getKey() + "  " + String.valueOf(e.getValue()) + "g\n";
            }
            rfw.setText(string);
            rcl.setText(String.valueOf(recordedmeal.getSnacks().get(recordedmeal.getSnacks().size()-1).getS_kaluli()).substring(0,3));
        }

        name = findViewById(R.id.name);
        fw = findViewById(R.id.fandw);
        cl = findViewById(R.id.calories);

        String fstring = "";

        if(favorite_sn.isFa()){
            name.setText(favorite_sn.getName());
            for (Map.Entry e:favorite_sn.getS_foods().entrySet()
            ) {
                fstring += e.getKey() + "  " + String.valueOf(e.getValue()) + "g\n";
            }
            fw.setText(fstring);
            cl.setText(String.valueOf(favorite_sn.getS_kaluli()).substring(0,3));
        }

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        add = findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(snack.this, add_snack.class);
                snack.this.finish();
                startActivity(intent);
            }
        });
    }
}