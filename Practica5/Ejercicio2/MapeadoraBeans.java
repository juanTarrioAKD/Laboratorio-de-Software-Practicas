package Practica5.Ejercicio2;

import java.lang.reflect.Field;

public class MapeadoraBeans {

    public static void main (String[] args) throws Exception{
        Mapeado mapeado = new Mapeado();

        if (mapeado.getClass().isAnnotationPresent(Archivo.class)){
            System.out.println("<nombre clase>"+mapeado.getClass().getSimpleName()+".txt"+"</nombre clase>");
            for (Field field : mapeado.getClass().getDeclaredFields()){
                if (field.isAnnotationPresent(AlmacenarAtributo.class)){
                    System.out.println("<nombre atributo>"+field.getName()+"</nombre atributo>");
                    field.setAccessible(true);
                    System.out.println("<nombre valor>"+field.get(mapeado)+"</nombre valor>");
                }
            }
        }
    }
}