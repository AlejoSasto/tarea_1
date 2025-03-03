package org.example;

    public class Metodos {

        // Que es un metodo?
        // Un método es un bloque de código que se ejecuta cuando se llama.
        // Puede recibir parámetros y devolver un valor.
        // Los métodos se utilizan para realizar ciertas acciones y también se conocen como funciones.


        // Método sin parámetros y sin valor de retorno
        // Este método simplemente imprime un mensaje en la consola.
        public void printMessage() {
            System.out.println("¡Hola, mundo!");
        }

        // Método con parámetros y sin valor de retorno
        // Este método recibe dos parámetros, calcula su suma y la imprime en la consola.
        public void printSum(int a, int b) {
            int sum = a + b;
            System.out.println("La suma de " + a + " y " + b + " es: " + sum);
        }

        // Método con valor de retorno y sin parámetros
        // Este método recibe dos parámetros, calcula su producto y devuelve el resultado.
        public int calculateProduct(int a, int b) {
            return a * b;
        }

        // Método con parámetros y valor de retorno
        // Este método recibe dos parámetros, calcula su diferencia y devuelve el resultado.
        public int calculateDifference(int a, int b) {
            return a - b;
        }

        // Método con sobrecarga (overloading)
        // Estos métodos tienen el mismo nombre pero diferentes parámetros.
        // Este método imprime el nombre en la consola.
        public void printInfo(String name) {
            System.out.println("Nombre: " + name);
        }

        // Este método imprime el nombre y la edad en la consola.
        public void printInfo(String name, int age) {
            System.out.println("Nombre: " + name + ", Edad: " + age);
        }

        // Método recursivo
        // Este método calcula el factorial de un número utilizando recursión.
        public int factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }

        // Método con varargs (argumentos variables)
        // Este método puede recibir un número variable de argumentos enteros y los imprime en la consola.
        public void printNumbers(int... numbers) {
            for (int number : numbers) {
                System.out.println("Número: " + number);
            }
        }
    }