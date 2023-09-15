package conversion;

import validation.Validation;

public class Conversion {
    private final NumberType NUMBER_TYPE;
    private final String NUMBER;

    public Conversion(NumberType numberType, String number) {
        this.NUMBER_TYPE = numberType;
        this.NUMBER = number;
    }

    public void transform() {
        throwErrorIfNotBinary();

        if (NumberType.INTEGER == NUMBER_TYPE)
            convertInteger();

        if (NumberType.FRACTIONAL == NUMBER_TYPE)
            convertFractional();
    }

    private void convertInteger() {
        BinaryArrayMaker binaryArrayMaker = new BinaryArrayMaker();

    }

    private void convertFractional() {
        System.out.println(String.format("Inside of convertFractional. Number: %s %f", NUMBER, Double.parseDouble(NUMBER)));
    }

    private void throwErrorIfNotBinary() {
        Validation validation = new Validation(NUMBER, NUMBER_TYPE);

        if (!validation.isBinary() || Double.parseDouble(NUMBER) <= 0)
            throw new IllegalArgumentException("This is not a binary number. Binary number must consists of 1 or 0, and be bigger than 0.");
    }
}
