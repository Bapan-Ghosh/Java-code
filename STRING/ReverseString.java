
//String reverse
import java.util.Scanner;

public class ReverseString {
  public static void main(String args[]) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the string :");
    String a = obj.nextLine();
    String arr[] = a.split(" ");
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
  }
}