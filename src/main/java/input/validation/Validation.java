package input.validation;

import conversion.BinaryNumberType;

import java.util.regex.Pattern;

public class Validation {
    private final String USER_NUMBER_TYPE;
    private final String NUMBER;

    private BinaryNumberType binaryNumberType;
    private char type;

    public Validation(String USER_NUMBER_TYPE, String NUMBER) {
        this.USER_NUMBER_TYPE = USER_NUMBER_TYPE;
        this.NUMBER           = NUMBER;
    }

    public boolean isValid() {
        type = Character.toLowerCase(USER_NUMBER_TYPE.charAt(0));

        return isValidNumberType() && isBinary();
    }

    private boolean isValidNumberType() {
        return USER_NUMBER_TYPE.length() == 1 && (type == 'y' || type == 'n');
    }

    private boolean isBinary() {
        if (!isValidNumber())
            throw new IllegalArgumentException("Invalid number! It isn't an integer and fractional.");

        for (String letter : NUMBER.split("")) {
            if (letter.equals("."))
                continue;

            if (!letter.equals("1") && !letter.equals("0"))
                return false;
        }

        return true;
    }

    private boolean isValidNumber() {
        binaryNumberType = type == 'y' ? BinaryNumberType.FRACTIONAL :  BinaryNumberType.INTEGER;

        // integer must not contains comma, fractional must contains one comma or dot
        String regex = BinaryNumberType.INTEGER == binaryNumberType ? "^\\d+$" : "^\\d+[.|,]\\d+$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        return pattern.matcher(NUMBER).find();
    }

    public BinaryNumberType getBinaryNumberType() {
        return binaryNumberType;
    }
}
