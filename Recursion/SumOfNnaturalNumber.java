public class SumOfNnaturalNumber {
    static int nSum(int n,int i){
          if(n==0){
              return i;
          }
          else
            return nSum(n-1,i+n);
    }
    public static void main(String []args){
           int n = 6;
            System.out.println(nSum(n,0));
    }
}
