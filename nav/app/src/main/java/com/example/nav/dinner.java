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
/**
 * showing the recent recorded and favorite dinner
 */
public class dinner extends AppCompatActivity
{
    /**
     * back button
     */
    private ImageButton back;
    /**
     * add button
     */
    private ImageButton add;
    /**
     * recent recorded meal name
     */
    private TextView rname;
    /**
     * recent recorded food weight
     */
    private TextView rfw;
    /**
     * recent recorded meal calories
     */
    private TextView rcl;
    /**
     * favorite meal name
     */
    private TextView name;
    /**
     * favorite food weight
     */
    private TextView fw;
    /**
     * favorite meal calories
     */
    private TextView cl;

    private FragmentManager fManager;
    /**
     * initialize activity.
     * using findViewById(int) to retrieve the widgets in that UI that need to interact with programmatically.
     * using setOnClickListener() to active button.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
        fManager = getSupportFragmentManager();

        rname = findViewById(R.id.rname);
        rfw = findViewById(R.id.rfandw);
        rcl = findViewById(R.id.rcalories);

        String string = "";

        if(recordedmeal.getDinners().size()!=0){
            rname.setText(recordedmeal.getDinners().get(recordedmeal.getDinners().size()-1).getName());
            for (Map.Entry e:recordedmeal.getDinners().get(recordedmeal.getDinners().size()-1).getD_foods().entrySet()
            ) {
                string += e.getKey() + "  " + String.valueOf(e.getValue()) + "g\n";
            }
            rfw.setText(string);
            rcl.setText(String.valueOf(recordedmeal.getDinners().get(recordedmeal.getDinners().size()-1).getD_kaluli()).substring(0,3));
        }

        name = findViewById(R.id.name);
        fw = findViewById(R.id.fandw);
        cl = findViewById(R.id.calories);

        String fstring = "";

        if(favorite_dinner.isFa()){
            name.setText(favorite_dinner.getName());
            for (Map.Entry e:favorite_dinner.getD_foods().entrySet()
            ) {
                fstring += e.getKey() + "  " + String.valueOf(e.getValue()) + "g\n";
            }
            fw.setText(fstring);
            cl.setText(String.valueOf(favorite_dinner.getD_kaluli()).substring(0,3));
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
                Intent intent = new Intent(dinner.this, add_dinner.class);
                dinner.this.finish();
                startActivity(intent);
            }
        });
    }
}