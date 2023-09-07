import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        float binaryNumber = 101F;
        int binary = 1011011;

        BinaryConverterImpl binaryConverter = new BinaryConverterImpl(binary);
        binaryConverter.convert();

        System.out.println(binaryConverter.getDecimal());
    }

}
