public class FibonacciSeries {
    static void fibo(int n1, int n2, int n) {
        if (n == 1)
            return;
        else {
            System.out.print(n2+" ");
            fibo(n2, n1 + n2, n - 1);
        }
    }

    public static void main(String []args){
               int n =9;
               System.out.print(0+" ");
               fibo(0,1,n);

       }
}
