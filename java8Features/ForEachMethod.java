package java8Features;
import java.util.*;


public class ForEachMethod {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,2,3,4,5,6);
        list.forEach(n->System.out.println(n));
    }
}
