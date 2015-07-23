package com.kaushiksamba.ultimatetic_tac_toe;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;


public class MainActivity extends Activity {
    private boolean isPlayerOneTurn = true;
    private boolean isPlaying = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setGridView();
    }

    private int getScreenWidth() {
        Display display = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        return point.x;
    }

    private void setGridView() {
        GridView gridView = (GridView) findViewById(R.id.color_grid);
        viewAdapter adapter = new viewAdapter(this, 9, false);
        gridView.setColumnWidth(getScreenWidth() / 3);
        gridView.setAdapter(adapter);
    }

    public class viewAdapter extends BaseAdapter {
        private Context context;
        private LayoutInflater inflater;
        private int num_items;
        private nestedViewAdapter adapter;

        public viewAdapter(Context context, int num_items, boolean isNested) {
            super();
            this.context = context;
            this.num_items = num_items;
            adapter = new nestedViewAdapter(this.context,9);
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
            item.setNumColumns(3);
            item.setColumnWidth(view.getWidth()/3);
            item.setAdapter(adapter);
            item.setBackgroundColor(Color.BLUE);
            return view;
        }
    }
}
