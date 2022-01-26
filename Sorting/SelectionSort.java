import java.util.Scanner;

public class SelectionSort {
    static void getData(int a[],int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements ");
        for(int i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
    }

    static void print(int a[], int n){
        for(int i=0 ; i<n ; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void selectionSort(int a[], int n){
        for(int i=0 ; i<n-1 ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String []args){
        int n;
        System.out.println("Enter the number of array elements :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        getData(a,n);
        System.out.println("Elements before sorting :");
        print(a,n);

        System.out.println("Elements after sorting :");
        selectionSort(a,n);
        print(a,n);
    }
}
