package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String textico;
        Scanner entrada = new Scanner(System.in);
        int opcion;


        System.out.print("Dame un texto: ");
        textico = entrada.nextLine();

        do {

            System.out.println("MENÚ DE OPCIONES: ");
            System.out.println("-----------------------");
            System.out.println("1.- Contar palabra.");
            System.out.println("2.- Iniciales.");
            System.out.println("3.- Sustituir carácter.");
            System.out.println("4.- Al revés.");
            System.out.println("0.- Salir.");

            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            System.out.println();

            switch (opcion)
                case 1:

        } while (opcion != 0);
    }
}
