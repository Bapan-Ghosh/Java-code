public class Teacher extends Person {

    public void teach() {
        System.out.println("teacher is teaching");

    }

    // public void walk() {
    //     System.out.println(name + " is from teacher");
    // }

     public void eat() {
         super.eat(); // means it will first print base class eat then derived eat
         System.out.println(name + " is eating from teacher");
     }

}
