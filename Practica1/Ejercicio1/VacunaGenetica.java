package Practica1.Ejercicio1;

public class VacunaGenetica extends Vacuna{
    private int tempMax;
    private int tempMin;

    public VacunaGenetica(String aMarca, String aPaisOrigen, String aEnfermedadPrevenida, int aCantDosis, int aTempMax, int aTempMin){
        super(aMarca, aPaisOrigen, aEnfermedadPrevenida, aCantDosis);
        this.tempMax=aTempMax;
        this.tempMin=aTempMin;
    }

    //GETTERS AND SETTER
    public int getTempMin(){return this.tempMin;}
    public int getTempMax() {return this.tempMax;}

    public void setTempMax(int aNumber){this.tempMax=aNumber;}
    public void setTempMin(int aNumber) {this.tempMin = aNumber;}

    //Tostring
    @Override
    public String toString (){
        return super.toString()+ " | Temperatura minima: " + this.getTempMax() + " | Temperatura minima: " + this.getTempMin();
    }
    /*
    Es completamente necesario sino se ejecutaria el metodo toString de Vacuna
    dejando afuera los campos de temperatura.
     */
}
