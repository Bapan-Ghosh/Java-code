import java.util.Scanner;

//Rat in a Maze
public class RatInAMaze {
    static void getData(int a[][], int row, int column) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    static boolean isSafe(int a[][], int row, int column, int x, int y) {
        if (x < row && y < column && a[x][y] == 1) {
            return true;
        }
        return false;
    }

    static boolean ratinMaze(int a[][], int row, int column, int x, int y, int solArray[][]) {
        if (x == row - 1 && y == column - 1 && a[x][y]==1) {
            solArray[x][y] = 1;
            return true;
        }
        if (isSafe(a, row, column, x, y)) {
            solArray[x][y] = 1;
            if (ratinMaze(a, row, column, x + 1, y, solArray)) {
                return true;
            }
            if (ratinMaze(a, row, column, x, y + 1, solArray)) {
                return true;
            }
            solArray[x][y] = 0; //backtrack
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows ");
        int row = sc.nextInt();
        System.out.println("Enter the no. of columns ");
        int column = sc.nextInt();
        int a[][] = new int[row][column];
        getData(a, row, column);
        int solArray[][] = new int[row][column];
        if (ratinMaze(a, row, column, 0, 0, solArray)) {
            System.out.println("Path ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(solArray[i][j] + " ");
                }
                System.out.println();
            }
        } else
            System.out.println("Unable to find path ");
    }
}