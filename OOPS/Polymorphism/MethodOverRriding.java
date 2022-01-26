import java.util.Scanner;

class Base {
    void print() {
        System.out.println("From base class");
    }
}

class Derived1 extends Base {
    // void print1(){
    // System.out.println("From Derived1 class");
    // }
    void print() {
        System.out.println("From Derived1 class");
    }

}

class Derived2 extends Base {
    void print() {
        System.out.println("From Derived2 class");
    }
}

// Main class
public class MethodOverRriding {
    public static void main(String args[]) {
        
        Derived1 d1 = new Derived1();
        d1.print();
        // If we run this program then we will see that, Base class print will be Overridden 

        Derived2 d2 = new Derived2();
        d2.print();
    }
}