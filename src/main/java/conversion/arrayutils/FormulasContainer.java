package conversion.arrayutils;

public class FormulasContainer {

    public FormulasContainer() {}

    public static int getDecimalFromIntegerDigits(int[] digits) {
        int decimal = 0;

        for (int index = 0; index < digits.length; index++)
            decimal += (int) (digits[index] * Math.pow(2, index));

        return decimal;
    }

    public static double getDecimalFromFractionDigits(int[] fractionDigits) {
        double decimal = 0;

        for (int index = 0; index < fractionDigits.length; index++) {
            int fractionIndex = index + 1;
            double result = 2 / Math.pow(2, fractionIndex) / 2;

            decimal += Float.parseFloat(String.valueOf(result));
        }

        return decimal;
    }
}
