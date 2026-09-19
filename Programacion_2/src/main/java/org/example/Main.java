package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Introducción de bucles y while do");

        Scanner scan = new Scanner(System.in);

        System.out.println("Adivina mi color favorito: ");
        String bandera = scan.nextLine();

        while (!bandera.equals("rojo")) {

            System.out.println("Ese no es... vuelve a intentarlo");
            System.out.println("Adivina mi color favorito: ");
            bandera = scan.nextLine();
        }

        System.out.println("Muy bien...");
    }
}