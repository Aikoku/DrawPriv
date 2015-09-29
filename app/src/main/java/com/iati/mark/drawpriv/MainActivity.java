package com.iati.mark.drawpriv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CircleClick(View view) {
//        Intent i = new Intent(this, CircleActivity.class);
//        startActivity(i);

        Intent i = new Intent(this, size.class);
        startActivity(i);

    }

    public void rootActiv(View view) {
        Intent i = new Intent(this, RootActivity.class);
        startActivity(i);
    }

    public void lineActiv(View view) {
        Intent i = new Intent(this, LineActivity.class);
        startActivity(i);
    }

    public void picActiv(View view) {
        Intent i = new Intent(this, PicActivity.class);
        startActivity(i);
    }
}
