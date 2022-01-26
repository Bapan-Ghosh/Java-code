import java.util.*;
public class ThreeSumProblem{
       static boolean twoPointerAlgo(int a[],int i,int y,int n,int key){
              int j=n-1;
              while(i<j){
                  if(a[i]+y+a[j] > key){
                      j--;
                  }
                  else
                   if(a[i]+y+a[j] < key){
                       i++;
                   }
                   else
                   {
                       return true;
                   }
              }
              return false;
       }
       static boolean threeSum(int a[],int n,int key){
             Arrays.sort(a);
             for(int i=0 ; i<n ; i++){
                  if(twoPointerAlgo(a,i+1,a[i],n,key)){
                      return true;
                  }
             }
             return false;
       }
       public static void main(String []args){
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter the number of elements : ");
              int n = sc.nextInt();
              System.out.println("Enter the array elements :");
              int arr[] = new int[n];
              for(int i=0 ; i<n ; i++){
                  arr[i] = sc.nextInt(); 
              }
              System.out.println("Enter the key");
              int key = sc.nextInt();
              if(threeSum(arr,n,key)){
                  System.out.println("true");
              }
              else
              {
                  System.out.println("False");
              }
       }
}