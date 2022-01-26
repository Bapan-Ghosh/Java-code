import java.util.Scanner;

public class toPointersArray {
    private int a[],n;
    a[] = new int[n];
    
    public void setArr(){
      System.out.println("Enter the no. of array elements ");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();  
      
      for(int i=0 ; i<n ; i++){
          a[i] = sc.nextInt();
      }
    }

    public int getArr(){
        return a;
    }
    
    public boolean findTriplets(){
        for(int i=0 ; i<n-2 ; i++){
            if(twoPointer(a,i+1,-a[i])){
                return true;
            }
        }
        return false;
    }

    public boolean twoPointer(int a[], int i, int x){
          int j = a.length - 1;
          while(i<j){
              if(a[i] + a[j] >x){
                  j--;
              }
              else 
                 if(a[i]+a[j]<x){
                     i++;
                 }
                 else
                   return true;
          }
          return false;
    }
}
