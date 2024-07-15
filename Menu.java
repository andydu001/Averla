/*
class menu


 */

package com.example.averla;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.SearchView;

public class Menu extends AppCompatActivity {
    private SearchView sch;
    private HorizontalScrollView ho;
    private Button btn, btn1, btn10,btn19;
    private ImageView ima;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //reference widgets
        btn = findViewById(R.id.button11);
        btn1 = findViewById(R.id.button12);
        btn10 = findViewById(R.id.button10);
        btn19 = findViewById(R.id.button19);

        ima= findViewById(R.id.imageView3);
        ho = findViewById(R.id.ho);


        btn.setBackgroundColor(Color.DKGRAY);
        btn1.setBackgroundColor(Color.WHITE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setBackgroundColor(Color.LTGRAY);
                btn.setBackgroundColor(Color.DKGRAY);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn.setBackgroundColor(Color.LTGRAY);
                btn1.setBackgroundColor(Color.DKGRAY);
            }
        });

        ho.setHorizontalScrollBarEnabled(false);
        //set reference to the button
        ima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte =new Intent(Menu.this ,MainActivity.class);
                startActivity(inte);
            }
        });


        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setContentView(R.layout.anss);
            }
        });

        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setContentView(R.layout.anss);
            }
        });
    }
}