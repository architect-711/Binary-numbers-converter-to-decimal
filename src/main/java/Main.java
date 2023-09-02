public class Main {

    public static void main(String[] args) {
        float binaryNumber = 101F;

        BinaryConverterImpl binaryConverter = new BinaryConverterImpl(binaryNumber);
        binaryConverter.convertToDecimal();
    }

}
