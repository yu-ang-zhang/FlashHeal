package com.example.nav;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fg_add#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fg_add extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private Button breakfast;
    private Button lunch;
    private Button dinner;
    private Button snack;
    Intent intent_next;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fg_add() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fg_add.
     */
    // TODO: Rename and change types and number of parameters
    public static fg_add newInstance(String param1, String param2) {
        fg_add fragment = new fg_add();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

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
        return inflater.inflate(R.layout.fragment_fg_add, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        breakfast = (Button) getActivity().findViewById(R.id.breakfast);
        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_next = new Intent(getActivity(), breakfast.class);
                startActivity(intent_next);
            }
        });
        lunch = (Button) getActivity().findViewById(R.id.lunch);
        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_next = new Intent(getActivity(), lunch.class);
                startActivity(intent_next);
            }
        });
        dinner = (Button) getActivity().findViewById(R.id.dinner);
        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_next = new Intent(getActivity(), dinner.class);
                startActivity(intent_next);
            }
        });
        snack = (Button) getActivity().findViewById(R.id.snack);
        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_next = new Intent(getActivity(), snack.class);
                startActivity(intent_next);
            }
        });
    }
}