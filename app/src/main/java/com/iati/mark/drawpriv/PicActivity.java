package com.iati.mark.drawpriv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.iati.mark.drawpriv.draw.DrawPic;

public class PicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic);
        DrawPic drawPic = new DrawPic(this);
        setContentView(drawPic);
    }

}
