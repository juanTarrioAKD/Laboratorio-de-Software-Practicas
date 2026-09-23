package Practica3.Ejercicio2;

public class InnerStatic {

    static double PI = 3.1416;

    static class Circulo {
        static double radio;
        static void setRadio(double aRadio){radio=aRadio;}
        static double getArea(){
            var a = PI * Math.pow(radio,2);
            System.out.println("el area es : " + a);
            return a;
        }
        static double getLongitudCircusferencia (){
            var l=2*PI*radio;
            System.out.println("la longitud es: " + l);
            return l;
        }
    }
}
