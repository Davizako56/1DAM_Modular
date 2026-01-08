package org.example.Tema4;
import java.util.Scanner;

public class Recursividad {
    static Scanner entrada = new Scanner(System.in);

    static void ejercicio2() {

        System.out.println("Hasta que número quieres imprimir?");

        if (entrada.hasNextInt()) {
            int num = entrada.nextInt();
            restar(num);

        }else{
            System.out.println("ERROR: El programa no admite texto.");
        }
    }

    static int restar(int num) {

        System.out.println(num);

        if (num > 1) {
            restar(num - 1);
        }

        return num;
    }

    static void ejercicio3() {

        int resultado = 0;
        int i = 0;
        System.out.println(sumar(resultado, i));

    }

    static int sumar(int num, int contador) {

        if (contador < 10) {
            contador++;
            num += sumar(num+1, contador);
        }

        return num;
    }


}
