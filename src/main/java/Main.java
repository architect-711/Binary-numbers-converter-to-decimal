public class Main {

    public static void main(String[] args) {
        int binaryNumber = 1011101110;
        BinaryConverterImpl binaryConverterImpl = new BinaryConverterImpl(binaryNumber);

        System.out.println(binaryConverterImpl.getConvertedBinaryToDecimal());
    }

}
