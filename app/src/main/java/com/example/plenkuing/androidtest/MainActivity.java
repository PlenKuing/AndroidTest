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

        Button LinearBt = findViewById(R.id.LinearBt);

        LinearBt.setOnClickListener(new View.OnClickListener() {//点击后进入线性布局界面
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LinearActivity.class);
                startActivity(intent);
            }
        });
    }
}
