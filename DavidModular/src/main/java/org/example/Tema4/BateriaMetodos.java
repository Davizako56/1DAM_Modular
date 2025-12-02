package org.example.Tema4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BateriaMetodos {
    static Scanner entrada = new Scanner(System.in);

    static void ejercicio1() {

        int num;

        while(true) {
            try {
                System.out.println("Introduce un número");
                num = entrada.nextInt();
                break;
            }catch(InputMismatchException e) {
                System.out.println("ERROR: El programa no admite texto");
                entrada.nextLine();
            }
        }

        System.out.println(num + " al cubo es " + Metodos.cubo(num));
    }

    static void ejercicio2() {

        menu();

        System.out.println("Selecciona opción:");
        char opcion = entrada.next().charAt(0);

        if (validarOpcion(opcion)) {
            System.out.println("Válida");
        }else{
            System.out.println("No válida");
        }

    }

    static void ejercicio3() {

        System.out.println("Introduce una frase o palabra:");
        String cadena = entrada.nextLine();

        String resultado = Metodos.mayus(cadena);
        System.out.println("Cadena en mayúsculas: " + resultado);
        System.out.println("Cantidad de vocales: " + Metodos.vocales(resultado));

    }

    public static void menu() {

        System.out.println("Bienvenido");
        System.out.println("1. Cantar");
        System.out.println("2. Bailar");
        System.out.println("3. Hacer backflip");
        System.out.println("X. Salir");
    }

    public static boolean validarOpcion(char opcion) {

        boolean prueba;

        switch(opcion) {

            case '1':
                System.out.println("Te has puesto a cantar");
                prueba = true;
                break;

            case '2':
                System.out.println("Te has puesto a bailar");
                prueba = true;
                break;

            case '3':
                System.out.println("Has intentado hacer un backflip (No te ha salido bien)");
                prueba = true;
                break;

            case 'x':
                System.out.println("Saliendo del menú...");
                System.exit(0);

            default:
                System.out.println("La opción no es válida");
                prueba = false;
                break;
        }

        return prueba;
    }
}
