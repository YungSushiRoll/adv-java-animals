package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class NewAnimal {

    public NewAnimal(ArrayList zoo) throws BadInputException {

        String action;
        String name;
        String friendly;
        String miceKillCount;
        String age;
        boolean isFriendly = true;
        boolean isNumber;
        boolean isBool;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("What animal would you like to create?\nA: Cat\nB: Dog\nC: Teacher\n" +
                    "D: To Exit");
            action = keyboard.nextLine();

            switch (action)
            {
                case "a":
                case "A":
                    System.out.println("A Cat?! My favorite!\nHow many mice has your Cat killed?");
                    do {
                        miceKillCount = keyboard.nextLine();
                        isNumber = true;
                        try {
                            InputTypeVerifier.validateInt(miceKillCount);
                        } catch (BadInputException e)
                        {
                            System.out.println("That's not a number, please try again");
                            isNumber = false;
                        }
                    } while (!isNumber);
                    System.out.println("What is your cats name?");
                    name = keyboard.nextLine();
                    Cat createCat = new Cat(Integer.parseInt(miceKillCount), name);
                    zoo.add(createCat);
                    break;
                case "b":
                case "B":
                    System.out.println("Hmm a Dog...I would prefer a cat but a dog will do.\nIs your Dog friendly? Y/N?");
                    do {
                        friendly = keyboard.nextLine();
                        isBool = true;
                        try {
                            InputTypeVerifier.validateBool(friendly);
                        } catch (BadInputException e) {
                            System.out.println("Please input a Y or N");
                            isBool = false;
                        }
                    } while (!isBool);
                    if (friendly.equalsIgnoreCase("Y")) {
                        isFriendly = true;
                    } else if (friendly.equalsIgnoreCase("N")) {
                        isFriendly = false;
                    }
                    System.out.println("What is your dogs name?");
                    name = keyboard.nextLine();
                    Dog createDog = new Dog(isFriendly, name);
                    System.out.println(createDog);
                    zoo.add(createDog);
                    break;
                case "c":
                case "C":
                    System.out.println("A Teacher.. a wise choice.\nI know I shouldn\'t ask this but...\n" +
                            "how old is your Teacher?");
                    do {
                        age = keyboard.nextLine();
                        isNumber = true;
                        try {
                            InputTypeVerifier.validateInt(age);
                        } catch (BadInputException e)
                        {
                            System.out.println("That's not an age, please try again");
                            isNumber = false;
                        }
                    } while (!isNumber);
                    System.out.println("What is your teachers name?");
                    name = keyboard.nextLine();
                    Teacher createTeacher = new Teacher(Integer.parseInt(age), name);
                    zoo.add(createTeacher);
                    break;
            }
        } while (!action.equalsIgnoreCase("d"));
    }
}
