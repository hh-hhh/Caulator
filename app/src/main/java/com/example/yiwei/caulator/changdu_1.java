package com.example.yiwei.caulator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class changdu_1 extends Activity {
    /** Called when the activity is first created. */
    int j=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainnext);
        Button en = (Button) findViewById(R.id.button01);
        Button back = (Button) findViewById(R.id.button02);
        en.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                EditText et = (EditText) findViewById(R.id.edit01);
                double s = Double.parseDouble(et.getText().toString());
                double res=s;
                Intent intent = new Intent();
                intent.setClass(changdu_1.this, changdu.class);

                Bundle bundle = new Bundle();
                bundle.putDouble("s", s);

                intent.putExtras(bundle);

                startActivity(intent);
                changdu_1.this.finish();
            }
        });
        back.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(changdu_1.this, danwei.class);
                startActivity(intent);
                changdu_1.this.finish();
            }
        });

    }
}