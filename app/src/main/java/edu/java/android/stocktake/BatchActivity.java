package edu.java.android.stocktake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.Date;

import edu.java.android.stocktake.R;
import edu.java.android.stocktake.model.BatchEntry;
import edu.java.android.stocktake.model.BatchModel;

public class BatchActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private BatchModel bm=new BatchModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batch);
        addContentToListView();
        Button addBtn=(Button)findViewById(R.id.btnAddBatch);
        addBtn.setFocusable(true);
        addBtn.setFocusableInTouchMode(true);
        addBtn.requestFocus();
    }

    private void addContentToListView()
    {
        ListView lv=(ListView)findViewById(R.id.listBatchNames);
        lv.setOnItemClickListener(this);
        for(int i=0;i<5;i++)
        {
            BatchEntry be=new BatchEntry();
            be.setBatchName("Batch - "+i);
            be.setItemCount(Long.valueOf(i * 100 + i));
            be.setLastAccessedDate(new Date());
            bm.addEntry(be);
        }
        lv.setAdapter(bm);
    }

    @Override
    public void onItemClick(AdapterView listView, View row, int position, long id) {

    }
}
