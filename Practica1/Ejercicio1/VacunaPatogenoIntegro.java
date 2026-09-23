package Practica1.Ejercicio1;

public class VacunaPatogenoIntegro extends Vacuna{

    private String virus;
    private boolean activo;

    public VacunaPatogenoIntegro(String aMarca, String aPaisOrigen, String aEnfermedadPrevenida, int aCantDosis, String aVirus, boolean aActivo){
        super(aMarca, aPaisOrigen, aEnfermedadPrevenida, aCantDosis);
        this.virus=aVirus;
        this.activo=aActivo;
    }

    //GETTERS AND SETTER
    public String getVirus(){return this.virus;}
    public boolean getActivo() {return this.activo;}

    public void setVirus(String aVirus){this.virus=aVirus;}
    public void setActivo(boolean aActivo) {this.activo = aActivo;}

    //Tostring
    @Override
    public String toString (){
        return super.toString()+ " | Virus: " + this.getVirus() + " | Activo: " + this.getActivo();
    }
    /*
    Es completamente necesario sino se ejecutaria el metodo toString de Vacuna
    dejando afuera los campos de temperatura.
     */
}
