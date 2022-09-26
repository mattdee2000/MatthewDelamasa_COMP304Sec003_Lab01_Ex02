package com.example.matthewdelamasa_comp304sec003_lab01_ex02;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.util.Log;
import android.view.View.OnClickListener;

import androidx.fragment.app.ListFragment;


public class FirstFragment extends ListFragment {
    String[] activities = new String[]
            {
                    "AIActivity",
                    "VRActivity"
            };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_first,container,false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, activities);
        final ListView listView = (ListView) view.findViewById(android.R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(getActivity(),"You clicked" +activities[position],Toast.LENGTH_SHORT).show();
            }
        });




        Toast.makeText(getActivity(),"onCreateView",Toast.LENGTH_SHORT).show();
        return view;
    }
    public void onStart(){
        super.onStart();
        Toast.makeText(getActivity(), "onStart", Toast.LENGTH_SHORT).show();
    }
    public void onStop(){
        super.onStop();
        Toast.makeText(getActivity(), "onStop", Toast.LENGTH_SHORT).show();
    }

    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(getActivity(), "onDestroy", Toast.LENGTH_SHORT).show();
    }


}