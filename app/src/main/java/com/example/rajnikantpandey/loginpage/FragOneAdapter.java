package com.example.rajnikantpandey.loginpage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajnikant Pandey on 2/16/2018.
 */

public class FragOneAdapter  extends RecyclerView.Adapter<FragOneAdapter.MyHandler>
{
ArrayList list=new ArrayList();
public FragOneAdapter(ArrayList arrayList)
{
    this.list=arrayList;
}
    @Override
    public MyHandler onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=(LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.firstrow,parent,false);
        MyHandler handler=new MyHandler(view);
        return handler;
    }

    public void onBindViewHolder(MyHandler holder, int position) {
        FragOneDataProvidr fragOneDataProvidr= (FragOneDataProvidr) list.get(position);
         holder.image.setImageResource(fragOneDataProvidr.getImage());
        holder.text.setText(fragOneDataProvidr.getNumber());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class MyHandler extends RecyclerView.ViewHolder {
        ImageView image;
        TextView text;
         MyHandler(View itemView) {
            super(itemView);
         image=itemView.findViewById(R.id.imageView);
          text=itemView.findViewById(R.id.textView2);
        }
}
}
