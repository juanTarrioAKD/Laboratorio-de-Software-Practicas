package Practica2;

public final class Circulo extends FiguraGeometrica {
    private int radio;

    public Circulo(String aColor, int aRadio){
        super(aColor);
        this.radio=aRadio;
    }

    @Override
    public int area() {return (int) ((this.radio*this.radio)*Math.PI);}

    @Override
    public void dibujar() {System.out.println("se dibuja un circulo con un radio: " + this.radio + " | de color: " + this.getColor());}

    public int getRadio() {return radio;}
}
