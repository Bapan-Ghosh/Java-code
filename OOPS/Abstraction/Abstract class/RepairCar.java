public class RepairCar {
    // public static void repairCar(Car car){
    //     System.out.println("Car is repaired");
    // }
    public static void main(String []args){
        Jaguar j = new Jaguar();
        //repairCar(j);
        System.out.println();
        RangeRover R = new RangeRover();
        //repairCar(R);
        j.accelerate();
        j.breaking();
        j.fromJaguar();
        R.accelerate();
        R.breaking();
        // Car c = new Car(); We can't create objcet of a abstract class  
    }
}
