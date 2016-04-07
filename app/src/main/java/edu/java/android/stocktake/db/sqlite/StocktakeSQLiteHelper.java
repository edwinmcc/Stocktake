package edu.java.android.stocktake.db.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by egnanasigamony on 8/04/2016.
 */
public class StocktakeSQLiteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="stocktake.db";
    private static final int DATABASE_VERSION=1;

    public StocktakeSQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            createTables();
        }
        catch(Exception ex) {

        }
    }

    private List<String> getCreateTablesScript() {
        List<String> createTablesScript=new ArrayList<>();
        String batchesScript="CREATE TABLE IF NOT EXISTS BATCHES( "

        return createTablesScript;
    }

    private void createTables() throws SQLiteException {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
