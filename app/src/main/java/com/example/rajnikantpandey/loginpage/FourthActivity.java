package com.example.rajnikantpandey.loginpage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {
    public EditText edit1, edit2, edit3, edit4;
    public TextView txt1, txt2;
    public String adres1, adres2, adres3, adres4, adres5, adres6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        edit1 = findViewById(R.id.id1);
        edit2 = findViewById(R.id.id2);
        edit3 = findViewById(R.id.id3);
        txt1 = findViewById(R.id.id4);
        txt2 = findViewById(R.id.id5);

    }

    public void click(View view) {
        if (isempty()) {
            adres1 = edit1.getText().toString();
            adres2 = edit2.getText().toString();
            adres3 = edit3.getText().toString();
            adres4 = txt1.getText().toString();
            adres5 = txt2.getText().toString();
            adres6=adres2+"\n"+adres3+"\n"+adres4+"\n"+adres5;
           // SetActivityDemo_1.getInstance().updateinfo(adres1, adres2, adres3);
            SharedPreferences sharedPreferences=getSharedPreferences("mydataok_1",MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("key5",adres1);
            editor.putString("key6",adres6);
            editor.commit();
            Intent intent = new Intent(FourthActivity.this, AddressActivity.class);
            startActivity(intent);
        }
    }
    public Boolean isempty() {
        Boolean result = false;
        String edit_1, edit_2, edit_3;
        edit_1 = edit1.getText().toString();
        edit_2 = edit2.getText().toString();
        edit_3 = edit3.getText().toString();

        if (edit_1.isEmpty() || edit_2.isEmpty() || edit_3.isEmpty()) {
            Toast.makeText(FourthActivity.this, "fill all blanks", Toast.LENGTH_SHORT).show();
        } else
            result = true;
        return result;
    }
}