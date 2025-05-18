
import bank.Account;
import bank.employee;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("i use to write");
    }
    public void c_write(){
        System.out.println(this.color);
    }}
class Student{
        String name;
        int age;
        static String school_name;
    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
//    Student(String n, int a){
//        System.out.println("i am a constructor");
//        this.name=n;
//        this.age=a;


    //COPY CONSTRUCTOR


    Student(){

    }
    Student(Student x){
        this.name=x.name;
        this.age=x.age;

    }

    }




//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "ballpen";
        p1.write();
        System.out.println(p1.color);


        Pen p2 = new Pen();
        p2.color = "red";
        p2.c_write();

        Student.school_name="pak shaheen cambridge school ";
        Student s1 = new Student();//here student() is a special type of function called constructor
        s1.name = "shayan";
        s1.age = 19;
        s1.info();
        System.out.println(s1.school_name);


        Student s2 = new Student(s1);



        bank.Account a1=new bank.Account();
        a1.name ="Abdullah";
        System.out.println(a1.name);


        bank.employee e1=new bank.employee();
        e1.name ="Shayan";
        System.out.println(e1.name);











    }}