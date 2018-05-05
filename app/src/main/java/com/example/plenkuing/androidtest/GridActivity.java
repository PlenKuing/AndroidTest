package com.example.plenkuing.androidtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

/**
 * Created by PlenKuing on 2018/5/5.
 */

public class GridActivity extends Activity {
    GridLayout gridLayout;
    String[] chars = new String[]{
        "1","2","3",
        "4","5","6",
        "7","8","9",
        "0","+","-",
        "*","/","."
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid);
        Button returnBt = findViewById(R.id.returnBt);
        returnBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GridActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        gridLayout = findViewById(R.id.gridLayout);
        for (int i=0;i<chars.length;i++){
            Button bt = new Button(this);
            bt.setText(chars[i]);
            bt.setTextSize(14);
            bt.setPadding(5,35,5,35);
            GridLayout.Spec rowSpec = GridLayout.spec(i/3,1f);//设置比重，达到均分效果
            GridLayout.Spec columnSpec = GridLayout.spec(i%3,1f);
            GridLayout.LayoutParams params =new GridLayout.LayoutParams(rowSpec,columnSpec);
            /*params.height=0;
            params.width=0;*/
            params.setGravity(Gravity.FILL);
            gridLayout.addView(bt,params);

        }
    }
}
