package conversion;

public class Convertor {

    public Convertor() {}

    private static int formulaForInteger(int[] digits) {
        int decimal = 0;

        for (int index = 0; index < digits.length; index++)
            decimal += (int) (digits[index] * Math.pow(2, index));

        return decimal;
    }
}
