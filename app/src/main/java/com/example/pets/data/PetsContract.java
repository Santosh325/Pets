package com.example.pets.data;

import android.provider.BaseColumns;

public class PetsContract {

    private PetsContract() {}
    public static abstract  class PetsEntry implements BaseColumns {
        public static final String _ID = BaseColumns._ID;
        public static final String TABLE_NAME = "pets";
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 1;
        public static final int GENDER_UNKNOWN = 1;
    }
}
