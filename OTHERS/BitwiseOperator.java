import java.util.Scanner;

public class BitwiseOperator{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter please : ");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int and=a & b;
        int or=a | b;
        int RightFhift=a >> 2; //divided by 2 two times ;if I write a>>1 then divide by 2 one time
        int LeftShift=a << 2;  //multiplied by 2 two times same as right shift
        System.out.println("Bitwise or : "+or);
        System.out.println("Bitwise and : "+and);
        System.out.println("Bitwise Right shift : "+RightFhift);
        System.out.println("Bitwise Left Shift : "+LeftShift);
    }
}