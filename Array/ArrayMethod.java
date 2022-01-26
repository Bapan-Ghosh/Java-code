import java.util.*;
public class ArrayMethod{
    public static void main(String args[])
    {
        int a[] = {10,50,88,11,7};
        System.out.println("Elements before sorting");
        for(int e : a){
            System.out.print(e+" ");
        }
        System.out.println();
        Arrays.sort(a);
        System.out.println("Elements After sorting");
        for(int e : a){
            System.out.print(e+" ");
        }
        System.out.println("Second /////////////////*******************");
        int al[] = {10,80,44};
        int bl[]  = {10,80,44};
        System.out.println(Arrays.equals(al, bl));
    }
} 