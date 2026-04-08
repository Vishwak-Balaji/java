import java8Features.Demo;

public class AbstractAnonymousInnerClass {
    public static void main(String[] args) {
        Demo obj = new Demo(){
            public void display(){
                System.out.println("hello world");
            }
        };
        obj.display();
    }
}
abstract class Demo{
    public abstract  void display();
}