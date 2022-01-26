package Encapsulation;

public class Student {
    private int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 15) {
            System.out.println("You are too old");
        } else
            this.age = age;
    }
}
