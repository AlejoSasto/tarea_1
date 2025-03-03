package org.example;
import org.example.TiposDatos;
import org.example.Operadores;
import org.example.ControlFlujo;
import org.example.Metodos;
import org.example.calculator;
import org.example.Clases_Obj;
import org.example.Poliformismo;
import org.example.ContructoresEncapsulamiento;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*// importando la clase TiposDatos
        // Crear una instancia de TiposDatos
        // ¿Qué es una instancia?
        // Una instancia es un objeto de una clase.
        // Cuando se crea una instancia de una clase, se reserva un espacio en la memoria para almacenar los datos.
        // La instancia de una clase se crea utilizando la palabra clave new seguida del nombre de la clase y los paréntesis.

        TiposDatos tiposDatos = new TiposDatos();
        // Llamar a los métodos para imprimir los valores de las variables
        tiposDatos.printVariables();
        tiposDatos.printStringVariable();*/

        /*// Crear una instancia de Operadores
        Operadores operadores = new Operadores();

        // Llamar a los métodos de Operadores
        operadores.arithmeticOperators();
        operadores.assignmentOperators();
        operadores.comparisonOperators();
        operadores.logicalOperators();
        operadores.bitwiseOperators();
        operadores.shiftOperators();
        operadores.conditionalOperator();
        operadores.instanceofOperator();*/

        /*// importando la clase ControlFlujo
        ControlFlujo controlFlujo = new ControlFlujo();
        controlFlujo.ifStatement();
        controlFlujo.switchStatement();
        controlFlujo.whileLoop();
        controlFlujo.doWhileLoop();
        controlFlujo.forLoop();
        controlFlujo.breakStatement();
        controlFlujo.continueStatement();
        controlFlujo.returnStatement();*/

        /*// Crear una instancia de Metodos
        Metodos metodos = new Metodos();

        // Llamar a los métodos de Metodos
        metodos.printMessage(); // Llama al método que imprime un mensaje
        metodos.printSum(10, 20); // Llama al método que imprime la suma de dos números
        int product = metodos.calculateProduct(5, 4); // Llama al método que calcula el producto de dos números
        System.out.println("Producto: " + product); // Imprime el resultado del producto
        int difference = metodos.calculateDifference(10, 5); // Llama al método que calcula la diferencia de dos números
        System.out.println("Diferencia: " + difference); // Imprime el resultado de la diferencia
        metodos.printInfo("Juan"); // Llama al método que imprime el nombre
        metodos.printInfo("Juan", 25); // Llama al método que imprime el nombre y la edad
        int factorial = metodos.factorial(5); // Llama al método que calcula el factorial de un número
        System.out.println("Factorial: " + factorial); // Imprime el resultado del factorial
        metodos.printNumbers(1, 2, 3, 4, 5); // Llama al método que imprime una lista de números*/

        /*// importando la clase calculator
        calculator calculator = new calculator();
        calculator.start();*/

        /*// importando la clase Clases_Obj
        Clases_Obj Clases_Obj = new Clases_Obj();
        Clases_Obj.createObject();*/

        /*// importando la clase Poliformismo
        Poliformismo Poliformismo = new Poliformismo();
        Poliformismo.usePolymorphism();*/


        // importando la clase ContructoresEncapsulamiento
        // Crear una instancia de la clase Person utilizando el constructor sin argumentos
        ContructoresEncapsulamiento example = new ContructoresEncapsulamiento();

        // Crear una instancia de Person utilizando el constructor sin argumentos
        ContructoresEncapsulamiento.Person person1 = example.new Person(); // Llama al constructor sin argumentos
        person1.printValues(); // Imprime los valores predeterminados

        // Crear una instancia de Person utilizando el constructor con argumentos
        ContructoresEncapsulamiento.Person person2 = example.new Person("Alice", 25); // Llama al constructor con argumentos
        person2.printValues(); // Imprime los valores proporcionados

        // Modificar los valores utilizando los métodos públicos (encapsulamiento)
        person2.setName("Eve");
        person2.setAge(30);
        person2.printValues(); // Imprime los valores modificados

    }
}