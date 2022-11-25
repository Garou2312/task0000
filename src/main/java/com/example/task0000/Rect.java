package com.example.task0000;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rect extends Shape {
    double length ;
    double width ;

    public Rect(Color colorbg) {
        super(colorbg);
    }

    public Rect() {
        super();
    }


    @Override
    protected double area() {
        return length*width;
    }
    @Override
    public String toString() {
        return"Rectangle color is " + super.color +
                "and area is : " + area();
    }
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill (colorbg);
        gr.fillRect(v, v1, v4,v3);
    }
}
