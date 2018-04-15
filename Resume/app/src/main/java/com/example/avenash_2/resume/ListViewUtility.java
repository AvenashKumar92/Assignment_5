package com.example.avenash_2.resume;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListViewUtility {
    private static final ListViewUtility ourInstance = new ListViewUtility();

    public static ListViewUtility getInstance() {
        return ourInstance;
    }

    private ListViewUtility() {
    }

    public ArrayAdapter<String> createAdapter(final Context context, final String[] lstData){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,lstData){
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                /// Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                TextView tv = view.findViewById(android.R.id.text1);

                // Set the text size 25 dip for ListView each item
                tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, context.getResources().getInteger(R.integer.txtSizeNormal));

                // Return the view
                return view;
            }
        };
        return adapter;
    }
}
