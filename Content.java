package com.example.averla;
/*

This content provider class is there to link application data
This create a data base. It contains all the sensitive data for our application.

Author: Andy Duverneau

 */
import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Vector;

public class Content extends ContentProvider {
    private SQLiteDatabase sqLiteDatabase;
    private Context context;
    private static Cursor curso;
    private final String COLUNM_NAME[] = new String[5];
    //create a vector
    Vector vector = new Vector<>();

    //crate a contant value
    private static ContentValues contentVal;

    //create object values
    ObjectValue objectValue;
    //........................
    private ContentValue contentValue;

    MatCursor matCursor = new  MatCursor( new MatrixCursor(COLUNM_NAME));
         /*  context = context.getApplicationContext();
         sqLiteDatabase = new Helper(context).getReadableDatabase();*/

    public Content(Context context) throws IllegalAccessException, InstantiationException {
        this.context = context;
    }

    @Override
    public boolean onCreate() {

        return true;
    }

    @SuppressLint("SuspiciousIndentation")
    @Nullable
    @Override
    public Cursor query(@NonNull Uri NotInUse, @Nullable String[] strings, @Nullable String s, @Nullable String[] strings1, @Nullable String s1) {


    /*    if(context != null)
            sqLiteDatabase = new Helper(context).getReadableDatabase();
        if(sqLiteDatabase != null)
        curso = sqLiteDatabase.rawQuery( "SELECT * FROM Restaurant", null);*/
        //Log.println(Log.WARN,"TAG", "My data base is open "+ sqLiteDatabase.getPath());
        return  curso; //matCursor.getMatrixCursor();
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri NotInUse, @Nullable ContentValues contentValues) {

        if(context != null)
         sqLiteDatabase = new Helper(context).getReadableDatabase();
        if(sqLiteDatabase != null)
         curso = sqLiteDatabase.rawQuery( "SELECT * FROM Restaurant", null);

        //create a constant value
        contentValue = new ContentValue(contentValues);

        contentVal = contentValue.getContentValue();
        //create an object value
        objectValue = new ObjectValue(contentVal);

        //add row object
        matCursor.addRRow(objectValue);

        return NotInUse;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }

}
