package com.kaushiksamba.ultimatetic_tac_toe;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

public class nestedViewAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private int num_items;

    public nestedViewAdapter(Context context, int num_items) {
        super();
        this.context = context;
        this.num_items = num_items;
        inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return num_items;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        view = inflater.inflate(R.layout.each_grid_item, parent, false);
        gridItemView item = (gridItemView) view.findViewById(R.id.color_image);
        item.setBackgroundColor(Color.YELLOW);
        return view;
    }
}
