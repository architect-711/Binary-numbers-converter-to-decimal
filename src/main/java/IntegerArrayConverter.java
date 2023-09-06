import java.util.Arrays;
import java.util.Collections;

// TODO rewrite class according to Uncle's Bob commandments
public class IntegerArrayConverter {
    public IntegerArrayConverter() {}

    // SHIT CODE
    public int[] getArrayOfDigits(int number) {
        StringBuilder stringBuilderOfNumber = new StringBuilder(String.valueOf(number));
        int[] arrayOfDigits = new int[stringBuilderOfNumber.length()];

        for (int index = 0; index < stringBuilderOfNumber.length(); index++)
            arrayOfDigits[index] = Integer.parseInt(String.valueOf(stringBuilderOfNumber.charAt(index)));

        return arrayOfDigits;
    }

    // SHIT CODE
    public int[] invertArrayOfIntegers(int[] array) {
        Integer[] integerObjectArray = convertToIntegerObjectArray(array);
        Collections.reverse(Arrays.asList(integerObjectArray));

        return convertToArrayOfIntegers(integerObjectArray);
    }

    // SHIT CODE
    private Integer[] convertToIntegerObjectArray(int[] array) {
        Integer[] integerArrayObject = new Integer[array.length];

        for (int index = 0; index < array.length; index++)
            integerArrayObject[index] = array[index];

        return integerArrayObject;
    }

    // SHIT CODE
    private int[] convertToArrayOfIntegers(Integer[] array) {
        int[] target = new int[array.length];

        for (int index = 0; index < array.length; index++)
            target[index] = array[index];

        return target;
    }
}
