class Shape{
    String name;
    int corner;

    public void area(){
        System.out.println("this will print area");
    }
}
class Triangle extends Shape{
    public void area(int l,int b){
        System.out.println(l*b);

    }
}



public class inheritance {
    public static void main(String[] args){
        System.out.println("hy");

        Triangle t1=new Triangle();
        t1.name="my name is triangle";
        t1.area();
        t1.area(2,2);



    }
}
