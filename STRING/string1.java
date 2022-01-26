import java.util.*;
public class string1{
      public static void main(String args[]){
          String name="Bapan";                 //by literal     ->It is from string pool area
          String newname=new String("Bapan");  //by new object  ->It is from heap area
          String name1="Bapan";
          String name3="";                      //empty string

          System.out.println(name==newname);  // This will print false because both are not equal
          System.out.println(name==name1);    // True,both value are sm as well as from string pool
          System.out.println(name.charAt(1));   // this will print the value at index 1
          System.out.println("Substr"+name.substring(0,5));  //It will print from index 0 to 4(5-1)
          System.out.println("Length = "+name.length());  //It will return the length of the string
          System.out.println(name.contains("Ba"));   /*If Ba is present in the string then output
                                                        will be true*/  
          System.out.println(name.equals(newname));  // It is for chacking values of two string
          System.out.println(name3.isEmpty()); //It will print true because the name3 string is empty
          System.out.println(name.concat(" Ghosh")); // concatenation of two strings
          System.out.println("/////////////////////////////////////////////////////////////////");
          String cars="TATA,Range Rover,lamborgini,mahindra,jaguar,OLA,simple energy";
          //String allcars[]=cars.split(",");  
          for(String car: cars.split(",")){      //for each loop
              System.out.println(car);
          }
         ///////////////////////////
         System.out.println("Index of char O : "+cars.indexOf('O'));
         System.out.println("Lower : "+cars.toLowerCase());
         System.out.println("Upper : "+cars.toUpperCase());
         String big="                             Bapan             Ghosh        1                   ";
         System.out.println(big.trim());      //for removing space string variable.trim()
         System.out.println("///////////////////////*********///////////////////////");
         String str[] = {"Bapan","Sourav","Kunal","Antarip","Matin","Nayan"};
         Arrays.sort(str);
         for(String s:str)
         {
             System.out.println(s);
         }
      }
}