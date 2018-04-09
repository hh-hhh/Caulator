package com.example.yiwei.caulator;
import java.security.PublicKey;
import android.content.Intent;
import android.os.Bundle;
import android.R.integer;
import android.R.string;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class programmeranother extends MainActivity implements OnClickListener {


    public RadioButton two, ten, sixteen,eigh;
    public Button[] buttons = new Button[16];
    public Button backbButton, cleanButton;
    public EditText econtent;
    int jinzhi = 1;
    double num1 = 0;
    double num2 = 0;
    int Result = 0;//计算结果
    int op = 0;//判断操作数，
    boolean isClickEqu = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        two = (RadioButton) findViewById(R.id.radio0);
        ten=(RadioButton) findViewById(R.id.radio1);
        eigh=(RadioButton)findViewById(R.id.radio3);
        sixteen = (RadioButton) findViewById(R.id.radio2);
        econtent = (EditText) findViewById(R.id.Econtent);

        backbButton = (Button) findViewById(R.id.backspace);
        cleanButton = (Button) findViewById(R.id.clean);
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
        buttons[10] = (Button) findViewById(R.id.b10);
        buttons[11] = (Button) findViewById(R.id.b11);
        buttons[12] = (Button) findViewById(R.id.b12);
        buttons[13] = (Button) findViewById(R.id.b13);
        buttons[14] = (Button) findViewById(R.id.b14);
        buttons[15] = (Button) findViewById(R.id.b15);


        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setOnClickListener(this);
        }
        backbButton.setOnClickListener(this);
        cleanButton.setOnClickListener(this);

        two.setOnClickListener(this);
        eigh.setOnClickListener(this);
        ten.setOnClickListener(this);
        sixteen.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id) {
            case R.id.action_cxy:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent1 = new Intent(programmeranother.this, programmeranother.class);
                        startActivity(intent1);
                        return true;
                    }

                });


                break;

            case R.id.action_BJ:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent2 = new Intent(programmeranother.this, MainActivity.class);
                        startActivity(intent2);
                        return true;
                    }

                });
                break;
           /* case R.id.action_data:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent3 = new Intent(programmeranother.this, data.class);
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
                        intent6.setClass(programmeranother.this, sushu.class);
                        startActivity(intent6);
                        programmeranother.this.finish();
                        return false;

                    }

                });
                break;
            /*case R.id.action_help:
                item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent5 = new Intent(programmeranother.this, help.class);
                        startActivity(intent5);
                        return true;

                    }

                });
                break;*/

        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onClick(View arg0) {
        int a = 0;
        // TODO Auto-generated method stub
        if (arg0 == two) {
            if(jinzhi==1){//八进制转换二进制
                econtent.setText(toD(econtent.getText().toString(),8 ));

                a=Integer.valueOf(econtent.getText().toString());
                econtent.setText(Integer.toBinaryString(a));
            }
            if (jinzhi == 2) {//十进制转换二进制
                a = Integer.valueOf(econtent.getText().toString());
                econtent.setText(Integer.toBinaryString(a));
            }
            if (jinzhi == 3) {//十六进制转换二进制
                econtent.setText(toD(econtent.getText().toString(),16 ));
                a = Integer.valueOf(econtent.getText().toString());
                econtent.setText(Integer.toBinaryString(a));
            }
            jinzhi = 0;//二进制转换二进制
            for (int i = 0; i < 16; i++) {
                if (i < 2) {
                    buttons[i].setEnabled(true);
                } else {
                    buttons[i].setEnabled(false);
                }
            }
        }
        if(arg0==eigh){
            if(jinzhi==0){
                econtent.setText(toD(econtent.getText().toString(),2 ));
                a = Integer.valueOf(econtent.getText().toString());
                econtent.setText(Integer.toOctalString(a));
            }
            if(jinzhi==2){
                a = Integer.valueOf(econtent.getText().toString());
                econtent.setText(Integer.toOctalString(a));

            }
            if(jinzhi==3){
                a=Integer.valueOf(econtent.getText().toString());
                econtent.setText(Integer.parseInt(String.valueOf(a)));
            }
            jinzhi=2;
            for (int i = 0; i < 16; i++) {
                if (i < 8) {
                    buttons[i].setEnabled(true);
                } else {
                    buttons[i].setEnabled(false);
                }
            }

        }

        if (arg0 == ten) {
            if(jinzhi==1){
                econtent.setText(toD(econtent.getText().toString(),8 ));
            }
            if (jinzhi == 3) {
                econtent.setText(toD(econtent.getText().toString(), 16));
            }
            if (jinzhi == 0) {
                econtent.setText(toD(econtent.getText().toString(), 2));
            }
            jinzhi = 2;
            for (int i = 0; i < 16; i++) {
                if (i < 10) {
                    buttons[i].setEnabled(true);
                } else {
                    buttons[i].setEnabled(false);
                }
            }
        }
        if (arg0 == sixteen) {
            if(jinzhi==1){
                econtent.setText(toD(econtent.getText().toString(),8 ));
                a = Integer.valueOf(econtent.getText().toString());
                econtent.setText(Integer.toHexString(a));

            }
            if (jinzhi == 2) {
                a = Integer.valueOf(econtent.getText().toString());
                econtent.setText(Integer.toHexString(a));
            }
            if (jinzhi == 0) {
                econtent.setText(BToH(econtent.getText().toString()));
            }
            jinzhi = 3;
            for (int i = 0; i < 16; i++) {
                if (i < 16) {
                    buttons[i].setEnabled(true);
                } else {
                    buttons[i].setEnabled(false);
                }
            }
        }
        for (int i = 0; i < buttons.length; i++) {
            if (arg0 == buttons[i]) {
                String aString = econtent.getText().toString();
                if (aString.equals("0")) {
                    econtent.setText(formattingH(i));
                } else {
                    econtent.setText(aString + formattingH(i));
                }
            }
        }

        if (arg0 == backbButton) {
            String scontent = econtent.getText().toString();
            if (scontent.length() > 1) {
                econtent.setText(scontent.substring(0, scontent.length() - 1));
            } else {
                econtent.setText("0");
            }

        }
        if (arg0 == cleanButton) {
            econtent.setText("0");
        }




    }




    // 十六进制转二进制
    public String HToB(String a) {
        String b = Integer.toBinaryString(Integer.valueOf(toD(a, 16)));
        return b;
    }
    // 二进制转十六进制
    public String BToH(String a) {
        // 将二进制转为十进制再从十进制转为十六进制
        String b = Integer.toHexString(Integer.valueOf(toD(a, 2)));
        return b;
    }
    //二进制转换八进制
    public String OTbO(String a){
        String b=Integer.toOctalString(Integer.valueOf(toD(a,2)));
        return b;
    }

    // 任意进制数转为十进制数
    public String toD(String a, int b) {
        int r = 0;
        for (int i = 0; i < a.length(); i++) {
            r = (int) (r + formatting(a.substring(i, i + 1))
                    * Math.pow(b, a.length() - i - 1));
        }
        return String.valueOf(r);
    }

    // 将十六进制中的字母转为对应的数字
    public int formatting(String a) {
        int i = 0;
        for (int u = 0; u < 10; u++) {
            if (a.equals(String.valueOf(u))) {
                i = u;
            }
        }
        if (a.equals("a")) {
            i = 10;
        }
        if (a.equals("b")) {
            i = 11;
        }
        if (a.equals("c")) {
            i = 12;
        }
        if (a.equals("d")) {
            i = 13;
        }
        if (a.equals("e")) {
            i = 14;
        }
        if (a.equals("f")) {
            i = 15;
        }
        return i;
    }

    // 将十进制中的数字转为十六进制对应的字母
    public String formattingH(int a) {
        String i;
        i = String.valueOf(a);
        if (a == 10) {
            i = "a";
        }
        if (a == 11) {
            i = "b";
        }
        if (a == 12) {
            i = "c";
        }
        if (a == 13) {
            i = "d";
        }
        if (a == 14) {
            i = "e";
        }
        if (a == 15) {
            i = "f";
        }
        return i;
    }
}