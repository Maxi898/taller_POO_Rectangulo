/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangulo;
import modelo.Punto;
import modelo.Rectangulo;
import modelo.FiguraGeometrica;
/**
 *
 * @author Daniel Alejandro
 */
public class Main {
    public static void main(String[] args) {
        // 1. Probar creación de puntos y rectángulo
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(10, 5);
        Rectangulo r = new Rectangulo(p1, p2);

        System.out.println("Base: " + r.getbase());       // Debe imprimir 10.0
        System.out.println("Altura: " + r.getAltura());   // Debe imprimir 5.0
        System.out.println("Área: " + r.calcularArea());  // Debe imprimir 50.0

        // 2. Probar movimiento
        r.mover(2, 3);
        System.out.println("Luego de mover: " + r.toString());

        // 3. Probar escalado
        r.escalar(2.0);
        System.out.println("Área escalada: " + r.calcularArea());
    }
}