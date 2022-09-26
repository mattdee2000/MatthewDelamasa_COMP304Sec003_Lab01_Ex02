package com.example.matthewdelamasa_comp304sec003_lab01_ex02;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class SecondFragment extends Fragment {
    TextView texts;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_second,container,false);
        texts= (TextView) view.findViewById(R.id.second);
        texts.append("\nonCreate Initiated");
        return view;
    }

    public void onStart(){
        super.onStart();
        texts= (TextView) getActivity().findViewById(R.id.second);
        texts.append("\nonStart Initiated");
    }




}