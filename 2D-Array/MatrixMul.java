import java.util.Scanner;

public class MatrixMul {
    public static void main(String []args){
        int row,column;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows ");
        row = sc.nextInt();
        System.out.println("Enter the no. of columns ");
        column = sc.nextInt();
        int a[][] = new int[row][column];
        System.out.println("Enter the first matrix elements ");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                a[i][j] =sc.nextInt();
            }
        }
        int b[][] = new int[row][column];
        System.out.println("Enter the Second matrix elements ");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                b[i][j] =sc.nextInt();
            }
        }
        int sum[][] =new int[row][column]; 
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                 sum[i][j]=a[i][0]*b[0][j] + a[i][1]*b[1][j];
            }
        }
        System.out.println("Multiplication :");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
