package Practica4.Ejercicio3;

public class Alumno {
    private String nombre;
    private String apellido;
    private long numero;
    private int edad;
    private String materiaAprobada;
    private int nota;

    public Alumno (String aNombre, String aApellido, long aNumero, int aEdad, String aMateria, int aNota){
        this.nombre=aNombre;
        this.apellido=aApellido;
        this.numero=aNumero;
        this.edad=aEdad;
        this.materiaAprobada=aMateria;
        this.nota=aNota;
    }

    public int getNota(){return this.nota;}

    public String getMateriaAprobada(){return this.materiaAprobada;}

    public String getNombre(){return this.nombre;}

    @Override
    public String toString (){
        return "Nombre: " + this.nombre + this.apellido + ".";
    }
}
