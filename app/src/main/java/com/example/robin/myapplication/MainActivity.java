package com.example.robin.myapplication;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button cb_goBack;
    TextView tv_2,tv_1;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb_goBack = (Button) findViewById(R.id.cb_goBack);
        tv_2 = (TextView) findViewById(R.id.tv_2);
        tv_1 = (TextView) findViewById(R.id.tv_1);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick: 点击了");
                cb_goBack.setVisibility(View.VISIBLE);
                tv_1.setVisibility(View.VISIBLE);
                tv_2.setVisibility(View.VISIBLE);
                ObjectAnimator animation = ObjectAnimator.ofFloat(cb_goBack,"translationY", 0.0f, 200.0f);
                animation.setInterpolator(new BounceInterpolator());
                animation.setDuration(400).start();
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(tv_2,"translationY", 0.0f, -200.0f);
                animation1.setInterpolator(new BounceInterpolator());
                animation1.setDuration(400).start();
                ObjectAnimator animation2 = ObjectAnimator.ofFloat(tv_1,"translationY", 0.0f, -400.0f);
                animation2.setInterpolator(new BounceInterpolator());
                animation2.setDuration(400).start();
                
            }
        });
    }
}
