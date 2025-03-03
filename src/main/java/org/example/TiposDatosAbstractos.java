package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiposDatosAbstractos {

    // Definición de un Tipo de Dato Abstracto (TDA):
    // Un TDA es un modelo matemático que define un conjunto de objetos y un conjunto de operaciones
    // que se pueden realizar sobre estos objetos. Los objetos son instancias de clases, y las operaciones
    // son los métodos de dichas clases.

    // Características y ventajas de usar un TDA:
    // - Abstracción: Permite ocultar detalles de implementación y simplificar la complejidad del código.
    // - Reutilización: Los objetos de un TDA facilitan la reutilización del código al ser modulares.
    // - Flexibilidad: Los TDAs permiten que el código sea más adaptable a cambios y nuevas funcionalidades.
    // - Encapsulamiento: Los datos y las operaciones están agrupados, lo que mejora la seguridad y facilita el mantenimiento.
    // - Eficiencia: Los TDAs están diseñados para manejar datos de manera eficiente, optimizando el rendimiento.
    // - Escalabilidad: Son fáciles de extender y escalar a medida que el sistema crece.
    // - Mantenimiento: Facilitan la corrección de errores y la implementación de nuevas funcionalidades sin afectar otras partes del sistema.

    // Usos comunes de los TDAs:
    // - Representación de entidades del mundo real (ejemplo: libros, estudiantes, empleados).
    // - Modelado de estructuras de datos (ejemplo: listas, pilas, colas, árboles).
    // - Implementación de algoritmos (ejemplo: búsqueda, ordenación, recorrido).
    // - Abstracción de datos y comportamientos, favoreciendo el mantenimiento y la legibilidad del código.

    // En resumen, los objetos de un TDA mejoran la calidad, seguridad, flexibilidad, y eficiencia del sistema,
    // favoreciendo la colaboración, la optimización y el desarrollo de sistemas más robustos y sostenibles.

    // Ejemplo de TDA List (Lista):
    public static class Lista {
        private List<Integer> elementos;

        public Lista() {
            elementos = new ArrayList<>();
        }

        public void agregarElemento(int elemento) {
            elementos.add(elemento);
        }

        public void eliminarElemento(int elemento) {
            elementos.remove(Integer.valueOf(elemento));
        }

        public void mostrarElementos() {
            System.out.println("Elementos en la lista: " + elementos);
        }
    }

    // Ejemplo de TDA Pila (Stack):
    public static class Pila {
        private List<Integer> pila;

        public Pila() {
            pila = new ArrayList<>();
        }

        public void apilar(int elemento) {
            pila.add(elemento);
        }

        public Integer desapilar() {
            if (!pila.isEmpty()) {
                return pila.remove(pila.size() - 1);
            } else {
                return null; // La pila está vacía
            }
        }

        public void mostrarPila() {
            System.out.println("Pila: " + pila);
        }
    }

    // Ejemplo de TDA Cola (Queue):
    public static class Cola {
        private List<Integer> cola;

        public Cola() {
            cola = new ArrayList<>();
        }

        public void encolar(int elemento) {
            cola.add(elemento);
        }

        public Integer desencolar() {
            if (!cola.isEmpty()) {
                return cola.remove(0);
            } else {
                return null; // La cola está vacía
            }
        }

        public void mostrarCola() {
            System.out.println("Cola: " + cola);
        }
    }

    // Definimos el TDA para cuentas bancarias
    public static class Cuenta {
        // Atributos
        private String numero;
        private double saldo;

        // Constructor
        public Cuenta(String numero, double saldo) {
            this.numero = numero;
            this.saldo = saldo;
        }

        // Métodos
        public String getNumero() {
            return numero;
        }

        public double getSaldo() {
            return saldo;
        }

        // Operación de depósito
        public void depositar(double monto) {
            saldo += monto;
        }

        // Operación de retiro con verificación de saldo
        public boolean retirar(double monto) {
            if (monto <= saldo) {
                saldo -= monto;
                return true;
            } else {
                return false;
            }
        }
    }

    // Definimos el TDA para el Banco, que gestiona múltiples cuentas bancarias.
    public static class Banco {
        // Atributos
        private String nombre;
        private List<Cuenta> cuentas;

        // Constructor
        public Banco(String nombre) {
            this.nombre = nombre;
            this.cuentas = new ArrayList<>();
        }

        // Método para agregar una cuenta al banco
        public void agregarCuenta(Cuenta cuenta) {
            cuentas.add(cuenta);
        }

        // Método para buscar una cuenta por número
        public Cuenta buscarCuenta(String numero) {
            for (Cuenta cuenta : cuentas) {
                if (cuenta.getNumero().equals(numero)) {
                    return cuenta;
                }
            }
            return null;
        }

        // Método para realizar una transferencia entre dos cuentas
        public void transferir(String origen, String destino, double monto) {
            Cuenta cuentaOrigen = buscarCuenta(origen);
            Cuenta cuentaDestino = buscarCuenta(destino);

            if (cuentaOrigen != null && cuentaDestino != null) {
                if (cuentaOrigen.retirar(monto)) {
                    cuentaDestino.depositar(monto);
                    System.out.println("Transferencia exitosa de " + monto + " desde " + origen + " a " + destino);
                } else {
                    System.out.println("No se pudo realizar la transferencia. Fondos insuficientes en la cuenta origen.");
                }
            } else {
                System.out.println("No se pudo realizar la transferencia. Cuenta origen o destino no encontrada.");
            }
        }
    }

    // Método principal donde pedimos los datos por consola y ejecutamos las operaciones
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejemplo de uso del TDA Lista
        Lista lista = new Lista();
        lista.agregarElemento(10);
        lista.agregarElemento(20);
        lista.mostrarElementos();
        lista.eliminarElemento(10);
        lista.mostrarElementos();

        // Ejemplo de uso del TDA Pila
        Pila pila = new Pila();
        pila.apilar(5);
        pila.apilar(10);
        pila.mostrarPila();
        System.out.println("Elemento desapilado: " + pila.desapilar());
        pila.mostrarPila();

        // Ejemplo de uso del TDA Cola
        Cola cola = new Cola();
        cola.encolar(30);
        cola.encolar(40);
        cola.mostrarCola();
        System.out.println("Elemento desencolado: " + cola.desencolar());
        cola.mostrarCola();

        // Creamos una instancia del banco
        Banco banco = new Banco("Mi Banco");

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
        Cuenta cuenta1 = new Cuenta(numeroCuenta1, saldoCuenta1);
        Cuenta cuenta2 = new Cuenta(numeroCuenta2, saldoCuenta2);

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
