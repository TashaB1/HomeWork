package com.tashad16a.gmail.hw0603ui.component;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

public class SquareImageView extends AppCompatImageView {

    public SquareImageView(Context context) {
        super(context);
    }

    public SquareImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        final int WIDTH = getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        final int MEASURE_WIDTH = WIDTH / 4 - 8;

        setMeasuredDimension(MEASURE_WIDTH, MEASURE_WIDTH);
    }

    @Override
    protected void onSizeChanged(final int width, final int height, final int oldWidth, final int oldHeight) {
        super.onSizeChanged(width, width, oldWidth, oldHeight);
    }
}