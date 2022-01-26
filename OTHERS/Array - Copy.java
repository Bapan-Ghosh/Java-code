//Array
import java.util.Scanner;
public class Array{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size ");
        int n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements ");
        for(int i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        System.out.print("Output : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        float average;
        float sum=0;
        for(int i=0;i<n;i++){
             sum=a[i]+sum;
        }
        average=sum/a.length;
        System.out.print("avg"+average);
    }
}