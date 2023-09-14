
class BinaryConverterImpl {
    private final float binaryNumber;
    private float decimal;

    public BinaryConverterImpl(float binaryNumber) {
        this.binaryNumber = binaryNumber;
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
}
