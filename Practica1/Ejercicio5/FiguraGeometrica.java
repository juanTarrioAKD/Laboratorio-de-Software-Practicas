package Practica1.Ejercicio5;

public abstract sealed class FiguraGeometrica permits Circulo, Rectangulo{
    private String color;

    public FiguraGeometrica(String aColor){this.color=aColor;}

    //METODOS ABSTRACTOS
    public abstract void dibujar();
    public abstract int area();

    //GETTERS ANDS SETTERS
    public void setColor (String aColor){this.color=aColor;}
    public String getColor(){return this.color;}
}
