package pl.lukabrasi;

import java.util.Random;

public class Zadanie7 {

    //Zadanie 7
    //Napisz program, który losuje 6 liczb z Dużego Lotka.

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int number = random.nextInt(49) + 1;


            System.out.println(number);

        }
    }

}
