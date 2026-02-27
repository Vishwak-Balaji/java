import java.util.Scanner;

 public class ifelse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter your gender (M/F): ");
        char gender = sc.next().charAt(0);

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        if (marks >= 50) {
            System.out.println("You passed.");
        } else {
            System.out.println("You failed.");
        }

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        if (age >= 18) {
            if (marks >= 60) {
                System.out.println("Eligible for scholarship.");
            }
        }

        if (age >= 18 && marks >= 60) {
            System.out.println("Eligible for college admission.");
        }

        if (gender == 'F' || gender == 'f') {
            System.out.println("Hello Ma'am!");
        }

        String result = (marks >= 50) ? "Pass" : "Fail";
        System.out.println("Final Result: " + result);

        sc.close();

    }
}
