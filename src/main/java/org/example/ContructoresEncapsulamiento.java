package org.example;

public class ContructoresEncapsulamiento {

    // Un constructor es un método especial que se llama automáticamente cuando se crea una instancia de una clase.
    // Se utiliza para inicializar los objetos de la clase.
    // El nombre del constructor debe ser el mismo que el nombre de la clase y no tiene un tipo de retorno.

    // El encapsulamiento es el concepto de ocultar los detalles internos de una clase y exponer solo lo necesario.
    // Esto se logra utilizando modificadores de acceso como private, protected y public.

    // Clase Person con dos constructores
    class Person {
        // Variables de instancia privadas (encapsulamiento)
        private String name;
        private int age;

        // Constructor sin argumentos
        // Este constructor inicializa las variables de instancia con valores predeterminados.
        public Person() {
            this.name = "John";
            this.age = 30;
        }

        // Constructor con argumentos
        // Este constructor inicializa las variables de instancia con los valores proporcionados.
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Métodos públicos para acceder a las variables privadas (encapsulamiento)
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        // Método para imprimir los valores de las variables de instancia
        public void printValues() {
            System.out.println("Nombre: " + name);
            System.out.println("Edad: " + age);
        }
    }
}