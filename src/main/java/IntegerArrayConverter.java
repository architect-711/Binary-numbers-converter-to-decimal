import java.util.Arrays;
import java.util.Collections;

// TODO rewrite class according to Uncle's Bob commandments
public class IntegerArrayConverter {
    public IntegerArrayConverter() {}

    public int[] getArrayOfDigits(int number) {
        StringBuilder stringBuilderOfNumber = new StringBuilder(String.valueOf(number));
        int[] arrayOfDigits = new int[stringBuilderOfNumber.length()];

        for (int index = 0; index < stringBuilderOfNumber.length(); index++)
            arrayOfDigits[index] = Integer.parseInt(String.valueOf(stringBuilderOfNumber.charAt(index)));

        return arrayOfDigits;
    }

    public int[] getInvertedArrayOfDigits(int[] array) {
        int[] invertedArray = new int[array.length];
        int counter = 0;

        for (int index = array.length - 1; index >= 0; index--) {
            invertedArray[counter] = array[index];

            counter++;
        }

        return invertedArray;
    }
}
