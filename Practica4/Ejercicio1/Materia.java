package Practica4.Ejercicio1;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Materia {
    private Set<Alumno> alumnos;
    private String nombre;

    //Constructor
    public Materia (String aNombre){
        this.nombre=aNombre;
        this.alumnos=new TreeSet<>(); //TreeSet no admite duplicados y los ordena como arbol.
    }

    //Inciso A
    public void agregarAlumno(Alumno aAlumno){this.alumnos.add(aAlumno);}
    public Set<Alumno> getAlumnos(){return alumnos;}

}
