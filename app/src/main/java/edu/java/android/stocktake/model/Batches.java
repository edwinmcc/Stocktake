package edu.java.android.stocktake.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by egnanasigamony on 8/04/2016.
 */
public class Batches {
    private List<Batch> batchEntryList=new ArrayList<Batch>();

    public int getSize()
    {
        return batchEntryList.size();
    }

    public Batch getBatch(int index)
    {
        return batchEntryList.get(index);
    }


}
