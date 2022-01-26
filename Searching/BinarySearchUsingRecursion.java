import java.util.Scanner;

public class BinarySearchUsingRecursion {
    static void getData(int a[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    static int bSearch(int a[], int lb, int ub, int key) {
        if(lb <= ub){ 
        int mid = lb+(ub-lb)/2;
        if(a[mid] == key)
           return mid;  
        if(key > a[mid])
           return bSearch(a, mid+1, ub, key);
        else
           return bSearch(a, lb, mid-1, key);      
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
        int res = bSearch(a,0, n-1, key);
        if (res == -1) {
            System.out.println("Not found");
        } else
            System.out.println("Found at position :"+(res+1));
    }
}
