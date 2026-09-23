package Practica2;

public abstract sealed class FiguraGeometrica implements Comparable<FiguraGeometrica> permits Circulo, Rectangulo {
    private String color;

    public FiguraGeometrica(String aColor){this.color=aColor;}

    //METODOS ABSTRACTOS
    public abstract void dibujar();
    public abstract int area();

    //METODO DE INTERFAZ
    @Override public int compareTo(FiguraGeometrica otra) {
        // Double.compare() devuelve <0, 0 o >0 según el valor de las áreas
        return Double.compare(this.area(), otra.area()); }

    //GETTERS ANDS SETTERS
    public void setColor (String aColor){this.color=aColor;}
    public String getColor(){return this.color;}
}
