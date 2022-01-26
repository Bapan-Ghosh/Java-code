//java video 36

import java.util.*;

public class HackerRank{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of students :");
        int n = sc.nextInt();
        System.out.println("Enter the rating of the students :");
        int a[] = new int[n];
        int c[] = new int[n];
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            a[i] =sc.nextInt();
        }
        Arrays.fill(c,1);
        for(int i=1 ; i<n ; i++){
            if(a[i]>a[i-1]){
               c[i] =c[i-1] + 1;    
            }
        }
        for(int i=n-2 ; i>=0 ; i--){
             if(a[i] > a[i+1]){
                 c[i] = Math.max(c[i+1] + 1, c[i]);
             }
        }
        for(int i=0; i<n ; i++){
            sum +=c[i]; 
        }
        for(int i=0; i<n ; i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
        System.out.println(sum);
    }
}

//////////////////////////////////////////////////////////////////////////////
// Same answer but different way

// import java.util.Scanner;

// public class Candy{
//        static void candyDistribution(int a[], int n){
//            int b[] = new int[n];
//            for(int i =0 ; i<n ; i++){
//                b[i] = 1;
//            }
//            for(int i=0 ; i<n-1 ; i++){
//                if(a[i+1] > a[i]){
//                    b[i+1] = b[i]+1;
//                }
//            }
//            for(int i = n-1 ; i >= 1 ; i--){
//                if(a[i] < a[i-1]){
//                    b[i-1] = Math.max(b[i-1], b[i]+1) ;
//                }
//            }
//            for(int i=0 ; i<n ; i++){
//                System.out.print(b[i]+" ");
//            }
//        }
       
//        public static void main(String []args){
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter the no. of students");
//             int n = sc.nextInt();
//             System.out.println("Enter the rating of the students");
//             int a[] = new int[n];
//             for(int i=0 ; i<n ; i++){
//                 a[i] = sc.nextInt();
//             }
//             candyDistribution(a,n);
//        }
// }
