package edu.java.android.stocktake.db.dao.intf;

import android.database.sqlite.SQLiteException;

import java.util.List;
import java.util.Properties;

import edu.java.android.stocktake.model.Batch;
import edu.java.android.stocktake.model.BatchItem;

/**
 * Created by egnanasigamony on 8/04/2016.
 */
public interface BatchDAO {

    public void addItemToBatch(BatchItem be);
    public void removeItemFromBatch(BatchItem be);
    public void updateBatchItem(BatchItem be);

    /**
     * Created by egnanasigamony on 8/04/2016.
     */

}
