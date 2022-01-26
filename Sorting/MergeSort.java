//From Anuj Bhaiya

import java.util.Scanner;

public class MergeSort {
    static void getData(int a[], int n) {
        System.out.println("Enter the array elements : ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    static void showData(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void merge(int a[], int l, int mid, int r) {
        int i = l;
        int j = mid + 1;
        int k = l;
        int b[] = new int[r+1];
        while (i <= mid && j <= r) {
            if (a[i] < a[j]) {
                b[k++] = a[i++];
            } else {
                b[k++] = a[j++];
            }
        }
        if (i > mid) {
            while (j <= r) {
                b[k++] = a[j++];
            }
        } else {
            while (i <= mid) {
                b[k++] = a[i++];
            }
        }

        for (k = l; k <= r; k++) {
            a[k] = b[k];
        }
    }

    static void mSort(int a[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mSort(a, l, mid);
            mSort(a, mid + 1, r);
            merge(a, l, mid, r);
        }
    }

    public static void main(String args[]) {
        int n;
        System.out.println("Enter the no. of array elements : ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        int a[] = new int[n];

        getData(a, n);
        System.out.println("Before sorting elements : ");
        showData(a, n);
        mSort(a, 0, n - 1);

        System.out.println("After sorting : ");
        showData(a, n);
    }
}
