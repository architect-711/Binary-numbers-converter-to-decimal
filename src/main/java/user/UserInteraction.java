package user;

import conversion.NumberType;

import java.util.Scanner;

public class UserInteraction {
    private final Scanner scanner;
    private String number;
    private NumberType numberType;

    public UserInteraction() {
        scanner = new Scanner(System.in);
    }

    public void interview() {
        askNumberType();
        askNumber();
    }

    private void askNumberType() {
        System.out.print("Is your number a fractional? y/n : ");
        String type = scanner.nextLine();

        if (!type.startsWith("y") && !type.startsWith("n"))
            throw new IllegalArgumentException("Invalid input!");

        if (type.toLowerCase().startsWith("y"))
            numberType = NumberType.FRACTIONAL;

        if (type.toLowerCase().startsWith("n"))
            numberType = NumberType.INTEGER;

    }

    private void askNumber() {
        System.out.print("Enter binary number: ");
        number = scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }

    public String getNumber() {
        return number;
    }

    public NumberType getNumberType() {
        return numberType;
    }
}
