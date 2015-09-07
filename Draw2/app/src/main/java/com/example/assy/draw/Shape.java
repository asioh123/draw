package com.example.assy.draw;

import android.content.Context;
import android.view.View;

/**
 * Created by assy on 07/09/2015.
 */
public class Shape extends View {

    private int x;
    private int y;
    private int color;

    public Shape(int x,int y,int color,Context context)
    {
        super(context);
        this.x=x;
        this.y=y;
        this.color=color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getx() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int gety() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }






}
