public class Throw {
    public static void main(String[] args) {
        int i =20;
        int j =0;
        try {
            j=18/i;
            if(j==0){
                throw new ArithmeticException("i dont want j to be zero");
            }

        } catch (ArithmeticException e) {
            System.out.println("cannot devide by zero"+ e);
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
        System.out.println(j);
        System.out.println("over");
    }
}
