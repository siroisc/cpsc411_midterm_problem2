package com.example.problem2_click_counter;

import android.app.Activity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ListAdapter;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

import com.example.problem2_click_counter.R;

import java.util.ArrayList;

public class ClickCounter extends Activity  {


    private int c1 = 0;
    private int c2 = 0;
    private int c3 = 0;
    private int c4 = 0;
    protected ListView click_LV;

    public ClickCounter() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.counter_listview));
        click_LV = (ListView) findViewById(R.id.list);

        final ArrayList<String> itemArray = new ArrayList<String>();
        itemArray.add("Counter");
        itemArray.add("0");
        itemArray.add("0");
        itemArray.add("0");

        final ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.lv_items, R.id.item_lv, itemArray);
        click_LV.setAdapter(arrayAdapter);
        click_LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int pos, long id) {
                if( pos == 1) {
                    c1++;
                    itemArray.set(1, new String(Integer.toString(c1)));
                    arrayAdapter.notifyDataSetChanged();;
                }
                if( pos == 2) {
                    c2++;
                    itemArray.set(2, new String(Integer.toString(c2)));
                    arrayAdapter.notifyDataSetChanged();;
                }
                if( pos == 3) {
                    c3++;
                    itemArray.set(3, new String(Integer.toString(c3)));
                    arrayAdapter.notifyDataSetChanged();;
                }
            }
        });

    }
/*
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }*/
}