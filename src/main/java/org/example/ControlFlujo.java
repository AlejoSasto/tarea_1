package org.example;

            public class ControlFlujo {

                // Estructuras de control de flujo
                // Las estructuras de control de flujo permiten modificar el flujo de ejecución de un programa.
                // En Java, las estructuras de control de flujo se dividen en tres categorías principales: selección, iteración y salto.

                // Ejemplo de estructura de selección (if-else)
                // La estructura de selección if-else se utiliza para tomar decisiones basadas en una condición.
                public void ifStatement() {
                    int x = 10;
                    int y = 5;
                    if (x > y) {
                        System.out.println("x es mayor que y");
                    } else {
                        System.out.println("y es mayor que x");
                    }
                }

                // Ejemplo de estructura de selección (switch)
                // La estructura de selección switch se utiliza para seleccionar una de las muchas opciones.
                public void switchStatement() {
                    int day = 3;
                    switch (day) {
                        case 1:
                            System.out.println("Lunes");
                            break;
                        case 2:
                            System.out.println("Martes");
                            break;
                        case 3:
                            System.out.println("Miércoles");
                            break;
                        case 4:
                            System.out.println("Jueves");
                            break;
                        case 5:
                            System.out.println("Viernes");
                            break;
                        case 6:
                            System.out.println("Sábado");
                            break;
                        case 7:
                            System.out.println("Domingo");
                            break;
                        default:
                            System.out.println("Día inválido");
                            break;
                    }
                }

                // Ejemplo de estructura de iteración (while)
                // La estructura de iteración while se utiliza para repetir un bloque de código mientras se cumpla una condición.
                public void whileLoop() {
                    int i = 0;
                    while (i < 5) {
                        System.out.println("while loop: " + i);
                        i++;
                    }
                }

                // Ejemplo de estructura de iteración (do-while)
                // La estructura de iteración do-while se utiliza para repetir un bloque de código al menos una vez
                // y luego repetirlo mientras se cumpla una condición.
                public void doWhileLoop() {
                    int i = 0;
                    do {
                        System.out.println("do-while loop: " + i);
                        i++;
                    } while (i < 5);
                }

                // Ejemplo de estructura de iteración (for)
                // La estructura de iteración for se utiliza para repetir un bloque de código un número específico de veces.
                public void forLoop() {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("for loop: " + i);
                    }
                }

                // Ejemplo de estructura de salto (break)
                // La estructura de salto break se utiliza para salir de un bucle o un switch.
                public void breakStatement() {
                    for (int i = 0; i < 10; i++) {
                        if (i == 5) {
                            break;
                        }
                        System.out.println("break statement: " + i);
                    }
                }

                // Ejemplo de estructura de salto (continue)
                // La estructura de salto continue se utiliza para saltar a la siguiente iteración de un bucle.
                public void continueStatement() {
                    for (int i = 0; i < 10; i++) {
                        if (i == 5) {
                            continue;
                        }
                        System.out.println("continue statement: " + i);
                    }
                }

                // Ejemplo de estructura de salto (return)
                // La estructura de salto return se utiliza para devolver un valor de un método.
                public void returnStatement() {
                    for (int i = 0; i < 10; i++) {
                        if (i == 5) {
                            System.out.println("return statement: " + i);
                            return;
                        }
                        System.out.println("return statement: " + i);
                    }
                }
            }