package edu.java.android.stocktake.model;

import java.util.Date;

/**
 * Created by egnanasigamony on 8/04/2016.
 */

public class BatchItem {

    private long   id;
    private String barcode;
    private int    count;
    private String comment;

    public BatchItem(String barcode)
    {
        this.id=System.currentTimeMillis();
        this.barcode=barcode;
    }

    public long getId()
    {
        return id;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getScanTimestamp() {
        return new Date(id);
    }
}