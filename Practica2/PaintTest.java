package Practica2;

import java.util.Arrays;

public class PaintTest {
    public static void main (String[] args){
        Paint paleta = new Paint();
        paleta.init(
                new Circulo("azul", 2),
                new Circulo("amarillo", 3),
                new Rectangulo("verde", 2,3),
                new Rectangulo("rojo", 4, 10)
        );
        FiguraGeometrica figuraActual;
        for (int i=0; i<4; i++){
            figuraActual=paleta.recorrer(i);
            System.out.println("Area: "+figuraActual.area());
            if (figuraActual instanceof Circulo circulo){System.out.println("Es un circulo y si radio es: "+circulo.getRadio());}
            /*
            Forma tradicional previa a java 16
            if (figuraActual.getClass()== Circulo.class){
                Circulo circulo= (Circulo) figuraActual;
                System.out.println(circulo.getRadio());
            }
             */
        }

        Arrays.sort(paleta.getPaleta()); // Usa automáticamente el compareTo de FiguraGeometrica
    }
}
