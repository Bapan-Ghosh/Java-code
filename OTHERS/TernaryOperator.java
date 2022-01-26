import java.util.Scanner;
public class TernaryOperator{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int res = (a>b) ? a :b;

        System.out.println("Max no. "+res);
        
    }
}