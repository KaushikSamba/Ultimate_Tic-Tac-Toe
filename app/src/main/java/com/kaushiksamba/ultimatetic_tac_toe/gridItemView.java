package com.kaushiksamba.ultimatetic_tac_toe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

public class gridItemView extends GridView
{
    public gridItemView(Context context) {
        super(context);
    }

    public gridItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public gridItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);        //Makes the height equal to the width
    }
}
