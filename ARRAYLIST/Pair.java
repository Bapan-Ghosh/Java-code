public class Pair<X,Y> {
       X a;
       Y b;
       public Pair(X a, Y b){
           this.a = a;
           this.b = b;
       } 
       public void getDescription(){
           System.out.println(a+" "+b);
       }
}
