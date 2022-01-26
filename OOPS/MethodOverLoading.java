//Method Overloading
public class MethodOverLoading{
    
    static void maxOf(int a,int b)
    {
        int res = (a>b) ? a : b;
        System.out.println("Max of a & b : "+res);
    }
    static int maxOf(int a, int b, int c)
    {
        int res = (a>b & a>c) ? a : (b>c) ? b : c ;
        return res;   
    }
    public static void main(String args[])
    {
       int first = 50;
       int second = 30;
       int third = 90;
       maxOf(first,second);
       int res = maxOf(first,second,third);
       System.out.println("Max of a,b &c : "+res);
    }

}