import conversion.Conversion;
import conversion.NumberType;
import user.UserInteraction;

public class BinaryConvertor {
    private static final UserInteraction userInteraction = new UserInteraction();
    private static NumberType numberType;

    public BinaryConvertor() {}

    public static void run() {
        try {
            userInteraction.interview();

            numberType = userInteraction.getNumberType();
            reactOnNumberType();

            userInteraction.close();
        } catch (Exception exception) {
            System.out.println("[ERROR]: class - " + exception.getClass().getSimpleName() + " | message - " + exception.getMessage());
        }
    }

    private static void reactOnNumberType() {
        Conversion conversion = new Conversion(numberType, userInteraction.getNumber());

        conversion.transform();
    }
}
