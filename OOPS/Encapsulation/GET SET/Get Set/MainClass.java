import java.util.*;

public class MainClass {
    public static void main(String []args){
        
        toPointersArray p = new toPointersArray();
        p.setArr();
        p.getArr();
        if(p.findTriplets())
           System.out.println("1");
        else
           System.out.println("0");   
    }

}
