public class ArrayConvertor {
    public ArrayConvertor() {}

    public int[] getArrayOfDigits(int number) {
        StringBuilder stringBuilderOfNumber = new StringBuilder(String.valueOf(number));
        int[] arrayOfDigits = new int[stringBuilderOfNumber.length()];

        for (int index = 0; index < stringBuilderOfNumber.length(); index++)
            arrayOfDigits[index] = Integer.parseInt(String.valueOf(stringBuilderOfNumber.charAt(index)));

        return arrayOfDigits;
    }

    public String[] splitByRegex(float number, String regex) {
        String stringNumber = String.valueOf(number);

        return stringNumber.split(regex);
    }

    public int[] convertElementsToIntegers(String[] array) {
        int[] intArray = new int[array.length];

        for (int index = 0; index < array.length; index++)
            intArray[index] = Integer.parseInt(array[index]);

        return intArray;
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
