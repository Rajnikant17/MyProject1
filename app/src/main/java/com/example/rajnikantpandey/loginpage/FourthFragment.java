package com.example.rajnikantpandey.loginpage;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Rajnikant Pandey on 3/11/2018.
 */

public class FourthFragment extends Fragment {


      public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
          View view =inflater.inflate(R.layout.firstfragment,container,false);
          LinearLayout linearLayout= view.findViewById(R.id.firstfrag);
          if(SetActivityDemo.getObject().linearLayout != null)
          {
          if(SetActivityDemo.getObject().linearLayout.getParent()!=null)
              ((ViewGroup)SetActivityDemo.getObject().linearLayout.getParent()).removeView(SetActivityDemo.getObject().linearLayout);
              linearLayout.addView(SetActivityDemo.getObject().linearLayout);
          }
        /*  SetActivityDemo.getObject().floating_cross.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                 // ((ViewGroup)  SetActivityDemo.getObject().relativeLayout.getParent()).removeView(SetActivityDemo.getObject().relativeLayout);
                  SetActivityDemo.getObject().linearLayout.removeView(SetActivityDemo.getObject().relativeLayout);
              }

          });

             // SetActivityDemo.getObject().linearLayout = null;
          //}
         /* TextView tv=new TextView(getActivity());
        RelativeLayout.LayoutParams  layoutParams_1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
          layoutParams_1.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
          layoutParams_1.addRule(RelativeLayout.ALIGN_PARENT_TOP);
          layoutParams_1.addRule(RelativeLayout.ALIGN_PARENT_START);
          TextView  textView = new TextView(getActivity());
          textView.setText("abc");
          textView.setLayoutParams(layoutParams_1);
          linearLayout.addView(textView);*/
          return view;
      }}


   /* public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
          view=SetActivityDemo.getObject().linearLayout;


    }*/

