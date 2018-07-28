package com.example.rajnikantpandey.loginpage;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Rajnikant Pandey on 2/28/2018.
 */

public class DynamicView {
    Context ctx;
    TextView textView;

    public DynamicView(Context ctx) {
        this.ctx = ctx;
    }
    public TextView Items(Context context, String text )
    {
       final ViewGroup.LayoutParams layoutParams=new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
       final TextView textView=new TextView(context);
        textView.setLayoutParams(layoutParams);
        textView.setMaxEms(8);
        textView.setText(" "+text+" ");
        return textView;
    }
    public TextView two( Context context,String text )
    {
      final    ViewGroup.LayoutParams layoutParams=new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
      final  TextView textView=new TextView(context);
        textView.setLayoutParams(layoutParams);
        textView.setMaxEms(8);
        textView.setText(" "+text+" ");
        return textView;
    }
    public TextView multiply( Context context,String text )
    {
      final  ViewGroup.LayoutParams layoutParams=new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        final  TextView textView=new TextView(context);
        textView.setLayoutParams(layoutParams);
        textView.setMaxEms(8);
        textView.setText(" "+text+" ");
        return textView;
    }
    public TextView Ten( Context context,String text )
    {
     final   ViewGroup.LayoutParams layoutParams=new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        final        TextView textView=new TextView(context);
        textView.setLayoutParams(layoutParams);
        textView.setMaxEms(8);
        textView.setText(" "+text+" ");
        return textView;
    }
    public TextView EqualTo( Context context,String text )
    {
        final  ViewGroup.LayoutParams layoutParams=new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        final  TextView textView=new TextView(context);
        textView.setLayoutParams(layoutParams);
        textView.setMaxEms(8);
        textView.setText(" "+text+" ");
        return textView;
    }
    public TextView Result( Context context,String text )
    {
        final  ViewGroup.LayoutParams layoutParams=new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        final  TextView textView=new TextView(context);
        textView.setLayoutParams(layoutParams);
        textView.setMaxEms(8);
        textView.setText(" "+text+" ");
        return textView;
    }
    public FloatingActionButton MinusButto( Context context )
    {
        final  ViewGroup.LayoutParams layoutParams=new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        final  FloatingActionButton floating=new FloatingActionButton(context);
        floating.setLayoutParams(layoutParams);
        return floating;
    }
    public FloatingActionButton PlusButto( Context context )
    {
       final  ViewGroup.LayoutParams layoutParams=new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        final  FloatingActionButton floating=new FloatingActionButton(ctx);
        floating.setLayoutParams(layoutParams);
        return floating;
    }
    public FloatingActionButton CrossButton( Context context)
    {
        final  ViewGroup.LayoutParams layoutParams=new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        final  FloatingActionButton floating=new FloatingActionButton(context);
        floating.setLayoutParams(layoutParams);
        return floating;
    }
}
