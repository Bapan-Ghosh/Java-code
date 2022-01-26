//check whether two strings are Anagram or not
import java.util.Scanner;

public class AnagramUsingOneArray {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String a = obj.nextLine();
        System.out.print("Enter the second string : ");
        String b = obj.nextLine();
        int al[] = new int[256];
        boolean isAnagram = true;
        for (char c : a.toCharArray()) { // This is called for each loop
            int index = (int) c;
            al[index]++;
        }
        for (char c : b.toCharArray()) { // This is called for each loop
            int index = (int) c;
            al[index]--;
        }
        for (int i = 0; i < 256; i++) {
            if (al[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println("Anagram ");
        } else
            System.out.println("not an anagram ");
    }
}