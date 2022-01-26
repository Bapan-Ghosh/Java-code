import java.util.*;
public class IntersectionTwoArray {
    static void intersection(int a[], int b[], int n, int m) {
        int i=0,j=0; // I use here two pointer algo
        Arrays.sort(a);
        Arrays.sort(b);
        while(i<n && j<m){
            if(a[i] == b[j]){
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
            else
              if(a[i]>b[j]){
                  j++;
              }
              else
              {
                  i++;
              }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of array elements ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the first array elements ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the no. of array elements ");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("Enter the secnd array elements ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        intersection(a, b, n, m);
    }

}