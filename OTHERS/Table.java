import java.util.Scanner;
public class Table{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the table no. :");
        int n=obj.nextInt();
        for(int i=1;i<=10;i++)
        {
           int p=n*i;
           System.out.println(n+"*"+i+"="+p);
        }
    }
}