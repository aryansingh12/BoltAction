package com.hackumass.med.boltaction.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Aryan Singh on 10/13/2018.
 */

public class MedOpenHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "med_db";
    public static final int VERSION = 1;

    private static MedOpenHelper instance;
    public MedOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    public static MedOpenHelper getInstance(Context context) {
        if(instance == null)
            instance = new MedOpenHelper(context.getApplicationContext());
        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String user_table = "CREATE TABLE " + Contract.User.TABLE_NAME +  " ( " +
                Contract.User.COLUMN_ID +  " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Contract.User.COLUMN_GROUND + " TEXT, " +
                Contract.User.COLUMN_TIME + " LONG DEFAULT 0 " +
                Contract.User.COLUMN_SPORT + " TEXT, " +
                " )";

        db.execSQL(user_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
