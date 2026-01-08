package org.example.Tema4;
import java.util.Scanner;

public class Menu {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int num;
        int potencia;

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
                System.out.println("Escribe un número:");
                num = entrada.nextInt();
                System.out.println("El número al revés es " + delReves(num));
                break;
        }
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

    static int delReves(int num) {

        if (num < 10) {
            return num;
        }else{
            return delReves(num % 10);
        }
    }
}
