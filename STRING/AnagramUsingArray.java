
//check whether two strings are Anagram or not
import java.util.Scanner;

public class AnagramUsingArray {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String a = obj.nextLine();
        System.out.print("Enter the second string : ");
        String b = obj.nextLine();
        int al[] = new int[256];
        int bl[] = new int[256];
        boolean isAnagram = true;
        for (char c : a.toCharArray()) {
            int index = (int) c;
            al[index]++;
        }
        for (char c : b.toCharArray()) {
            int index = (int) c;
            bl[index]++;
        }
        for (int i = 0; i < 256; i++) {
            if (al[i] != bl[i]) {
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