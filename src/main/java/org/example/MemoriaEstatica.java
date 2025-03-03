package org.example;

public class MemoriaEstatica {

    // ¿Qué es la memoria estática?
    // La memoria estática es un tipo de memoria que se asigna en tiempo de compilación.
    // En Java, la memoria estática se asigna utilizando la palabra clave static.
    // La memoria estática se asigna en la memoria de la clase.
    // La memoria estática se libera automáticamente cuando la clase se descarga.
    // La memoria estática se utiliza para almacenar variables y métodos estáticos.

    // Variables estáticas
    static int numero = 10;
    static String mensaje = "Hola, mundo!";

    // Método estático
    public static void imprimirMensaje() {
        System.out.println("Mensaje: " + mensaje);
    }

    public void ejecutar() {
        // Acceder a las variables estáticas
        System.out.println("Número: " + numero);
        System.out.println("Mensaje: " + mensaje);

        // Llamar al método estático
        imprimirMensaje();

        // Modificar las variables estáticas
        numero = 20;
        mensaje = "¡Hola, Java!";

        // Acceder a las variables estáticas modificadas
        System.out.println("Número: " + numero);
        System.out.println("Mensaje: " + mensaje);

        // Llamar al método estático nuevamente
        imprimirMensaje();
    }
}
