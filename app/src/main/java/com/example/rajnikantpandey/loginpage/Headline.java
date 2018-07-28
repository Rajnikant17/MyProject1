package com.example.rajnikantpandey.loginpage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by Rajnikant Pandey on 2/17/2018.
 */

public class Headline extends Fragment {
    TextView text_1,text_2,text_3,text_4,text_5;
    ButtonClick buttonClick;
    DrawerLayout drawerLayout;
    LinearLayout linearLayout;
    FirebaseAuth firebaseAuth;
    ActionBarDrawerToggle actionBarDrawerToggle;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.headlinelayout,container,false);
        text_1=view.findViewById(R.id.text_1);
        text_2=view.findViewById(R.id.text_2);
        text_3=view.findViewById(R.id.text_3);
        text_4=view.findViewById(R.id.text_4);
        text_5=view.findViewById(R.id.text_5);
        firebaseAuth=FirebaseAuth.getInstance();
        NavigationView navigationView=view.findViewById(R.id.navigation);
        drawerLayout=view.findViewById(R.id.drawer);
                text_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        drawerLayout.openDrawer(Gravity.LEFT);
                    }
                });

        text_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick.route("mens");
            }
        });
        text_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick.route("womens");
            }
        });
        text_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick.route("other");
            }
        });
            text_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick.route("overall");
            }
        });
            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId())
                    {
                        case R.id.menu:
                            drawerLayout.closeDrawers();
                            firebaseAuth.signOut();
                            startActivity(new Intent(getActivity(),RegistrationActivity.class));
                            break;
                    }
                    return false;
                }
            });
        return view;
    }
   /* public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getContext().getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menu:
                Toast.makeText(this.getActivity(),"All is Well",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }*/
    public interface ButtonClick
    {
      public  void  route(String string);

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            buttonClick=(ButtonClick)activity;
        }
        catch (Exception e){}
    }
}
