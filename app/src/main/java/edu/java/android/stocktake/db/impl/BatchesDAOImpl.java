package edu.java.android.stocktake.db.impl;

import android.database.sqlite.SQLiteException;

import java.util.List;
import java.util.Properties;

import edu.java.android.stocktake.db.dao.intf.BatchDAO;
import edu.java.android.stocktake.db.dao.intf.BatchesDAO;
import edu.java.android.stocktake.model.Batch;

/**
 * Created by egnanasigamony on 8/04/2016.
 */
public class BatchesDAOImpl implements BatchesDAO {

    @Override
    public List<Batch> getBatches() throws SQLiteException {
        return null;
    }

    @Override
    public void addBatch(Batch be) throws SQLiteException {

    }

    @Override
    public void removeBatch(Batch be) throws SQLiteException {

    }

    @Override
    public void updateBatch(Properties modifyParams) throws SQLiteException {

    }
}
