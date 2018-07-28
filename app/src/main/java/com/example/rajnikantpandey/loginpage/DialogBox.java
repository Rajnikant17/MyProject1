package com.example.rajnikantpandey.loginpage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Rajnikant Pandey on 2/25/2018.
 */

public class DialogBox extends DialogFragment {
    LayoutInflater inflater;
    View view;
    String str;
    TextView textView;
    public   int k=0;
   SendData send;
    SetActivity set;
    FloatingActionButton floatingActionButton_1,floatingActionButton_2;
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        inflater=getActivity().getLayoutInflater();
         Context contxt;
       view=inflater.inflate(R.layout.dialog,null);
        textView= view.findViewById(R.id.digit);
        floatingActionButton_1=view.findViewById(R.id.plus);
        floatingActionButton_2=view.findViewById(R.id.minus);
        floatingActionButton_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                k++;
                str=Integer.toString(k);
                textView.setText(str);
            }
        });
        floatingActionButton_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                k--;
                str=Integer.toString(k);
                textView.setText(str);

            }
        });
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
       // Fragment secondfragment = getActivity().getFragmentManager().findFragmentByTag("SecondFragment");

        builder.setView(view).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public  void onClick(DialogInterface dialogInterface, int i) {
              //  Toast.makeText(getActivity(),"All is Well" + " "+str,Toast.LENGTH_SHORT).show();
                send.sendData(k);
               // SetActivityDemo.getObject().callmethod(getContext());



            }
        }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(),"All is Not Well",Toast.LENGTH_SHORT).show();
            }
        });
        return builder.create();
    }
    public interface SendData
    {
      public void sendData(int t);
    }

    @Override
    public void onAttach(Activity context) {
        super.onAttach(context);
        try {
            send=(SendData) context;
        } catch (Exception e) {

        }
    }
    public interface SetActivity
    {
        public void setActivity();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            set=(SetActivity)context;
        } catch (Exception e) {

        }
    }

}
