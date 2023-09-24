package input.user_interaction;

import java.util.Scanner;

public class UserInterviewer {
    private final Scanner scanner = new Scanner(System.in);

    private String userNumberType;
    private String userNumber;

    public UserInterviewer() {}

    public void startInterview() {
        askNumberType();
        askNumber();
    }

    private void askNumberType() {
        System.out.print("Is your number fractional? y\\n : ");
        userNumberType = scanner.nextLine();
    }

    private void askNumber() {
        System.out.print("Enter binary number (use . sign for fractional numbers) : ");
        userNumber = scanner.nextLine();
    }


    public void stopInterview() {
        scanner.close();
    }

    public String getUserNumberType() {
        return userNumberType;
    }

    public String getUserNumber() {
        return userNumber;
    }

}
