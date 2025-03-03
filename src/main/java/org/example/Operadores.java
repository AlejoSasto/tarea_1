package org.example;

public class Operadores {

    // Operadores
    // Los operadores son símbolos especiales que realizan operaciones sobre variables y valores.
    // En Java, los operadores se clasifican en diferentes categorías, como aritméticos, de asignación, de comparación, lógicos, etc.

    // Ejemplo de operadores aritméticos:
    // El operador aritmético se utiliza para realizar operaciones matemáticas en variables.
    // Los operadores aritméticos en Java son: +, -, *, /, %.
    public void arithmeticOperators() {
        int a = 10;
        int b = 5;
        // Suma
        int sum = a + b; // 15
        System.out.println("Suma: " + sum);
        // Resta
        int difference = a - b; // 5
        System.out.println("Resta: " + difference);
        // Multiplicación
        int product = a * b; // 50
        System.out.println("Multiplicación: " + product);
        // División
        int quotient = a / b; // 2
        System.out.println("División: " + quotient);
        // Módulo
        int remainder = a % b; // 0
        System.out.println("Módulo: " + remainder);
    }

    // Ejemplo de operadores de asignación:
    // El operador de asignación se utiliza para asignar un valor a una variable.
    // Los operadores de asignación en Java son: =, +=, -=, *=, /=, %=.
    public void assignmentOperators() {
        int a = 10;
        // Asignación simple
        int b = a; // b = 10
        System.out.println("Asignación simple: " + b);
        // Asignación con suma
        b += a; // b = b + a = 20
        System.out.println("Asignación con suma: " + b);
        // Asignación con resta
        b -= a; // b = b - a = 10
        System.out.println("Asignación con resta: " + b);
        // Asignación con multiplicación
        b *= a; // b = b * a = 100
        System.out.println("Asignación con multiplicación: " + b);
        // Asignación con división
        b /= a; // b = b / a = 10
        System.out.println("Asignación con división: " + b);
        // Asignación con módulo
        b %= a; // b = b % a = 0
        System.out.println("Asignación con módulo: " + b);
    }

    // Ejemplo de operadores de comparación:
    // El operador de comparación se utiliza para comparar dos valores.
    // Los operadores de comparación en Java son: ==, !=, >, <, >=, <=.
    public void comparisonOperators() {
        int a = 10;
        int b = 5;
        // Igual a
        boolean isEqual = a == b; // false
        System.out.println("Igual a: " + isEqual);
        // No igual a
        boolean isNotEqual = a != b; // true
        System.out.println("No igual a: " + isNotEqual);
        // Mayor que
        boolean isGreater = a > b; // true
        System.out.println("Mayor que: " + isGreater);
        // Menor que
        boolean isLess = a < b; // false
        System.out.println("Menor que: " + isLess);
        // Mayor o igual que
        boolean isGreaterOrEqual = a >= b; // true
        System.out.println("Mayor o igual que: " + isGreaterOrEqual);
        // Menor o igual que
        boolean isLessOrEqual = a <= b; // false
        System.out.println("Menor o igual que: " + isLessOrEqual);
    }

    // Ejemplo de operadores lógicos:
    // Los operadores lógicos se utilizan para combinar expresiones condicionales.
    // Los operadores lógicos en Java son: && (AND lógico), || (OR lógico), ! (NOT lógico).
    public void logicalOperators() {
        boolean a = true;
        boolean b = false;
        // AND lógico
        boolean and = a && b; // false
        System.out.println("AND lógico: " + and);
        // OR lógico
        boolean or = a || b; // true
        System.out.println("OR lógico: " + or);
        // NOT lógico
        boolean notA = !a; // false
        System.out.println("NOT lógico de a: " + notA);
        boolean notB = !b; // true
        System.out.println("NOT lógico de b: " + notB);
    }

    // Ejemplo de operadores de incremento y decremento:
    // Los operadores de incremento y decremento se utilizan para aumentar o disminuir el valor de una variable en 1.
    // Los operadores de incremento y decremento en Java son: ++ (incremento), -- (decremento).
    public void incrementDecrementOperators() {
        int a = 10;
        // Incremento
        a++; // a = a + 1 = 11
        System.out.println("Incremento: " + a);
        // Decremento
        a--; // a = a - 1 = 10
        System.out.println("Decremento: " + a);
    }

    // Ejemplo de operadores de desplazamiento:
    // Los operadores de desplazamiento se utilizan para desplazar los bits de un número hacia la izquierda o hacia la derecha.
    // Los operadores de desplazamiento en Java son: << (desplazamiento a la izquierda), >> (desplazamiento a la derecha).
    public void shiftOperators() {
        int a = 8; // 1000 en binario
        // Desplazamiento a la izquierda
        int leftShift = a << 1; // 10000 en binario, equivalente a multiplicar por 2
        System.out.println("Desplazamiento a la izquierda: " + leftShift);
        // Desplazamiento a la derecha
        int rightShift = a >> 1; // 100 en binario, equivalente a dividir por 2
        System.out.println("Desplazamiento a la derecha: " + rightShift);
    }

    // Ejemplo de operadores de bits:
    // Los operadores de bits se utilizan para realizar operaciones a nivel de bits en números enteros.
    // Los operadores de bits en Java son: & (AND a nivel de bits), | (OR a nivel de bits), ^ (XOR a nivel de bits), ~ (NOT a nivel de bits).
    public void bitwiseOperators() {
        int a = 5; // 101 en binario
        int b = 3; // 011 en binario
        // AND a nivel de bits
        int and = a & b; // 001 en binario
        System.out.println("AND a nivel de bits: " + and);
        // OR a nivel de bits
        int or = a | b; // 111 en binario
        System.out.println("OR a nivel de bits: " + or);
        // XOR a nivel de bits
        int xor = a ^ b; // 110 en binario
        System.out.println("XOR a nivel de bits: " + xor);
        // NOT a nivel de bits
        int notA = ~a; // 11111111111111111111111111111010 en binario
        System.out.println("NOT a nivel de bits: " + notA);
    }

    // Ejemplo de operador condicional (ternario):
    // El operador condicional (ternario) se utiliza para tomar decisiones basadas en una condición.
    // El operador condicional en Java es: ? :.
    public void conditionalOperator() {
        int a = 10;
        int b = 5;
        // Operador condicional (ternario)
        int max = (a > b) ? a : b; // 10
        System.out.println("El número mayor es: " + max);
    }

    // Ejemplo de operador de instanceof:
    // El operador instanceof se utiliza para verificar si un objeto es una instancia de una clase o interfaz.
    // El operador instanceof en Java es: instanceof.
    public void instanceofOperator() {
        Object obj = new String("Hello");
        // instanceof
        boolean isString = obj instanceof String; // true
        System.out.println("¿El objeto es una instancia de String? " + isString);
    }
}