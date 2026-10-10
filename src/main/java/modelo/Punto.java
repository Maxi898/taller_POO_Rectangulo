/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Daniel Alejandro
 */
public class Punto {
    private double x;
    private double y;
    
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
                
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void desplazar (double deltaX, double deltaY){
        this.x +=deltaX;
        this.y +=deltaY;
    }
    @Override
    public String toString(){
        return "("+x+" , " +y+")";
    }
}

