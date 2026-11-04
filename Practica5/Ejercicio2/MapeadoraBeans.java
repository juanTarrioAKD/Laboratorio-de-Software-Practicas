package Practica5.Ejercicio2;

import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.*;

public class MapeadoraBeans {

    public void generarFile(Object object) {
        Class<?> clazz = object.getClass();
        String nombreArchivo = clazz.getSimpleName() + ".txt";
        if (clazz.isAnnotationPresent(Archivo.class)) {
            Archivo anotacionArchivo = clazz.getAnnotation(Archivo.class);
            if (!anotacionArchivo.nombre().isEmpty()) {
                nombreArchivo = anotacionArchivo.nombre();
            }
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            writer.println("<nombre clase>" + clazz.getSimpleName() + "</nombre clase>");

            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(AlmacenarAtributo.class)) {
                    field.setAccessible(true);
                    String nombreAtributo = field.getName();
                    Object valorAtributo = field.get(object);

                    writer.println("<nombre atributo>" + nombreAtributo + "</nombre atributo>");
                    writer.println("<nombre valor>" + valorAtributo + "</nombre atributo>");
                }
            }
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}