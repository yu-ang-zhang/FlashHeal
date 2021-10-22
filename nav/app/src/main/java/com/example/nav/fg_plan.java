package com.example.nav;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * retriever page
 */
public class fg_plan extends Fragment {

    /**
     * button storing previous search
     */
    private Button rs1;
    private Button rs2;
    private Button rs3;
    /**
     * food name
     */
    private TextView name;
    /**
     * food protein
     */
    private TextView pro;
    /**
     * food fat
     */
    private TextView fat;
    /**
     * food carb
     */
    private TextView carb;
    /**
     * food calories
     */
    private TextView calo;
    /**
     * searched food name
     */
    private EditText nameinput;
    /**
     * jump to next page
     */
    private Intent intent;
    /**
     * a searchedfood class storing food information
     */
    private searchedfood sfood;
    /**
     * food database
     */
    databasehandler db;
    /**
     * counter
     */
    int i = 0;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fg_plan() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fg_plan.
     */
    // TODO: Rename and change types and number of parameters
    public static fg_plan newInstance(String param1, String param2) {
        fg_plan fragment = new fg_plan();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

        /**
     * initialize fragment.
     * using findViewById(int) to retrieve the widgets in that UI that need to interact with programmatically.
     * using setOnClickListener() to active button.
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        name = getActivity().findViewById(R.id.foodname);
        pro = getActivity().findViewById(R.id.p);
        fat = getActivity().findViewById(R.id.f);
        carb =getActivity().findViewById(R.id.c);
        calo = getActivity().findViewById(R.id.cal);

        nameinput = getActivity().findViewById(R.id.namei);

        db = new databasehandler(getContext());

        Button search = (Button) getActivity().findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (food_items_model food: db.getAllfooditems()
                ) {
                    if(food.getfood_item().equals(nameinput.getText().toString() + " (100 g.)")){
                        name.setText(nameinput.getText().toString());
                        pro.setText(String.valueOf(food.getproteins()));
                        fat.setText(String.valueOf(food.getfat()));
                        carb.setText(String.valueOf(food.getcarb()));
                        calo.setText(String.valueOf(food.getcalorie()));
                        sfood = new searchedfood(nameinput.getText().toString(),food.getproteins(),food.getfat(),food.getcarb(),(int)food.getcalorie());
                        recordedmeal.addFood(sfood);
                        switch (i%3) {
                            case 0:
                                rs1 = (Button) getActivity().findViewById(R.id.rs1);
                                rs1.setText(nameinput.getText().toString());
                                rs1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        sfood = recordedmeal.getSearchedfoods().get(0);
                                        name.setText(sfood.getName());
                                        pro.setText(String.valueOf(sfood.getProt()).substring(0,3));
                                        fat.setText(String.valueOf(sfood.getFat()).substring(0,3));
                                        carb.setText(String.valueOf(sfood.getCarb()).substring(0,3));
                                        calo.setText(String.valueOf(sfood.getCal()).substring(0,3));
                                    }
                                });
                                break;
                            case 1:
                                if(recordedmeal.getSearchedfoods().size()>1){
                                    rs2 = (Button) getActivity().findViewById(R.id.rs2);
                                    rs2.setText(nameinput.getText().toString());
                                    rs2.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            sfood = recordedmeal.getSearchedfoods().get(1);
                                            name.setText(sfood.getName());
                                            pro.setText(String.valueOf(sfood.getProt()).substring(0,3));
                                            fat.setText(String.valueOf(sfood.getFat()).substring(0,3));
                                            carb.setText(String.valueOf(sfood.getCarb()).substring(0,3));
                                            calo.setText(String.valueOf(sfood.getCal()).substring(0,3));
                                        }
                                    });
                                }
                                break;
                            case 2:
                                if(recordedmeal.getSearchedfoods().size()>2) {
                                    rs3 = (Button) getActivity().findViewById(R.id.rs3);
                                    rs3.setText(nameinput.getText().toString());
                                    rs3.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            sfood = recordedmeal.getSearchedfoods().get(2);
                                            name.setText(sfood.getName());
                                            pro.setText(String.valueOf(sfood.getProt()).substring(0,3));
                                            fat.setText(String.valueOf(sfood.getFat()).substring(0,3));
                                            carb.setText(String.valueOf(sfood.getCarb()).substring(0,3));
                                            calo.setText(String.valueOf(sfood.getCal()).substring(0,3));
                                        }
                                    });
                                }
                                break;
                        }
                        i++;
                    }
                }

            }
        });

        Button b = getActivity().findViewById(R.id.back);
        intent = new Intent(getActivity(),MainActivity.class);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });


    }
    /**
     * initialize fragment view.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fg_plan, container, false);
    }
}