package us.mattgreen;

import java.util.Scanner;

public class NewAnimal {

    public void getInput() {
        Scanner keyboard = new Scanner(System.in);

        do {
        System.out.println("What animal would you like to create?\nA: Cat\nB: Dog\nC: Teacher\n" +
                "D: To Exit");
        }
    }
}
