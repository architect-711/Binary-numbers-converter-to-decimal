package conversion.convertors;

import conversion.arrayutils.FormulasContainer;
import conversion.arrayutils.ArrayConvertor;

public class IntegerConvertor {
    private String number;

    public IntegerConvertor(String number) {
        this.number = number;
    }

    public int getDecimal() {
        int[] digits = ArrayConvertor.getIntegerDigitsArray(number);
        int[] reversedDigits = ArrayConvertor.getReversedArray(digits);

        return FormulasContainer.getDecimalFromIntegerDigits(reversedDigits);
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
