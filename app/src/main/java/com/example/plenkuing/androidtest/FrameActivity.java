package com.example.plenkuing.androidtest;

import android.app.Activity;
import android.content.Intent;
import android.nfc.cardemulation.HostNfcFService;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by PlenKuing on 2018/4/21.
 */

public class FrameActivity extends Activity {
    private  int currentPhoto = 0;
    private ImageView iv;


    private int[] photos = new int[]{
            R.drawable.first,
            R.drawable.second,
            R.drawable.thrid,
            R.drawable.fouth,
            R.drawable.fifth
    };

    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if(msg.what==0x123){
                currentPhoto++;
                iv.setImageResource(photos[currentPhoto%5]);
            }
            super.handleMessage(msg);
        }
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame);
        Button returnBt = findViewById(R.id.returnBt);
        iv = findViewById(R.id.iv);


        returnBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrameActivity.this,MainActivity.class);
                startActivity(intent);//开启
                finish();//关闭
            }
        });

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x123);
            }
        },0,1500);
    }
}
