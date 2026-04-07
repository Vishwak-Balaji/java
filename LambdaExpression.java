//It only for Functional interface

public class LambdaExpression {
    public static void main(String[] args) {
        Demo obj = ()->System.out.println("hello");

        obj.print();
        
    }
}
interface Demo{
    public void print();
}