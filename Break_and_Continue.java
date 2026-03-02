import java.util.*;
 public class Break_and_Continue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
