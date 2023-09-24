import conversion.ConversionService;
import input.InputService;
import output.MessageIndicator;

public class BinaryConvertor {
    private static final InputService inputService = new InputService();

    public BinaryConvertor() {}

    public static void run() {
        try {
            inputService.interrogate();
            inputService.defineNumberType();

            convertToBinary();
        } catch (Exception exception) {
            MessageIndicator.log(String.format("❌ [ERROR] type: %s, message: %s", exception.getClass().getSimpleName(), exception.getMessage()));
        }
    }

    private static void convertToBinary() {
        ConversionService conversion = new ConversionService(inputService.getBinaryNumberType(), inputService.getUserNumber());

        conversion.transform();
    }
}
