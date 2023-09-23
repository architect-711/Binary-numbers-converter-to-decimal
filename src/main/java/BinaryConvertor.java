import conversion.ConversionService;
import user.UserInteraction;

public class BinaryConvertor {
    private static final UserInteraction userInteraction = new UserInteraction();

    public BinaryConvertor() {}

    public static void run() {
        try {
            userInteraction.interview();
            userInteraction.close();

            convertToBinary();
        } catch (Exception exception) {
            System.out.println("❌ [ERROR]: class - " + exception.getClass().getSimpleName() + " | message - " + exception.getMessage());
        }
    }

    private static void convertToBinary() {
        ConversionService conversion = new ConversionService(userInteraction.getNumberType(), userInteraction.getNumber());

        conversion.transform();
    }
}
