import java.util.Scanner;

public class Anagram1 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first string ");
        String s1 = obj.nextLine();
        System.out.println("Enter the second string ");
        String s2 = obj.nextLine();
        boolean isAnagram = true;
        int al[] = new int[256];
        for (char c : s1.toCharArray()) {
            int index = (int) c;
            al[index]++;
        }
        for (char c : s2.toCharArray()) {
            int index = (int) c;
            al[index]--;
        }
        for(int i = 0; i < 256; i++){
              if(al[i] != 0){
                  isAnagram = false;
                  break;
              }
        }
        if (isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("Not an anagram");

    }
}