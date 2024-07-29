package com.example.averla;




/* This class is a data base. But it's not currently in use
 The project was updated to include a SQL database that is more efficient
 I am keeping here for back up.

 Author: Andy Duverneau

 */


import android.database.MatrixCursor;
//Create a MatCursor class to handle a MatrixCursor
public class MatCursor {
    private MatrixCursor matrixCursor;
    //construct a Matrix Cursor
    public MatCursor(MatrixCursor matrixCursor) {
        this.matrixCursor = matrixCursor;

    }

    // Return the cursor
    public MatrixCursor getMatrixCursor() {
        return matrixCursor;
    }

    // Add a row
    public  void  addRRow(ObjectValue objectValue){

        matrixCursor.addRow(objectValue.objects());

    }
}
