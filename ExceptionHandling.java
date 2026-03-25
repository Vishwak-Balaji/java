public class ExceptionHandling {
   public static void main(String[] args) {
    int i =2; //if i is greater than 0 eg 2 , then out put will be 2,  if it is zero the out put will be "Some thing went wrong..!"
    int j =0 ;
    try {
        j = 18/i;
    } catch (Exception e) {
        System.out.println("Some thing went wrong..!");
    }
    System.out.println(j);
    System.out.println("Hello");
   }
}
