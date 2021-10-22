package com.example.nav;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
/**
 * showing fragments here
 */
public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    /**
     * fragments to be displayed
     */
    private Fragment fg1,fg2,fg4,fg5;
    private FragmentManager fManager;

    /**
     * initialize activity.
     * using findViewById(int) to retrieve the widgets in that UI that need to interact with programmatically.
     * using setOnClickListener() to active button.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fManager = getSupportFragmentManager();
        RadioGroup rg_tab_bar = (RadioGroup) findViewById(R.id.rg_tab_bar);
        rg_tab_bar.setOnCheckedChangeListener(this);
        RadioButton rb_channel = (RadioButton) findViewById(R.id.diary);
        rb_channel.setChecked(true);
    }

    /**
     * fill the layout by using fragment's layout
     */
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        FragmentTransaction fTransaction = fManager.beginTransaction();
        hideAllFragment(fTransaction);

        switch (checkedId){
            case R.id.diary:
                fg1 = new fg_diary();
                fTransaction.add(R.id.ly_content,fg1);
                break;
            case R.id.profile:
                fg2 = new fg_profile();
                fTransaction.add(R.id.ly_content,fg2);
                break;
                case R.id.retriever:
                fg4 = new fg_plan();
                fTransaction.add(R.id.ly_content,fg4);
                break;
            case R.id.recipe:
                fg5 = new fg_recipe();
                fTransaction.add(R.id.ly_content,fg5);
                break;
        }
        fTransaction.commit();
    }
    /**
     * hide fragment layout
     */
    private void hideAllFragment(FragmentTransaction fragmentTransaction){
        if(fg1 != null)fragmentTransaction.hide(fg1);
        if(fg2 != null)fragmentTransaction.hide(fg2);
        if(fg4 != null)fragmentTransaction.hide(fg4);
        if(fg5 != null)fragmentTransaction.hide(fg5);
    }

}