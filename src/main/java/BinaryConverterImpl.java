
class BinaryConverterImpl {
    private final float binaryNumber;
    public boolean hasComma = false;

    public BinaryConverterImpl(float binaryNumber) {
        this.binaryNumber = binaryNumber;
    }

    public void convertToDecimal() {
        System.out.println(binaryNumber);

        if (isBinary())
            splitConversionLogic();
    }

    //  TODO binaryNumber always has a comma since it is a float
    private boolean isBinary() throws IllegalArgumentException {
        StringBuilder stringBuilderBinaryNumber = new StringBuilder(String.valueOf(binaryNumber));

        for (int index = 0; index < stringBuilderBinaryNumber.length(); index++) {
            char character = stringBuilderBinaryNumber.charAt(index);

            if (!(character == '1' || character == '0' || character == '.'))
                throw new IllegalArgumentException("Passed number is not a binary, binary must contains 1 or 0, and . character. Your number: " + binaryNumber);

            if (character == '.')
                hasComma = true;
        }

        return true;
    }

    // TODO can't divide logic, because of binaryNumber type
    private void splitConversionLogic() {
        if (hasComma)
            divideByIntegerAndFractionDigit();
        else
            countInteger();
    }

    private void divideByIntegerAndFractionDigit() {
        System.out.println("divide");
    }

    private void countInteger() {
        System.out.println("count integer");
    }

    public float getBinaryNumber() {
        return binaryNumber;
    }

    public boolean isHasComma() {
        return hasComma;
    }
}
