import java.util.Scanner;

class Main {
    private int n;

    public int getInput() {
        return n;
    }

    public void setInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is a Krishnamurti no. or not");
        n = sc.nextInt();
    }

    int factorial(int n) {
        // int fact = 1;
        // while (n != 0) {
        //     fact = fact * n;
        //     n = n - 1;
        // }
        // return fact;

        //////////////////////// recursive solution ////////////////
        if(n == 0)
          return 1;
        else
          return n*factorial(n-1);  
    }

    boolean isKrishnamurti() {
        int sum = 0;
        int r = n;
        while (n != 0) {
            sum = factorial(n % 10) + sum;
            n = n/10;
        }
        if (sum == r)
            return true;
        else
            return false;
    }
}

public class Krishnamurti {
    public static void main(String[] args) {

        Main obj = new Main();

        obj.setInput();
        obj.getInput();
        if (obj.isKrishnamurti())
            System.out.println("Krishnamurthy number");
        else
           System.out.println("Not a Krishnamurthy number");   
    }
}