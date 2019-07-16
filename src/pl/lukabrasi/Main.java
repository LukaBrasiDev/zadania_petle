package pl.lukabrasi;

public class Main {

    public static void main(String[] args) {

       // Zadania_Petle.pdf
        // 15.10.2018 BLOK 2




	// 1. Napisz program, który wypisuje wszystkie liczby od 5 do 10

        for (int i = 5; i < 11; i++) {
            System.out.println(i);
            
        }


        // Zadanie 2
        //Napisz program, który na ekran wypisuje 5 razy napis Hello.

        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello");
        }


        //Zadanie 3
        //Napisz program, który wypisuje liczby od 5 do 50, które są nieparzyste.

        for (int i = 5; i <50 ; i=i+2) {
            System.out.println(i);

        }
        //Zadanie 4
        //Napisz program, który wypisuje liczby od 50 do 10 (w tej kolejności).

        for (int i = 50; i >9 ; i--) {
            System.out.println(i);

        }




    }
}
