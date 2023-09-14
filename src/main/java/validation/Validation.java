package validation;

import conversion.NumberType;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    private String number;
    private NumberType type;

    public Validation() {}

    public boolean isBinary() {
        if (!isValid())
            throw new IllegalArgumentException("Invalid number!");

        String[] numberLetters = number.split("");

        System.out.println(Arrays.toString(numberLetters));

        for (String letter : numberLetters) {
            if (letter.equals(".") || letter.equals(","))
                continue;

            if (!letter.equals("1") && !letter.equals("0"))
                return false;
        }

        return true;
    }

    private boolean isValid() {
        // integer must not contains comma, fractional must contains one comma
        String regex = NumberType.INTEGER == type ? "^\\d+$" : "^\\d+[.|,]\\d+$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        return pattern.matcher(number).find();
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setType(NumberType type) {
        this.type = type;
    }

}
