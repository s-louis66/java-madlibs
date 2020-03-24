package com.tts;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // write your code here
        int ageLimit = 18;
        System.out.println("How old are you?");
        int age = Integer.parseInt(userInput.nextLine());
            if (age < ageLimit) {
                System.out.println("You are too young, sorry!");
                System.exit(0);
        }   else {
                System.out.println("What is their name?");
                String name = userInput.nextLine();
                System.out.println("What is your adjective?");
                String adjective = userInput.nextLine();
                System.out.println("What is your first verb?");
                String verbOne = userInput.nextLine();
                System.out.println("What is your second verb?");
                String verbTwo = userInput.nextLine();
                System.out.println("What is your noun?");
                String noun = userInput.nextLine();
                System.out.println("What is your number?");
                String number = userInput.nextLine();
                System.out.println("What is your name?");
                String yourName = userInput.nextLine();
                System.out.printf("Dear %s, \n You are a %s %s and I want to be your %s. I want to go to the %s with you in %s days.  \n" +
                                "Sincerely, %s",
                        name, adjective, verbOne, verbTwo, noun, number, yourName);
        }

    }
}
