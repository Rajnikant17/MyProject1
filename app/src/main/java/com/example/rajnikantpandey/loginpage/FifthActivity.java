package com.example.rajnikantpandey.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class FifthActivity extends AppCompatActivity {
String st1,st2,st3,st4,st5;

private DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        databaseReference = FirebaseDatabase.getInstance().getReference();


    }
    public void order(View view)
    {
        this.st1= SetActivityDemo_1.getInstance().st1;
        this.st2= SetActivityDemo_1.getInstance().st2;
        this.st3= SetActivityDemo_1.getInstance().st3;
        this.st4=Integer.toString(SetActivityDemo.getObject().total_no_item);
        this.st5=Integer.toString(SetActivityDemo.getObject().total);
        HashMap<String,String> hashMap=new HashMap<String,String>();
        hashMap.put("Name",st1);
        hashMap.put("Mob-no",st2);
        hashMap.put("Addres",st3);
        hashMap.put("No_of_item",st4);
        hashMap.put("Total_amout",st5);
        databaseReference.push().setValue(hashMap);



    }
}