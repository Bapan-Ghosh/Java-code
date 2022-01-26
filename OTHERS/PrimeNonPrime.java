import java.util.Scanner;

//Prime number :
public class PrimeNonPrime{
      public static void main(String args[]){
          Scanner obj=new Scanner(System.in);
          System.out.print("Enter the number to check whether it is prime number or not : ");
          int n=obj.nextInt();
          if(n==2)
             System.out.println("Given number "+n+" is prime");
          else   
           if(n>2){
                 int p=1;
             for(int i=2;i<n;i++)
             {
                 if(n%i==0)
                   p=p+1; 
             }
             if(p==1)
               System.out.println("Given number "+n+" is prime");
             else  
               System.out.println("Given number "+n+" is not prime");    
          }
          else
            System.out.println("Enter a valid input :");          
      }
}