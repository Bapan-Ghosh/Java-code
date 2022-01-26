public class First {
    public static void main(String []args){
        try{
            int a= 5 ;
            int b= 0 ;
            int res = a/b;
            System.out.println(res);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage() +" occured, please check your code");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index should be in the range of 0 to size of array");
        }catch(IllegalArgumentException e){
            System.out.println("Check your casting carefully");
        }finally{
            System.out.println("Sorry for the inconvenience");
        }
    }
}
