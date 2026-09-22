package Practica1.Ejercicio1;
import Practica1.Ejercicio1.Vacuna;


public class TestVacuna {
    public static void main (String[] args){
        Vacuna[] vacunas = new Vacuna[5];

        vacunas[0]= new Vacuna ("Sputnik V", "Rusia", "COVID-19", 2);
        vacunas[1] = new Vacuna("Pfizer", "EE.UU.", "COVID-19", 2);
        vacunas[2] = new Vacuna("Spikevax", "EE.UU.", "COVID-19", 1);
        vacunas[3] = new Vacuna("AstraZeneca", "EE.UU.", "COVID-19", 3);
        vacunas[4] = new Vacuna("Novavax", "EE.UU.", "COVID-19", 1);

        for (int i=0; i<vacunas.length; i++){
            System.out.println(vacunas[i]);
            /* automaticamente el System.out.println ejecuta el toString()
               sin necesidad de vacunas[i].toString()
             */
        }
    }
}