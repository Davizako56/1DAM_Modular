package org.example.Tema4;
import java.util.Scanner;

public class Modo2 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        while(casoDePrueba()){

        }
    }

    public static boolean casoDePrueba() {

        int x = entrada.nextInt();
        int y = entrada.nextInt();

        if (x < 0 || y < 0) {
            return false;
        }else{
            System.out.println((x + y) * 2);
        }

        return true;
    }
}
