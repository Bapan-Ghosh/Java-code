import java.util.Scanner;

public class AnagramObject {
    void ana(String s1, String s2, int al[]) {
        boolean isAnagram = true;
        for (char c : s1.toCharArray()) {
            int index = (int) c;
            al[index]++;
        }
        for (char c : s2.toCharArray()) {
            int index = (int) c;
            al[index]--;
        }
        for (int i = 0; i < 256; i++) {
            if (al[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("Not an anagram");
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1 = obj.nextLine();
        System.out.println("Enter the first string");
        String s2 = obj.nextLine();
        int al[] = new int[256];
        AnagramObject ob = new AnagramObject();
        ob.ana(s1, s2, al);
    }
}