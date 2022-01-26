/*check if triplet which sum to 0 --> is present or not
  For example if n=3 & elements : 3 2 -5 then it will return true
             because 3+2-5 = 0                         */
import java.util.*;

public class twoPointersAlgo {
    static boolean findTriplet(int a[], int n){
           Arrays.sort(a);
           for(int i=0 ; i<n-2 ; i++){
             if(twoSum(a, i+1, -a[i]))
                return true;
           }
           return false;
    }

//      This        is      a        two      pointer      algorithm, 2 pointer algo only works in a sorted array

    static boolean twoSum(int a[], int i, int x) {
        int j = a.length - 1;
        while (i < j) {
            if (a[i] + a[j] > x) {
                j--;
            } else if (a[i] + a[j] < x) {
                i++;
            } else
                if(a[i] + a[j] == x)
                   return true;
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.println("Enter the no. of array elements ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>2){
        System.out.println("Enter the elements ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
            System.out.println(findTriplet(a, n));
      }    
        else
            System.out.println("element Should be greater than 2");    
    }
}