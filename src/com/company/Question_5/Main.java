package com.company.Question_5;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         /*
         1. Create a new method in this class.  Make sure to instantiate the main to break out of the static context.
         2. Create a switch statement in this new method that has 4 cases and a default.  This switch should take user input of a string .
         3. Make sure you prompt your user as to what they should enter
         4. Have the default case tell the user to input the correct input you are looking for and use recursion to run the switch again.
         */
        Main main = new Main();







            System.out.println("type number 1 to 4.");

            switch (input.nextInt()) {
                case 1:
                    System.out.println("you selected 1");
                    break;
                case 2:
                    System.out.println("you selected 2");
                    break;
                case 3:
                    System.out.println("you selected 3");
                    break;
                case 4:
                    System.out.println("you selected 4");
                    break;
                default:
                    System.out.println("you need to select 1 to 4");
                    input.nextLine();
                    break;

        }


    }

}
