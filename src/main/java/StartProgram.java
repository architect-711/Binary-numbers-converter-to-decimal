import conversion.Conversion;
import conversion.NumberType;
import user.UserInteraction;

public class StartProgram {
    private final UserInteraction userInteraction;

    public StartProgram() {
        userInteraction = new UserInteraction();
    }

    public void start() {
        try {
            userInteraction.interview();
            
            reactOnNumberType(userInteraction.getNumberType());

            userInteraction.close();

        } catch (Exception exception) {
            System.out.println("ERROR: class - " + exception.getClass().getSimpleName() + " message - " + exception.getMessage());
        }
    }

    private void reactOnNumberType(NumberType numberType) {
        Conversion conversion = new Conversion(numberType, userInteraction.getNumber());

        conversion.makeFork();
    }
}
