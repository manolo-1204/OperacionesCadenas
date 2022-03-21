package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String textico;
        Scanner entrada = new Scanner(System.in);
        int opcion, contador;
        char sustituir, sustituido;


        System.out.print("Dame un texto: ");
        textico = entrada.nextLine();

        do {

            System.out.println();
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

            switch (opcion) {
                case 1:
                    contador = 1;
                    for (int i = 0; i < textico.length(); i++) {
                        if (textico.charAt(i) == ' ') {
                            contador++;
                        }
                    }
                    System.out.println("Hay " + contador + " palabrica");

                    break;
                case 2:
                    System.out.print("Las iniciales son: ");

                    System.out.print(textico.toUpperCase().charAt(0));
                    for (int i = 0; i < textico.length(); i++) {
                        if (textico.charAt(i) == ' ') {
                            System.out.print(textico.toUpperCase().charAt(i + 1));
                        }
                    }

                    System.out.println();

                    break;
                case 3:
                    entrada.nextLine();
                    System.out.println("¿Qué carácter quieres cambiar? ");
                    sustituido = entrada.nextLine().charAt(0);

                    System.out.println("¿Por que carácter quieres cambiarlo? ");
                    sustituir = entrada.nextLine().charAt(0);

                    for (int i = 0; i < textico.length(); i++) {
                        if (textico.charAt(i) == sustituido) {
                            System.out.print(sustituir);
                        } else {
                            System.out.print(textico.charAt(i));
                        }
                    }

                    break;
                case 4:
                    System.out.println("Esta es la oración al revés: ");
                    for (int i = textico.length() - 1; i >= 0; i--) {
                        System.out.print(textico.charAt(i));
                    }
                    System.out.println();

                    break;
                case 0:
                    System.out.print("¡Hasta luego!");
                    break;
                default:
                    System.out.print("ERROR: la opción " + opcion + " no existe.");
            }

            entrada.nextLine();
            System.out.println();
            System.out.print("Pulsa intro para continuar...");
            entrada.nextLine();

        } while (opcion != 0);
    }
}
