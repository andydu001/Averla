/*
class menu


 */


package com.example.averla;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class Menu1 extends AppCompatActivity {
    private ImageView ima;
    private SearchView sch;
    private ScrollView scrollView;
    private TextView t1 , t2, t3, t4, t5, t6, t7, t8, t9,t56,t57,t58,t52,t54,t55;
    public static Apend ap;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        //reference objects
        ima= findViewById(R.id.imageView3);
        sch= findViewById(R.id.searcch);
        t1= findViewById(R.id.textView8);
        t2= findViewById(R.id.textView9);
        t3= findViewById(R.id.textView10);
        t4= findViewById(R.id.textView11);
        t5= findViewById(R.id.textView12);
        t6= findViewById(R.id.textView13);

        t56= findViewById(R.id.textView56);
        t57= findViewById(R.id.textView57);
        t58= findViewById(R.id.textView58);

        t52= findViewById(R.id.textView56);
        t54= findViewById(R.id.textView57);
        t55= findViewById(R.id.textView55);

        t57.setText(" ");
        t58.setText(" ");
        //t55.setText(" ");

        scrollView = findViewById(R.id.scroll);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            scrollView.setTopEdgeEffectColor(Color.MAGENTA);
        }

        scrollView.setSmoothScrollingEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            scrollView.setEdgeEffectColor(Color.RED);
        }
        // scrollView.setBackgroundColor(Color.LTGRAY);
        sch.setQueryRefinementEnabled(true);
        sch.setBackgroundColor(Color.LTGRAY);
        sch.setQueryHint("menu,drinks");

        sch.setInputType(SearchView.KEEP_SCREEN_ON);
        sch.setScrollY(SearchView.SCROLL_AXIS_VERTICAL);

        sch.setShowDividers(SearchView.SHOW_DIVIDER_BEGINNING);


        sch.setSubmitButtonEnabled(true);

        //sch.setBackgroundColor(Color.CYAN);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            t1.setOutlineSpotShadowColor(Color.GREEN);
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            sch.setInputType(WindowInsets.Type.systemGestures());

        }

        //add event to create a match
        sch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {

                String  toStr = new SrinMatch(s.trim()).checkMAtch();


                if ( toStr.equals("afr") || toStr.equals("afri") || toStr.equals("africa") || toStr.equals("african")|| toStr.equals("a") || toStr.equals("af")) {


                    t1.setText("\t\t\tAfrican Restaurant 🍴");
                    t2.setText("\t\t\tGodou Voutu🍴🍴");
                    t3.setText("\t\t\tMiatu Shoutou Restaurant");
                    t4.setText("\t\t\tSousu Mapou 🍽️");
                    t5.setText("\t\t\tMatsou Topo Restaurant 🍽️");
                    t6.setText("\t\t\tNouNou Restaurant 🍴🍴");



                }
                else if ( toStr.equals("hai") || toStr.equals("hait") || toStr.equals("ha") || toStr.equals("haiti")|| toStr.equals("h")) {


                    t1.setText("\t\t\tHaiti Restaurant 🍽️");
                    t2.setText("\t\t\tMiami Restaurant 🍴");
                    t3.setText("\t\t\tJacmel Capital Restaurant 🍽️");
                    t4.setText("\t\t\tJeremy Lalo Resto 🍴");
                    t5.setText("\t\t\tDelmas BanBou Restaurant 🍽️");
                    t6.setText("\t\t\tNouvo Restaurant 🍴");

                }
                else if ( toStr.equals("cub") || toStr.equals("cuba") || toStr.equals("cubain") || toStr.equals("cu")|| toStr.equals("c") || toStr.equals("cubai")) {


                    t1.setText("\t\t\tRicon Caribeno 🍽️");
                    t2.setText("\t\t\tLas Delicias Colombianas 🍴");
                    t3.setText("\t\t\tPikalox 🍽️");
                    t4.setText("\t\t\tEl Rey De Polo 🍴");
                    t5.setText("\t\t\tPueblo Viejo's Cafe 🍽️");
                    t6.setText("\t\t\tLa Esquina Restaurant 🍴");

                }
                else if ( toStr.equals("j") || toStr.equals("ja") || toStr.equals("jam") || toStr.equals("jama")||
                        toStr.equals("jamai") || toStr.equals("jamaic") || toStr.equals("jamaica")|| toStr.equals("jamaican")) {

                    // t1.setText(new SrinMatch(s).checkMAtch());
                    t1.setText("\t\t\tJamaica's Best 🍽️");
                    t2.setText("\t\t\tLas Delicias Colombianas 🍴");
                    t3.setText("\t\t\tPikalox 🍽️");
                    t4.setText("\t\t\tRaphael Restaurant 🍴");
                    t5.setText("\t\t\tCOOL SHADE 🍽️");
                    t6.setText("\t\t\tJoJo Restaurant 🍴");

                }
                else{
                    t1.setText("\t\t\t"+ new SrinMatch(s).checkMAtch());
                    t2.setText(" ");
                    t3.setText(" ");
                    t4.setText(" ");
                    t5.setText(" ");
                    t6.setText(" ");

                }

                try {
                    Apend.printChsequence(s);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return true;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                // t1.setText("     ");
                return true;
            }
        });

        t1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                t1.setText("         ANDY");
                return false;
            }
        });

        t1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                t1.setText("         ANDY");
            }
        });


        ima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte =new Intent(Menu1.this ,MainActivity.class);
                startActivity(inte);
            }
        });
        sch.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // t1.setText("\t\t\tAll");
                t2.setText("\t\t\trecent");

            }
        });

        sch.setQueryRefinementEnabled(true);
        sch.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                t1.setText(" ");
                t2.setText(" ");
                t3.setText(" ");
                t4.setText(" ");
                t5.setText(" ");
                t6.setText(" ");
                return true;
            }
        });

        t54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t56.setText("");
                t57.setText("___________");
                t58.setText(" ");

                t1.setText("\t\t\tJamaica's Best 🍽️");
                t2.setText("\t\t\tLas Delicias Colombianas 🍴");
                t3.setText("\t\t\tPikalox 🍽️");
                t4.setText("\t\t\tRaphael Restaurant 🍴");
                t5.setText("\t\t\tCOOL SHADE 🍽️");
                t6.setText("\t\t\tJoJo Restaurant 🍴");
            }
        });

        t55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t57.setText("");
                t58.setText("________");
                t56.setText("");

                t1.setText("\t\t\t Stop & Shop 🍽️");
                t2.setText("\t\t\t Alino Market 🍴");
                t3.setText("\t\t\tCapi Convenient Store 🍽️");
                t4.setText("\t\t\tAmerica's Food Basket 🍴");
                t5.setText("\t\t\tAdeli Store  🍽️");
                t6.setText("\t\t\tAlty Market 🍴");
            }
        });

        t52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t57.setText("");
                t58.setText(" ");
                t56.setText("___");


                t1.setText("\t\t\tJamaica's Best Food 🍽️");
                t2.setText("\t\t\tLas Delicias Restaurent 🍴");
                t3.setText("\t\t\tPikalox 🍽️");
                t4.setText("\t\t\tRaphael Restaurant 🍴");
                t5.setText("\t\t\tCOOL SHADE 🍽️");
                t6.setText("\t\t\tJoJo Restaurant 🍴");
            }
        });

    }



    @Override
    public void onUserInteraction() {

      //  setContentView(R.layout.anss);
        super.onUserInteraction();
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(),"Do you want to go back", Toast.LENGTH_SHORT);
        super.onBackPressed();
    }
}