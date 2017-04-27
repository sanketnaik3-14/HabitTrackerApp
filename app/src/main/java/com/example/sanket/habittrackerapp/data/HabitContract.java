package com.example.sanket.habittrackerapp.data;

import android.provider.BaseColumns;

/**
 * Created by sanket on 27/04/17.
 */

public final class HabitContract {

    private HabitContract()
    {

    }

    public static final class HabitEntry implements BaseColumns
    {

        public static final String TABLE_NAME = "habits";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_HABIT_NAME = "name";
        public static final String COLUMN_HABIT_DETAILS = "details";
        public static final String COLUMN_HABIT_WEEKLY = "weekly";
        public static final String COLUMN_HABIT_REMINDER = "reminder";
        public static final String COLUMN_HABIT_TRACK = "track";


        public static final int HABIT_ONE_DAY = 1;
        public static final int HABIT_TWO_DAY = 2;
        public static final int HABIT_THREE_DAY = 3;
        public static final int HABIT_FOUR_DAY = 4;
        public static final int HABIT_FIVE_DAY = 5;
        public static final int HABIT_SIX_DAY = 6;
        public static final int HABIT_SEVEN_DAY = 7;



    }
}
