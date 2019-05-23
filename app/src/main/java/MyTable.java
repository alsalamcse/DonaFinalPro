import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyTable extends SQLiteOpenHelper {
    private static final int DATABASAE_VERSION = 1; // RAKAM ALKA3EDA
    private static final String DATABASE_NAME = "CONTACTS_DB"; // 2isim KA3IDAT ALBAYANAT
    private static final String TABLE_CONTACTS = "CONTACTS_TBL"; // 2isim aljadwal
    private static final String KEY_ID = "_id";
    private static final String KEY_correntWieght = "correntWieght";
    private static final String KEY_lengh = "lengh";
    private static final String KEY_firstWieght = "firstWieght";
    private static final String KEY_wightNeeded = " wightNeeded";
    private static final String KEY_daysFosEndingTheDiet = "daysForEndingTheDiet";
    private static final String KEY_weightYouLost = "weightYouLost";
    private static final String KEY_startingtDate = "startingtDate";


    public MyTable(Context context) {
        super(context, DATABASE_NAME, null, DATABASAE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) /////////// تعمل مرة وحدة تبني الجدول
    {
        String sqlCreate = "CREATE TABLE " + TABLE_CONTACTS + "(" + KEY_ID + "INTEGER PRIMARY KEY," + KEY_correntWieght + "TEXT" + KEY_firstWieght + "TEXT" + KEY_lengh + "TEXT" + KEY_startingtDate + "TEXT" + ")";
        db.execSQL(sqlCreate);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) /// لعمل تغييرات على الجدول / تحديث//////////
    {
        String sqlDrop = "DROP TABLE IF EXISTS " + TABLE_CONTACTS;
        db.execSQL(sqlDrop);
        onCreate(db);
    }


    public long addWieght(WieghtUpdate weight) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_correntWieght, weight.correntWieght());
        values.put(KEY_lengh, weight.lengh());
        values.put(KEY_firstWieght, weight.firstWieght());
        values.put(KEY_startingtDate, weight.startingDate());
        long row = db.insert(TABLE_CONTACTS, null, values);
        db.close();
        return row;
    }

    public int updateWieght(WieghtUpdate weight) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_lengh, weight.lengh());
        values.put(KEY_correntWieght, weight.correntWieght());
        values.put(KEY_firstWieght, weight.firstWieght());
        values.put(KEY_startingtDate, weight.startingDate());
        int num = db.update(TABLE_CONTACTS, values, KEY_ID + "=" + weight._id(), null);
        db.close();
        return num;

    }

    public int deleteContactById(WieghtUpdate weight) {
        SQLiteDatabase db = this.getWritableDatabase();
        int num = db.delete(TABLE_CONTACTS, KEY_ID + "=" + weight._id(), null);
        db.close();
        return num;
    }

    public ArrayList<WieghtUpdate> getAllWieghts() {
        ArrayList<WieghtUpdate> contactList = new ArrayList<WieghtUpdate>();
        String selectQuery = "SELECT *  FROM " + TABLE_CONTACTS;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
       boolean flag =cursor.moveToFirst();
       while (flag==true)
            {
                WieghtUpdate weight = new WieghtUpdate();
                weight.set_id(cursor.getString(0)); /////////id
                weight.setLengh(cursor.getLong(1));///////lengh
                weight.setCorrentWieght(cursor.getDouble(2));///////current weight
                weight.setFirstWieght(cursor.getLong(3));///////first weight
                weight.setStartingDate(cursor.getInt(4));/////// starting date
                contactList.add(weight);
                while (cursor.moveToNext()) ;
            }
            return contactList;

    }
}



