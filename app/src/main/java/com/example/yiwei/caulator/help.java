package com.example.yiwei.caulator;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
public class help extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);


        return true;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id) {
            case R.id.action_cxy:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent1 = new Intent(help.this, programmeranother.class);
                        startActivity(intent1);
                        return true;
                    }

                });


                break;


            case R.id.action_BJ:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent2 = new Intent(help.this, MainActivity.class);
                        startActivity(intent2);
                        return true;
                    }

                });
                break;
           /* case R.id.action_data:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent3 = new Intent(help.this, data.class);
                        startActivity(intent3);
                        return true;
                    }

                });
                break;*/
            case R.id.action_volume:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent3 = new Intent(help.this, danwei.class);
                        startActivity(intent3);
                        return true;
                    }

                });
                break;
            case R.id.action_sushu:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent6 = new Intent();
                        intent6.setClass(help.this, sushu.class);
                        startActivity(intent6);
                        help.this.finish();
                        return false;

                    }

                });
                break;
           /* case R.id.action_help:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent5 = new Intent(help.this, help.class);
                        startActivity(intent5);
                        return true;

                    }

                });
                break;*/

        }
        return super.onOptionsItemSelected(item);
    }

}
