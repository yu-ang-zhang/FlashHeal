package com.example.nav;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;
import java.util.logging.Logger;

/**
 * diary page
 */
public class fg_diary extends Fragment {

    /**
     * jump to next page
     */
    Intent intent_next;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fg_diary() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fg_diary.
     */
    // TODO: Rename and change types and number of parameters
    public static fg_diary newInstance(String param1, String param2) {
        fg_diary fragment = new fg_diary();
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
        /**
     * initialize fragment.
     * using findViewById(int) to retrieve the widgets in that UI that need to interact with programmatically.
     * using setOnClickListener() to active button.
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView kaluli = (TextView)getActivity().findViewById(R.id.kaluli);
        kaluli.setText(String.valueOf((int) UserJoinInfo.getKaluli()));

        TextView eaten = (TextView)getActivity().findViewById(R.id.eaten);
        eaten.setText(String.valueOf((int) recordedmeal.getMealkaluli()));

        TextView left = (TextView)getActivity().findViewById(R.id.kalulileft);
        left.setText(String.valueOf((int) UserJoinInfo.getKaluli() - (int) recordedmeal.getMealkaluli()));

        Button breakfast = (Button) getActivity().findViewById(R.id.add_b);
        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_next = new Intent(getActivity(), breakfast.class);
                startActivity(intent_next);
            }
        });

        Button lunch = (Button) getActivity().findViewById(R.id.add_l);
        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_next = new Intent(getActivity(), lunch.class);
                startActivity(intent_next);
            }
        });

        Button dinner = (Button) getActivity().findViewById(R.id.add_d);
        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_next = new Intent(getActivity(), dinner.class);
                startActivity(intent_next);
            }
        });

        Button snack = (Button) getActivity().findViewById(R.id.add_s);
        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_next = new Intent(getActivity(), snack.class);
                startActivity(intent_next);
            }
        });
    }
    /**
     * initialize fragment view.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fg_diary, container, false);
    }
}