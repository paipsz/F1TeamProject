//Hecho Por felipe Giraldo Neira CC 1020302073
package com.eafun.f1team;


import com.eafun.f1team.models.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crear el equipo de F1
        F1Team eafun = new F1Team("Eafun", 2024);

        // Crear 20 miembros del equipo de boxes
        for (int i = 1; i <= 20; i++) {
            PitCrewTeam pitCrewMember = new PitCrewTeam("Role" + i, 1);
            eafun.addTeamMember(pitCrewMember);
        }

        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();

        // Bucle principal del programa
        while (true) {
            System.out.println("¿Qué te gustaría hacer?");
            System.out.println("1. Mostrar información del equipo");
            System.out.println("2. Dar una vuelta");
            System.out.println("3. Salir");
            System.out.print("Ingresa una opción: ");
            int option = scanner.nextInt();

            if (option == 1) {
                // Mostrar la información del equipo
                eafun.displayTeamInfo();
            } else if (option == 2) {
                // Dar una vuelta
                System.out.println("Dando una vuelta...");

                // Generar un número aleatorio entre 0 y 1
                int needTireChange = random.nextInt(2);

                if (needTireChange == 1) {
                    System.out.println("Uno de los carros necesita cambio de llantas!");
                    System.out.println("¿Qué te gustaría hacer?");
                    System.out.println("1. Cambiar las llantas");
                    System.out.println("2. Seguir en la carrera");
                    System.out.print("Ingresa una opción: ");
                    int tireOption = scanner.nextInt();

                    if (tireOption == 1) {
                        // Cambiar las llantas
                        System.out.println("Cambiando las llantas...");
                        // Aquí puedes llamar a un método para cambiar las llantas
                    } else if (tireOption == 2) {
                        // Seguir en la carrera
                        System.out.println("Siguiendo en la carrera...");

                        // Generar un número aleatorio entre 0 y 1
                        int crash = random.nextInt(2);

                        if (crash == 1) {
                            System.out.println("¡Oh no! El carro ha tenido un choque y el conductor está incapacitado.");
                            // Aquí puedes llamar a un método para manejar el choque
                        }
                    } else {
                        System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    }
                }
            } else if (option == 3) {
                // Salir del programa
                System.out.println("Saliendo del programa...");
                break;
            } else {
                System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        }

        scanner.close();
    }
}
