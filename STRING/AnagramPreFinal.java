
//check whether two strings are Anagram or not
import java.util.Scanner;

public class AnagramPreFinal { // Time complexity O(n^2)
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String a = obj.nextLine();
        System.out.print("Enter the second string : ");
        String b = obj.nextLine();
        boolean isAnagram = false;

        if (a.length() == b.length()) {
            boolean visited[] = new boolean[b.length()];
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                isAnagram = false;
                for (int j = 0; j < b.length(); j++) {
                    if (b.charAt(j) == c && !visited[j]) {
                        visited[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if (!isAnagram) {
                    break;
                }

            }
            if (isAnagram) // it is same as (isAnagram == true)
                System.out.println("anagram");
            else
                System.out.println("not an anagram");
        } else
            System.out.println("String length is not equal ");
    }
}