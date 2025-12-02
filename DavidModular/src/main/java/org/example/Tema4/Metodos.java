package org.example.Tema4;
import java.util.Random;

public class Metodos {

    public static int[][] matriz(int largo, int ancho) {
        Random random = new Random();

        int[][] matriz = new int[largo][ancho];

        for (int i = 0; i < largo; i++) {

            for (int j = 0; j < ancho; j++) {

                int num = random.nextInt(10);
                matriz[i][j] = num;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        return matriz;

    }

    public static int cubo(int num) {

        return num * num * num;
    }

    public static String mayus(String cadena) {

        String mayusculas = cadena.toUpperCase();

        return mayusculas;
    }

    public static int vocales(String cadena) {

        int contador = 0;
        String[] vector = cadena.split("");

        for (int i = 0; i < vector.length; i++) {

            if (vector[i].equals("A") || vector[i].equals("E") || vector[i].equals("I") || vector[i].equals("O") || vector[i].equals("U")){
                contador++;
            }
        }

        return contador;
    }
}
