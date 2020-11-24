package com.example.testtouchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * description ： TODO:类的作用
 * author : caojun
 * date : 2020-01-07 15
 */
public class TestView extends View {

    public TestView(Context context) {
        super(context);
    }

    public TestView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TestView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("test",  event.getAction()+"-----TestView onTouchEvent");
        return super.onTouchEvent(event);
//        return true;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("test",  event.getAction()+"-----TestView dispatchTouchEvent");
//        switch (event.getAction()){
//            case MotionEvent.ACTION_DOWN:
//                getParent().requestDisallowInterceptTouchEvent(true);
//                Log.d("TAG", "You down button");
//                break;
//            case MotionEvent.ACTION_UP:
//                getParent().requestDisallowInterceptTouchEvent(false);
//                Log.d("TAG", "You up button");
//                break;
//            case MotionEvent.ACTION_MOVE:
//                Log.d("TAG", "You move button");
//        }
        return super.dispatchTouchEvent(event);
//        return true;
    }

}
