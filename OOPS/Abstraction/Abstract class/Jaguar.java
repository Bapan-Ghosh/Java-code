// concrete class
public class Jaguar extends Car {
    @Override
    public void accelerate() {
        System.out.println("Jaguar is accelerating ");
    }
    @Override
    public void breaking() {
        System.out.println("Jaguar is breaking ");
    }
    
    @Override
    public void fromJaguar(){
        super.fromJaguar();
        System.out.println("Not overriden from jaguar");
    }
}
