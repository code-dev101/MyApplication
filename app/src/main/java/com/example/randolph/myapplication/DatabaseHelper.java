package com.example.randolph.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Randolph on 1/22/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String PRODUCT_DB      = "product.db";

    private static final String PRODUCT_TBL     = "product_tbl";
    private static final String ID              = "prod_id";
    private static final String NAME            = "prod_name";
    private static final String CATEGORY        = "prod_cat";
    private static final String PRICE           = "prod_price";
    private static final String QTY             = "prod_qty";

    private static final String SALES_TBL       = "sales_tbl";


    private static final String CUSTOMER_TBL    = "customer_tbl";





    public DatabaseHelper(Context context) {
        super(context, STUDENT_DB, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + STUDENT_TBL + " (" +
                "SID VARCHAR," +
                "FNAME VARCHAR," +
                "LNAME VARCHAR," +
                "EMAILADD VARCHAR," +
                "PASSWORD VARCHAR);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+STUDENT_TBL);
        onCreate(db);
    }

    public boolean insertData(Product product) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(SID, student.getStudentID());
        contentValues.putAll(student_info(student));
        long result = db.insert(STUDENT_TBL, null, contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+STUDENT_TBL,null);
        return res;
    }

    public ContentValues student_info(Student student){
        ContentValues contentValues = new ContentValues();
        contentValues.put(FNAME,student.getFirstName());
        contentValues.put(LNAME,student.getLastName());
        contentValues.put(EMAIL,student.getEmail());
        contentValues.put(PASS, student.getPassword());

        return contentValues;
    }

    public boolean updateData(Student student) {

        String sid = student.getStudentID();
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.putAll(student_info(student));
        db.update(STUDENT_TBL, contentValues, "SID = ?",new String[] { sid });
        return true;
    }

    public Integer deleteData (String sid) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(STUDENT_TBL, "SID = ?",new String[] {sid});
    }
}
