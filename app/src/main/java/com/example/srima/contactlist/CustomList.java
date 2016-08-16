package com.example.srima.contactlist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by srima on 16-08-2016.
 */
public class CustomList extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] name;
    private final String[] number;
    public CustomList(Activity context,
                      String[] name, String[] number) {
        super(context, R.layout.list_single, name);
        this.context = context;
        this.name = name;
        this.number = number;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_single, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt1);

        TextView tx = (TextView) rowView.findViewById(R.id.txt);
        txtTitle.setText(name[position]);

        tx.setText(number[position]);
        return rowView;
    }
}
