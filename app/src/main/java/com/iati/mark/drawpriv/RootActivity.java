package com.iati.mark.drawpriv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.iati.mark.drawpriv.draw.DrawRect;

public class RootActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);
        DrawRect drawRect = new DrawRect(this);
        setContentView(drawRect);
    }

}
