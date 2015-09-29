package com.iati.mark.drawpriv.draw;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

import com.iati.mark.drawpriv.DrawCanvas;


public class DrawRect extends DrawCanvas {
    public DrawRect(Context context) {
        super(context);
    }

    @Override
     protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setColor(Color.RED);
        mCanvas.drawRect(200, 200, 300, 450, mPaint);
    }
}
