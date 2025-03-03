package org.example;

public class Clases_Obj {

    // Clases
    // Una clase es un modelo que define un conjunto de atributos y métodos que pueden tener los objetos de un tipo de datos.
    // En Java, una clase se define con la palabra clave 'class' seguida del nombre de la clase y el cuerpo de la clase entre llaves.
    // Ejemplo:
    public class MyClass {
        // Atributos
        // Los atributos son variables que pertenecen a la clase y describen las propiedades de los objetos.
        int x = 5;
        // Métodos
        // Los métodos son funciones que pertenecen a la clase y definen el comportamiento de los objetos.
        public void myMethod() {
            System.out.println("Hello World");
        }
    }

    // Objetos
    // Un objeto es una instancia de una clase. Cuando se crea un objeto, se asigna memoria para almacenar sus atributos.
    // En Java, un objeto se crea con la palabra clave 'new' seguida del nombre de la clase y paréntesis.
    // Ejemplo de creación de un objeto:
    public void createObject() {
        // Creación de un objeto de la clase MyClass
        MyClass myObject = new MyClass();
        // Acceso a los atributos y métodos del objeto
        System.out.println(myObject.x); // Imprime el valor del atributo 'x'
        myObject.myMethod(); // Llama al método 'myMethod' del objeto
    }
}