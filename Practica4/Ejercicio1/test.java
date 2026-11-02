package Practica4.Ejercicio1;

public class test {
    public static void main (String[] args) {
        Materia materiaPrueba = new Materia("Laboratorio de Software");
        Alumno alumno1 = new Alumno("juan1", "tarrio1", 100009, 1000001);
        Alumno alumno2 = new Alumno("juan1", "tarrio1", 100008, 1000002);
        Alumno alumno3 = new Alumno("juan1", "tarrio1", 100007, 1000003);
        Alumno alumno4 = new Alumno("juan1", "tarrio1", 100006, 1000004);
        Alumno alumno5 = new Alumno("juan1", "tarrio1", 100005, 1000005);
        Alumno alumno6 = new Alumno("juan1", "tarrio1", 100004, 1000006);
        Alumno alumno7 = new Alumno("juan1", "tarrio1", 100003, 1000007);
        Alumno alumno8 = new Alumno("juan1", "tarrio1", 100001, 1000008);
        Alumno alumno9 = new Alumno("juan1", "tarrio1", 100002, 1000009);
        Alumno alumno10 = new Alumno("juan1", "tarrio1", 100010, 1000010);
        materiaPrueba.agregarAlumno(alumno1);
        materiaPrueba.agregarAlumno(alumno2);
        materiaPrueba.agregarAlumno(alumno3);
        materiaPrueba.agregarAlumno(alumno4);
        materiaPrueba.agregarAlumno(alumno5);
        materiaPrueba.agregarAlumno(alumno6);
        materiaPrueba.agregarAlumno(alumno7);
        materiaPrueba.agregarAlumno(alumno8);
        materiaPrueba.agregarAlumno(alumno9);
        materiaPrueba.agregarAlumno(alumno10);
        System.out.println(materiaPrueba.getAlumnos().toString());
    }
}
