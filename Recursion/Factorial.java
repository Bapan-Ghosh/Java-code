public class Factorial {
    static int fact(int res, int n){
         if(n == 0 || n == 1){
             return res;
         }
         else
           return fact (res*n, n-1);
    }
    public static void main(String []args){
         int n = 5;
         System.out.println(fact(1 , n));
    }
}
