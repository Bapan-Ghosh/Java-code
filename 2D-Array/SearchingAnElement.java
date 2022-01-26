import java.util.Scanner;

public class SearchingAnElement{
    static void getData(int a[][],int n,int m)
    {
        System.out.println("Enter the matrix elements ");
        Scanner obj = new Scanner(System.in);
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                a[i][j] = obj.nextInt();
            }
        }
    }   
        static int mSearch(int a[][],int n,int m,int k)
        {
            int row = 0, column = m-1;
            int record = 0;
            while(row < n && column >=0)
            {
                if(a[row][column] == k)
                {
                     record = 1;
                     break;    
                }
                else
                  if(a[row][column] > k)
                     column--;
                  else
                     row++;   
            }
            return record;            
        }
        static void output(int res)
        {
            if(res == 1)
              System.out.println("Element is found");
            else
              System.out.println("Element does not exist");  
        }
    public static void main(String args[])
    {
        int n,m;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no. of rows ");
        n = obj.nextInt();
        System.out.println("Enter the no. of columns ");
        m = obj.nextInt();
        int a[][] = new int[n][m]; 
        getData(a,n,m);
        int k;
        System.out.println("Enter the value to search ");
        k = obj.nextInt();
        int res= mSearch(a,n,m,k);
        output(res);
    }
}