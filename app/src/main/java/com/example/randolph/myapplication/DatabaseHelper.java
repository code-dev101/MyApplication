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
    private static final String MYAPP_DB        = "myapp.db";

    private static final String PRODUCT_TBL     = "product_tbl";
    private static final String PROD_ID         = "prod_id";
    private static final String DESC            = "prod_desc";
    private static final String CATEGORY        = "category";
    private static final String PRICE           = "price";
    private static final String QTY             = "qty";

    private static final String SALES_TBL       = "sales_tbl";
    private static final String SALES_ID        = "sales_id";
    private static final String DATE            = "sales_date";
    private static final String sPROD_ID        = "prod_id";
    private static final String SALES_QTY       = "qty";
    private static final String AMOUNT          = "amount";

    private static final String CUSTOMER_TBL    = "customer_tbl";
    private static final String CUSTOMER_ID     = "customer_name";
    private static final String NAME            = "customer_id";
    private static final String ADDRESS         = "address";
    private static final String CONTACT         = "contact";
    private static final String EMAIL           = "email";

    public DatabaseHelper(Context context) {
        super(context, MYAPP_DB, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + PRODUCT_TBL + " (" +
                PROD_ID     + " VARCHAR PRIMARY KEY," +
                DESC        + " VARCHAR," +
                CATEGORY    + " VARCHAR," +
                PRICE       + " DECIMAL(10,2)," +
                QTY         + " INTEGER);");

        db.execSQL("CREATE TABLE IF NOT EXISTS " + SALES_TBL + " (" +
                SALES_ID    + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                DATE        + " VARCHAR," +
                sPROD_ID    + " VARCHAR," +
                SALES_QTY   + " INTEGER," +
                AMOUNT      + " DECIMAL(10,2));");

        db.execSQL("CREATE TABLE IF NOT EXISTS " + CUSTOMER_TBL + " (" +
                CUSTOMER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                NAME        + " VARCHAR," +
                ADDRESS     + " VARCHAR," +
                CONTACT     + " VARCHAR," +
                EMAIL       + " VARCHAR);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + PRODUCT_TBL);
        db.execSQL("DROP TABLE IF EXISTS " + SALES_TBL);
        db.execSQL("DROP TABLE IF EXISTS " + CUSTOMER_TBL);
        onCreate(db);
    }

    public Cursor getProducts() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM "+ PRODUCT_TBL,null);
        close();
        return res;
    }

    public Cursor getSales() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM "+ SALES_TBL,null);
        close();
        return res;
    }

    public Cursor getCustomers() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM "+ CUSTOMER_TBL,null);
        close();
        return res;
    }

    public boolean updateProuct(Product product) {
        SQLiteDatabase db = this.getWritableDatabase();
        String ID = product.getID();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DESC, product.getDescription());
        contentValues.put(CATEGORY, product.getCategory());
        contentValues.put(PRICE, product.getPrice());
        contentValues.put(QTY, product.getQty());
        long result = db.update(PRODUCT_TBL, contentValues, PROD_ID + " = ?",new String[] { ID });
        close();
        if(result == -1)
            return false;
        else
            return true;
    }

    public boolean updateCustomer(Customer customer) {
        String ID = customer.getID();
        ContentValues contentValues = new ContentValues();
        contentValues.put(NAME, customer.getName());
        contentValues.put(ADDRESS, customer.getAddress());
        contentValues.put(CONTACT, customer.getContact());
        contentValues.put(EMAIL, customer.getEmail());

        SQLiteDatabase db = this.getWritableDatabase();
        long result = db.update(CUSTOMER_TBL, contentValues, CUSTOMER_ID + " = ?",new String[] { ID });
        close();
        if(result == -1)
            return false;
        else
            return true;
    }

    public boolean deleteProduct(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        long result = db.delete(PRODUCT_TBL, PROD_ID + " = ?",new String[] {id});
        if(result == -1)
            return false;
        else
            return true;
    }

    public boolean deleteCustomer(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        long result = db.delete(CUSTOMER_TBL, CUSTOMER_ID + " = ?",new String[] {id});
        if(result == -1)
            return false;
        else
            return true;
    }

    public boolean newProduct(Product product) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(PROD_ID, product.getID());
        contentValues.put(DESC, product.getDescription());
        contentValues.put(CATEGORY, product.getCategory());
        contentValues.put(PRICE, product.getPrice());
        contentValues.put(QTY, product.getQty());





        SQLiteDatabase db = this.getWritableDatabase();
        long result = db.insert(PRODUCT_TBL, null, contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public boolean newSales(Sales sales) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(SALES_ID, "null");
        contentValues.put(DATE, sales.getSalesDate());
        contentValues.put(sPROD_ID, sales.getProdID());
        contentValues.put(SALES_QTY, sales.getQty());
        contentValues.put(AMOUNT, sales.getAmount());

        SQLiteDatabase db = this.getWritableDatabase();
        long result = db.insert(SALES_TBL, null, contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public boolean newCustomer(Customer customer) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(CUSTOMER_ID, "null");
        contentValues.put(NAME, customer.getName());
        contentValues.put(ADDRESS, customer.getAddress());
        contentValues.put(CONTACT, customer.getContact());
        contentValues.put(EMAIL, customer.getEmail());

        SQLiteDatabase db = this.getWritableDatabase();
        long result = db.insert(CUSTOMER_TBL, null, contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }


}
