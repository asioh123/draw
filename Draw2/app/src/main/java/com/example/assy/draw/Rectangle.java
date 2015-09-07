package com.example.assy.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by assy on 07/09/2015.
 */
public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int x,int y,int color,int width,int height,Context context)
    {
        super(x,y,color,context);
        this.width=width;
        this.height=height;
    }

    public int getwidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getheight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void onDraw(Canvas canvas)
    {
        canvas.drawColor(Color.WHITE);
        Paint paint = new Paint();
        paint.setColor(getColor());
        canvas.drawRect(getx(),gety(),getwidth(),getheight(),paint);
    }
}
