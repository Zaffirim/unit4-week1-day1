package it.epicode;

import java.util.Scanner;

public class Operazioni {

    public static void main(String[] args) {

        System.out.println(moltiplicazione(3,5));

        System.out.println(concatena("ciao", 3));

        String[] arrayIniziale = {"uno", "due", "tre", "quattro", "cinque"};
        String nuovaStringa = "nuova";

        String[] nuovoArray = inserisciStringa(arrayIniziale, nuovaStringa);

        for (String elemento : nuovoArray) {
            System.out.println(elemento);
        }
        System.out.println("inserisci numeri per perimetro");

        Scanner scanner = new Scanner(System.in);

        System.out.println(perimetroRettangolo(scanner.nextDouble(), scanner.nextDouble()));

        System.out.println(evenOdd(4));
        System.out.println(area(2.5, 4.2, 5.6));



    }

    public static int moltiplicazione(int a, int b) {
        return a*b;
    }

    public static String concatena(String s, int c) {
       return s+c;
    }

    public static String[] inserisciStringa(String[] array, String nuovaStringa) {
        String[] nuovoArray = new String[6];

        // Copia i primi due elementi
        System.arraycopy(array, 0, nuovoArray, 0, 2);

        // Inserisci la nuova stringa al terzo posto
        nuovoArray[2] = nuovaStringa;

        // Copia le stringhe precedenti nelle posizioni successive
        System.arraycopy(array, 2, nuovoArray, 3, 2);

        // Restituisce il nuovo array
        return nuovoArray;
    }

    public static double perimetroRettangolo(double d, double e) {
        double perimetro = (d*2)+(e*2);
        return perimetro;
    }
    public static int evenOdd(int input) {
        return input % 2 == 0 ? 0 : 1;
    }
    public static double area(double l1, double l2, double l3) {
        double semiPerimeter = (l1 + l2 + l3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - l1) * (semiPerimeter - l2) * (semiPerimeter - l3));
    }
}
