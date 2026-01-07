package org.example.Tema4;

public class Sobrecarga {

    static void main() {
        atacar("Carlos");
        atacar();
        atacar(10);
    }

    public static void atacar() {
        System.out.println("ATACANDO");
    }

    public static void atacar(int nivel) {
        System.out.println("ATACANDO CON NIVEL " + nivel);
    }

    public static void atacar(String nombre) {
        System.out.println("Te está atacando " + nombre);
    }
}
