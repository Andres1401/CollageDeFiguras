/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;
import java.awt.*;
import java.awt.geom.*;
/**
 *
 * @author Jesus Andres
 */
public class Circle {
    
    
    private int diameter;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    
    /**
     * Create a new circle at default position with default color.
     */
    public Circle(int diameter, int xPosition,int yPosition,String color)
    {
        this.diameter = diameter;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.color = color;
        isVisible=true;
    }
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }
    /**
     * Draw the circle with current specifications on screen.
     */
    public void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition, 
                                                          diameter, diameter));
            canvas.wait(10);
        }
    }

    /**
     * Erase the circle on screen.
     */
    public void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
