//All types of user input
import java.util.*;
//import java.util.Scanner;

public class AllTypesOfUserInput{             //AllTypesOfUserInput This is called camel case
    public static void main(String args[]){    
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Int");   // means we are calling static member of that class
        int i=sc.nextInt();                       //here System-> is a class
        System.out.println("Enter the Float");
        float f=sc.nextFloat();
        System.out.println("Enter the Double");
        double d=sc.nextDouble();
        System.out.println("Enter the string");
        sc.nextLine();
        String str=sc.nextLine();
        System.out.println("Enter the character");
        char ch=sc.nextLine().charAt(1); //This will show output only the first character if charAt(0)

        System.out.println("Int :"+i);
        System.out.println("float :"+f);
        System.out.println("double :"+d);
        System.out.println("string :"+str);
        System.out.println("char : "+ch);
    }
}