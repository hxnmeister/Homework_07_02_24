package com.ua.project.task1.model;

import com.ua.project.task1.dto.HumanDto;
import com.ua.project.task1.enums.Gender;
import com.ua.project.task1.util.helpers.InputHelpers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Human {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Date birthDate;
    private Gender gender;

    public Human(HumanDto dto) {
        this.firstName = dto.getFirstName();
        this.lastName = dto.getLastName();
        this.patronymic = dto.getPatronymic();
        this.birthDate = dto.getBirthDate();
        this.gender = dto.getGender();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    private Date getInputDate(final String inputMessage) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);

        while(true){
            try{
                System.out.print(inputMessage);
                return dateFormat.parse(scanner.nextLine());
            }
            catch (Exception ex){
                System.out.println(" Incorrect date format!");
            }
        }
    }

    private Gender selectGender() {
        int choice;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try{
                System.out.println(" Select gender:");
                System.out.println("  1. Male;");
                System.out.println("  2. Female;");
                System.out.println("  3. Other;");
                System.out.print(" Input field: ");

                choice = scanner.nextInt();

                return switch (choice) {
                    case 1 -> Gender.MALE;
                    case 2 -> Gender.FEMALE;
                    case 3 -> Gender.OTHER;
                    default -> throw new IllegalStateException(" Unexpected value!");
                };
            }
            catch (InputMismatchException inputEx){
                System.out.println(" Invalid input, please enter a number!");
                scanner.next();
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    public void fillBio() {
        String tempString = "";

        this.firstName = InputHelpers.getInputStringByLength("\n Enter first name: ", 3);
        this.lastName = InputHelpers.getInputStringByLength("\n Enter last name: ", 4);

        do {
            tempString = InputHelpers.getInputStringByLength("\n Enter patronymic (enter \"0\" to skip): ", 1);

            if(tempString.length() < 2 && !tempString.equals("0")){
                System.out.println(" Incorrect input, try again!");
                continue;
            }
        }while (!tempString.equals("0") && tempString.length() < 2);
        this.patronymic = tempString.equals("0") ? "" : tempString;

        this.birthDate = getInputDate("\n Enter birthday (yyyy-MM-dd): ");

        this.gender = selectGender();
    }

    @Override
    public String toString() {
        return String.format(" %s %s %s%n  Birthday: %s%n  Gender: %s%n",
                this.getLastName(),
                this.getFirstName(),
                this.getPatronymic(),
                new SimpleDateFormat("yyyy-MM-dd").format(this.getBirthDate()),
                this.getGender());
    }
}
