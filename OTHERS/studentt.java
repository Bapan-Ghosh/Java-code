class student{
    String name;
    int   roll;
    student(String n,int r){
        name=n;
        roll=r;
    }
    void show(){
        System.out.println("name : "+name+"\tname : "+roll);
    }
}

public class studentt{
public static void main(String args[]){
        student obj=new student("Bapan",10);
        obj.show();
    }
}    