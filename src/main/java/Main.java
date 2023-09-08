import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static float binaryNumber;

    /*
    * TODO
    *  1. Reject of using primitives.
    *  2. Replace conversion for integers and float to different classes.
    *  3. Make own class for validation.
    * */

    public static void main(String[] args) {
        interviewUser();

        if (!(binaryNumber > 0))
            throw new IllegalArgumentException("Number should be bigger that 0!");

        BinaryConverterImpl binaryConverter = new BinaryConverterImpl(binaryNumber);
        binaryConverter.convert();

        System.out.println(binaryConverter.getDecimal());
    }

    private static void interviewUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Binary number: ");
        binaryNumber = scanner.nextFloat();
    }

}
