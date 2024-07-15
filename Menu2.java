package com.example.averla;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;

public class Menu2 extends AppCompatActivity {
    private ImageView ima;
    private SearchView sch;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        ima= findViewById(R.id.imageView3);
        sch= findViewById(R.id.searcch);
        sch.setQueryRefinementEnabled(true);
        sch.setBackgroundColor(Color.LTGRAY);
        sch.setQueryHint("menu,drinks");
        sch.setSubmitButtonEnabled(true);

        ima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte =new Intent(Menu2.this ,MainActivity.class);
                startActivity(inte);
            }
        });



    }
}