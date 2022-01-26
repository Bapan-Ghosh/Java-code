import java.util.Scanner;

public class PalindromNumber{
    public static void main(String args[]){
           Scanner obj=new Scanner(System.in);
           System.out.println("Enter the int:");
           int n=obj.nextInt();
           int st=n;
           int rev=0;
           while(n!=0){
               rev=rev*10+n%10;
               n=n/10;
           }
           if(rev==st)
              System.out.println("Given number "+st+" is a palindrom number ");
           else
             System.out.println("Given number "+st+" not a palindrom number ");   
    }
}           