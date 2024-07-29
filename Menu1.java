/*
class menu
To show the user all available menu after a search selection

 */


package com.example.averla;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.Random;

public class Menu1 extends AppCompatActivity {
    private ImageView ima;
    private SearchView sch;
    private Content content;

    private Cursor cursor;
    private ScrollView scrollView;
    private TextView t1 , t2, t3, t4, t5, t6 ,t57,t58,t52,t54,t55;
    private Context context = this;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        try {
            content = new Content(getApplicationContext());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


        //reference objects
        ima= findViewById(R.id.imageView3);
        sch= findViewById(R.id.searcch);
        t1= findViewById(R.id.textView8);
        t2= findViewById(R.id.textView9);
        t3= findViewById(R.id.textView10);
        t4= findViewById(R.id.textView11);
        t5= findViewById(R.id.textView12);
        t6= findViewById(R.id.textView13);

        // t56= findViewById(R.id.textView56);
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
        //set close listener.
        sch.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                t1.setText(" ");
                t2.setText(" ");
                t3.setText(" ");
                t4.setText(" ");
                t5.setText(" ");
                t6.setText(" ");

                t1.setBackgroundResource(0);
                t3.setBackgroundResource(0);
                return true;
            }
        });





        //add event to create a match
        sch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @SuppressLint({"Range", "ResourceType"})
            @Override
            public boolean onQueryTextSubmit(String s) {

                String  toStr = new SrinMatch(s.trim()).checkMAtch();


                content.insert(Uri.EMPTY ,new ContentValues());

                if ( toStr.equals("afr") || toStr.equals("afri") || toStr.equals("africa") || toStr.equals("african")|| toStr.equals("a") || toStr.equals("af")) {

                    //content.insert(Uri.EMPTY, new ContentValues());

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        cursor = content.query(Uri.EMPTY, null, null, null);
                    }

                    if (cursor != null && cursor.moveToFirst()) {
                        DataStringText();

                        // TextView tes   =   findViewById(R.id.textView8);
                        t1.setBackgroundResource(R.drawable.cake);


                                   /*   ImageView imageView = new ImageView(context);
                               imageView.setLayoutParams(new ViewGroup.LayoutParams(45,50));
                               imageView.setBackgroundColor(Color.DKGRAY);

                        setContentView( imageView);*/

                        //t6.setText("\t\t\tNouNou Restaurant 🍴🍴");
                    }

                    Log.println(Log.WARN,"TAG", "Is it right "+ getResources().getString(R.drawable.cake));//Arrays.toString(cursor.getColumnNames()));

                }
                else if ( toStr.equals("hai") || toStr.equals("hait") || toStr.equals("ha") || toStr.equals("haiti")|| toStr.equals("h")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        cursor = content.query(Uri.EMPTY, null, null, null);
                    }
                    if (cursor != null && cursor.moveToFirst()) {

                        t1.setBackgroundResource(R.drawable.cake);
                        t2.setText(cursor.getString( 2));
                        //To be replace
                        t3.setBackgroundResource(R.drawable.ronise);
                        t4.setText(cursor.getString( 4));
                        t5.setText(cursor.getString( 5));
                        t6.setText(cursor.getString( 3));
                    }

                }
                else if ( toStr.equals("cub") || toStr.equals("cuba") || toStr.equals("cubain") || toStr.equals("cu")|| toStr.equals("c") || toStr.equals("cubai")|| toStr.equals("cuban")) {

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        cursor = content.query(Uri.EMPTY, null, null, null);
                    }
                    if (cursor != null && cursor.moveToFirst()) {

                        t1.setBackgroundResource(R.drawable.merchan);
                        t2.setText(cursor.getString( 3));
                        //To be replace
                        t3.setBackgroundResource(R.drawable.breakfast);
                        t4.setText(cursor.getString( 1));
                        t5.setText(cursor.getString( 2));
                        t6.setText(cursor.getString( 5));
                    }
                }
                else if ( toStr.equals("j") || toStr.equals("ja") || toStr.equals("jam") || toStr.equals("jama")||
                        toStr.equals("jamai") || toStr.equals("jamaic") || toStr.equals("jamaica")|| toStr.equals("jamaican")) {

                    // t1.setText(new SrinMatch(s).checkMAtch());
                    // t1.setText("\t\t\tJamaica's Best 🍽️");
                    //t2.setText("\t\t\tLas Delicias Colombianas 🍴");
                    //To be replace
                   /* t3.setBackgroundResource(R.drawable.breakfast);
                    t4.setText("Raphael Restaurant 🍴");
                    t5.setText("COOL SHADE 🍽️");
                    t6.setText("JoJo Restaurant 🍴");*/

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        cursor = content.query(Uri.EMPTY, null, null, null);
                    }
                    if (cursor != null && cursor.moveToFirst()) {

                        t1.setBackgroundResource(R.drawable.asparagus);
                        t2.setText(cursor.getString( 2));
                        //To be replace
                        t3.setBackgroundResource(R.drawable.sweetpotatoes);
                        t4.setText(cursor.getString( 5));
                        t5.setText(cursor.getString( 3));
                        t6.setText(cursor.getString( 4));
                    }

                }
                else{
                    t1.setText(new SrinMatch(s).checkMAtch());
                    t1.setBackgroundResource(0);
                    t2.setBackgroundResource(0);
                    t2.setText(" ");
                    t3.setBackgroundResource(0);
                    t3.setText(" ");
                    t4.setText(" ");
                    t4.setBackgroundResource(0);
                    t5.setText(" ");
                    t5.setBackgroundResource(0);
                    t6.setText(" ");
                    t6.setBackgroundResource(0);


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
                //t2.setText("recent");

            }
        });

        sch.setQueryRefinementEnabled(true);



        t54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t52.setText("");
                t57.setText("___________");
                t58.setText(" ");

                t1.setBackgroundResource(R.drawable.vegetables);
                //To be replace

                content.insert(Uri.EMPTY ,new ContentValues());

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    cursor = content.query(Uri.EMPTY, null, null, null);
                }
                if (cursor != null && cursor.moveToFirst()) {
                    t1.setText(" ");
                    t1.setBackgroundResource(R.drawable.vegetables);
                    t2.setText(cursor.getString( 3));
                    //To be replace
                    t3.setBackgroundResource(R.drawable.breakfast);
                    t4.setText(cursor.getString( 4));
                    t5.setText(cursor.getString( 2));
                    t6.setText(cursor.getString( 5));
                }


            }
        });

        t55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t57.setText("");
                t58.setText("________");
                t52.setText("");
                //To be replace

                content.insert(Uri.EMPTY ,new ContentValues());

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    cursor = content.query(Uri.EMPTY, null, null, null);
                }

                if (cursor != null && cursor.moveToFirst()) {
                    t1.setText(" ");
                    t1.setBackgroundResource(R.drawable.salmon);
                    t2.setText(cursor.getString( 1));
                    //To be replace
                    t3.setBackgroundResource(R.drawable.teriyaki);
                    t4.setText(cursor.getString( 3));
                    t5.setText(cursor.getString( 4));
                    t6.setText(cursor.getString( 2));
                }

            }
        });

        t52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t57.setText("");
                t58.setText(" ");
                t52.setText("___");


                content.insert(Uri.EMPTY ,new ContentValues());

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    cursor = content.query(Uri.EMPTY, null, null, null);
                }
                if (cursor != null && cursor.moveToFirst()) {
                    t1.setText(" ");
                    t1.setBackgroundResource(R.drawable.cheeseburger1558041280);
                    t2.setText(cursor.getString( 2));
                    //To be replace
                    t3.setBackgroundResource(R.drawable.sushi);
                    t4.setText(cursor.getString( 5));
                    t5.setText(cursor.getString( 1));
                    t6.setText(cursor.getString( 4));
                }

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
       // Toast.makeText(getApplicationContext(),"Do you want to go back", Toast.LENGTH_SHORT);
        super.onBackPressed();
    }

    // Show the text tring
    public void DataStringText(){
        Random random = new Random();
        t1.setBackgroundResource(R.drawable.cake);
        t1.setText(" ");
        t2.setText(cursor.getString(1));
        t3.setBackgroundResource(R.drawable.pizza);
        t4.setText(cursor.getString( 3));
        t5.setText(cursor.getString( 4));
        t6.setText(cursor.getString( 2));

    }

}