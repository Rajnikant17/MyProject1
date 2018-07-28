package com.example.rajnikantpandey.loginpage;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Rajnikant Pandey on 4/3/2018.
 */

public class FourthFragmentPrevious extends Fragment {
    RelativeLayout button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9;
    TextView txtview1,txtview2,txtview3,txtview4,txtview5,txtview6,txtview7,txtview8,txtview9;
    TextView txtview_1,txtview_2,txtview_3,txtview_4,txtview_5,txtview_6,txtview_7,txtview_8,txtview_9;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fourth_layout,container,false);

        button_1=view.findViewById(R.id.button_1);
        button_2=view.findViewById(R.id.button_2);
        button_3=view.findViewById(R.id.button_3);
        button_4=view.findViewById(R.id.button_4);
        button_5=view.findViewById(R.id.button_5);
        button_6=view.findViewById(R.id.button_6);
        button_7=view.findViewById(R.id.button_7);
        button_8=view.findViewById(R.id.button_8);
        button_9=view.findViewById(R.id.button_9);
        txtview1=view.findViewById(R.id.textView1);
        txtview2=view.findViewById(R.id.textView2);
        txtview3=view.findViewById(R.id.textView3);
        txtview4=view.findViewById(R.id.textView4);
        txtview5=view.findViewById(R.id.textView5);
        txtview6=view.findViewById(R.id.textView6);
        txtview7=view.findViewById(R.id.textView7);
        txtview8=view.findViewById(R.id.textView8);
        txtview9=view.findViewById(R.id.textView9);
        txtview_1=view.findViewById(R.id.textView_1);
        txtview_2=view.findViewById(R.id.textView_2);
        txtview_3=view.findViewById(R.id.textView_3);
        txtview_4=view.findViewById(R.id.textView_4);
        txtview_5=view.findViewById(R.id.textView_5);
        txtview_6=view.findViewById(R.id.textView_6);
        txtview_7=view.findViewById(R.id.textView_7);
        txtview_8=view.findViewById(R.id.textView_8);
        txtview_9=view.findViewById(R.id.textView_9);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetActivityDemo.getObject().callmethod1(Integer.parseInt(txtview1.getText().toString()),(txtview_1.getText().toString()));
                DialogBox dialogBox=new DialogBox();
                dialogBox.show(getFragmentManager(),"my_dialog");
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SetActivityDemo.getObject().callmethod1(Integer.parseInt(txtview2.getText().toString()),(txtview_2.getText().toString()));
                DialogBox dialogBox=new DialogBox();
                dialogBox.show(getFragmentManager(),"my_dialog");
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetActivityDemo.getObject().callmethod1(Integer.parseInt(txtview3.getText().toString()),(txtview_3.getText().toString()));
                DialogBox dialogBox=new DialogBox();
                dialogBox.show(getFragmentManager(),"my_dialog");
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetActivityDemo.getObject().callmethod1(Integer.parseInt(txtview4.getText().toString()),(txtview_4.getText().toString()));
                DialogBox dialogBox=new DialogBox();
                dialogBox.show(getFragmentManager(),"my_dialog");
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetActivityDemo.getObject().callmethod1(Integer.parseInt(txtview5.getText().toString()),(txtview_5.getText().toString()));
                DialogBox dialogBox=new DialogBox();
                dialogBox.show(getFragmentManager(),"my_dialog");
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetActivityDemo.getObject().callmethod1(Integer.parseInt(txtview6.getText().toString()),(txtview_6.getText().toString()));
                DialogBox dialogBox=new DialogBox();
                dialogBox.show(getFragmentManager(),"my_dialog");
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetActivityDemo.getObject().callmethod1(Integer.parseInt(txtview7.getText().toString()),(txtview_7.getText().toString()));
                DialogBox dialogBox=new DialogBox();
                dialogBox.show(getFragmentManager(),"my_dialog");
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetActivityDemo.getObject().callmethod1(Integer.parseInt(txtview8.getText().toString()),(txtview_8.getText().toString()));
                DialogBox dialogBox=new DialogBox();
                dialogBox.show(getFragmentManager(),"my_dialog");
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetActivityDemo.getObject().callmethod1(Integer.parseInt(txtview9.getText().toString()),(txtview_9.getText().toString()));
                DialogBox dialogBox=new DialogBox();
                dialogBox.show(getFragmentManager(),"my_dialog");
            }
        });
        return view;

    }
}
