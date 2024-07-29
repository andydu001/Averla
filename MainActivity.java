/*

Class main activity configures and references layout objects

Author: Andy Duverneau

Date 7/2024
 */

package com.example.averla;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Camera;
import android.graphics.Color;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraOfflineSession;
import android.hardware.camera2.CaptureFailure;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.Executor;


public class MainActivity extends AppCompatActivity {
    private Button btn, btn1, ima2, ima8, ima7;
    private SearchView src;
    private TextView txt, txt2, txt3;
    private ImageView imav, ima5, ima9;
    private SQLiteDatabase sq;
    private SQLiteDatabase.OpenParams pa;
    private AvList avList;
    private ScrollView scrollView;
    private HorizontalScrollView ho, hori, hori1;
    private final int ReadAnWriteMode = SQLiteDatabase.OPEN_READWRITE;
    private SQLiteDatabase sqLiteDatabase;
    private static Cursor curso;
    private Activity activity = this;
    private Camera camera;
    CameraCharacteristics ca;
    private final int REQUESTCODE =0;
    private CameraDevice cameraDevice;
    private CameraCaptureSession session;
    private CameraOfflineSession offlineSession;
    private CaptureFailure captureFailure;
    private CameraCharacteristics cameraCharacteristics;

    @RequiresApi(api = Build.VERSION_CODES.S)
    @SuppressLint({"MissingInflatedId", "WrongConstant"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Executor executor = getMainExecutor();
/*
       Anima ani = new Anima();
         //  CreateHelp createHelp = new CreateHelp();
       //  System.out.println(createHelp.getDatabasePath("Dras.db").getName());
       ani.query(Uri.parse("C:\\Users\\andyd\\OneDrive\\Documents\\CADA.txt"), null, null,null, null);
       */ //get reference to layout objects
        imav = findViewById(R.id.imageView);
        ima2 = findViewById(R.id.button77);
        ima5 = findViewById(R.id.imageView5);
        ima9 = findViewById(R.id.imageView9);
        ima7 = findViewById(R.id.button76);
        ima8 = findViewById(R.id.button14);

        //ima8 = findViewById(R.id.button10);
        scrollView = findViewById(R.id.scroll);
        txt2 = findViewById(R.id.textView2);
        txt = findViewById(R.id.textView);
        txt3 = findViewById(R.id.textView3);
        // ho = findViewById(R.id.hori1);
        hori = findViewById(R.id.hori);
        hori1 = findViewById(R.id.hori1);
        btn = findViewById(R.id.button);
        btn1 = findViewById(R.id.button2);
        //scrollView = findViewById(R.id.scroll);



        btn.setBackgroundColor(Color.DKGRAY);
        btn1.setBackgroundColor(Color.WHITE);
        //configure objects
        src = findViewById(R.id.src);
        src.setScrollX(SearchView.SCROLL_AXIS_HORIZONTAL);
        src.setQueryHint("food drink dessert");
        src.setInputType(SearchView.SYSTEM_UI_FLAG_FULLSCREEN);
        src.setBackgroundColor(Color.LTGRAY);
        src.setQueryRefinementEnabled(true);
        src.setSubmitButtonEnabled(true);

        // scrollView.setSmoothScrollingEnabled(true);
        scrollView.setVerticalScrollBarEnabled(false);

        // hori.setHorizontalScrollBarEnabled(false);
        hori.setHorizontalScrollBarEnabled(false);
        hori1.setHorizontalScrollBarEnabled(false);
        hori.setVerticalScrollBarEnabled(false);
        hori1.setVerticalScrollBarEnabled(false);
        //add a query text listener
        src.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                Toast.makeText(getApplicationContext(), s + " submitted ", Toast.LENGTH_LONG).show();
                Intent inte = new Intent(MainActivity.this, Menu1.class);
                startActivity(inte);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                return false;
            }
        });



        src.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this, Menu1.class);
                startActivity(inte);

            }
        });


        src.setOnSuggestionListener(new SearchView.OnSuggestionListener() {
            @Override
            public boolean onSuggestionSelect(int i) {
                return true;
            }

            @Override
            public boolean onSuggestionClick(int i) {
                return true;
            }
        });

        // src.setInputType(WindowInsets.Type.systemGestures());

        ima5.setColorFilter(Color.BLACK);
        ima9.setColorFilter(Color.BLACK);

        //Open the camera
        ima8.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {



                Intent intent  = new Intent(Intent.ACTION_VOICE_COMMAND);
                startActivity(intent);


            }
        });


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

        txt = (TextView) findViewById(R.id.textView);

        imav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this, Profile.class);
                startActivity(inte);
            }
        });

        ima2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this, Menu.class);
                startActivity(inte);

            }
        });


        ima7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this, Menu1.class);
                startActivity(inte);
            }
        });
       /* ima8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this, Menu2.class);
                startActivity(inte);
            }
        });*/
        ima5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this, Message.class);
                startActivity(inte);
            }
        });


        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this, About.class);
                startActivity(inte);
            }
        });


        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this, Policy.class);
                startActivity(inte);
            }
        });


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:

              /*  Intent inte =new Intent(MainActivity.this ,Menu1.class);
                startActivity(inte);*/
                break;
            case MotionEvent.ACTION_UP:

                break;

            default:
                // Optional: handle other actions
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSearchRequested() {

        return super.onSearchRequested();
    }

    @Override
    public void onBackPressed() {
        //  Toast.makeText(getApplicationContext(), " Go back", Toast.LENGTH_LONG).show();
        //setContentView(R.layout.anss);
        super.onBackPressed();
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

    }

      public  Cursor getCursor(){


         sqLiteDatabase = new Helper(activity).getReadableDatabase();
         return curso = sqLiteDatabase.rawQuery(null, null);
      }

}











