package com.example.averla;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;

public class AppSearch extends AppCompatActivity {
    private SearchView src;
    private RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_search);

        src= findViewById(R.id.src);
        //src.setQueryHint("Food, Drinks.....NACK/ ect.");
        src.setBackgroundColor(Color.LTGRAY);
        src.setQueryRefinementEnabled(true);
        src.setSubmitButtonEnabled(true);
        //get reference
        recyclerView= findViewById(R.id.recycle);
        recyclerView.setBackgroundColor(Color.WHITE);
        recyclerView.setRecyclerListener(new RecyclerView.RecyclerListener() {
            @Override
            public void onViewRecycled(@NonNull RecyclerView.ViewHolder holder) {

            }
        });

        //recyclerView.addView(new View(AppSearch.this));



    }
}