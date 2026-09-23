package Practica2;

public class Paint {
    private FiguraGeometrica[] paleta;

    public Paint(){}

    public void init (Circulo circulo1, Circulo circulo2, Rectangulo rectangulo1, Rectangulo rectangulo2){
        this.paleta= new FiguraGeometrica[] {circulo1,circulo2,rectangulo1,rectangulo2};
    }

    public FiguraGeometrica recorrer (int aNumber){return paleta[aNumber];}

    public FiguraGeometrica[] getPaleta() {return paleta;}
}
