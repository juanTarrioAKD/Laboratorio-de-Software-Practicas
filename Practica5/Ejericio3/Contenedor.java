package Practica5.Ejericio3;

import java.lang.reflect.Method;
import java.sql.Time;
import java.time.LocalDate;

public class Contenedor {

    public static void main(String[] args) throws Exception{
        MiServidor server = new MiServidor();
        Class<?> clazz = server.getClass();

        if (clazz.isAnnotationPresent(Servidor.class)){
            Servidor anotaciones = clazz.getAnnotation(Servidor.class);
            System.out.println("---------- New Archivo --------------");
            System.out.println("Archivo: "+ anotaciones.archivo());
            System.out.println("Ip conectada: "+ anotaciones.ip());
            System.out.println("Fecha y hora: "+ LocalDate.now());

            for (Method method : clazz.getDeclaredMethods() ){
                if (method.isAnnotationPresent(Invocar.class)){
                    method.invoke(server);
                }
            }
        }
    }
}
