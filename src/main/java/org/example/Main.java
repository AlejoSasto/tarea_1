package org.example;
import java.util.Scanner;

import org.example.TiposDatos;
import org.example.Operadores;
import org.example.ControlFlujo;
import org.example.Metodos;
import org.example.calculator;
import org.example.Clases_Obj;
import org.example.Poliformismo;
import org.example.ContructoresEncapsulamiento;
import org.example.ClaseAbstracta;
import org.example.MemoriaDinamica;
import org.example.MemoriaEstatica;
import org.example.TiposDatosAbstractos;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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


        /*// importando la clase ContructoresEncapsulamiento
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
        person2.printValues(); // Imprime los valores modificados*/

        /*// importando la clase ClaseAbstracta
        ClaseAbstracta ClaseAbstracta = new ClaseAbstracta();
        ClaseAbstracta.Dog dog = ClaseAbstracta.new Dog();
        dog.makeSound();
        dog.sleep();
        ClaseAbstracta.Cat cat = ClaseAbstracta.new Cat();
        cat.makeSound();
        cat.sleep();*/

        /*// importando la clase MemoriaDinamica
        // Crear una instancia de la clase MemoriaDinamica y llamar al método ejecutar
        MemoriaDinamica memoriaDinamica = new MemoriaDinamica();
        memoriaDinamica.ejecutar();*/

        /*// importando la clase MemoriaEstatica
        // Crear una instancia de la clase MemoriaEstatica
        MemoriaEstatica memoriaEstatica = new MemoriaEstatica();
        // Aquí se está creando una nueva instancia de la clase MemoriaEstatica.
        // La memoria para este objeto se asigna dinámicamente en el montón.
        System.out.println("Se ha creado una instancia de MemoriaEstatica.");

        // Llamar al método ejecutar
        memoriaEstatica.ejecutar();*/

        // importando la clase TiposDatosAbstractos
        // Crear una instancia de la clase TiposDatosAbstractos
        // Ejemplo de uso del TDA Lista
        TiposDatosAbstractos.Lista lista = new TiposDatosAbstractos.Lista();
        lista.agregarElemento(10);
        lista.agregarElemento(20);
        lista.mostrarElementos();
        lista.eliminarElemento(10);
        lista.mostrarElementos();

        // Ejemplo de uso del TDA Pila
        TiposDatosAbstractos.Pila pila = new TiposDatosAbstractos.Pila();
        pila.apilar(5);
        pila.apilar(10);
        pila.mostrarPila();
        System.out.println("Elemento desapilado: " + pila.desapilar());
        pila.mostrarPila();

        // Ejemplo de uso del TDA Cola
        TiposDatosAbstractos.Cola cola = new TiposDatosAbstractos.Cola();
        cola.encolar(30);
        cola.encolar(40);
        cola.mostrarCola();
        System.out.println("Elemento desencolado: " + cola.desencolar());
        cola.mostrarCola();

        // Creamos una instancia del banco
        TiposDatosAbstractos.Banco banco = new TiposDatosAbstractos.Banco("Mi Banco");

        // Pedimos datos para crear cuentas
        System.out.print("Ingrese el número de la cuenta 1: ");
        String numeroCuenta1 = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial de la cuenta 1: ");
        double saldoCuenta1 = scanner.nextDouble();
        scanner.nextLine();  // Limpiar el buffer de entrada

        System.out.print("Ingrese el número de la cuenta 2: ");
        String numeroCuenta2 = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial de la cuenta 2: ");
        double saldoCuenta2 = scanner.nextDouble();
        scanner.nextLine();  // Limpiar el buffer de entrada

        // Crear cuentas con los datos ingresados
        TiposDatosAbstractos.Cuenta cuenta1 = new TiposDatosAbstractos.Cuenta(numeroCuenta1, saldoCuenta1);
        TiposDatosAbstractos.Cuenta cuenta2 = new TiposDatosAbstractos.Cuenta(numeroCuenta2, saldoCuenta2);

        // Agregar las cuentas al banco
        banco.agregarCuenta(cuenta1);
        banco.agregarCuenta(cuenta2);

        // Mostrar el estado de las cuentas
        System.out.println("Cuentas creadas con éxito.");
        System.out.println("Cuenta 1: " + cuenta1.getNumero() + " con saldo " + cuenta1.getSaldo());
        System.out.println("Cuenta 2: " + cuenta2.getNumero() + " con saldo " + cuenta2.getSaldo());

        // Realizar una transferencia
        System.out.print("Ingrese el monto a transferir de la cuenta 1 a la cuenta 2: ");
        double montoTransferir = scanner.nextDouble();
        scanner.nextLine();  // Limpiar el buffer de entrada

        banco.transferir(numeroCuenta1, numeroCuenta2, montoTransferir);

        // Mostrar el estado final de las cuentas
        System.out.println("Saldo final de la Cuenta 1: " + cuenta1.getSaldo());
        System.out.println("Saldo final de la Cuenta 2: " + cuenta2.getSaldo());

        scanner.close();

    }
}