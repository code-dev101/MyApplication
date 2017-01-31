package com.example.randolph.myapplication;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by user on 1/27/2017.
 */

public class DbQuery {
    static SQLiteDatabase db;
    static Cursor c;
    private static final String Table_NAME = "Table_user";
    private static final String Table_Order= "Table_order";
    private static final String User_id = "User_ID";
    private static final String Fname = "Firstname";
    private static final String Lname = "Lastname";
    private static final String Studno = "Student_number";
    private static final String Schoolname = "School_name";
    private static final String Order_id = "Order_ID";
    private static final String Quantity = "Quantity";
    private static final String TotalAmount = "Total";
    private static final String Product_id = "Prod_id";
    private static final String Price = "Prod_price";



    private static final String TABLE_PRODUCT = "Table_product";
    ///USERACCOUNT

    public void createTable(Activity activity){
            db = activity.openOrCreateDatabase("Proware", Context.MODE_PRIVATE,null);
            db.execSQL("CREATE TABLE IF NOT EXISTS  "+Table_NAME+" ("+User_id+"  INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    ""+Fname+" VARCHAR, "+Lname+" VARCHAR, "+Studno+" VARCHAR, "+Schoolname+" Varchar);");

//            db.execSQL("CREATE TABLE IF NOT EXISTS "+TABLE_PRODUCT+" ("+Product_id+" VARCHAR PRIMARY KEY , "++"); ");
//            db.execSQL("CREATE TABLE IF NOT EXISTS "+Table_Order+"("+Order_id+" );");


    }

    public void insertProduct(){

    }

}
