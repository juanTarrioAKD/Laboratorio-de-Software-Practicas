package Practica4.Ejercicio3;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Facultad {

    private List<Alumno> alumnos;

    public Facultad (){ this.alumnos=new ArrayList<>();}

    public Alumno getMayorNota(){
        return alumnos.stream()
                      .max((a1,a2) -> Integer.compare(a1.getNota(),a2.getNota()))
                      .orElse(null);
    }


    public void imprimirDosAlumnos () {
        this.alumnos.stream()
                    .limit(2)
                    .forEach(alumno -> System.out.println(alumno.toString()));
    }

    public Alumno imprimirLabo (){
        return this.alumnos.stream()
                           .filter(a -> a.getMateriaAprobada().equals("Laboratorio De Software"))
                           .findFirst()
                           .orElse(null);
    }

    public List<Alumno> retornarAlumnos (){
        return this.alumnos.stream()
                           .filter(a -> a.getNombre().startsWith("P") && a.getNombre().length()<=6)
                           .toList();
    }

    public void ordenarPorNota() { this.alumnos.sort(Comparator.comparingInt(Alumno::getNota).reversed()); }

}
