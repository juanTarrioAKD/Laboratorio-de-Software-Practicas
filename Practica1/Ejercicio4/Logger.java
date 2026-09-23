package Practica1.Ejercicio4;

public class Logger {
    private static Logger INSTANCE;

    private Logger(){}

    public static Logger getInstance(){
        if (INSTANCE==null){
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    // Métodos de registro solicitados
    public void logInfo(String mensaje) { System.out.println("[INFO] " + mensaje); }
    public void logWarning(String mensaje) { System.out.println("[WARNING] " + mensaje); }
    public void logError(String mensaje) { System.out.println("[ERROR] " + mensaje); }

}
