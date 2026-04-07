import java.util.Base64;

public class Base64Encoding {
    public static void main(String[] args) {
        String sample = "India is a developing country";
        System.out.println("Sample String : \n"+sample);
        String BasicBase64Format = Base64.getEncoder().encodeToString(sample.getBytes());
        System.out.println("Encoded String : \n"+BasicBase64Format);
    }
}
