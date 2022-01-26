import java.util.Scanner;

public class StringIndex{
  public static void main(String args[]){
      String n = "Bapan Ghosh";
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the index");
      int in = obj.nextInt();
      System.out.println("character at index "+in+" is  : "+n.charAt(in));
  }
}