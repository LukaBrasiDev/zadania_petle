package pl.lukabrasi;

import java.util.Scanner;

public class Zadanie6 {

    //Zadanie 6
    //Napisz prostą grę - zadaniem użytkownika będzie zgadnięcie liczby, którą
    //zainicjujemy w programie (przykładowa liczba 600). W przypadku, gdy liczba
    //będzie za duża lub za mała, użytkownik otrzyma odpowiednią podpowiedź.
    //Gramy tak długo dopóki użytkownik zgadnie liczbę.

    public static void main(String[] args) {
        int n = 0;
        int liczba = 600;


        do {
            System.out.println("Podaj liczbe");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();

            if (n > liczba) {

                System.out.println("Podana liczba jest WIEKSZA od szukanej");

            } else if (n < liczba) {
                System.out.println("Podana liczba jest MNIEJSZA od szukanej");
            } else if (n == liczba) {
                System.out.println("BRAWO!");
            }
        } while (n != liczba);
    }


}
