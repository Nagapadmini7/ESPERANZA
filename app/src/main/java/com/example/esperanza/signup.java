package com.example.esperanza;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        TextView email=(TextView) findViewById(R.id.editTextTextEmailAddress2);
        TextView textPassword=(TextView) findViewById(R.id.editTextTextPassword);
        @SuppressLint("WrongViewCast") MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
                //admin and admin
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("admin") && textPassword.getText().toString().equals("admin"))
                    //correct
                    Toast.makeText(signup.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();

                    //incorrect
                 Toast.makeText(signup.this, "LOGIN FAILED!!!",Toast.LENGTH_SHORT).show();




        }
    });}}
