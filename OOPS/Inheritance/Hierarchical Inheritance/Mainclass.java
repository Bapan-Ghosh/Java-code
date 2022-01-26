public class Mainclass {
    public static void main(String args[]) {
        /*
         * method overriding if same method is available in the base class and in the
         * derived class then derived class will be print
         */
        Teacher t = new Teacher();
        t.name = "Anuj kumar sharma";
        System.out.println();
        t.eat();
        t.walk();
        t.teach();

        System.out.println();
        Singer s = new Singer();
        s.name = "Bapan";
        s.sing();
        s.eat();
        s.walk();

        System.out.println("////////////////////////////");

        Teacher te = new Teacher();

        Person p = te;  // A teacher can be  person
        p.name = "Sourav";  //upcasting OR implicit casting
        p.eat();
        p.walk();

        /* Person lll = new Person();
        Teacher ls = lll;
        ls.teach();                    It is not possible it is an error */

        System.out.println("***********************************"); //Downcasting
        Teacher t1 = new Teacher();
        Person p2 = t1;
        Teacher t2 = (Teacher)p2 ;
        t2.teach();  
    }
}
