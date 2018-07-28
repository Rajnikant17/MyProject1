package com.example.rajnikantpandey.loginpage;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegistrationActivity extends AppCompatActivity {
  private  EditText  email, password;
  private   Button register;
  private   TextView signpage;
  private   FirebaseAuth firebaseAuth;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        email = (EditText) findViewById(R.id.reg_email);
        password = (EditText) findViewById(R.id.reg_pass);
        register = (Button) findViewById(R.id.button);
        signpage = findViewById(R.id.sign_page);
        firebaseAuth=FirebaseAuth.getInstance();
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (register()) {
                    String Email = email.getText().toString().trim();
                    String Password = password.getText().toString().trim();
                    firebaseAuth.createUserWithEmailAndPassword(Email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                      @Override
                      public void onComplete(@NonNull Task<AuthResult> task) {
                          if (task.isSuccessful()){
                             // Toast.makeText(RegistrationActivity.this, "For successful Registration,verify the email", Toast.LENGTH_SHORT).show();
                             emailVerification();

                          }
                          else
                              Toast.makeText(RegistrationActivity.this, "unsuccessful", Toast.LENGTH_SHORT).show();
                      }


                  });
                }

            }
        });
        signpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrationActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
                }
    public Boolean register() {
        Boolean result = false;
        String emal,pass;
        emal=email.getText().toString().trim();
        pass=password.getText().toString().trim();

        if( emal.isEmpty() || pass.isEmpty())
        {
            Toast.makeText(RegistrationActivity.this,"fill all blanks",Toast.LENGTH_SHORT).show();}
        else
           result=true;

return result;
    }
    public void emailVerification()
    {
        FirebaseUser firebaseUser=firebaseAuth.getCurrentUser();
        if(firebaseUser !=null)
        {
            firebaseUser.sendEmailVerification();
            firebaseAuth.signOut();
            Toast.makeText(RegistrationActivity.this, "verification mail sent to the email", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        else
            Toast.makeText(RegistrationActivity.this, "verification mail not sent to the email", Toast.LENGTH_SHORT).show();
    }


}