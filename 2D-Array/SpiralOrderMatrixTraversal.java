import java.util.Scanner;
//spiral order matrix traversal
public class SpiralOrderMatrixTraversal {
    static void getData(int a[][], int n, int m) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the matrix elements : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = obj.nextInt();
            }
        }
    }

    static void traversal(int a[][], int n, int m) {
        int row_start = 0, row_end = n - 1, col_start = 0, col_end = m - 1;
        while(row_start <= row_end && col_start <= col_end)
        {
            //for first row
            for(int col = col_start ; row_start <= row_end && col_start <= col_end && col <= col_end ; col++)
            {
                System.out.print(a[row_start][col]+" ");
            }
            row_start++;
            //for column end
            for(int row = row_start ; row_start <= row_end && col_start <= col_end && row <= row_end ; row++)
            {
                System.out.print(a[row][col_end]+" ");
            }
            col_end--;
            //for last row
            for(int col = col_end ; row_start <= row_end && col_start <= col_end && col >= col_start ; col--)
            {
                System.out.print(a[row_end][col]+" ");
            }
            row_end--;
            //for first column
            for(int row = row_end ; row_start <= row_end && col_start <= col_end && row >= row_start ; row--)
            {
                System.out.print(a[row][col_start]+" ");
            }
            col_start++;
        }
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the row no.");
        int n = obj.nextInt();
        System.out.println("Enter the column no.");
        int m = obj.nextInt();
        int a[][] = new int[n][m];
        getData(a, n, m);
        traversal(a, n, m);
    }
}