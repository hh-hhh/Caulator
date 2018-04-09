package com.example.yiwei.caulator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.widget.TextView;
public class changdu extends Activity {
    /** Called when the activity is first created. */
    private Button mButton;
    private TextView mTextView01;
    private TextView mTextView02;
    private TextView mTextView03;
    private double s;
    private double an;
    private double am;
    private double ax;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainnext01);
        Bundle bun=this.getIntent().getExtras();
        s=bun.getDouble("s");
        mTextView01=(TextView)findViewById(R.id.Test10);
        mTextView02=(TextView)findViewById(R.id.Test11);
        mTextView03=(TextView)findViewById(R.id.Test12);
        an=s*100;
        String v=s+"米"+"="+an+"厘米";
        mTextView01.setText(v);
        am=s*10;
        v=s+"米"+"="+am+"分米";
        mTextView02.setText(v);
        ax=s/1000;
        v=s+"米"+"="+ax+"千米";
        mTextView03.setText(v);

        mButton=(Button)findViewById(R.id.button10);
        mButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent=new Intent();
                intent.setClass(changdu.this, changdu_1.class);
                startActivity(intent);
                changdu.this.finish();
            }
        });


    }
}