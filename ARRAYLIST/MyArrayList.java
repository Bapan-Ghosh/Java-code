import java.util.ArrayList;

public class MyArrayList {
    public static void main(String []args){
        // ArrayList<Integer> fruits = new ArrayList<>();
        // fruits.add(988);
        // fruits.add(166);
        // System.out.println(fruits);
        /*ArrayList<String> bobe = new ArrayList<>();
        bobe.add("BAPAN");
        bobe.add("GHOSH");
        System.out.println(bobe);*/

        Pair<String,Integer> p1 = new Pair("Bapan",1234);
        Pair<String,Boolean> p2 = new Pair("Ghosh",true);
        p1.getDescription();
        p2.getDescription();
    }
}
