/* ****
    ***
     **
      *      */
import java.util.Scanner;

public class Pattern5{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1 ; j<=n ; j++){
                if(j >= i){
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
                
        }
    }
}

// logic 2
// for(int j=0;j<=i;j++)
//     System.out.print(" ");
// for(int k=1;k<=n-i;k++){    
//    System.out.print("*");
  // }
// System.out.println();