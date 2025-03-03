package org.example;

public class MemoriaDinamica {

    // ¿Qué es la memoria dinámica?
    // La memoria dinámica es un tipo de memoria que se asigna en tiempo de ejecución.
    // En Java, la memoria dinámica se asigna utilizando la palabra clave new.
    // La memoria dinámica se asigna en el montón (heap) de la memoria.
    // La memoria dinámica se libera automáticamente cuando el objeto ya no es accesible.
    // En Java, el recolector de basura (garbage collector) se encarga de liberar la memoria dinámica.
    // La memoria dinámica se utiliza para almacenar objetos y matrices.

    public void ejecutar() {
        // Crear una instancia de la clase MemoriaDinamica
        MemoriaDinamica memoriaDinamica = new MemoriaDinamica();
        // Aquí se está creando una nueva instancia de la clase MemoriaDinamica.
        // La memoria para este objeto se asigna dinámicamente en el montón.
        System.out.println("Se ha creado una instancia de MemoriaDinamica.");

        // Crear un objeto de la clase MemoriaDinamica
        MemoriaDinamica objeto = new MemoriaDinamica();
        // Similar al anterior, se está creando otro objeto de la clase MemoriaDinamica.
        // La memoria para este objeto también se asigna dinámicamente en el montón.
        System.out.println("Se ha creado otro objeto de MemoriaDinamica.");

        // Crear una matriz de enteros
        int[] numeros = new int[5];
        // Se está creando una matriz de enteros con 5 elementos.
        // La memoria para esta matriz se asigna dinámicamente en el montón.
        System.out.println("Se ha creado una matriz de enteros con 5 elementos.");

        // Crear una matriz de cadenas
        String[] nombres = new String[3];
        // Se está creando una matriz de cadenas (String) con 3 elementos.
        // La memoria para esta matriz se asigna dinámicamente en el montón.
        System.out.println("Se ha creado una matriz de cadenas con 3 elementos.");

        // Crear una matriz de objetos
        Object[] objetos = new Object[4];
        // Se está creando una matriz de objetos con 4 elementos.
        // La memoria para esta matriz se asigna dinámicamente en el montón.
        System.out.println("Se ha creado una matriz de objetos con 4 elementos.");

        // Crear una matriz de objetos de la clase MemoriaDinamica
        MemoriaDinamica[] instancias = new MemoriaDinamica[2];
        // Se está creando una matriz de objetos de la clase MemoriaDinamica con 2 elementos.
        // La memoria para esta matriz se asigna dinámicamente en el montón.
        System.out.println("Se ha creado una matriz de objetos de MemoriaDinamica con 2 elementos.");
    }
}