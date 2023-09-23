package user;

import conversion.BinaryNumberType;

import java.util.Scanner;

public class UserInteraction {
    private final Scanner scanner = new Scanner(System.in);
    
    private String number;
    private BinaryNumberType binaryNumberType;

    public UserInteraction() {}

    public void interview() {
        askNumberType();
        askNumber();
    }

    private void askNumberType() {
        System.out.print("Is your number fractional? y/n : ");
        // do not use ... = Character.toLowerCase(scanner.next().charAt(0)) <- error
        char userNumberType = Character.toLowerCase(scanner.nextLine().charAt(0));

        if (userNumberType != 'y' && userNumberType != 'n') throw new IllegalArgumentException("Invalid input! Answer must be 'y' or 'n' at any case.");

        binaryNumberType = userNumberType == 'y' ? BinaryNumberType.FRACTIONAL :  BinaryNumberType.INTEGER;
    }

    private void askNumber() {
        System.out.print("Enter binary number (use . sign for fraction numbers): ");
        number = scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }

    public String getNumber() {
        return number;
    }

    public BinaryNumberType getNumberType() {
        return binaryNumberType;
    }
}
