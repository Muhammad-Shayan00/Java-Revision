
class Students{
    String name;
    int age;

    public void printinfo(String name){
        System.out.println(name);

    }
    public void printinfo(int age){
        System.out.println(age);

    }
    public void printinfo(String name,int age){
        System.out.println(name+" "+age);

    }


}

public class polymorphism {
    public static void main(String[] args) {
        //polymorphis has 2 types
        //copiletime polymorphism and run time polymorphism
        //compile time polymorphis is basically function overloading


        Students s1=new Students();
        s1.name="shayan";
        System.out.println(s1.name);
        s1.printinfo("shayan");
        s1.printinfo(12);
        s1.printinfo("shayan",12);
    }
}
