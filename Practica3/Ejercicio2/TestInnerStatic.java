package Practica3.Ejercicio2;

public class TestInnerStatic {
    public static void main (String[] args){

        //PRIMER CIRCULO
        InnerStatic.Circulo.setRadio(4);
        System.out.println(InnerStatic.Circulo.getArea());
        System.out.println(InnerStatic.Circulo.getLongitudCircusferencia());

        //SEGUNDO CIRCULO
        InnerStatic.Circulo.setRadio(8);
        System.out.println(InnerStatic.Circulo.getArea());
        System.out.println(InnerStatic.Circulo.getLongitudCircusferencia());

    }
}
