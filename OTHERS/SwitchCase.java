import java.util.Scanner;

public class SwitchCase{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        while(true){
            System.out.println("Enter\n1: addition\n2: subsraction\n3: multiplication\n4:exit");
            System.out.println("Enter your choice : ");
            int choice=obj.nextInt();
            switch(choice){
                case 1:
                  System.out.println("Enter two number :");
                  int a=obj.nextInt();                      //instance variable
                  int b=obj.nextInt();
                  int res=a+b;
                  System.out.println("addition "+res);
                  break;
                case 2:
                  System.out.println("Enter two number :");
                   a=obj.nextInt();
                   b=obj.nextInt();
                   res=a-b;
                  System.out.println("sub "+res);
                  break;
                case 3:
                  System.out.println("Enter two number :");
                   a=obj.nextInt();
                   b=obj.nextInt();
                   res=a*b;
                  System.out.println("mul :"+res);
                  break;
                case 4 :
                  System.exit(1);
                default :
                  System.out.println("Wrong choice !");                       
            }
        }
    }
}