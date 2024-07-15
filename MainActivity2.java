package com.example.averla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.averla.ui.login.LoginActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent =new Intent(this, LoginActivity.class);
        Intent inte =new Intent(this, MainActivity.class);
        startActivity(inte);
        startActivity(intent);
    }
}