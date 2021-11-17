package com.example.a2product;
import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


public class ProductManagementHelper extends SQLiteOpenHelper{

    private static final String dbName = "ProductManagement";
    private static final int dbVersion = 1;

    ProductManagementHelper(Context context)
    {
        super(context, dbName, null, dbVersion);
    }

    private static void insertProduct(SQLiteDatabase db, String name, int StockOnHand, int StockInTransit, double price,int ReorderQuantity, int ReorderAmount)
    {
        ContentValues productValues=new ContentValues();
        productValues.put("Name", name);
        productValues.put("StockOnHand", StockOnHand);
        productValues.put("StockInTransit", StockInTransit);
        productValues.put("Price", price);
        productValues.put("ReorderQuantity", ReorderQuantity);
        productValues.put("ReorderAmount", ReorderAmount);
        db.insert("PRODUCT", null, productValues);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE PRODUCT (id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "Name TEXT,"
                + "StockOnHand INTEGER,"
                + "StockInTransit INTEGER,"
                + "Price REAL,"
                + "ReorderQuantity INTEGER,"
                + "ReorderAmount INTEGER);");



        // insertProduct(db,"Flour",10, 5, 49.90,8,10);


    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }

}
