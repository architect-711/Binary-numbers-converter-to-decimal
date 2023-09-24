package conversion;

import conversion.convertors.FractionalConverter;
import conversion.convertors.IntegerConvertor;
import output.MessageIndicator;

public class ConversionService {
    private final BinaryNumberType NUMBER_TYPE;
    private final String NUMBER;

    public ConversionService(BinaryNumberType binaryNumberType, String number) {
        this.NUMBER_TYPE = binaryNumberType;
        this.NUMBER      = number;
    }

    public void transform() {
        if (BinaryNumberType.INTEGER == NUMBER_TYPE) {
            convertInteger();

            return;
        }
        convertFractional();
    }

    private void convertInteger() {
        IntegerConvertor integerConvertor = new IntegerConvertor(NUMBER);
        integerConvertor.convertToDecimal();

        MessageIndicator.log(String.format("Your decimal number: %d", integerConvertor.getDecimal()));
    }

    private void convertFractional() {
        FractionalConverter fractionalConverter = new FractionalConverter(NUMBER);
        fractionalConverter.convertToDecimal();

        MessageIndicator.log(String.format("Your decimal number: %f", fractionalConverter.getDecimal()));
    }
}
