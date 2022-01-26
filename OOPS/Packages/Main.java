import Models.Student;

public class Main {
      public static void main(String args[])
      {
          Student obj = new Student("Jaguar");
          obj.showData();

          System.out.println("***********************************************");
          Student obj1 = new Student("Range Rover","Sports");
          System.out.println(obj1.car);
          System.out.println(obj1.model);
          System.out.println(obj.car);
      }
}
