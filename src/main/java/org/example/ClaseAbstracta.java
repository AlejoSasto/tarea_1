package org.example;

public class ClaseAbstracta {

    // Una clase abstracta en Java es una clase que no se puede instanciar directamente.
    // Se utiliza como una superclase que define métodos abstractos que deben ser implementados por las subclases.
    // Una clase abstracta puede contener métodos abstractos (sin implementación) y métodos concretos (con implementación).

    // Definición de una clase abstracta
    public abstract class Animal {
        // Método abstracto (sin implementación)
        public abstract void makeSound();

        // Método concreto (con implementación)
        public void sleep() {
            System.out.println("El animal está durmiendo");
        }
    }

    // Subclase que extiende la clase abstracta y proporciona implementación para el método abstracto
    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("El perro ladra");
        }
    }

    // Subclase que extiende la clase abstracta y proporciona implementación para el método abstracto
    class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("El gato maúlla");
        }
    }
}
