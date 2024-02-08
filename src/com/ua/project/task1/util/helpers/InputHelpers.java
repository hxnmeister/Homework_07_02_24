package com.ua.project.task1.util.helpers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHelpers {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String getInputStringByLength(final String inputMessage, final int lineLength) {
        String stringInput;

        while(true){
            System.out.print(inputMessage);
            stringInput = SCANNER.nextLine();

            if(stringInput.length() < lineLength){
                System.out.println(" Your input \"" + stringInput +"\" is too short, try again!");
                continue;
            }

            return stringInput;
        }
    }

    public static int getPositiveIntegerInput(final String inputMessage) {
        int integerInput;
        Scanner scanner = new Scanner(System.in);

        while(true){
            try{
                System.out.print(inputMessage);
                integerInput = scanner.nextInt();

                if(integerInput <= 0){
                    throw new IllegalArgumentException(" Number cannot be less than zero or equals to it!");
                }

                return integerInput;
            }
            catch(InputMismatchException inputEx) {
                System.out.println(" Incorrect input, please enter a number!");
                scanner.next();
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
