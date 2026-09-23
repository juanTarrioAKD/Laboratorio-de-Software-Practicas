package Practica1.Ejercicio5;

import org.w3c.dom.css.Rect;

public final class Rectangulo extends FiguraGeometrica{
    private int alto;
    private int ancho;

    public Rectangulo(String aColor, int aAlto, int aAncho){
        super(aColor);
        this.alto=aAlto;
        this.ancho=aAncho;
    }

    @Override
    public int area() {return this.alto*this.ancho;}

    @Override
    public void dibujar() {System.out.println("Se dibuja un triangulo de area: " + this.area() + " | de color: " + this.getColor());}

}
