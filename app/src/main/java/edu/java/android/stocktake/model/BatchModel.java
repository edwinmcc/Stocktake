package edu.java.android.stocktake.model;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.java.android.stocktake.R;

/**
 * Created by egnanasigamony on 4/04/2016.
 */
public class BatchModel extends BaseAdapter {

    private List<BatchEntry> batchEntryList=new ArrayList<BatchEntry>();
    private SimpleDateFormat sdf=null;

    public BatchModel()
    {
        sdf=new SimpleDateFormat("dd/MM/yyyy hh:mm a");
    }

    @Override
    public int getCount() {
        return batchEntryList.size();
    }

    @Override
    public Object getItem(int position) {
        return batchEntryList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private String getLastUsedDateString(Date dt)
    {
        if(dt==null)
        {
            return "";
        }
        return "Last Used: "+sdf.format(dt);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context=parent.getContext();
        BatchEntry be=batchEntryList.get(position);
        BatchEntryViewHolder bevh=null;
        if(convertView==null)
        {
            //COMMENT: convertView corresponds to a row in a ListView.  If it is null, it is a new entry.  It needs to be constructed.
            bevh=new BatchEntryViewHolder();
            LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.batch_entry,parent,false);
            TextView txtBatchName=(TextView)convertView.findViewById(R.id.lbl_BatchName);
            TextView txtBatchCount=(TextView)convertView.findViewById(R.id.lbl_BatchItemCount);
            TextView txtLastUsedDate=(TextView)convertView.findViewById(R.id.lbl_BatchLastUsedDate);
            bevh.setBatchName(txtBatchName);
            bevh.setItemCount(txtBatchCount);
            bevh.setLastUsedDate(txtLastUsedDate);
            convertView.setTag(bevh);
        }
        else
        {
            bevh=(BatchEntryViewHolder)convertView.getTag();
        }
        bevh.getBatchName().setText(be.getBatchName());
        bevh.getItemCount().setText(be.getItemCount().toString());
        bevh.getLastUsedDate().setText(getLastUsedDateString(be.getLastAccessedDate()));
        return convertView;
    }

    // COMMENT: Methods to add/remove entries from List
    public void addEntry(BatchEntry entry)
    {
        batchEntryList.add(entry);
        notifyDataSetChanged();
    }

    public void removeEntry(BatchEntry entry)
    {
        batchEntryList.remove(entry);
        notifyDataSetChanged();
    }

    public void removeEntry(int position)
    {
        batchEntryList.remove(position);
        notifyDataSetChanged();
    }

}
