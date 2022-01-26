//constructor overloading
class Vehicle{
    int wheels;
    String carName;
    Vehicle(int wheels)
    {
        this.wheels=wheels;
        System.out.println("Wheels "+wheels);
    }
    Vehicle(String carName,int wheels)
    {
       this.carName = carName;
       this.wheels = wheels; 
       System.out.println("carName "+carName);
    }
}

public class ParameterizedConstructor{
      public static void main(String args[])
      {
          Vehicle car = new Vehicle(4);
          Vehicle car1 = new Vehicle("TATA",8);
          System.out.println(car1.wheels);
          Vehicle scooty = new Vehicle(2); 
      }
}