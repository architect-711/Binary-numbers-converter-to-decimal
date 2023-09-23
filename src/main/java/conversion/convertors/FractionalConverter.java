package conversion.convertors;

import conversion.arrayutils.ArrayConvertor;
import conversion.arrayutils.FormulasContainer;

import java.util.Arrays;

public class FractionalConverter {
    private String number;
    private int[] integerPart;
    private int[] fractionalPart;
    private double decimal;

    public FractionalConverter(String number) {
        this.number = number;
    }

    public double getDecimal() {
        assignConvertedAndReversedParts();

        decimal += FormulasContainer.getDecimalFromIntegerDigits(integerPart);
        decimal += FormulasContainer.getDecimalFromFractionDigits(fractionalPart);

        return decimal;
    }

    private void assignConvertedAndReversedParts() {
        String[] separatedNumber = number.split("[,|.]");

        integerPart    = ArrayConvertor.getIntegerDigitsArray(separatedNumber[0]);
        fractionalPart = ArrayConvertor.getIntegerDigitsArray(separatedNumber[1]);

        integerPart    = ArrayConvertor.getReversedArray(integerPart);
        fractionalPart = ArrayConvertor.getReversedArray(fractionalPart);
    }
}
