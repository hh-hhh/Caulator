package com.example.yiwei.caulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
public class zhonglinag_1 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhongliang);
        Button en = (Button) findViewById(R.id.button20);
        Button back = (Button) findViewById(R.id.button21);
        en.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                EditText et = (EditText) findViewById(R.id.edit20);
                double s = Double.parseDouble(et.getText().toString());
                Intent intent = new Intent();
                intent.setClass(zhonglinag_1.this, zhongliang.class);

                Bundle bundle = new Bundle();
                bundle.putDouble("s", s);

                intent.putExtras(bundle);

                startActivity(intent);
                zhonglinag_1.this.finish();
            }
        });
        back.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(zhonglinag_1.this, danwei.class);
                startActivity(intent);
                zhonglinag_1.this.finish();
            }
        });

    }
}
