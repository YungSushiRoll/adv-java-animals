package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class NewAnimal {

    public NewAnimal(ArrayList zoo) {

        String action;
        String name;
        String friendly;
        int miceKillCount = 0;
        int age;
        boolean isFriendly = true;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("What animal would you like to create?\nA: Cat\nB: Dog\nC: Teacher\n" +
                    "D: To Exit");
            action = keyboard.nextLine();

            switch (action)
            {
                case "a":
                case "A":
                    try {
                        System.out.println("A Cat?! My favorite!\nHow many mice has your Cat killed?");
                        miceKillCount = Integer.parseInt(keyboard.nextLine());
                    }

                    System.out.println("What is your cats name?");
                    name = keyboard.nextLine();
                    Cat createCat = new Cat(miceKillCount, name);
                    zoo.add(createCat);
                    break;
                case "b":
                case "B":
                    System.out.println("Hmm a Dog...I would prefer a cat but a dog will do.\nIs your Dog friendly? Y/N?");
                    friendly = keyboard.nextLine();
                    System.out.println("What is your dogs name?");
                    name = keyboard.nextLine();
                    if (friendly.equalsIgnoreCase("Y")) {
                        isFriendly = true;
                    } else if (friendly.equalsIgnoreCase("N")) {
                        isFriendly = false;
                    }
                    Dog createDog = new Dog(isFriendly, name);
                    zoo.add(createDog);
                    break;
                case "c":
                case "C":
                    System.out.println("A Teacher.. a wise choice.\nI know I shouldn\'t ask this but...\n" +
                            "how old is your Teacher?");
                    age = Integer.parseInt(keyboard.nextLine());
                    System.out.println("What is your teachers name?");
                    name = keyboard.nextLine();
                    Teacher createTeacher = new Teacher(age, name);
                    zoo.add(createTeacher);
                    break;
            }
            // add exception here for correct input
            // switch case for responses
            // add variable for keyboard
        } while (!action.equalsIgnoreCase("d"));
    }
}
