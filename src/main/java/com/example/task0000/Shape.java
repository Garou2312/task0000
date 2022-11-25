package com.example.task0000;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    protected Color color;
    protected Color colorbg;
    protected double v;
    protected  double v1;

    protected  double v4;
    protected double v3;

    public Color getColor() {
        return color.BLUE;
    }

    public Color getColorbg() {
        return color.BLUE;
    }

    public Shape(Color color) {
        this.color = color;
        this.colorbg = colorbg;
        this.v = v;
        this.v1 = v1;
        this.v4 = v4;
        this.v3 = v3;
    }
    public Shape() {
        this.color = Color.BLUE;
        this.colorbg = Color.RED;
        this.v = 80;
        this.v1=70;
        this.v4 = 50;
        this.v3 = 40;
    }


    abstract double area();
    public abstract String toString();
    abstract void draw( GraphicsContext gr);

}
