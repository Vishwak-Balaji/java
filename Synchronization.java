public class Synchronization {
    public static void main(String[] args) {
    
        person1 obj1 = new person1();
        person2 obj2 = new person2();
        obj1.start();;
        obj2.start();
    
}
}

class printer{
    public static synchronized  void print(String s){
        for(int i =0 ; i< s.length();i++){
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
class person1 extends Thread{
    public void run(){
        printer.print("hello");
    }
}
 class person2 extends Thread{
    public void run(){
        printer.print("Welcome");
    }
}
