public class LambdaWithReturn {
    public static void main(String[] args) {
        Demo obj = (i,j)->i+j;
        int ans = obj.add(5,4);
        System.out.println(ans);
    }

    //without lambda expression , with inner class.
    /* 
     public static void main(String[] args) {
        Demo obj = new Demo(){
        public int add  (int i , int j){
        return i+j;
        }
        };
       System.out.println( obj.add(2,5));

    }
    */
    
    
    
}
interface Demo{
    public int add(int i , int j);
}
