package org.example.Tema4;
import java.util.Scanner;

public class Modo3 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        while(casoDePrueba()){

        }
    }

    public static boolean casoDePrueba() {

        if (!entrada.hasNext()) {
            return false;
        }else{
            int toros = entrada.nextInt();
            int velocidad_corredor = 0;

            for (int i = 0; i < toros; i++) {
                int velocidad_toro = entrada.nextInt();

                if (velocidad_toro > velocidad_corredor) {
                    velocidad_corredor = velocidad_toro;
                }
            }

            System.out.println(velocidad_corredor);
            entrada.nextLine();

            return true;
        }
    }
}
