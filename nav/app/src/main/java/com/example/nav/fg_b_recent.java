package com.example.nav;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fg_b_recent#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fg_b_recent extends Fragment {

    private Button add;
    private TextView name;
    private TextView fw;
    private TextView cl;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fg_b_recent() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fg_b_recent.
     */
    // TODO: Rename and change types and number of parameters
    public static fg_b_recent newInstance(String param1, String param2) {
        fg_b_recent fragment = new fg_b_recent();
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
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        name = getActivity().findViewById(R.id.name);
        fw = getActivity().findViewById(R.id.fandw);
        cl = getActivity().findViewById(R.id.calories);

        String string = "";

        if(recordedmeal.getBreakfasts().size()!=0){
            name.setText(recordedmeal.getBreakfasts().get(recordedmeal.getBreakfasts().size()-1).getName());
            for (Map.Entry e:recordedmeal.getBreakfasts().get(recordedmeal.getBreakfasts().size()-1).getB_foods().entrySet()
            ) {
                string += e.getKey() + "  " + String.valueOf(e.getValue()) + "g\n";
            }
            fw.setText(string);
            cl.setText(String.valueOf(recordedmeal.getBreakfasts().get(recordedmeal.getBreakfasts().size()-1).getB_kaluli()));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fg_b_recent, container, false);
    }
}