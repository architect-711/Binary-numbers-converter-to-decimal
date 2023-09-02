
class BinaryConverterImpl implements BinaryConverter {
    private final int binaryNumber;

    public BinaryConverterImpl(int binaryNumber) {
        this.binaryNumber = binaryNumber;
    }

    @Override
    public double getConvertedBinaryToDecimal() {
        int[] binaryDigits = returnInvertedBinaryDigitsArray();
        double decimal = 0;

        for (int index = 0; index < binaryDigits.length; index++)
            decimal += Math.pow(2, index) * binaryDigits[index];

        return decimal;
    }

    private int[] returnInvertedBinaryDigitsArray() {
        StringBuilder stringBuilderBinaryNumber = new StringBuilder(Integer.toString(binaryNumber));
        int[] invertedBinaryDigitsArray = new int[stringBuilderBinaryNumber.length()];

        stringBuilderBinaryNumber.reverse();

        for (int index = 0; index < stringBuilderBinaryNumber.length(); index++) {
            invertedBinaryDigitsArray[index] = Integer.parseInt(String.valueOf(stringBuilderBinaryNumber.charAt(index)));
        }

        return invertedBinaryDigitsArray;
    }
}
