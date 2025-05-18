// abstraction means imagination
//


    abstract class animal{
    String name;
    abstract void walk();
    animal(){
        System.out.println("you are creating a new animal");
    }

}
class horse extends animal{


    public void walk(){
        System.out.println("walk on 4 legs");
    }
}


public class abstraction {
    public static void main(String[] args) {

        horse h1=new horse();
        h1.walk();
    }
}
