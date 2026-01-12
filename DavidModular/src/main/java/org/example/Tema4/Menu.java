package org.example.Tema4;
import java.util.Scanner;

public class Menu {
    static Scanner entrada = new Scanner(System.in);

    public static void main() {

        int num;
        int potencia;
        int eleccion;
        String salida;

        String[] vector = {"Dígitos","Potencias","Del Revés","Binario","A binario","Orden alfabético","Mostrar suma"};

        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieres ejecutar...");

        for (int i = 1; i <= 7; i++) {

            System.out.println(i + " - " + vector[i - 1]);
        }

        System.out.println("Elige una opción:");
        int opcion = entrada.nextInt();

        switch(opcion) {

            case 1:
                System.out.println("Escribe un número:");
                num = entrada.nextInt();
                System.out.println("El número tiene " + digitos(num) + " dígitos");
                break;

            case 2:
                do {
                    System.out.println("Escribe un número:");
                    num = entrada.nextInt();
                    System.out.println("Escribe su potencia:");
                    potencia = entrada.nextInt();

                    if (num < 0 || potencia < 0) {
                        System.out.println("Los números no pueden ser negativos.");
                    }else{
                        System.out.println("El resultado de la potencia es " + potencias(num, potencia));
                    }
                }while (num < 0 || potencia < 0);
                break;

            case 3:
                do {
                    System.out.println("Elige que quieres imprimir del revés:");
                    System.out.println("[1] - Número");
                    System.out.println("[2] - Frase");
                    eleccion = entrada.nextInt();

                    if (eleccion == 1){
                        System.out.println("Escribe un número:");
                        num = entrada.nextInt();
                        System.out.println("Número al reves:");
                        delReves(num);
                    }else if (eleccion == 2) {
                        System.out.println("Escribe una cadena:");
                        entrada.nextLine();
                        String frase = entrada.nextLine();
                        char[] cadena = frase.toCharArray();
                        invertido(cadena.length - 1, cadena);
                    }else{
                        System.out.println("No es una opción compatible");
                    }
                }while (eleccion != 1 && eleccion != 2);
                break;

            case 4:
                System.out.println("Escribe un número");
                num = entrada.nextInt();

                if (binario(num)) {
                    System.out.println("El número es binario");
                }else{
                    System.out.println("El número no es binario");
                }
                break;

            case 5:
                System.out.println("Escribe un número");
                num = entrada.nextInt();
                String bin = "";
                obtenerBinario(num, bin);
                break;

            default:
                System.out.println("La opción no es válida.");
                break;
        }

        do {
            System.out.println("Elige una opción:");
            System.out.println("[M] -  Volver al menú principal.");
            System.out.println("[X] - Salir");
            salida = entrada.next();

            if (salida.equalsIgnoreCase("M")) {
                main();
            }else if (salida.equalsIgnoreCase("S")) {
                System.exit(0);
            }else{
                System.out.println("No es una opción válida.");
            }
        }while (!salida.equalsIgnoreCase("M") && !salida.equalsIgnoreCase("S"));
    }

    static int digitos(int num) {

        if (num < 10) {
            return 1;
        }else{
            return 1 + digitos(num / 10);
        }
    }

    static int potencias(int base, int exponente) {

        if (exponente == 1) {
            return base;
        }else{
            return base *= potencias(base, exponente - 1);
        }
    }

    static void delReves(int num) {

        if (num < 10) {
            System.out.print(num);
        }else{
            System.out.print(num % 10);
            delReves(num / 10);
        }
    }

    static void invertido(int posicion, char[] frase) {

        if (posicion >= 0) {
            System.out.print(frase[posicion]);
            invertido(posicion - 1, frase);
        }

    }

    static boolean binario(int num) {

        if (num >= 10) {

            if (num % 10 == 1 || num % 10 == 0) {
                return binario(num / 10);
            }else{
                return false;
            }
        }else if (num == 1 || num == 0) {
            return true;
        }else{
            return false;
        }
    }

    static void obtenerBinario(int num, String bin) {

        if (num == 1 || num == 0) {
            System.out.println(num + bin);
        }else{
            bin = num % 2 + bin;
            num = num / 2;
            obtenerBinario(num, bin);
        }
    }
}
