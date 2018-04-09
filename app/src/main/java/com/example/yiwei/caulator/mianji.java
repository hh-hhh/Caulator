package com.example.yiwei.caulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mianji extends AppCompatActivity {

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
        setContentView(R.layout.mainnext05);
        Bundle bun = this.getIntent().getExtras();
        s = bun.getDouble("s");
        mTextView01 = (TextView) findViewById(R.id.Test35);
        mTextView02 = (TextView) findViewById(R.id.Test36);
        mTextView03 = (TextView) findViewById(R.id.Test37);
        an = s * 1000000;
        String v = s + "平方米" + "=" + an + "平方毫米";
        mTextView01.setText(v);
        am = s * 10000;
        v = s + "平方米" + "=" + am + "平方厘米";
        mTextView02.setText(v);
        ax = s / 1000000;
        v = s + "平方米" + "=" + ax + "平方公里";
        mTextView03.setText(v);

        mButton = (Button) findViewById(R.id.button35);
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(mianji.this, zhonglinag_1.class);
                startActivity(intent);
                mianji.this.finish();
            }
        });

    }

}
