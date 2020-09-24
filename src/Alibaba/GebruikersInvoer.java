package Alibaba;

import java.util.Scanner;

public class GebruikersInvoer {
    public static void main(String[] invoer) {
        new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Voer tekst in: ");
        String tekst = s.nextLine();
        System.out.println(tekst.length());
// var werkt bij mij niet, ik moest String gebruiken.

                System.out.println("Voer een getal in: ");
                // als ik hier onder String gebruikt ipv var krijg ik een foutmelding, waarom?
                var getal = s.nextInt();

                var uitkomst1 = getal;
                var uitkomst2 = 2 * getal;
                var uitkomst3 = 3 * getal;
                var uitkomst4 = 4 * getal;
                var uitkomst5 = 5 * getal;
                var uitkomst6 = 6 * getal;
                var uitkomst7 = 7 * getal;
                var uitkomst8 = 8 * getal;
                var uitkomst9 = 9 * getal;
                var uitkomst10 = 10 * getal;
        System.out.println("De tafel van "+ getal+ " is: ");
                System.out.println("1 x " + getal + "=" + uitkomst1);
                System.out.println("2 x " + getal + "=" + uitkomst2);
                System.out.println("3 x " + getal + "=" + uitkomst3);
                System.out.println("4 x " + getal + "=" + uitkomst4);
                System.out.println("5 x " + getal + "=" + uitkomst5);
                System.out.println("6 x " + getal + "=" + uitkomst6);
                System.out.println("7 x " + getal + "=" + uitkomst7);
                System.out.println("8 x " + getal + "=" + uitkomst8);
                System.out.println("9 x " + getal + "=" + uitkomst9);
                System.out.println("10 x " + getal + "=" + uitkomst10);



    }
}
