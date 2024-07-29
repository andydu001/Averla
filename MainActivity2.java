package com.example.averla;
/*

This class is responsible for launching the application.
It has intents action properties.

Author: Andy Duverneau


 */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.averla.ui.login.LoginActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //launch the login activity
        Intent intent =new Intent(this, LoginActivity.class);
        //launch the main activity that handles most of the application widgets
        Intent intent2 =new Intent(this, MainActivity.class);

        startActivity(intent2);
        startActivity(intent);
    }
}