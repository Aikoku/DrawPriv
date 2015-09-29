package com.iati.mark.drawpriv.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

import com.iati.mark.drawpriv.DrawCanvas;


public class DrawLine extends DrawCanvas {
    public DrawLine(Context context) {
        super(context);
    }
    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setColor(Color.RED);
        mCanvas.drawLine(10, 10, 200, 250, mPaint);
    }

}
