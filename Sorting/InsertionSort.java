import java.util.Scanner;

public class InsertionSort {
    static void getData(int a[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    static void insSort(int a[], int n) {
        for (int i = 1; i < n; i++) {
            int current = a[i];
            int j = i - 1;
            // while (current < a[j] && j >= 0)
            while (j >= 0 && a[j] > current) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = current;
        }
    }

    static void showData(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of array elements :");
        n = obj.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements : ");
        getData(a, n);
        System.out.println("Elements before sorting :");
        showData(a, n);
        insSort(a, n);
        System.out.println("Elements after sorting :");
        showData(a, n);
    }
}
