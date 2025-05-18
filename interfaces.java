//interfaces are like classes with some properties
//interfaces don't have constructors
//interfaces also don't have non abstract methords


interface animals{
   void walk();

}
interface hy{
   int eye=2;
}
class horses implements animals,hy{
    public void walk(){
        System.out.println("can walk on 4 legs");
    }

}


public class interfaces {
    public static void main(String[] args) {

    }
}
