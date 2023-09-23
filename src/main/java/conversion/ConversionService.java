package conversion;

import conversion.convertors.FractionalConverter;
import conversion.convertors.IntegerConvertor;
import validation.Validation;

public class ConversionService {
    private final BinaryNumberType NUMBER_TYPE;
    private final String NUMBER;

    public ConversionService(BinaryNumberType binaryNumberType, String number) {
        this.NUMBER_TYPE = binaryNumberType;
        this.NUMBER      = number;
    }

    public void transform() {
        throwErrorIfNotBinary();

        if (BinaryNumberType.INTEGER == NUMBER_TYPE) {
            convertInteger();

            return;
        }
        convertFractional();
    }

    private void convertInteger() {
        IntegerConvertor integerConvertor = new IntegerConvertor(NUMBER);

        System.out.printf("Your decimal number: %d", integerConvertor.getDecimal());
    }

    private void convertFractional() {
        FractionalConverter fractionalConverter = new FractionalConverter(NUMBER);

        System.out.printf("Your decimal number: %f", fractionalConverter.getDecimal());
    }

    private void throwErrorIfNotBinary() {
        Validation validation = new Validation(NUMBER, NUMBER_TYPE);

        if (!validation.isBinary() || Double.parseDouble(NUMBER) <= 0)
            throw new IllegalArgumentException("❌ This is not a binary number. Binary number must consists of 1 or 0, and be bigger than 0.");
    }
}
