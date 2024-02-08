package com.ua.project.helpers;

import java.text.SimpleDateFormat;
import java.util.Date;
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

        while(true){
            try{
                System.out.print(inputMessage);
                integerInput = SCANNER.nextInt();

                if(integerInput <= 0){
                    throw new IllegalArgumentException(" Number cannot be less than zero or equals to it!");
                }

                return integerInput;
            }
            catch(InputMismatchException inputEx) {
                System.out.println(" Incorrect input, please enter a number!");
                SCANNER.next();
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    public static Date getInputDate(final String inputMessage) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        while(true){
            try{
                System.out.print(inputMessage);
                return dateFormat.parse(SCANNER.nextLine());
            }
            catch (Exception ex){
                System.out.println(" Incorrect date format!");
            }
        }
    }
}
