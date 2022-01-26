//Transpose matrix only applicable only in a square matrix

import java.util.Scanner;

public class Transpose{

    public static void main(String[] args) {
        int r, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows ");
        r = sc.nextInt();
        System.out.println("Enter the no. of columns ");
        c = sc.nextInt();
        int a[][] = new int[r][c];
        //input
        System.out.println("Enter the  matrix elements ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        // transpose
        for(int i=0 ; i<r ; i++){
            for(int j=i ; j<c ; j++){
                    int temp = a[i][j];
                    a[i][j] =a[j][i];
                    a[j][i] =temp;
            }
        }
        //after transpose output
        System.out.println("After transposition : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
