package com.example.averla;

/*
An attempt to build a database

Author: Andy Duverneau



 */

import android.content.ContentValues;

public class ContentValue
{



private ContentValues contentValues;

//Construct a constant value

ContentValue(ContentValues contentValue)
 {

 this.contentValues = contentValue;

  //Create a constant value
  contentValues = new ContentValues();
  /*contentValues.put(String.valueOf(DataHolderClass.arr[DataHolderClass.ZERO]), DataHolderClass.SPACEZ+" "+DataHolderClass.AFRES_1);
  contentValues.put(String.valueOf(DataHolderClass.arr[DataHolderClass.ONE] ) ,DataHolderClass.SPACEZ+" "+DataHolderClass.AFRES_2);
  contentValues.put(String.valueOf(DataHolderClass.arr[DataHolderClass.TWO]) ,DataHolderClass.SPACEZ+" "+DataHolderClass.AFRES_3);
  contentValues.put(String.valueOf(DataHolderClass.arr[DataHolderClass.THREE]) ,DataHolderClass.SPACEZ+" "+DataHolderClass.AFRES_4);
  contentValues.put(String.valueOf(DataHolderClass.arr[DataHolderClass.FOUR]) ,DataHolderClass.SPACEZ+" "+DataHolderClass.AFRES_5);*/

 }

  // Return a constant value object
  public ContentValues getContentValue()
  {
    return contentValues;
  }
}
