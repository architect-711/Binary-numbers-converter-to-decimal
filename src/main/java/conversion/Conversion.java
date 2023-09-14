package conversion;

import validation.Validation;

public class Conversion {
    private NumberType numberType;
    private Validation validation;

    private final String NOT_BINARY_NUMBER_EXCEPTION = "This is not a binary number. Binary number must consists of 1 or 0, and be bigger than 0.";
    private final String NUMBER;

    public Conversion(NumberType numberType, String number) {
        this.numberType = numberType;
        this.NUMBER = number;
    }

    public void makeFork() {
        validation = new Validation();

        if (NumberType.INTEGER == numberType)
            convertInteger();

        if (NumberType.FRACTIONAL == numberType)
            convertFractional();
    }

    private void convertInteger() {
        throwErrorIfNotBinary();

        System.out.println("Inside of convertInteger. Number: " + NUMBER);
    }

    private void convertFractional() {
        throwErrorIfNotBinary();

        System.out.println("Inside of convertFractional. Number: " + NUMBER);
    }

    private void throwErrorIfNotBinary() {
        validation.setNumber(NUMBER);
        validation.setType(numberType);

        if (!validation.isBinary() || Double.parseDouble(NUMBER) <= 0)
            throw new IllegalArgumentException(NOT_BINARY_NUMBER_EXCEPTION);
    }
}
