package com.example.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.pets.data.PetsContract.PetsEntry;
import androidx.annotation.Nullable;

public class PetDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "shelter.db";


    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
      String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + PetsContract.PetsEntry.TABLE_NAME +
                "(" + PetsEntry._ID + " INTEGER PRIMARY KEY, " +
                PetsEntry.COLUMN_PET_NAME + " TEXT NOT NULL, " +
                PetsEntry.COLUMN_PET_BREED + " TEXT, " +
                PetsEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL," +
                PetsEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0 ); ";
       db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
