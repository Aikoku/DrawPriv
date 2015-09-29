package com.iati.mark.drawpriv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.iati.mark.drawpriv.draw.DrawCircle;


public class CircleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        Bundle extras = getIntent().getExtras();
        DrawCircle drawCircle;
        if (extras != null) {
            String height = extras.getString("height");
            String color = extras.getString("color");
             drawCircle = new DrawCircle(this,color,height);
        }else{
             drawCircle = new DrawCircle(this);
        }
        setContentView(drawCircle);
    }



}
