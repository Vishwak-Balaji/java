public class MultipleCatch {
    public static void main(String[] args) {
        int i =2;
        int j =0;
        int [] arr = new int[5];
        String str = null;
        try {
            j=18/i;
            System.out.println(str.length());
            System.out.println(arr[1]);
            System.out.println(arr[5]);

        } catch (ArithmeticException e) {
            System.out.println("cannot devide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array limit exceeded");
        }
        catch(NullPointerException e){
            System.out.println("issue in the empty string");
        }
        catch(Exception e){
            System.out.println("Something went wrong..");
        }
    }
}
