
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
        StringBuilder stringBuilderBinaryNumber = new StringBuilder(String.valueOf(binaryNumber));
        boolean isFloat = false;

        for (int index = 0; index < stringBuilderBinaryNumber.length(); index++) {
            if (stringBuilderBinaryNumber.charAt(index) == '.') isFloat = true;
        }

        if (!isFloat)
            convertIntegerToDecimal();
        else
            convertFloatToDecimal();
    }

    private void convertIntegerToDecimal() {
        if (!isIntegerBinary((int) binaryNumber))
            throw new IllegalArgumentException("Transmitted value is not a binary.");

        ArrayConvertor integerArrayConverter = new ArrayConvertor();
        int[] digits = integerArrayConverter.getArrayOfDigits((int) binaryNumber);
        int[] invertedDigits = integerArrayConverter.getInvertedArrayOfDigits(digits);

        formula(invertedDigits);
    }

    public boolean isIntegerBinary(int number) {
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

    private void formulaForFractionDigits(int[] fractionDigits) {
        for (int index = 0; index < fractionDigits.length; index++) {
            int fractionIndex = index + 1;
            // 2 / (2 ^ fractionIndex)) / 2
            double result = 2 / Math.pow(2, fractionIndex) / 2;

            decimal += Float.parseFloat(String.valueOf(result));
        }
    }

    private void convertFloatToDecimal() {
        ArrayConvertor arrayConvertor = new ArrayConvertor();

        String[] stringDividedFloatByComma = arrayConvertor.splitByRegex(binaryNumber, "\\.");
        int[] dividedFloatByComma = arrayConvertor.convertElementsToIntegers(stringDividedFloatByComma);

        int integerPart = dividedFloatByComma[0];
        int fractionPart = dividedFloatByComma[1];

        if (!isIntegerBinary(integerPart) && !isIntegerBinary(fractionPart))
            throw new IllegalArgumentException("Transmitted value is not a binary.");

        formula(arrayConvertor.getArrayOfDigits(integerPart));
        formulaForFractionDigits(arrayConvertor.getArrayOfDigits(fractionPart));
    }

    public float getBinaryNumber() {
        return binaryNumber;
    }

    public float getDecimal() {
        return decimal;
    }
}
