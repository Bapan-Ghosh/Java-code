//check whether two strings are Anagram or not
import java.util.Scanner;

public class AnagramFirstMethod { // time complexity O(n^2)
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String a =obj.nextLine();
        System.out.print("Enter the second string : ");
        String b =obj.nextLine();
        boolean isAnagram = false;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            for (int j = 0; j < b.length(); j++) {
                if (b.charAt(j) == c){
                    isAnagram = true;
                    break;
                }
            }
            if (!isAnagram)
                break;
        }
        if (isAnagram)
            System.out.println("anagram");       // error of this program aab,abc is not an anaramg
        else
            System.out.println("not an anagram");
    }
}
/*Enter the first string : aab
Enter the second string : abc
output :
anagram              
           This is the error of this program*/