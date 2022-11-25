package com.example.task0000;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class polygon extends Shape {
    double length ;
    double width ;

    public polygon(Color colorbg) {
        super(colorbg);
    }

    public polygon() {
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
        double[] X = {40,50,100,120,150};
        double[] Y = {40,70,100,250,0};
        gr.fillPolygon (X,Y, 5);
    }
}
