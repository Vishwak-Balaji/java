import java.util.Scanner;

public class While{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = sc.nextInt();

        int reverse =0;
        while(i!=0){
            int digit = i%10;
            reverse=reverse*10+digit;
            i=i/10;

        }
        
        System.out.println( "result :"+reverse);
    }
}
