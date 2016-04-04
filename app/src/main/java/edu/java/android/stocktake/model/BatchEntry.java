package edu.java.android.stocktake.model;

import java.util.Date;

/**
 * Created by egnanasigamony on 4/04/2016.
 */
public class BatchEntry {
    private String batchName;
    private Long   itemCount;
    private Date lastAccessedDate;


    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public Long getItemCount() {
        return itemCount;
    }

    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }

    public Date getLastAccessedDate() {
        return lastAccessedDate;
    }

    public void setLastAccessedDate(Date lastAccessedDate) {
        this.lastAccessedDate=lastAccessedDate;
    }

}
