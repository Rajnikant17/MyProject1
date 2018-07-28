package com.example.rajnikantpandey.loginpage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseUser;

/**
 * Created by Rajnikant Pandey on 3/4/2018.
 */

 public class SetActivityDemo {

    RelativeLayout relativeLayout;
    public static Context cont;
    public static Context cont1;
    LinearLayout linearLayout = null;
    ImageView floating_cross;
    TextView textView0,textView1,textView2;
    int strt=0, result_1=0, result_2, total=0, total_no_item=0;
    String noOfItem, price_1,item_valu,item;
    FloatingActionButton floating_add;
    int item_value;
    int textView3 = 3, textView5 = 5, textView6 = 6, textView7 = 7, textView8 = 8, textView9 = 9, textView10 = 10;
    RelativeLayout.LayoutParams layoutParams;
    RelativeLayout.LayoutParams layoutParams_1;
    RelativeLayout.LayoutParams layoutParams_2;
    RelativeLayout.LayoutParams layoutParams_3;
    RelativeLayout.LayoutParams layoutParams_4;
    RelativeLayout.LayoutParams layoutParams_5;
    RelativeLayout.LayoutParams layoutParams_6;
    RelativeLayout.LayoutParams layoutParams_7;
    RelativeLayout.LayoutParams layoutParams_8;
    RelativeLayout.LayoutParams layoutParams_9;
    private static SetActivityDemo object = null;
    private SetActivityDemo() {
    }

    public static SetActivityDemo getObject() {
        if (object == null) {
            object = new SetActivityDemo();
        }

        return object;
    }
    public void callmethod1(int a,String z)
    {
       item_value=a;
       item=z;
    }


    public Context callmethod(Context context, Context context1, int b) {

            strt = b;
            result_1 = item_value * b;
             item_valu = Integer.toString(item_value);
            total = total + result_1;
            total_no_item = total_no_item + strt;
            noOfItem = Integer.toString(strt);
            price_1 = Integer.toString(result_1);

            cont = context;
            cont1 = context1;
            //  object.Items("item");
            if (linearLayout == null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                linearLayout = new LinearLayout(cont1);
                linearLayout.setLayoutParams(layoutParams);
                linearLayout.setOrientation(LinearLayout.VERTICAL);
                // linearLayout1=linearLayout;
            }

            layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 250);

            relativeLayout = new RelativeLayout(cont);
            relativeLayout.setLayoutParams(layoutParams);
            relativeLayout.setBackgroundColor(Color.WHITE);
             relativeLayout.addView(Items(item),layoutParams_1);
            relativeLayout.addView(two(noOfItem), layoutParams_2);
            relativeLayout.addView(multiply("*"), layoutParams_3);
            relativeLayout.addView(Ten(item_valu), layoutParams_4);
            relativeLayout.addView(EqualTo("="), layoutParams_5);
            relativeLayout.addView(Result(price_1), layoutParams_6);
            relativeLayout.addView(MinusButto(relativeLayout), layoutParams_7);
            relativeLayout.addView(PlusButto(relativeLayout,b), layoutParams_8);
            relativeLayout.addView(CrossButton(relativeLayout), layoutParams_9);
            linearLayout.addView(relativeLayout);
            linearLayout.addView(view());
       /* floating_cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(cont1,"all is well",Toast.LENGTH_SHORT).show();

                    ((ViewGroup) relativeLayout.getParent()).removeView(relativeLayout);
                    // linearLayout.removeView(relativeLayout);


            }
        });*/

        return cont;

    }
    public View view()
    {
        RelativeLayout.LayoutParams layoutParams_1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 15);
        View view1=new View(cont1);
        view1.setLayoutParams(layoutParams_1);
        return view1;
    }

    public  TextView Items(String text) {
        layoutParams_1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        layoutParams_1.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        layoutParams_1.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        layoutParams_1.addRule(RelativeLayout.ALIGN_PARENT_START);
        TextView textView = new TextView(cont1);
        textView.setLayoutParams(layoutParams_1);
        textView.setMaxEms(8);
        textView.setId(textView3);
        textView.setText(text);
        return textView;
    }

    public  TextView two(String text) {
        layoutParams_2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
         textView0 = new TextView(cont);
        layoutParams_2.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        layoutParams_2.addRule(RelativeLayout.ALIGN_PARENT_START);
        layoutParams_2.addRule(RelativeLayout.CENTER_VERTICAL);
        layoutParams_2.setMargins(68, 68, 0, 0);
        layoutParams_2.addRule(RelativeLayout.ALIGN_PARENT_START);
        textView0.setLayoutParams(layoutParams_2);
        textView0.setId(textView5);
        textView0.setMaxEms(8);
        textView0.setText(text);
        return textView0;
    }

    public  TextView multiply(String text) {
        layoutParams_3 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        final TextView textView = new TextView(cont);
        textView.setLayoutParams(layoutParams_3);
        layoutParams_3.addRule(RelativeLayout.ALIGN_BOTTOM, textView5);
        layoutParams_3.addRule(RelativeLayout.ALIGN_BASELINE, textView5);
        layoutParams_3.addRule(RelativeLayout.END_OF, textView5);
        layoutParams_3.addRule(RelativeLayout.RIGHT_OF, textView5);
        layoutParams_3.setMargins(11, 11, 0, 0);
        textView.setLayoutParams(layoutParams_3);
        textView.setMaxEms(8);
        textView.setId(textView6);
        textView.setText("*");
        return textView;
    }

    public  TextView Ten(String text) {
        layoutParams_4 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        TextView textView = new TextView(cont);
        layoutParams_4.addRule(RelativeLayout.ALIGN_BOTTOM, textView6);
        layoutParams_4.addRule(RelativeLayout.ALIGN_BASELINE, textView6);
        layoutParams_4.addRule(RelativeLayout.END_OF, textView6);
        layoutParams_4.addRule(RelativeLayout.RIGHT_OF, textView6);
        layoutParams_4.setMargins(22, 22, 0, 0);
        textView.setLayoutParams(layoutParams_4);
        textView.setMaxEms(8);
        textView.setId(textView7);
        textView.setText(text);
        return textView;
    }

    public  TextView EqualTo(String text) {
        layoutParams_5 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        TextView textView = new TextView(cont);
        layoutParams_5.addRule(RelativeLayout.ALIGN_BOTTOM, textView7);
        layoutParams_5.addRule(RelativeLayout.END_OF, textView7);
        layoutParams_5.addRule(RelativeLayout.RIGHT_OF, textView7);
        textView.setLayoutParams(layoutParams_5);
        textView.setMaxEms(8);
        textView.setId(textView8);
        textView.setText("=");
        return textView;
    }

    public  TextView Result(String text) {
        layoutParams_6 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
         textView2 = new TextView(cont);
        layoutParams_6.addRule(RelativeLayout.ALIGN_TOP, textView8);
        layoutParams_6.addRule(RelativeLayout.END_OF, textView8);
        layoutParams_6.addRule(RelativeLayout.RIGHT_OF, textView8);
        layoutParams_6.setMargins(16, 0, 0, 0);
        textView2.setLayoutParams(layoutParams_6);
        textView2.setMaxEms(8);
        textView2.setId(textView9);
        textView2.setText(text);
        return textView2;
    }


    public FloatingActionButton MinusButto(final RelativeLayout relativelayout_2) {

        layoutParams_7 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        FloatingActionButton fab=new FloatingActionButton(cont);
        fab.setId(textView10);
        layoutParams_7.addRule(RelativeLayout.BELOW, textView9);
        layoutParams_7.setMargins(22, 0, 0, 0);
        fab.setBackgroundResource(R.drawable.ic_action_minus);
        fab.setImageResource(R.drawable.ic_action_minus);
        fab.setLayoutParams(layoutParams_7);
       final TextView txt=relativelayout_2.findViewById(textView5);
       final TextView txt1=relativelayout_2.findViewById(textView9);
       final TextView txt2=relativelayout_2.findViewById(textView7);
       // final int itm_val= Integer.parseInt(txt2.getText().toString());
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // strt=strt+1;
                //result_1 = 10 * strt;
                // total = total + result_1;
                //total_no_item =strt;
                // noOfItem = Integer.toString(strt);
                // price_1 = Integer.toString(result_1);
                //TextView txt=relativelayout_2.findViewById(textView5);
                //TextView txt1=relativelayout_2.findViewById(textView9);
                int no_item= Integer.parseInt(txt.getText().toString());
                 int itm_val= Integer.parseInt(txt2.getText().toString());
                // int total_1= Integer.parseInt(txt1.getText().toString());
                no_item=no_item-1;
                total_no_item =total_no_item-1;
                total=total-itm_val;
                noOfItem = Integer.toString(no_item);
                price_1 = Integer.toString(no_item*itm_val);
                txt.setText(noOfItem);
                txt1.setText(price_1);
            }
        });
        return fab;
    }

    public FloatingActionButton PlusButto(final RelativeLayout relativelayout_2,final int b) {
        layoutParams_8 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
         floating_add = new FloatingActionButton(cont);
        layoutParams_8.addRule(RelativeLayout.BELOW, textView9);
        layoutParams_8.addRule(RelativeLayout.END_OF, textView9);
        layoutParams_8.addRule(RelativeLayout.RIGHT_OF, textView9);
        layoutParams_8.setMargins(22, 0, 0, 0);
        floating_add.setImageResource(R.drawable.ic_action_plus);
        floating_add.setLayoutParams(layoutParams_8);
       final TextView txt=relativelayout_2.findViewById(textView5);
       final TextView txt1=relativelayout_2.findViewById(textView9);
        final TextView txt2=relativelayout_2.findViewById(textView7);
      //  final int itm_val= Integer.parseInt(txt2.getText().toString());
        floating_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // strt=strt+1;
                //result_1 = 10 * strt;
               // total = total + result_1;
                //total_no_item =strt;
               // noOfItem = Integer.toString(strt);
               // price_1 = Integer.toString(result_1);
               // TextView txt=relativelayout_2.findViewById(textView5);
               // TextView txt1=relativelayout_2.findViewById(textView9);
                  int no_item= Integer.parseInt(txt.getText().toString());
                 int itm_val= Integer.parseInt(txt2.getText().toString());
               // int total_1= Integer.parseInt(txt1.getText().toString());
                no_item=no_item+1;
                total_no_item =total_no_item+1;
                total=total+itm_val;
                noOfItem = Integer.toString(no_item);
                price_1 = Integer.toString(no_item*itm_val);
                           txt.setText(noOfItem);
                           txt1.setText(price_1);
            }
        });
        return floating_add;
    }

    public ImageView CrossButton(final RelativeLayout relativelayout_2) {
        layoutParams_9 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
         floating_cross = new ImageView(cont);
        layoutParams_9.addRule(RelativeLayout.ABOVE, textView9);
        layoutParams_9.addRule(RelativeLayout.ALIGN_PARENT_END);
        layoutParams_9.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        layoutParams_9.setMargins(14, 0, 14, 0);
        floating_cross.setImageResource(R.drawable.cancel);
        floating_cross.setLayoutParams(layoutParams_9);
        final TextView txt=relativelayout_2.findViewById(textView5);
        final TextView txt1=relativelayout_2.findViewById(textView9);
       // final RelativeLayout r1=(RelativeLayout)floating_cross.getParent();
        floating_cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no_item= Integer.parseInt(txt.getText().toString());
                int no_item1= Integer.parseInt(txt1.getText().toString());
                total_no_item=total_no_item-no_item;
                total=total-no_item1;
                linearLayout.removeView(relativelayout_2);
            }
        });
        return floating_cross;
    }
}




