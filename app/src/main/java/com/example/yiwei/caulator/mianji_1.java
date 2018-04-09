package com.example.yiwei.caulator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mianji_1 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mianji);
        Button en = (Button) findViewById(R.id.button30);
        Button back = (Button) findViewById(R.id.button31);
        en.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                EditText et = (EditText) findViewById(R.id.edit30);
                double s = Double.parseDouble(et.getText().toString());
                Intent intent = new Intent();
                intent.setClass(mianji_1.this, mianji.class);

                Bundle bundle = new Bundle();
                bundle.putDouble("s", s);

                intent.putExtras(bundle);

                startActivity(intent);
                mianji_1.this.finish();
            }
        });
        back.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(mianji_1.this, danwei.class);
                startActivity(intent);
                mianji_1.this.finish();
            }
        });

    }
}