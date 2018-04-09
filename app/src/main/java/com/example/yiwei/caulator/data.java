package com.example.yiwei.caulator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.support.annotation.NonNull;

import java.util.Calendar;
import java.text.BreakIterator;
import java.util.Date;
public class data extends AppCompatActivity {

    public Button btnChoose1Date;
    public Button btnChoose2Date;
    Date date1;
    Date date2;
    String theDate1;
    String theDate2;
    long between;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data);

//     将获取开始时间的按钮传进来
        btnChoose1Date= (Button) findViewById(R.id.btnChoose1Date);
//     在按钮中实现获取时间
        btnChoose1Date.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                new DatePickerDialog(data.this,new DatePickerDialog.OnDateSetListener()
                {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth)
                    {
                        theDate1=(String.format("%d-%d-%d",year,monthOfYear+1,dayOfMonth));
                        System.out.println(theDate1);
                        //btnChoose1Date.setText(theDate1);
                        TextView text1=(TextView)findViewById(R.id.text1);
                        text1.setText("开始时间："+theDate1);
                        date1 = new Date(year - 1900, monthOfYear+1, dayOfMonth);//获取时间转换为Date对象
                    }
                },2016,4,11).show();
            }
        });

        btnChoose2Date=(Button)findViewById(R.id.btnChoose2Date);

        btnChoose2Date.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                new DatePickerDialog(data.this,new DatePickerDialog.OnDateSetListener()
                {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth)
                    {
                        theDate2=(String.format("%d-%d-%d",year,monthOfYear+1,dayOfMonth));
                        System.out.println(theDate2);
                        TextView text2=(TextView)findViewById(R.id.text2);
                        text2.setText("结束时间："+theDate2);
                        date2= new Date(year - 1900, monthOfYear+1, dayOfMonth); //获取时间转换为Date对象
                    }
                },2016,4,11).show();
            }
        });


        findViewById(R.id.btnDaysAty).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                between= DataUtil.getDaysBetween(date1,date2);
                TextView days=(TextView) findViewById(R.id.days);
                days.setText("日期间隔为："+between+"天");
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);


        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id) {
            case R.id.action_cxy:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent1 = new Intent(data.this, programmeranother.class);
                        startActivity(intent1);
                        return true;
                    }

                });


                break;

            case R.id.action_BJ:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent2 = new Intent(data.this, MainActivity.class);
                        startActivity(intent2);
                        return true;
                    }

                });
                break;
            /*case R.id.action_data:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent3 = new Intent(data.this, data.class);
                        startActivity(intent3);
                        return true;
                    }

                });
                break;*/
            case R.id.action_volume:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent3 = new Intent(data.this, danwei.class);
                        startActivity(intent3);
                        return true;
                    }

                });
                break;
            /*case R.id.action_help:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent5 = new Intent(data.this, help.class);
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
                        intent6.setClass(data.this, sushu.class);
                        startActivity(intent6);
                        data.this.finish();
                        return false;

                    }

                });
                break;

        }
        return super.onOptionsItemSelected(item);
    }

}
