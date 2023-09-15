package validation;

import conversion.NumberType;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    private final String number;
    private final NumberType type;

    public Validation(String number, NumberType type) {
        this.number = number;
        this.type = type;
    }

    public boolean isBinary() {
        if (!isValid())
            throw new IllegalArgumentException("Invalid number!");

        for (String letter : number.split("")) {
            if (letter.equals(".") || letter.equals(","))
                continue;

            if (!letter.equals("1") && !letter.equals("0"))
                return false;
        }

        return true;
    }

    private boolean isValid() {
        // integer must not contains comma, fractional must contains one comma or dot
        String regex = NumberType.INTEGER == type ? "^\\d+$" : "^\\d+[.|,]\\d+$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        return pattern.matcher(number).find();
    }

}
