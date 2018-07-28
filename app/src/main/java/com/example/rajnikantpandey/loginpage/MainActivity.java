package com.example.rajnikantpandey.loginpage;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
private EditText useremail,userpass;
private TextView signin,register_page;
FirebaseAuth firebaseAuth1;
int counter=5;
ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     useremail=findViewById(R.id.name);
        userpass=findViewById(R.id.email);
        signin=findViewById(R.id.signin);
        register_page=findViewById(R.id.register_page);
        progressDialog=new ProgressDialog(this);
        firebaseAuth1=FirebaseAuth.getInstance();
        FirebaseUser user=firebaseAuth1.getCurrentUser();
        if(user !=null)
        {
        finish();
         startActivity(new Intent(this,SecondActivity.class));
        }


        register_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,RegistrationActivity.class);
                startActivity(intent);
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(useremail.getText().toString().trim(), userpass.getText().toString().trim());
            }
        });


    }

    public void validate(String Email,String Password) {
        progressDialog.setMessage("wait for a while ,its signin");
        progressDialog.show();
        firebaseAuth1.signInWithEmailAndPassword(Email, Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    progressDialog.dismiss();
                    verifyEmail();
                } else {
                    progressDialog.dismiss();
                    counter--;
                    Toast.makeText(MainActivity.this, "wrong pass or email", Toast.LENGTH_SHORT).show();
                    if (counter == 0)
                        signin.setEnabled(false);
                }
            }
        });
    }
    public void verifyEmail()
    {
        FirebaseUser firebaseUser=firebaseAuth1.getCurrentUser();
        if(firebaseUser.isEmailVerified()) {
            Toast.makeText(MainActivity.this, "signin successfully", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, SecondActivity.class));
        }
        else{
            Toast.makeText(MainActivity.this, "Verify the email", Toast.LENGTH_SHORT).show();
            firebaseAuth1.signOut();
        }
    }


}
