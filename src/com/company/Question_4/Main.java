package com.company.Question_4;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        1. Create a new method to take user input of a number between 1 and 100
        2. Create an if statement that will take this number and if the number is between 1 and/or equal to 45 display,
        "You have been teleported to a swamp".  If the number is between 46 and/or 90 display, "Lucky you, you've been
        teleported to the beach".  If the number is between 91 and/or equal to 100 display, "Well, I hope you like it hot,
        you have been teleported to a volcano."
         */


       // System.out.println("Pick a number between 1 and 100.");
        int userInput = input.nextInt();
        input.nextInt();

        if (userInput <= 45 && userInput >= 1) {
            System.out.println("you have been teleported to a swamp.");
        } else if (userInput >= 46 && userInput <= 90) {
            System.out.println("Lucky you, you've been teleported to the beach");
        } else if (userInput <= 100 && userInput >= 91) {
            System.out.println("Well, I hope you like it hot, you have been teleported to a volcano.");
        } else {
            System.out.println("try again!!");
        }

    }
}
