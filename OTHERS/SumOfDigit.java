import java.util.Scanner;

public class SumOfDigit{
    public static void main(String args[]){
           Scanner obj=new Scanner(System.in);
           System.out.println("Enter the number :");
           int n=obj.nextInt();
           int l=n;
           int sum=0,r;
           while(n!=0){
              r=n%10; 
              sum=sum+r;
              n=n/10;
           }
           System.out.println("Sum of the given "+l+" number is "+sum);
    }
}