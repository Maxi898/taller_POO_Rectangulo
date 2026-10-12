package controlador;

import modelo.Punto;
import modelo.Rectangulo;

/**
 * Controlador: gestiona la lógica del rectángulo (área, mover, escalar
 * y verificar si un punto está dentro). La vista solo le pasa los datos
 * que escribe el usuario y muestra lo que el controlador le devuelve.
 */
public class ControladorRectangulo {

    private Rectangulo rectangulo;

    public ControladorRectangulo() {
        this.rectangulo = null;
    }

    public void crearRectangulo(double x1, double y1, double x2, double y2) {
        Punto p1 = new Punto(x1, y1);
        Punto p2 = new Punto(x2, y2);
        rectangulo = new Rectangulo(p1, p2);
    }

    public boolean hayRectangulo() {
        return rectangulo != null;
    }

    public double calcularArea() {
        return rectangulo.calcularArea();
    }

    public double getBase() {
        return rectangulo.getbase();
    }

    public double getAltura() {
        return rectangulo.getAltura();
    }

    public void mover(double deltaX, double deltaY) {
        rectangulo.mover(deltaX, deltaY);
    }

    public boolean escalar(double factor) {
        return rectangulo.escalar(factor);
    }

    // El punto está dentro si su X está entre X1 y X2, y su Y está entre Y1 y Y2.
    // Se usan Math.min y Math.max por si el usuario escribe los vértices al revés.
    public boolean puntoDentro(double x, double y) {
        double x1 = rectangulo.getVertice1().getX();
        double y1 = rectangulo.getVertice1().getY();
        double x2 = rectangulo.getVertice2().getX();
        double y2 = rectangulo.getVertice2().getY();

        double minX = Math.min(x1, x2);
        double maxX = Math.max(x1, x2);
        double minY = Math.min(y1, y2);
        double maxY = Math.max(y1, y2);

        if (x >= minX && x <= maxX && y >= minY && y <= maxY) {
            return true;
        } else {
            return false;
        }
    }

    public String getInformacion() {
        return rectangulo.toString();
    }
}