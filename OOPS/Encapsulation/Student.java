public class Student {
    private int roll;
    private String name;

    public void get() {
        System.out.println(roll);
        System.out.println(name);
    }

    public void set(int roll, String name)
    {
        this.name= name;
        if(roll > 60)
            this.roll= roll;
    }
}