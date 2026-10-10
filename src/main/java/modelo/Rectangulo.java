/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Daniel Alejandro
 */
public class Rectangulo extends FiguraGeometrica{
    private Punto vertice1;
    private Punto vertice2;
    
    public Rectangulo (Punto vertice1, Punto vertice2){
        super();
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
    }

    public Punto getVertice1() {
        return vertice1;
    }

    public void setVertice1(Punto vertice1) {
        this.vertice1 = vertice1;
    }

    public Punto getVertice2() {
        return vertice2;
    }

    public void setVertice2(Punto vertice2) {
        this.vertice2 = vertice2;
    }
    
    public double getbase(){
        return Math.abs(vertice2.getX()-vertice1.getX());
    }
    @Override
    public double getAltura(){
        return Math.abs(vertice2.getY() - vertice1.getY());
    }
 
    @Override
    public double calcularArea(){
        return getbase() * getAltura();   
    }
    
    @Override
    public void mover(double deltaX, double deltaY){
        vertice1.desplazar(deltaX, deltaY);
        vertice2.desplazar(deltaX, deltaY);
    }
    
    public boolean escalar (double factor){
        if (factor <=0){
            return false;
        }
        double nuevoX2 = vertice1.getX() +(vertice2.getX()-vertice1.getX()*factor);
        double nuevoY2 = vertice1.getX() +(vertice2.getY()-vertice1.getY()*factor);
        vertice2.setX(nuevoX2);
        vertice2.setY(nuevoY2);
        return true;
    }
    
    @Override
    public String toString(){
        return "Rectangulo [V1: " + vertice1 + ", V2: "+ vertice2 + ", Base: " + getbase()+ ", Altura: " + getAltura() + "]";
    }
}