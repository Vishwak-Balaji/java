import java.util.Base64;

public class Base64Decoding {
    public static void main(String[] args) {
        String encoded = "SW5kaWEgaXMgYSBkZXZlbG9waW5nIGNvdW50cnk";
        System.out.println("Encoded String : \n"+encoded);
        byte[]BasicBase64Decode = Base64.getDecoder().decode(encoded);
        String decode = new String(BasicBase64Decode);
        System.out.println("decoded String : \n"+decode);
    }
}
