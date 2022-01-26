public class MainClass {
    public static void main(String args[]) {
        AppConfig obj1 = AppConfig.getInstance();
        AppConfig obj2 = AppConfig.getInstance();
        AppConfig obj3 = AppConfig.getInstance();
        //This will create only one object
    }
}
