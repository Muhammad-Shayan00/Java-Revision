//public = can be acess from any class to any pakage ,main class always be public
//default= can be acess it its own pakage but not in another pakage , by default if anyting don,t have any acess modifier so it is default
//protected= can be acess it its own class and only sub class of other pakage can access it
//private= can be access in its own class,  private can be access by using access getters and setters
//getters and setters = they are the methord which is public to access private things

class people{
    public String name;
    String email;//it is default automatically
    protected String password;
    private String tresure_location;

    //getters
    public String get_tresure_location(){
        return this.tresure_location;
    }
    //setters
    public void set_tresure_location(String x){
       this.tresure_location=x;
    }

}
public class acess_modifier {
    public static void main(String[] args) {
        people p1=new people();
        p1.name="shayan";
        p1.set_tresure_location("hy");
        System.out.println(p1.get_tresure_location());









    }



}
