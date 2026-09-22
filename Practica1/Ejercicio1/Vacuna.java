package Practica1.Ejercicio1;

public class Vacuna {

    private String marca;
    private String paisOrigen;
    private String enfermedadPrevenida;
    private int cantDosis;

    public Vacuna (String aMarca, String aPaisOrigen, String aEnfermedadPrevenida, int aCantDosis){
        this.marca=aMarca;
        this.paisOrigen=aPaisOrigen;
        this.enfermedadPrevenida=aEnfermedadPrevenida;
        this.cantDosis=aCantDosis;
    }

    @Override
    public String toString (){
        String stringBuffer;
        stringBuffer=this.getMarca();
        stringBuffer+=this.getPaisOrigen();
        stringBuffer+=this.getEnfermedadPrevenida();
        stringBuffer+=this.getCantDosis();
        return stringBuffer;
    }

    //GETTERS AND SETTERS
    public String getMarca() {return this.marca;}
    public String getPaisOrigen() {return paisOrigen;}
    public String getEnfermedadPrevenida() {return enfermedadPrevenida;}
    public int getCantDosis() {return cantDosis;}

    public void setMarca(String marca) {this.marca = marca;}
    public void setPaisOrigen(String aPaisOrigen) {this.paisOrigen = aPaisOrigen;}
    public void setEnfermedadPrevenida(String aEnfermedadPrevenida) {this.enfermedadPrevenida = aEnfermedadPrevenida;}
    public void setCantDosis(int aCantDosis) {this.cantDosis = aCantDosis;}

}