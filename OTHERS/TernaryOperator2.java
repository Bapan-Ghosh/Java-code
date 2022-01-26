public class TernaryOperator2{
    public static void main(String[] args) {
        int a=800,b=900,c=700;
        int res = (a>b && a>c) ? a : (b>c) ? b :c ;
        System.out.println(res);
    }
}