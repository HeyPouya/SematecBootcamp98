package com.sematec.bootcamp.eight.android;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class TestSqlHelper extends SQLiteOpenHelper {


    String TABLE_NAME = "students";

    String createTableQuery = "" +
            "CREATE TABLE " + TABLE_NAME +
            " (" +
            "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "name TEXT," +
            "family TEXT," +
            "grade INTEGER" +
            ")"
            + "";


    public TestSqlHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //DROP THE TABLE
        onCreate(db);
    }


    public void insertData(String name, String family, int grade) {
        String insertDataQuery = "" +
                "INSERT INTO " + TABLE_NAME +
                "(" +
                "name,family,grade" +
                ")" +
                "VALUES" +
                "(" +
                "'" + name + "'" + "," +
                "'" + family + "'" + "," +
                grade +
                ")" +
                "";

        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(insertDataQuery);
        db.close();


    }


    String getStudentsNames() {
        String name = "";
        String getStudentsQuery = "SELECT name FROM " + TABLE_NAME;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(getStudentsQuery, null);


        while (cursor.moveToNext()) {
            name += cursor.getString(0) + "\n";
        }

        db.close();
        return name;
    }
}
