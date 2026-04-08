package java8Features;
//It only for Functional interface

public class LambdaExpression {
    public static void main(String[] args) {
        Demo obj = (int a)->System.out.println("hello"+a);

        obj.print(10);
        
    }
}
interface Demo{
    public void print(int a);
}