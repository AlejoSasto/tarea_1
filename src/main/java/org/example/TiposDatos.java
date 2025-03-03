package org.example;

    import java.util.Scanner;

    public class TiposDatos {
        // Tipos de Datos
        // En Java, los tipos de datos se dividen en dos categorías: primitivos y de referencia.
        // Los tipos de datos primitivos son tipos de datos básicos que almacenan valores directamente,
        // mientras que los tipos de datos de referencia son objetos que almacenan referencias a los valores.
        // Ejemplos de tipos de datos primitivos en Java son int, double, char, boolean, etc.
        // Ejemplos de tipos de datos de referencia en Java son String, Scanner, Random, etc.

        // Tipos de Datos Primitivos
        // Los tipos de datos primitivos en Java son:
        // byte: 8 bits, rango de -128 a 127
        byte byteVariable = 10;
        // short: 16 bits, rango de -32,768 a 32,767
        short shortVariable = 20;
        // int: 32 bits, rango de -2,147,483,648 a 2,147,483,647
        int intVariable = 30;
        // long: 64 bits, rango de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        long longVariable = 40L;
        // float: 32 bits, rango de 1.4e-45 a 3.4e+38, precisión de 7 decimales
        float floatVariable = 50.5f;
        // double: 64 bits, rango de 4.9e-324 a 1.8e+308, precisión de 15 decimales
        double doubleVariable = 60.6;
        // char: 16 bits, rango de 0 a 65,535
        char charVariable = 'A';
        // boolean: 1 bit, true o false
        boolean booleanVariable = true;

        // Método para imprimir los valores de las variables primitivas
        public void printVariables() {
            System.out.println("byteVariable: " + byteVariable);
            System.out.println("shortVariable: " + shortVariable);
            System.out.println("intVariable: " + intVariable);
            System.out.println("longVariable: " + longVariable);
            System.out.println("floatVariable: " + floatVariable);
            System.out.println("doubleVariable: " + doubleVariable);
            System.out.println("charVariable: " + charVariable);
            System.out.println("booleanVariable: " + booleanVariable);
        }

        // Tipos de Datos de Referencia
        // Los tipos de datos de referencia en Java son objetos que almacenan referencias a los valores.
        // Ejemplos de tipos de datos de referencia en Java son String, Scanner, Random, etc.

        // Ejemplo de declaración de una variable con tipo de dato de referencia:
        String stringVariable = "Hello, World!";

        // Método para imprimir el valor de la variable de referencia
        public void printStringVariable() {
            System.out.println("stringVariable: " + stringVariable);
        }

        // Ejemplo de declaración de una variable Scanner
        Scanner scanner = new Scanner(System.in);
    }