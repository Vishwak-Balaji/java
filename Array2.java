//second largest element
import java.util.*;
public class Array2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        int [] num = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        for(int i : num){
            if(i>largest){
                slargest = largest;
                largest = i;
            }
            else if(i<largest && i>slargest){
                slargest=i;
            }
        }
        System.out.println("the largest element is :"+ largest);
        System.out.println("the second 5largest element is :"+ slargest);
    }
}
