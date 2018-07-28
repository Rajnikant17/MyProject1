package com.example.rajnikantpandey.loginpage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddressActivity extends AppCompatActivity {
TextView txt1,txt2,txt3;
Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        txt1=findViewById(R.id.id1);
        txt2=findViewById(R.id.id3);
        txt3=findViewById(R.id.id2);
        bt=findViewById(R.id.bt);
        txt2.setVisibility(View.INVISIBLE);
        txt3.setVisibility(View.INVISIBLE);
        SharedPreferences sharedPreferences=getSharedPreferences("mydataok_1",MODE_PRIVATE);
       txt2.setText(sharedPreferences.getString("key5",""));
        txt2.setVisibility(View.VISIBLE);
       txt3.setText(sharedPreferences.getString("key6",""));
        txt3.setVisibility(View.VISIBLE);
       /* txt2.setText(SetActivityDemo_1.getInstance().st1);
        txt3.setText(SetActivityDemo_1.getInstance().st4);
        txt2.setVisibility(View.VISIBLE);
        txt3.setVisibility(View.VISIBLE);*/
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddressActivity.this,FourthActivity.class));
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddressActivity.this,FifthActivity.class));
            }
        });

    }
}
