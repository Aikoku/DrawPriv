package com.iati.mark.drawpriv.draw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;

import com.iati.mark.drawpriv.DrawCanvas;
import com.iati.mark.drawpriv.R;


public class DrawPic extends DrawCanvas {
    public DrawPic(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setColor(Color.GREEN);
        Bitmap d= BitmapFactory.decodeResource(getResources(), R.drawable.king);
        mCanvas.drawBitmap(d,200,200, mPaint);
    }
}
