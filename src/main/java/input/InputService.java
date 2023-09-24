package input;

import conversion.BinaryNumberType;
import input.user_interaction.UserInterviewer;
import input.validation.Validation;

public class InputService {
    private final UserInterviewer userInterviewer = new UserInterviewer();

    private Validation validation;
    private BinaryNumberType numberType;

    public InputService() {}

    public void interrogate() {
        userInterviewer.startInterview();
        userInterviewer.stopInterview();
    }

    public void defineNumberType() {
        if (!isValid()) {
            String exceptionMessage = String.format("Invalid number type or number. Number type %s, number: %s", userInterviewer.getUserNumberType(), userInterviewer.getUserNumber());

            throw new IllegalArgumentException(exceptionMessage);
        }
        numberType = validation.getBinaryNumberType();

    }

    private boolean isValid() {
        validation = new Validation(userInterviewer.getUserNumberType(), userInterviewer.getUserNumber());

        return validation.isValid();
    }

    public BinaryNumberType getBinaryNumberType() {
        return numberType;
    }

    public String getUserNumber() {
        return userInterviewer.getUserNumber();
    }

}
