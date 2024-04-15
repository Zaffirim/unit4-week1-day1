import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente di inserire tre stringhe da tastiera
        System.out.println("Inserisci la prima stringa:");
        String stringa1 = scanner.nextLine();

        System.out.println("Inserisci la seconda stringa:");
        String stringa2 = scanner.nextLine();

        System.out.println("Inserisci la terza stringa:");
        String stringa3 = scanner.nextLine();

        // Concatenazione delle stringhe in ordine di inserimento
        String concatenazioneInOrdine = stringa1 + stringa2 + stringa3;
        System.out.println("Concatenazione in ordine di inserimento: " + concatenazioneInOrdine);

        // Concatenazione delle stringhe in ordine inverso di inserimento
        String concatenazioneInOrdineInverso = stringa3 + stringa2 + stringa1;
        System.out.println("Concatenazione in ordine inverso di inserimento: " + concatenazioneInOrdineInverso);


    }
}
