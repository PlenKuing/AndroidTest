package com.example.plenkuing.androidtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by PlenKuing on 2018/4/21.
 */

public class FrameActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame);
        Button returnBt = findViewById(R.id.returnBt);

        returnBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrameActivity.this,MainActivity.class);
                startActivity(intent);//开启
                finish();//关闭
            }
        });
    }
}
