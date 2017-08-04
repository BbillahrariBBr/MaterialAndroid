package com.example.bakibillah.mymaterialthemescolor;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){
//
//        }
//        else{
//
//        }
    }

    public void showToolbarAsActionBar(View view){
        Intent intent = new Intent(MainActivity.this,ActionBarToolbar.class);
        startActivity(intent);
    }

    public void showStandAloneToolBar(View view){
        Intent intent = new Intent(MainActivity.this,StandAloneToolbar.class);
        startActivity(intent);
    }

    public void showContextulaMenu(View view){
        Intent intent = new Intent(MainActivity.this,ContextualMenu.class);
        startActivity(intent);
    }
}
