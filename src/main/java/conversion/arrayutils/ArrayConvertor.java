package conversion.arrayutils;

public class ArrayConvertor {

    public ArrayConvertor() {}

    public static int[] getIntegerDigitsArray(final String number) {
        StringBuilder builder = new StringBuilder(number);
        int[] digits          = new int[builder.length()];

        for (int index = 0; index < builder.length(); index++)
            digits[index] = Integer.parseInt(String.valueOf(builder.charAt(index)));

        return digits;
    }

    public static int[] getReversedArray(int[] array) {
        int[] reversed = new int[array.length];
        int reversedIndex = 0;

        for (int index = array.length - 1; index >= 0; index--) {
            reversed[reversedIndex] = array[index];
            reversedIndex++;
        }

        return reversed;
    }


}
