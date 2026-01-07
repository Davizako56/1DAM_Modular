package org.example.Tema4;
import java.util.Scanner;

public class Modo1 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int num = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < num; i++) {

            casosDeUso();
        }
    }

    public static void casosDeUso() {

        String nombre = entrada.nextLine();

        String[] vector = nombre.split(" ");

        if (vector[0].equals("Soy")) {
            System.out.println("Hola, " + vector[1] + ".");
        }else{
            System.out.println("No cuadra con el formato");
        }
    }
}
