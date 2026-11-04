package Practica5.Ejericio3;

@Servidor(ip="127.000", puerto="3001", archivo="archivo.txt")
public class MiServidor {
    private boolean prendido = false;

    public MiServidor(){}

    @Invocar
    public void conectar(){
        if (prendido){System.out.println("Ya esta conectado al servidor");}
        else {System.out.println("200 OK");}
    }

    @Invocar
    public void desconectar(){
        if (!prendido){System.out.println("No esta conectado al servidor");}
        System.out.println("500 Internal Server Error");
    }

}
