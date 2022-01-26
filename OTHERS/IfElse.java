import java.util.Scanner;

public class IfElse{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int marks=obj.nextInt();
        if(marks>=0 && marks<=100)
        {
            if(marks>=90)
               System.out.println("Excelent");
            else if(marks >=70 && marks<=79)
               System.out.println("Good");
            else if(marks>=40 && marks<=69)
               System.out.println("So bad");
            else
               System.out.println("banchod");   
        }
        else
          System.out.println("Enter a valid input ");     
    }
}