package com.example.yiwei.caulator;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
public class danwei extends AppCompatActivity  {

    private Button mButton;
    private Button aButton;
    private Button bButton;
    private Button cButton;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);


        return true;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mButton=(Button)findViewById(R.id.widget29);
        aButton=(Button)findViewById(R.id.widget30);
        bButton=(Button)findViewById(R.id.widget31);
        cButton=(Button)findViewById(R.id.widget32);

        mButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent showNextPage_Intent=new Intent();
                showNextPage_Intent.setClass(danwei.this,changdu_1.class);
                startActivity(showNextPage_Intent);
                danwei.this.finish();
            }
        });
        aButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent showNextPage_Intent=new Intent();
                showNextPage_Intent.setClass(danwei.this,zhonglinag_1.class);
                startActivity(showNextPage_Intent);
                danwei.this.finish();
            }
        });
        bButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent showNextPage_Intent=new Intent();
                showNextPage_Intent.setClass(danwei.this,mianji_1.class);
                startActivity(showNextPage_Intent);
                danwei.this.finish();
            }
        });
        cButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent showNextPage_Intent=new Intent();
                showNextPage_Intent.setClass(danwei.this,tiji_1.class);
                startActivity(showNextPage_Intent);
                danwei.this.finish();
            }
        });

    }


    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id) {
            case R.id.action_cxy:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent1 = new Intent(danwei.this, programmeranother.class);
                        startActivity(intent1);
                        danwei.this.finish();
                        return true;

                    }

                });


                break;

            case R.id.action_BJ:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent2 = new Intent();
                        intent2.setClass(danwei.this, MainActivity.class);
                        startActivity(intent2);
                        danwei.this.finish();

                        return true;
                    }

                });
                break;
            /*case R.id.action_data:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent3 = new Intent();
                        intent3.setClass(danwei.this, data.class);
                        startActivity(intent3);
                        danwei.this.finish();
                        return true;

                    }

                });
                break;*/
            case R.id.action_volume:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent4 = new Intent();
                        intent4.setClass(danwei.this, danwei.class);
                        startActivity(intent4);
                        danwei.this.finish();
                        return true;

                    }

                });
                break;
            /*case R.id.action_help:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent5 = new Intent(danwei.this, help.class);
                        startActivity(intent5);
                        return true;

                    }

                });
                break;*/
            case R.id.action_sushu:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent6 = new Intent();
                        intent6.setClass(danwei.this, sushu.class);
                        startActivity(intent6);
                        danwei.this.finish();
                        return false;

                    }

                });
                break;

        }
        return super.onOptionsItemSelected(item);
    }

}
