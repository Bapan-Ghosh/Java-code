import java.util.Scanner;

public class Pattern1{
     public static void main(String args[]){
         Scanner obj=new Scanner(System.in);
         System.out.print("Enter the value of N :");
         int n=obj.nextInt();
         System.out.print("Enter the value of M :");
         int m=obj.nextInt();
         for(int i=1;i<=n;i++){
             for(int j=1;j<=m;j++){
                 System.out.print("* ");
             }
             System.out.println();
         }
     }
}