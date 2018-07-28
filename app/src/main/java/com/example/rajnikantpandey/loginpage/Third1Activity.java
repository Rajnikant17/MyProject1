package com.example.rajnikantpandey.loginpage;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Third1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third1);
        FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FourthFragment d1 = new FourthFragment();
        fragmentTransaction.add(R.id.container_2, d1);
        fragmentTransaction.commit();
    }
    public void click(View view)
    {
        Intent intent=new Intent(Third1Activity.this,AddressActivity.class);
        startActivity(intent);
    }
}
