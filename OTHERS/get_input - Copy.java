import java.util.Scanner;

public class get_input{
    public static void main(String arug[]){
        float num1,num2,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number :");
        num1=sc.nextInt();
        System.out.println("Enter Second number :");
        num2=sc.nextInt();
        sc.close();
        sum=num1 + num2;
        System.out.println("The result after addition :"+sum);
    }
}