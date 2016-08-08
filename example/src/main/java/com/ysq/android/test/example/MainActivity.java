package com.ysq.android.test.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ysq.android.utils.singletoast.YSingleToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = (Button) findViewById(R.id.btn_show);
        button.setTag(1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setTag((int)button.getTag() + 1);
                YSingleToast.getInstance(MainActivity.this).show("" + button.getTag());
            }
        });
    }
}
