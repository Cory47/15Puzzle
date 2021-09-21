package com.example.homework2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

//Create a new class that extends SurfaceView
public class GameSurfaceView extends SurfaceView implements View.OnTouchListener {
    public GameSurfaceView(Context context, AttributeSet attrs){
        super(context, attrs);

        //enable drawing
        setWillNotDraw(false);

    }
    protected void onDraw(Canvas canvas){
        Paint redPaint = new Paint();
        redPaint.setARGB(255,255,0,0);
        int centerX = (int) (this.getX() + this.getWidth()  / 2);
        int centerY = (int) (this.getY() + this.getHeight() / 2);
        canvas.drawCircle(centerX, centerY, 200,  redPaint);
        invalidate();
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
