package com.example.rajnikantpandey.loginpage;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Rajnikant Pandey on 2/16/2018.
 */

public class Firstfragment extends Fragment{
    int image[]={R.drawable.dhobi,R.drawable.dhobi,R.drawable.dhobi,R.drawable.dhobi,R.drawable.dhobi,R.drawable.dhobi,R.drawable.dhobi
            ,R.drawable.dhobi,R.drawable.dhobi};
    String ar[]={"10","10","10","10","10","10","10","10","10",};
    int i=0;
    RecyclerView recyclerView;
    FragOneAdapter fragOneAdapter;
    ArrayList arrayList;
    RecyclerView.LayoutManager layoutManager;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View view =inflater.inflate(R.layout.first_layout,container,false);
        recyclerView=view.findViewById(R.id.recyclerview);
        // String ar1[];
       // ar1=getResources().getStringArray(R.array.number);
         arrayList=new ArrayList();
for ( i=0;i<9;i++)
        {
         FragOneDataProvidr fragOneDataProvidr = new  FragOneDataProvidr(image[i],ar[i]);
         arrayList.add(fragOneDataProvidr);
        }
        fragOneAdapter=new FragOneAdapter(arrayList);
        recyclerView.setHasFixedSize(true);
     layoutManager=new LinearLayoutManager(this.getActivity());
     recyclerView.setLayoutManager(layoutManager);
     recyclerView.setAdapter(fragOneAdapter);
     return view;
    }
}
