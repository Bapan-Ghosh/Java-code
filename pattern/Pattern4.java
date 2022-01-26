/*  *
   **
  ***   */
import java.util.Scanner;

public class Pattern4{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n; j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
                else System.out.print("*");
            } 
            System.out.println(); 
            }        
        }
 }