//From Anuj Bhaiya

import java.util.Scanner;

public class QuickSort {
    static void getData(int a[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    static void printData(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void swap(int a[], int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int partition(int a[], int l, int h) {
        int i = l;
        int pivot = a[l];
        int j = h;
        while (i < j) {
            while (a[i] <= pivot && i<h) {
                i++;
            }
            while (a[j] > pivot && j >= l) {
                j--;
            }
            if (i < j) {
                swap(a, i, j);
            }
        }
        swap(a, l, j);
        return j;
    }

    static void quickSort(int a[], int l, int h) {
        if (l < h) {
            int position = partition(a, l, h);
            quickSort(a, l, position - 1);
            quickSort(a, position + 1, h);
        }
    }
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no. of array elements :");
        int n = obj.nextInt();
        int a[] = new int[n];
        getData(a, n);
        System.out.println("Elements before sorting :");
        printData(a, n);
        System.out.println("Elements after sorting :");
        quickSort(a, 0, n - 1);
        printData(a, n);
    }
}