package com.example.rajnikantpandey.loginpage;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements Headline.ButtonClick,DialogBox.SendData {
    TextView hel;
String strt;

    RelativeLayout rl;

    Secondfragment secondfragment;
    Thirdfragment thirdfragment;
    Firstfragment firstfragment;
    FourthFragmentPrevious fourthFragmentPrevious;
    FragmentManager fragmentManager;
    android.app.FragmentTransaction  fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        rl=findViewById(R.id.container_1);
        fragmentManager=getFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        secondfragment=new Secondfragment();
        thirdfragment=new Thirdfragment();
        firstfragment=new Firstfragment();
        fourthFragmentPrevious=new FourthFragmentPrevious();
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        android.net.NetworkInfo wifi = cm
                .getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        android.net.NetworkInfo datac = cm
                .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        if ((wifi != null & datac != null)
                && (wifi.isConnected() || datac.isConnected())) {
            fragmentTransaction.add(R.id.container_1,firstfragment);
            fragmentTransaction.commit();
        }else{

            Toast toast = Toast.makeText(this, "No Internet Connection",
                    Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public void route(String string)
    {
     //  FragmentManager fragmentManager=getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

       if(string.equals("mens")) {
           ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
           android.net.NetworkInfo wifi = cm
                   .getNetworkInfo(ConnectivityManager.TYPE_WIFI);
           android.net.NetworkInfo datac = cm
                   .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
           if ((wifi != null & datac != null)
                   && (wifi.isConnected() | datac.isConnected())) {
               fragmentTransaction.replace(R.id.container_1,firstfragment);
               fragmentTransaction.commit();

           }else{

               Toast toast = Toast.makeText(this, "No Internet Connection",
                       Toast.LENGTH_LONG);
               toast.show();
           }
        }

    else if(string.equals("womens"))
        {

            ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            android.net.NetworkInfo wifi = cm
                    .getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo datac = cm
                    .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            if ((wifi != null & datac != null)
                    && (wifi.isConnected() | datac.isConnected())) {
                fragmentTransaction.add(R.id.container_1,thirdfragment);
                fragmentTransaction.commit();
            }else{

                Toast toast = Toast.makeText(this, "No Internet Connection",
                        Toast.LENGTH_LONG);
                toast.show();
            }
        }
        else if(string.equals("other"))
        {
            ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            android.net.NetworkInfo wifi = cm
                    .getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo datac = cm
                    .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            if ((wifi != null & datac != null)
                    && (wifi.isConnected() | datac.isConnected())) {
                fragmentTransaction.add(R.id.container_1,fourthFragmentPrevious);
                fragmentTransaction.commit();

            }else{

                Toast toast = Toast.makeText(this, "No Internet Connection",
                        Toast.LENGTH_LONG);
                toast.show();
            }

        }
        else
        {

            Intent intent =new Intent(SecondActivity.this,Third1Activity.class);
            startActivity(intent);
        }
}
    public void sendData(int j) {

        SetActivityDemo.getObject().callmethod(this,getApplicationContext(),j);
    }


}
