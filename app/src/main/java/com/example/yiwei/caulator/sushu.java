package com.example.yiwei.caulator;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
/**
 * Created by yuan on 2017/10/10.
 */

public class sushu extends AppCompatActivity implements View.OnClickListener {
    public Button[] buttons = new Button[10];
    public Button backbButton, cleanButton, panduan;
    public EditText econtent, econtent1;
    boolean isClickEqu = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sushu);
        //从布局文件中获取控件，
        econtent = (EditText) findViewById(R.id.Econtent0);
        econtent1 = (EditText) findViewById(R.id.Econtent1);
        backbButton = (Button) findViewById(R.id.backspace);
        cleanButton = (Button) findViewById(R.id.clean);
        panduan = (Button) findViewById(R.id.panduan);
        buttons[0] = (Button) findViewById(R.id.b0);
        buttons[1] = (Button) findViewById(R.id.b1);
        buttons[2] = (Button) findViewById(R.id.b2);
        buttons[3] = (Button) findViewById(R.id.b3);
        buttons[4] = (Button) findViewById(R.id.b4);
        buttons[5] = (Button) findViewById(R.id.b5);
        buttons[6] = (Button) findViewById(R.id.b6);
        buttons[7] = (Button) findViewById(R.id.b7);
        buttons[8] = (Button) findViewById(R.id.b8);
        buttons[9] = (Button) findViewById(R.id.b9);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setOnClickListener(this);
        }
        panduan.setOnClickListener(this);

        backbButton.setOnClickListener(this);
        cleanButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_cxy:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent1 = new Intent(sushu.this, programmeranother.class);
                        startActivity(intent1);
                        return true;
                    }

                });


                break;

            case R.id.action_BJ:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent2 = new Intent(sushu.this, MainActivity.class);
                        startActivity(intent2);
                        return true;
                    }

                });
                break;
            /*case R.id.action_data:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent3 = new Intent(sushu.this, data.class);
                        startActivity(intent3);
                        return true;
                    }

                });
                break;*/
            case R.id.action_sushu:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent6 = new Intent();
                        intent6.setClass(sushu.this, sushu.class);
                        startActivity(intent6);
                        sushu.this.finish();
                        return false;

                    }

                });
                break;
            /*case R.id.action_help:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent5 = new Intent(sushu.this, help.class);
                        startActivity(intent5);
                        return true;

                    }

                });
                break;*/

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //btnBackspace和CE--------------------
            case R.id.backspace:
                String myStr = econtent1.getText().toString();
                try {
                    econtent1.setText(myStr.substring(0, myStr.length() - 1));
                } catch (Exception e) {
                    econtent1.setText("");
                }

                break;
            case R.id.clean:
                econtent1.setText(null);
                break;

            //btn0--9---------------------------
            case R.id.b0:
                if (isClickEqu) {
                    econtent1.setText(null);
                    isClickEqu = false;
                }
                String myString = econtent1.getText().toString();
                myString += "0";
                econtent1.setText(myString);
                break;
            case R.id.b1:
                if (isClickEqu) {
                    econtent1.setText(null);
                    isClickEqu = false;
                }
                String myString1 = econtent1.getText().toString();
                myString1 += "1";
                econtent1.setText(myString1);
                break;
            case R.id.b2:
                if (isClickEqu) {
                    econtent1.setText(null);
                    isClickEqu = false;
                }
                String myString2 = econtent1.getText().toString();
                myString2 += "2";
                econtent1.setText(myString2);
                break;
            case R.id.b3:
                if (isClickEqu) {
                    econtent1.setText(null);
                    isClickEqu = false;
                }
                String myString3 = econtent1.getText().toString();
                myString3 += "3";
                econtent1.setText(myString3);
                break;
            case R.id.b4:
                if (isClickEqu) {
                    econtent1.setText(null);
                    isClickEqu = false;
                }
                String myString4 = econtent1.getText().toString();
                myString4 += "4";
                econtent1.setText(myString4);
                break;
            case R.id.b5:
                if (isClickEqu) {
                    econtent1.setText(null);
                    isClickEqu = false;
                }
                String myString5 = econtent1.getText().toString();
                myString5 += "5";
                econtent1.setText(myString5);
                break;
            case R.id.b6:
                if (isClickEqu) {
                    econtent1.setText(null);
                    isClickEqu = false;
                }
                String myString6 = econtent1.getText().toString();
                myString6 += "6";
                econtent1.setText(myString6);
                break;
            case R.id.b7:
                if (isClickEqu) {
                    econtent1.setText(null);
                    isClickEqu = false;
                }
                String myString7 = econtent1.getText().toString();
                myString7 += "7";
                econtent1.setText(myString7);
                break;
            case R.id.b8:
                if (isClickEqu) {
                    econtent1.setText(null);
                    isClickEqu = false;
                }
                String myString8 = econtent1.getText().toString();
                myString8 += "8";
                econtent1.setText(myString8);
                break;
            case R.id.b9:
                if (isClickEqu) {
                    econtent1.setText(null);
                    isClickEqu = false;
                }
                String myString9 = econtent1.getText().toString();
                myString9 += "9";
                econtent1.setText(myString9);
                break;
            case R.id.panduan:
                if (isClickEqu) {
                    econtent1.setText(null);
                    isClickEqu = false;
                }
                String myString10 = econtent1.getText().toString();
                int a = Integer.parseInt(myString10);
                for (int i = 2; i <= a; i++) {    //最小的素数是2
                    if (a % i == 0 && i != a) {   //除了1和本身之后没有约数即为素数
                        econtent.setText("不是素数");
                        break;
                    } else if (i == a) {
                        econtent.setText("是素数");
                        break;

                    }
                }
        }
    }
}