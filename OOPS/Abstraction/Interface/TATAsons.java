package Interface;

public class TATAsons implements TCS,TATApower {
    public static void main(String []args){
        TATAsons T = new TATAsons();
        T.tcs();
        T.tataPower();
    }
    @Override
    public void tcs(){
        System.out.println("tcs");
    }
    @Override
    public void tataPower(){
         System.out.println("tata power");
    }
}
