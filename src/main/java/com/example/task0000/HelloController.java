package com.example.task0000;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class HelloController {
    @FXML
     Canvas canvas ;



    @FXML
    protected void onHelloButtonClick() {
        GraphicsContext gs= canvas.getGraphicsContext2D();
        Rect rectangle= new Rect();
        rectangle.draw(gs);
    }
    protected void  onRunButtonClick() {
        GraphicsContext gs= canvas.getGraphicsContext2D();
        Rect rectangle= new Rect();
        rectangle.draw(gs);
    }
    @FXML
    protected void onHelloButtonClick1() {
        GraphicsContext gs= canvas.getGraphicsContext2D();
        oval oval= new oval();
        oval.draw(gs);
    }
    protected void  onRunButtonClick1() {
        GraphicsContext gs= canvas.getGraphicsContext2D();
        oval oval= new oval();
        oval.draw(gs);
    }
    @FXML
    protected void onHelloButtonClick2() {
        GraphicsContext gs= canvas.getGraphicsContext2D();
        polygon polygon= new polygon();
        polygon.draw(gs);
    }
    protected void  onRunButtonClick2() {
        GraphicsContext gs= canvas.getGraphicsContext2D();
        polygon polygon= new polygon();
        polygon.draw(gs);
    }
}