public class methodOverloading {
    
    // Method 1: add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method 2: add three integers (overloaded)
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method 3: add two doubles (overloaded)
    public double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        methodOverloading obj = new methodOverloading();
        
        System.out.println("Sum of 5 and 10: " + obj.add(5, 10));
        System.out.println("Sum of 5, 10, and 15: " + obj.add(5, 10, 15));
        System.out.println("Sum of 5.5 and 10.5: " + obj.add(5.5, 10.5));
    }
}