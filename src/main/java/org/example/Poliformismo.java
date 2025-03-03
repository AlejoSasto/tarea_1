package org.example;

    // Polimorfismo
    // El polimorfismo es un concepto de la programación orientada a objetos que permite a los objetos
    // de diferentes clases responder al mismo mensaje de manera distinta.
    // En Java, el polimorfismo se puede lograr mediante la herencia y la implementación de interfaces.

    public class Poliformismo {

        // Ejemplo de polimorfismo mediante herencia:
        public class Animal {
            // Método que será sobrescrito por las subclases
            public void makeSound() {
                System.out.println("Animal hace un sonido");
            }
        }

        // Clase Dog que hereda de Animal
        // Herencia: Dog hereda de Animal y sobrescribe el método makeSound.
        public class Dog extends Animal {
            @Override
            public void makeSound() {
                System.out.println("El perro ladra");
            }
        }

        // Clase Cat que hereda de Animal
        // Herencia: Cat hereda de Animal y sobrescribe el método makeSound.
        public class Cat extends Animal {
            @Override
            public void makeSound() {
                System.out.println("El gato maúlla");
            }
        }

        // Ejemplo de polimorfismo mediante implementación de interfaces:
        // Interfaz Shape con un método draw
        // Una interfaz define un contrato que las clases deben cumplir.
        public interface Shape {
            void draw();
        }

        // Clase Circle que implementa la interfaz Shape
        // Implementación de interfaces: Circle implementa el método draw de la interfaz Shape.
        public class Circle implements Shape {
            @Override
            public void draw() {
                System.out.println("Se dibuja un círculo");
            }
        }

        // Clase Rectangle que implementa la interfaz Shape
        // Implementación de interfaces: Rectangle implementa el método draw de la interfaz Shape.
        public class Rectangle implements Shape {
            @Override
            public void draw() {
                System.out.println("Se dibuja un rectángulo");
            }
        }

        // Método para demostrar el uso del polimorfismo
        public void usePolymorphism() {
            // Polimorfismo mediante herencia
            // Los objetos dog y cat son instancias de las subclases Dog y Cat, respectivamente,
            // pero se tratan como objetos de la clase base Animal.
            Animal dog = new Dog();
            Animal cat = new Cat();
            dog.makeSound(); // Output: El perro ladra
            cat.makeSound(); // Output: El gato maúlla

            // Polimorfismo mediante implementación de interfaces
            // Los objetos circle y rectangle son instancias de las clases Circle y Rectangle, respectivamente,
            // pero se tratan como objetos de la interfaz Shape.
            Shape circle = new Circle();
            Shape rectangle = new Rectangle();
            circle.draw(); // Output: Se dibuja un círculo
            rectangle.draw(); // Output: Se dibuja un rectángulo
        }
    }