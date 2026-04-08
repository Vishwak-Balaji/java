package java8Features;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("Iam changed..!");
            }
        };
        obj.show();
    }
}
class A{
    public void show(){
        System.out.println("change me");
    }
}
