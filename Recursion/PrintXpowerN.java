public class PrintXpowerN {
       static int print(int x, int y,int n){
             if(n == 0){
                 return 0;
             }
             if(n == 1){
                 return x;
             } 
             return print(y*x,y,n-1);
       }
       public static void main(String []args){
           int x = 4;
           int n = 4;
           System.out.println(print(x,x,n));
       }
}
