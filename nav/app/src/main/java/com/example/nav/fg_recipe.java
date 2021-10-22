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

/**
 * recipe page
 */
public class fg_recipe extends Fragment {
    /**
     * jump to next page
     */
    private Intent intent_next;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fg_recipe() {
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fg_recipe.
     */
    // TODO: Rename and change types and number of parameters
    public static fg_recipe newInstance(String param1, String param2) {
        fg_recipe fragment = new fg_recipe();
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

        /**
     * initialize fragment.
     * using findViewById(int) to retrieve the widgets in that UI that need to interact with programmatically.
     * using setOnClickListener() to active button.
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Button br = (Button) getActivity().findViewById(R.id.breakfastr);
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_next = new Intent(getActivity(), recipeshow.class);
                startActivity(intent_next);
            }
        });

        Button lu = (Button) getActivity().findViewById(R.id.lunchr);
        lu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_next = new Intent(getActivity(), recipeshow.class);
                startActivity(intent_next);
            }
        });

        Button di = (Button) getActivity().findViewById(R.id.dinnerr);
        di.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_next = new Intent(getActivity(), recipeshow.class);
                startActivity(intent_next);
            }
        });

        Button sn = (Button) getActivity().findViewById(R.id.snackr);
        sn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_next = new Intent(getActivity(), recipeshow.class);
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fg_recipe, container, false);
    }
}