/*Write a program to find unique number in an array where all numbers except one, are present twice*/
public class UniqueNumber {

    static int unique(int a[],int len)
    {
        int Xor = 0;
        for(int i=0 ; i<len ; i++)
             Xor ^= a[i];
        return Xor;     
    }

    public static void main(String args[]) {
        int a[] = { 1, 5, 8, 2, 1, 8, 2 };
        int len = a.length;
        int res = unique(a, len);
        System.out.println(res);
    }
}
