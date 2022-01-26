/*   * * * * 
     * * *   
     * *     
     *         */
import java.util.Scanner;

public class Pattern3{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int n=obj.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();    
        }
    }
}

/* or
for(i=1;i<=n;i++){
        for(j=n;j>=i;j--){
          System.out.println("*"); */