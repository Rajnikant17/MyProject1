package com.example.rajnikantpandey.loginpage;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Rajnikant Pandey on 3/14/2018.
 */

public class sixthfragment extends Fragment {
    TextView txt1,txt2;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.sixthfragment,container);
        txt1=view.findViewById(R.id.no_of_item);
        txt2=view.findViewById(R.id.total_amount);
        txt1.setText("No of Item: "+Integer.toString(SetActivityDemo.getObject().total_no_item));
        txt2.setText("Total Amount: "+Integer.toString(SetActivityDemo.getObject().total));
        return view;
    }
}
