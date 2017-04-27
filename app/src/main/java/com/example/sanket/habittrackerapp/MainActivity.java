package com.example.sanket.habittrackerapp;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.sanket.habittrackerapp.data.HabitContract.HabitEntry;

import com.example.sanket.habittrackerapp.data.HabitContract;
import com.example.sanket.habittrackerapp.data.HabitDbHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void insertHabit()
    {
        HabitDbHelper mDbHelper = new HabitDbHelper(this);
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(HabitEntry.COLUMN_HABIT_NAME, "Drink Water");
        values.put(HabitEntry.COLUMN_HABIT_DETAILS, "Drink 10 glasses of water per day");
        values.put(HabitEntry.COLUMN_HABIT_WEEKLY, HabitEntry.HABIT_SEVEN_DAY);
        values.put(HabitEntry.COLUMN_HABIT_REMINDER, 8.00);
        values.put(HabitEntry.COLUMN_HABIT_TRACK, HabitEntry.HABIT_ONE_DAY);

        long newRowId = db.insert(HabitEntry.TABLE_NAME, null, values);
    }

    private void displayHabit()
    {
        HabitDbHelper mDbHelper = new HabitDbHelper(this);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        String[] projection = {
                HabitEntry._ID,
                HabitEntry.COLUMN_HABIT_NAME,
                HabitEntry.COLUMN_HABIT_DETAILS,
                HabitEntry.COLUMN_HABIT_REMINDER
        };

            Cursor cursor = db.query(
                    HabitEntry.TABLE_NAME,
                    projection,
                    null,
                    null,
                    null,
                    null,
                    null);

            cursor.close();

    }
}
