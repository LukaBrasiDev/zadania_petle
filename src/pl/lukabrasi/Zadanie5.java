package pl.lukabrasi;

import java.util.Scanner;

public class Zadanie5 {

    //Zadanie 5
    //Napisz program, który odczytuje n i sumuje liczby od 1 do n.
    public static void main(String[] args) {
        int n;
        int j=0;
        System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i < n+1 ; i++) {
            j=j+i;

        }
        System.out.println(j);
    }


}
