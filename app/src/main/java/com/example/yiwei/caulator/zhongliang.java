package com.example.yiwei.caulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Button;
import android.view.View.OnClickListener;

public class zhongliang extends AppCompatActivity {

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
        setContentView(R.layout.mainnext03);
        Bundle bun = this.getIntent().getExtras();
        s = bun.getDouble("s");
        mTextView01 = (TextView) findViewById(R.id.Test24);
        mTextView02 = (TextView) findViewById(R.id.Test25);
        mTextView03 = (TextView) findViewById(R.id.Test26);
        an = s * 1000;
        String v = s + "千克" + "=" + an + "克";
        mTextView01.setText(v);
        am = s / 2;
        v = s + "千克" + "=" + am + "斤";
        mTextView02.setText(v);
        ax = s;
        v = s + "千克" + "=" + ax + "公斤";
        mTextView03.setText(v);

        mButton = (Button) findViewById(R.id.button25);
        mButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(zhongliang.this, zhonglinag_1.class);
                startActivity(intent);
                zhongliang.this.finish();
            }
        });

    }

}
