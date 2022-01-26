/*butterFly pattern
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *                                                                          */
import java.util.Scanner;

public class butterFly{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the row number :");
        int n = obj.nextInt();
        for( int i = 1 ; i <= n ; i++ ){
            for( int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for( int j = 1 ; j <= 2*n-2*i ; j++){
                System.out.print(" ");
            }
            for( int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();          
        }
        for( int i = n ; i > 0 ; i-- ){
            for( int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for( int j = 1 ; j <= 2*n-2*i ; j++){
                System.out.print(" ");
            }
            for( int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();          
        }
    }
}