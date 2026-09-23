package Practica1.Ejercicio1;

public class VacunaSubunidadAntigenica extends Vacuna{
    private int patogenos;
    private String tipo;

    public VacunaSubunidadAntigenica(String aMarca, String aPaisOrigen, String aEnfermedadPrevenida, int aCantDosis, int aPatogenos, String aTipo){
        super(aMarca, aPaisOrigen, aEnfermedadPrevenida, aCantDosis);
        this.patogenos=aPatogenos;
        this.tipo=aTipo;
    }

    //GETTERS AND SETTER
    public int getPatogenos(){return this.patogenos;}
    public String getTipo() {return this.tipo;}

    public void setPatogenos(int aPatogenos){this.patogenos=aPatogenos;}
    public void setTipo(String aTipo) {this.tipo = aTipo;}

    //Tostring
    @Override
    public String toString (){
        return super.toString()+ " | Patogenos: " + this.getPatogenos() + " | Tipo: " + this.getTipo();
    }
    /*
    Es completamente necesario sino se ejecutaria el metodo toString de Vacuna
    dejando afuera los campos de temperatura.
     */

}
