package Practica4.Ejercicio1;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private String apellido;
    private int legajo;
    private int dni;

    //Constructor
    public Alumno (String aNombre, String aApellido, int aLegajo, int aDni){
        this.nombre=aNombre;
        this.apellido=aApellido;
        this.legajo=aLegajo;
        this.dni=aDni;
    }

    //Compare to
    @Override
    public int compareTo(Alumno otro){return Integer.compare(this.legajo,otro.getLegajo());}

    //To String
    @Override
    public String toString () {
        return "Alumno= " + this.nombre + ", " + this.apellido + ", " + this.legajo + ", " + this.dni +"\n";
    }

    // GETTESR AND SETTER
    public void setNombre (String aNombre){this.nombre=aNombre;}
    public void setApellido (String aApellido){this.apellido=aApellido;}
    public void setLegajo (int aLegajo){this.legajo=aLegajo;}
    public void setDni (int aDni){this.dni=aDni;}
    public String getNombre (){return this.nombre;}
    public String getApellido (){return this.apellido;}
    public int getLegajo (){return this.legajo;}
    public int getDni (){return this.dni;}
}
