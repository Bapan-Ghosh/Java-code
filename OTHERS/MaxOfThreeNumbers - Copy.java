import java.util.Scanner;

//Maxium of three number using ternary operator
public class MaxOfThreeNumbers{
    public static void main(String args[]){
        System.out.println("Enter three numbers :");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        int max=(a>b) ? (a>c) ? a : c :b;
        System.out.println("Max : "+max);
    }    
}