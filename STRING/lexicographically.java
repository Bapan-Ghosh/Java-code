/*Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.*/

import java.util.Scanner;

/*public class lexicographically{
  public static void main(String args[]){
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter first string ");
      String a = obj.nextLine();
      System.out.println("Enter the second string ");
      String b = obj.nextLine();
      if( a.length() == b.length() ){
              if(a.equals(b)){
                  System.out.println("Length and value both are equal ");
              }
              else
                 System.out.println("Lengths are equal but values are different ");
      }
      else
       System.out.println("Lengths are not equal");
  }
}                                                                  */
/* NOTE:: Two strings are lexicographically equal if and only if length of both string are same and 
           contain the same characters at the same positions                        */  
public class lexicographically {
  public static void main(String args[]) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter first string ");
    String a = obj.nextLine();
    System.out.println("Enter the second string ");
    String b = obj.nextLine();
    int result = a.compareTo(b); // compared like a dictionary (word by word)
    if (result < 0) {
      System.out.println("First string is less than the second");
    } else if (result == 0) {
      System.out.println("Two strings are equal ");
    } else {
      System.out.println("Second string is small than first string");
    }
  }
}