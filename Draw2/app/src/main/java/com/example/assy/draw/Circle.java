package com.example.assy.draw;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by assy on 07/09/2015.
 */
public class Circle extends Shape {
    private int radius;


    public Circle(int x,int y,int color,int radius,Context context)
    {

        super(x,y,color,context);
        this.radius=radius;

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public void onDraw(Canvas canvas)
    {
        canvas.drawColor(Color.WHITE);
        Paint paint = new Paint();
        paint.setColor(getColor());
        canvas.drawCircle(getx(), gety(), getRadius(), paint);
    }





}
