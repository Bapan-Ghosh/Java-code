import java.util.Scanner;

public class LinearSearch{
    static void getData(int a[],int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements :");
        for(int i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
    }

    static boolean lSearch(int a[],int n,int key,int i){
        // for(int i=0 ; i<n ; i++){
        //     if(a[i] == key){
        //         return true;
        //     }
        // }
        // return false;
        if(a[i] == key){
            return true;
        }
        if(i == n)
           return false;
        return lSearch(a,n,key,i+1);
    }

    public static void main(String []args){
        System.out.println("Enter the no. of elements ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        getData(a, n);
        System.out.println("Enter the value to search");
        int key = sc.nextInt();
        if(lSearch(a, n-1, key,0)){
            System.out.println("Found");
        }
        else
          System.out.println("Not found");
    }
}