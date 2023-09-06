import java.util.Arrays;
import java.util.Objects;

class BinaryConverterImpl {
    private final float binaryNumber;
    private float decimal;

    public BinaryConverterImpl(float binaryNumber) {
        this.binaryNumber = binaryNumber;
    }

    public void convert() {
        if (binaryNumber == 0 || binaryNumber < 0)
            throw new IllegalArgumentException("Transmitted value is less or equals to 0.");
        else
            checkType();
    }

    private void checkType() {
        if ((int) binaryNumber == binaryNumber)
            convertIntegerToDecimal();
    }

    private void convertIntegerToDecimal() {
        if (!isIntegerBinary())
            throw new IllegalArgumentException("Transmitted value is not a binary.");

        IntegerArrayConverter integerArrayConverter = new IntegerArrayConverter();
        int[] digits = integerArrayConverter.getArrayOfDigits((int) binaryNumber);
        // TODO Reject of using that shit method
        int[] invertedDigits = integerArrayConverter.invertArrayOfIntegers(digits);

        // TODO rewrite using recursion
        formula(invertedDigits);
    }

    public boolean isIntegerBinary() {
        int number = (int) binaryNumber;

        while (number != 0) {
            if (number % 10 > 1)
                return false;

            number /= 10;
        }

        return true;
    }

    private void formula(int[] digits) {
        for (int index = 0; index < digits.length; index++)
            decimal += Float.parseFloat(String.valueOf(digits[index] * Math.pow(2, index)));
    }

    public float getBinaryNumber() {
        return binaryNumber;
    }

    public float getDecimal() {
        return decimal;
    }
}
