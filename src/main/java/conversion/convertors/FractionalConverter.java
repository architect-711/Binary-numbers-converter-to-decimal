package conversion.convertors;

import conversion.arrayutils.ArrayConvertor;
import conversion.arrayutils.FormulasContainer;

public class FractionalConverter {
    private final String NUMBER;
    private int[] integerPart;
    private int[] fractionalPart;
    private double decimal;

    public FractionalConverter(String NUMBER) {
        this.NUMBER = NUMBER;
    }

    public void convertToDecimal() {
        assignConvertedAndReversedParts();

        decimal += FormulasContainer.getDecimalFromIntegerDigits(integerPart);
        decimal += FormulasContainer.getDecimalFromFractionDigits(fractionalPart);
    }

    private void assignConvertedAndReversedParts() {
        String[] separatedNumber = NUMBER.split("[,|.]");

        integerPart    = ArrayConvertor.getIntegerDigitsArray(separatedNumber[0]);
        fractionalPart = ArrayConvertor.getIntegerDigitsArray(separatedNumber[1]);

        integerPart    = ArrayConvertor.getReversedArray(integerPart);
        fractionalPart = ArrayConvertor.getReversedArray(fractionalPart);
    }

    public double getDecimal() {
        return decimal;
    }
}
