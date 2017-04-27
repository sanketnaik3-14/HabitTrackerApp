package com.example.sanket.habittrackerapp.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.sanket.habittrackerapp.data.HabitContract.HabitEntry;

/**
 * Created by sanket on 27/04/17.
 */

public class HabitDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "tracker.db";

    public HabitDbHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_ENTRIES =
                "CREATE TABLE" + HabitEntry.TABLE_NAME + " ("
                + HabitEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + HabitEntry.COLUMN_HABIT_NAME + " TEXT NOT NULL, "
                + HabitEntry.COLUMN_HABIT_DETAILS + " TEXT NOT NULL, "
                + HabitEntry.COLUMN_HABIT_WEEKLY + " INTEGER NOT NULL, "
                + HabitEntry.COLUMN_HABIT_REMINDER + " REAL DEFAULT 8.30, "
                + HabitEntry.COLUMN_HABIT_TRACK + " INTEGER DEFAULT 0);";

        db.execSQL(SQL_CREATE_ENTRIES);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
