package org.example.Tema4;
import java.util.Arrays;
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

    static void ejercicio4() {

        double[] vector = recaudacionSemana();

        System.out.println("El día con más ventas ha sido el " + mayor(vector));
        System.out.println("El día con menos ventas ha sido el " + menor(vector));
        System.out.println("La media semanal ha sido " + mediaSemanal(vector) + "€");
        System.out.println("Recaudación del domingo: " + domingo(vector) + "€");
    }

    public static double[] recaudacionSemana() {

        double[] vector = new double[7];

        System.out.println("Escribe los valores de cada dia de la semana:");

        for (int i = 0; i < vector.length; i++) {

            double num = entrada.nextDouble();
            vector[i] = num;
        }

        System.out.println(Arrays.toString(vector));

        return vector;
    }

    public static double domingo(double[] vector) {

        return vector[6];
    }

    public static double mediaSemanal(double[] vector) {

        double resultado = 0;

        for (double n : vector) {

            resultado += n;
        }

        return resultado / 7;
    }

    public static String menor(double[] vector) {

        String dia = "";
        String[] semana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sábado","Domingo"};

        for (int i = 0; i < vector.length; i++) {

            int contador = 5;
            bucle2:
            for (int j = 0; j < vector.length; j++) {

                if (i == j){
                    continue;
                }else if (vector[i] < vector[j]){
                    contador--;
                }else if (vector[i] >= vector[j]){
                    break bucle2;
                }else if (contador == 0) {
                    dia = semana[i];
                    break;
                }
            }
        }

        return dia;
    }

    public static String mayor(double[] vector) {

        String dia = "";
        String[] semana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sábado","Domingo"};

        for (int i = 0; i < vector.length; i++) {

            int contador = 0;
            bucle2:
            for (int j = 0; j < vector.length; j++) {

                if (i == j){
                    continue;
                }else if (vector[i] > vector[j]){
                    contador++;
                }else if (vector[i] <= vector[j]){
                    break bucle2;
                }else if (contador == 5) {
                    dia = semana[i];
                    break;
                }
            }
        }

        return dia;
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
