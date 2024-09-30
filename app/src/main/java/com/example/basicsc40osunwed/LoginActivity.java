package com.example.basicsc40osunwed;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity { // MainActivity class is a child of a built-in class called AppCompatActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) { // creating the activity using the 'super function' + our needs
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // inflation (linking) -> XML file with this java class
        //             R -> is a class linked with the project resources
    }
}