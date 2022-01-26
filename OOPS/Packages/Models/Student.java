package Models;

public class Student {
      public String car,model;
      public Student(String car)
      {
          this.car = car;
      }    
      public void showData()
      {
          System.out.println(car);
      }
      public Student(String car,String model)
      {
          this.car = car;
          this.model = model;
      }
}
