package com.example.rajnikantpandey.loginpage;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Rajnikant Pandey on 3/14/2018.
 */

public class FifthFragment extends Fragment {

    TextView txt1,txt2,txt3;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fifthfragment,container);
        txt1=view.findViewById(R.id.name_1);
        txt2=view.findViewById(R.id.mob_no);
        txt3=view.findViewById(R.id.address);
        txt2.setVisibility(View.INVISIBLE);
        txt3.setVisibility(View.INVISIBLE);
        SharedPreferences sharedPreferences= SetActivityDemo.cont1.getSharedPreferences("mydataok_1",MODE_PRIVATE);
        txt2.setText(sharedPreferences.getString("key5",""));
        txt2.setVisibility(View.VISIBLE);
        txt3.setText(sharedPreferences.getString("key6",""));
        txt3.setVisibility(View.VISIBLE);
      /*  txt1.setText(SetActivityDemo_1.getInstance().st1);
        txt2.setText(SetActivityDemo_1.getInstance().st2);
        txt3.setText(SetActivityDemo_1.getInstance().st3);*/
        return view;
    }
  /*  public void update(String st1,String st2,String st3)
    {
       txt1.setText(st1);
        txt1.setText(st2);
        txt1.setText(st3);
    }*/
}
