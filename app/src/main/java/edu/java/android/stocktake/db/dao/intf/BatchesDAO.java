package edu.java.android.stocktake.db.dao.intf;

import android.database.sqlite.SQLiteException;

import java.util.List;
import java.util.Properties;

import edu.java.android.stocktake.model.Batch;

/**
 * Created by egnanasigamony on 8/04/2016.
 */

public interface BatchesDAO {

    public List<Batch> getBatches() throws SQLiteException;
    public void addBatch(Batch be) throws SQLiteException;
    public void removeBatch(Batch be) throws SQLiteException;
    public void updateBatch(Properties modifyParams) throws SQLiteException;

}