package java8Features;
public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.print();
        //to create object for B
        A.B obj1 = obj.new B();
        obj1.show();
        //obj for static inner class
        A.C obj2 = new A.C();
        obj2.display();
    }
}
class A{
    int num = 20;

    public void print(){
        System.out.println("hello");
    }
    class B{
        public void show(){
            System.out.println("display..!");
        }
    }
    static class C{
        public void display(){
            System.out.println("show..!");
        }
    }
}