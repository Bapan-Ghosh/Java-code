import java.util.*;
public class BinarySearch {
    static void getData(int a[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    static int bSearch(int a[], int n, int key) {
        int lb=0;
        int ub=n-1;
        int mid;
        while(lb <= ub){
            // mid = (lb+ub)/2;
            mid = lb + (ub-lb)/2;  /* for 2^31-1 */
            if(key < a[mid])
                ub = mid-1;
            else
              if(key > a[mid])
                 lb = mid+1;
            else
              if(a[mid] == key)
                 return mid;      
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Enter the no. of elements ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        getData(a, n);
        System.out.println("Enter the value to search");
        int key = sc.nextInt();
        int res = bSearch(a, n, key);
        if (res == -1) {
            System.out.println("Not found");
        } else
            System.out.println("Found at position :"+(res+1));
    }
}
