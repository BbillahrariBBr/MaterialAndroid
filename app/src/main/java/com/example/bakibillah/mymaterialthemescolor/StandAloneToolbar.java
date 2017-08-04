package com.example.bakibillah.mymaterialthemescolor;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class StandAloneToolbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stand_alone_toolbar);

        Toolbar mtoolbar = (Toolbar)findViewById(R.id.toolbar);
        mtoolbar.setTitle("BakiBillah ToolBar");
        mtoolbar.setSubtitle("By Baki");


        //mtoolbar.setNavigationIcon(R.drawable.navigation_back);

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            mtoolbar.setElevation(10f);
//        }

        mtoolbar.inflateMenu(R.menu.menu_main);
        mtoolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                String title = (String )item.getTitle();
                Toast.makeText(StandAloneToolbar.this, title+ "Selected! ", Toast.LENGTH_SHORT).show();
                switch (item.getItemId()){
                    case R.id.save:
                        //perform the individual menu action
                        break;
                    case R.id.settings:
                        //perform the individual menu action
                        break;
                    case R.id.mail:
                        //perform the individual menu action
                        break;
                }


                return true;
            }
        });
    }
}
