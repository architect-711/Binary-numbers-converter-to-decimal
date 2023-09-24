package conversion.convertors;

import conversion.arrayutils.FormulasContainer;
import conversion.arrayutils.ArrayConvertor;

public class IntegerConvertor {
    private final String NUMBER;
    private int decimal;

    public IntegerConvertor(String NUMBER) {
        this.NUMBER = NUMBER;
    }

    public void convertToDecimal() {
        int[] digits = ArrayConvertor.getIntegerDigitsArray(NUMBER);
        int[] reversedDigits = ArrayConvertor.getReversedArray(digits);

        decimal = FormulasContainer.getDecimalFromIntegerDigits(reversedDigits);
    }

    public int getDecimal() {
        return decimal;
    }
}
