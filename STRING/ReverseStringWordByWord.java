import java.util.Scanner;

public class ReverseStringWordByWord{
    static String rev(String str){
        int i = str.length()-1;
        String ans =""; 
        while(i>=0){
            while(i>=0 && str.charAt(i) ==' ')i--;
            int j = i;
            if(i <0)break;
            while(i>=0 && str.charAt(i) !=' ')i--;

            if(ans.isEmpty()){
                ans = ans.concat(str.substring(i+1,j+1));
            }
            else
            {
                ans = ans.concat(" "+str.substring(i+1,j+1)); 
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String str;
        System.out.println("Enter the string ");
        str = obj.nextLine();
        System.out.println(rev(str));
    }
}