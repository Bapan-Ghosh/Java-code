import java.util.*;

public class MaxSubArrayLength {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the array length : ");
        int n = obj.nextInt();
        System.out.println("Enter the array elements : ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }
        int pd = a[1] - a[0];
        int current = 2;
        int j = 2;
        int mx=2;
        while (j < n) {
            if(pd == a[j] - a[j-1])
            {
                current ++;
            }
            else
            {
                pd = a[j] - a[j-1] ;
                current = 2;
            }
            mx=Math.max(mx,current);
            j++;
        }
        System.out.print(mx+" ");
    }
}