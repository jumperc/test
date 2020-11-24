package com.example.testtouchevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    private TestView testView;
    private TestLayout testLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testView = (TestView) findViewById(R.id.testView);
        testLayout =findViewById(R.id.testLayout);
//        View rootview = button.getRootView();
        testView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("test", "onClick" + "------"+v);
            }
        });
        testLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("test", "onClick" + "------"+v);
            }
        });
        testView.setOnTouchListener(this);
        testLayout.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Log.d("test",  event.getAction()+"-----onTouch-----"+v);
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("test",  event.getAction()+"-----onTouchEvent");
        return super.onTouchEvent(event);
    }
}
