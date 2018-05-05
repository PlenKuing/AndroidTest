package com.example.plenkuing.androidtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button linearBt = findViewById(R.id.LinearBt);
        Button frameBt = findViewById(R.id.frameBt);
        Button relativeBt = findViewById(R.id.relativeBt);
        Button tableBt = findViewById(R.id.tableBt);
        Button gridBt = findViewById(R.id.gridBt);
        gridBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,GridActivity.class);
                startActivity(intent);
            }
        });
        tableBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TableActivity.class);
                startActivity(intent);
            }
        });
        linearBt.setOnClickListener(new View.OnClickListener() {//点击后进入线性布局界面
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LinearActivity.class);
                startActivity(intent);
            }
        });
        relativeBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RelativeActivity.class);
                startActivity(intent);
            }
        });
        frameBt.setOnClickListener(new View.OnClickListener() {//帧布局
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FrameActivity.class);
                startActivity(intent);
            }
        });
    }
}
