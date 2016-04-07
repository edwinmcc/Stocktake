package edu.java.android.stocktake.model;

import android.widget.TextView;

/**
 * Created by egnanasigamony on 4/04/2016.
 */
public class BatchViewHolder {
    private TextView batchName;
    private TextView itemCount;
    private TextView lastUsedDate;

    public TextView getBatchName() {
        return batchName;
    }

    public void setBatchName(TextView batchName) {
        this.batchName = batchName;
    }

    public TextView getItemCount() {
        return itemCount;
    }

    public void setItemCount(TextView itemCount) {
        this.itemCount = itemCount;
    }

    public TextView getLastUsedDate() {
        return lastUsedDate;
    }

    public void setLastUsedDate(TextView lastUsedDate) {
        this.lastUsedDate= lastUsedDate;
    }

}
