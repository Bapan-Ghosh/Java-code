import java.util.Scanner;

public class prinAstringInReverse {
    static void rev(int idx, String s){
           if(idx == -1){
               return;
           } 
           System.out.print(s.charAt(idx));   
           rev(idx-1,s);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        rev(s.length()-1,s);
    }
}
