package com.iati.mark.drawpriv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.iati.mark.drawpriv.draw.DrawLine;

public class LineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line);
        DrawLine drawLine = new DrawLine(this);
        setContentView(drawLine);
    }

}
