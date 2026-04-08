
import java.util.*;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("abeesh","arun","avinash","aravind","amul","vishwak","bhuvana","kavin");
           long result =  name.stream()
                            .filter(n->n.startsWith("a"))
                            .count();

        System.out.println(result);

        List<String>names = name.stream()
                            .filter(n->n.startsWith("a"))
                            .map(String::toUpperCase)
                            .toList();

        System.out.println(names);                    
    }
}
