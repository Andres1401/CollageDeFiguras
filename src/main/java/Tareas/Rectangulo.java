/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;
import java.awt.*;
/**
 *
 * @author Jesus Andres
 */
public class Rectangulo {
    
     private int ancho;
    private int altura;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    /**
     * Create a new square at default position with default color.
     */
    public Rectangulo(int ancho,int altura, int xPosition,int yPosition,String color)
    {
        this.ancho = ancho;
        this.altura= altura;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.color = color;
        isVisible = true;
    }

    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }
    
    /**
     * Draw the square with current specifications on screen.
     */
    public void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                        new Rectangle(xPosition, yPosition, ancho, altura));
            canvas.wait(10);
        }
    }

    /**
     * Erase the square on screen.
     */
    public void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
