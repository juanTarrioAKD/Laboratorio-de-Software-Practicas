Ejericio 1C:

Luego de ejecutar el programa sin comentar el toString() me dio como resultado:

    Sputnik VRusiaCOVID-192
    PfizerEE.UU.COVID-192
    SpikevaxEE.UU.COVID-191
    AstraZenecaEE.UU.COVID-193
    NovavaxEE.UU.COVID-191

Para el inciso C nos solicitan comentar el toString(), la salida por terminal fue:

    Practica1.Ejercicio1.Vacuna@8efb846
    Practica1.Ejercicio1.Vacuna@2a84aee7
    Practica1.Ejercicio1.Vacuna@a09ee92
    Practica1.Ejercicio1.Vacuna@30f39991
    Practica1.Ejercicio1.Vacuna@452b3a41

¿Porque ocurre esto?, por como funciona java.lang.Object,
al no sobreescribir toString() ejecuta el que posee la clase
Object (todo hereda de Object) el cual imprime el nombre completo
de la clase + @ con el hashCode() de la instancia en memoria.