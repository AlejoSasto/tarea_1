package org.example; // Define el paquete al que pertenece esta clase.

import java.util.ArrayList; // Importa la clase ArrayList de la biblioteca estándar de Java.
import java.util.List; // Importa la interfaz List de la biblioteca estándar de Java.
import java.util.Scanner; // Importa la clase Scanner de la biblioteca estándar de Java.

public class TiposDatosAbstractos { // Define la clase principal TiposDatosAbstractos.

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
    // Un TDA List es una colección de elementos ordenados que permite almacenar y manipular datos de forma dinámica.
    // En Java, la interfaz List define un conjunto de operaciones comunes para trabajar con listas de elementos.
    public static class Lista { // Define la clase interna Lista.
        private List<Integer> elementos; // Declara una lista de enteros llamada elementos.

        public Lista() { // Constructor de la clase Lista.
            elementos = new ArrayList<>(); // Inicializa la lista de elementos como un ArrayList.
        }

        public void agregarElemento(int elemento) { // Método para agregar un elemento a la lista.
            elementos.add(elemento); // Agrega el elemento a la lista.
        }

        public void eliminarElemento(int elemento) { // Método para eliminar un elemento de la lista.
            elementos.remove(Integer.valueOf(elemento)); // Elimina el elemento de la lista.
        }

        public void mostrarElementos() { // Método para mostrar los elementos de la lista.
            System.out.println("Elementos en la lista: " + elementos); // Imprime los elementos de la lista.
        }
    }

    // Ejemplo de TDA Pila (Stack):
    // Una pila es una estructura de datos que sigue el principio LIFO (Last In, First Out),
    // lo que significa que el último elemento en entrar es el primero en salir.
    // En Java, la interfaz Stack define un conjunto de operaciones para trabajar con pilas de elementos.
    public static class Pila { // Define la clase interna Pila.
        private List<Integer> pila; // Declara una lista de enteros llamada pila.

        public Pila() { // Constructor de la clase Pila.
            pila = new ArrayList<>(); // Inicializa la lista de pila como un ArrayList.
        }

        public void apilar(int elemento) { // Método para agregar un elemento a la pila.
            pila.add(elemento); // Agrega el elemento a la pila.
        }

        public Integer desapilar() { // Método para eliminar el último elemento de la pila.
            if (!pila.isEmpty()) { // Verifica si la pila no está vacía.
                return pila.remove(pila.size() - 1); // Elimina y retorna el último elemento de la pila.
            } else {
                return null; // La pila está vacía.
            }
        }

        public void mostrarPila() { // Método para mostrar los elementos de la pila.
            System.out.println("Pila: " + pila); // Imprime los elementos de la pila.
        }
    }

    // Ejemplo de TDA Cola (Queue):
    // Una cola es una estructura de datos que sigue el principio FIFO (First In, First Out),
    // lo que significa que el primer elemento en entrar es el primero en salir.
    // En Java, la interfaz Queue define un conjunto de operaciones para trabajar con colas de elementos.
    public static class Cola { // Define la clase interna Cola.
        private List<Integer> cola; // Declara una lista de enteros llamada cola.

        public Cola() { // Constructor de la clase Cola.
            cola = new ArrayList<>(); // Inicializa la lista de cola como un ArrayList.
        }

        public void encolar(int elemento) { // Método para agregar un elemento a la cola.
            cola.add(elemento); // Agrega el elemento a la cola.
        }

        public Integer desencolar() { // Método para eliminar el primer elemento de la cola.
            if (!cola.isEmpty()) { // Verifica si la cola no está vacía.
                return cola.remove(0); // Elimina y retorna el primer elemento de la cola.
            } else {
                return null; // La cola está vacía.
            }
        }

        public void mostrarCola() { // Método para mostrar los elementos de la cola.
            System.out.println("Cola: " + cola); // Imprime los elementos de la cola.
        }
    }

    // Definimos el TDA para cuentas bancarias
    public static class Cuenta { // Define la clase interna Cuenta.
        // Atributos
        private String numero; // Declara un atributo de tipo String llamado numero.
        private double saldo; // Declara un atributo de tipo double llamado saldo.

        // Constructor
        public Cuenta(String numero, double saldo) { // Constructor de la clase Cuenta.
            this.numero = numero; // Inicializa el atributo numero.
            this.saldo = saldo; // Inicializa el atributo saldo.
        }

        // Métodos
        public String getNumero() { // Método para obtener el número de cuenta.
            return numero; // Retorna el número de cuenta.
        }

        public double getSaldo() { // Método para obtener el saldo de la cuenta.
            return saldo; // Retorna el saldo de la cuenta.
        }

        // Operación de depósito
        public void depositar(double monto) { // Método para depositar un monto en la cuenta.
            saldo += monto; // Incrementa el saldo de la cuenta.
        }

        // Operación de retiro con verificación de saldo
        public boolean retirar(double monto) { // Método para retirar un monto de la cuenta.
            if (monto <= saldo) { // Verifica si el monto a retirar es menor o igual al saldo.
                saldo -= monto; // Decrementa el saldo de la cuenta.
                return true; // Retorna true si la operación fue exitosa.
            } else {
                return false; // Retorna false si no hay suficiente saldo.
            }
        }
    }

    // Definimos el TDA para el Banco, que gestiona múltiples cuentas bancarias.
    public static class Banco { // Define la clase interna Banco.
        // Atributos
        private String nombre; // Declara un atributo de tipo String llamado nombre.
        private List<Cuenta> cuentas; // Declara una lista de objetos Cuenta llamada cuentas.

        // Constructor
        public Banco(String nombre) { // Constructor de la clase Banco.
            this.nombre = nombre; // Inicializa el atributo nombre.
            this.cuentas = new ArrayList<>(); // Inicializa la lista de cuentas como un ArrayList.
        }

        // Método para agregar una cuenta al banco
        public void agregarCuenta(Cuenta cuenta) { // Método para agregar una cuenta a la lista de cuentas.
            cuentas.add(cuenta); // Agrega la cuenta a la lista de cuentas.
        }

        // Método para buscar una cuenta por número
        public Cuenta buscarCuenta(String numero) { // Método para buscar una cuenta por su número.
            for (Cuenta cuenta : cuentas) { // Itera sobre la lista de cuentas.
                if (cuenta.getNumero().equals(numero)) { // Verifica si el número de cuenta coincide.
                    return cuenta; // Retorna la cuenta encontrada.
                }
            }
            return null; // Retorna null si no se encuentra la cuenta.
        }

        // Método para realizar una transferencia entre dos cuentas
        public void transferir(String origen, String destino, double monto) { // Método para transferir dinero entre dos cuentas.
            Cuenta cuentaOrigen = buscarCuenta(origen); // Busca la cuenta de origen.
            Cuenta cuentaDestino = buscarCuenta(destino); // Busca la cuenta de destino.

            if (cuentaOrigen != null && cuentaDestino != null) { // Verifica si ambas cuentas existen.
                if (cuentaOrigen.retirar(monto)) { // Intenta retirar el monto de la cuenta de origen.
                    cuentaDestino.depositar(monto); // Deposita el monto en la cuenta de destino.
                    System.out.println("Transferencia exitosa de " + monto + " desde " + origen + " a " + destino); // Imprime un mensaje de éxito.
                } else {
                    System.out.println("No se pudo realizar la transferencia. Fondos insuficientes en la cuenta origen."); // Imprime un mensaje de error por fondos insuficientes.
                }
            } else {
                System.out.println("No se pudo realizar la transferencia. Cuenta origen o destino no encontrada."); // Imprime un mensaje de error por cuentas no encontradas.
            }
        }
    }
}