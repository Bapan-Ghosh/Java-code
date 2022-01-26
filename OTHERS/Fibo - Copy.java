import java.util.Scanner;

public class Fibo{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of series:");
        int n=obj.nextInt();
              int fib1=0;
              int fib2=1;
              while(n!=0)
               {
                System.out.print(fib1+"\t");
                System.out.print(fib2+"\t");
                  fib1=fib2;
                  fib2=fib1+fib2;
                  n=n-1;
               } 

    }
}