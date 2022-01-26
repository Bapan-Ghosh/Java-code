//SimpleInterest
import java.util.Scanner;
public class SimpleInterest{
    public static void main(String args[])
    {
        float PrincipalAmount,interest,duration,total; //instance member variable
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the principalamount : ");
        PrincipalAmount=obj.nextFloat();
        System.out.println("Enter the interest rate : ");

        interest=obj.nextFloat();
        System.out.println("Enter the duration : ");
        duration=obj.nextFloat();

        total=(PrincipalAmount * interest * duration)/100;
        System.out.println("Interset amount  "+total);
    }
}