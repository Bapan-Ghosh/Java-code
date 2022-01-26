import java.util.Scanner;

public class MaxOfThreeNumber{
    public static void main(String args[])
    {
        System.out.println("Enter three number :");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        if(a>b)
         {
             if(a>c)
               System.out.println("Max no is "+a);
             else
               System.out.println("Max no is "+c);  
         }
         else
           System.out.println("Max no is "+b);
    }
}