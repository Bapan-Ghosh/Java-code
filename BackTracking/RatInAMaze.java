import java.util.Scanner;

public class RatInAMaze{
    static boolean isSol(int a[][], int x, int y,int n){
           if(x<n && y<n && a[x][y] == 1)
                return true;
           return false;     
    }

    static boolean ratinmaze(int a[][], int x, int y, int n, int solArr[][]){
               if(x == n-1 && y == n-1){
                   solArr[x][y] = 1 ;
                   return true;
               }
               if(isSol(a,x,y,n)){
                    solArr[x][y] = 1;
               if(ratinmaze(a, x+1, y, n, solArr))
                    return true;
               if(ratinmaze(a, x, y+1, n, solArr))
                    return true;
               solArr[x][y] = 0;
               return false;     
             }
             return false;             
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[][] = new int[n][n];
        int solArr[][] = new int[n][n];
        
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("::::::::::::::::::::::::::Path ::::::::::::::::");
        if(ratinmaze(a, 0, 0, n, solArr)){
            for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<n ; j++){
                    System.out.print(solArr[i][j]+" ");
                }
                System.out.println();
            }   
        }
    }
}