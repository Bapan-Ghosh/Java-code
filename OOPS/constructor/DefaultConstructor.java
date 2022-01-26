//Default Constructor
/* When we don't create any constructor compiler will automatically create a default constructor */
class Vehicle{
    int wheels = 4; // This will call automatically
}

public class DefaultConstructor{
    public static void main(String args[])
    {
       Vehicle obj = new Vehicle();           
       System.out.println("Wheels : "+obj.wheels);  
    }
}