package com.example.grapgame.starterproject.db.core;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;

import com.example.grapgame.starterproject.db.DBConstants;
import com.example.grapgame.starterproject.db.Queries;


/**
 * Created on 2016-12-03 15:01.
 *
 * @author M.Allaudin
 */
public class SQLiteHelper extends SQLiteOpenHelper {

    private SQLiteHelper(Context ctx, String name, int version) {
        super(ctx, name, null, version);
    } // SQLiteHelper

    @NonNull
    public static SQLiteHelper newInstance(Context ctx, String name, int version) {
        return new SQLiteHelper(ctx, name, version);
    }

    @Override
    public void onCreate(@NonNull SQLiteDatabase db) {
        db.execSQL(Queries.createFeed());
    } // onCreate

    /**
     * Drop all tables on upgrade and create a backup of user table.
     * Restore user table in (onCreate).
     */
    @Override
    public void onUpgrade(@NonNull SQLiteDatabase db, int oldVersion, int newVersion) {
        dropTables(db);
        onCreate(db);
    } // onUpgrade

    private void dropTables(@NonNull SQLiteDatabase db) {
        db.execSQL(Queries.drop(DBConstants.Feed.TABLE_NAME));
    } // dropTables

    public static void truncateTables(SQLiteDatabase db) {
        db.execSQL(Queries.truncate(DBConstants.Feed.TABLE_NAME));

    }//truncateTables
} // SQLiteHelper
