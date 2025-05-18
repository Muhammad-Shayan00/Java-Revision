



import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void printjava(){
        System.out.println("java");
    }
    public static void name(String name){
        System.out.println("your name is"+ name);
    }
    public static int sum(int a, int b ){

        int sum=a+b;
        return sum;

    }
    public static void main(String[] args) {


        //INTRODUCTION


        System.out.println("hello world");
        int age = 19;
        System.out.println(age);
        String name = "shayan";
        System.out.println(name);


        //DATA TYPES


//        datatypes with there memory
//         bytes = 1 (can store number between -128 to 127)
        //short = 2
        //int = 4 (2,3,43,44,454,444545)
        //long= 8 (494949.449L)
        //float=4 (3.14222244F)
        //double=8
        //char=2 (a,f,v,r)
        //boolean=1 (true,false)

        byte num = 12;
        int numb = 19;
        long phone_no = 2343243234L;
        float pi = 3.142F;
        char letter = 'a';
        boolean is_adult = true;
//non primitve data type


        //STRING


        String fname = "mushtaq";
        System.out.println(fname);
        String name1 = "shayan ";
        String name2 = "Abdullah";
        String name3 = name1 + name2;
        System.out.println(name3);
        System.out.println(name1.charAt(1));
        System.out.println(name1.length());
        String name4 = name1.replace('h', 'e');
        System.out.println(name4);
        String name5 = name1.substring(1, 4);
        System.out.println(name5);


        //ARRAYS


        int marks[] = {20, 4, 68, 8};
        System.out.println(marks[0]);
        System.out.println(marks.length);//no need to mention () in the end in java
        Arrays.sort(marks);              //import array class is nessesary
        System.out.println(marks[0]);

        int fmarks[][] = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(fmarks[0][1]);


        //casting
        //implicit casting: it means that changing the data types from small to large and there is no chance of losing data

        int price = 3;
        double fprice = price;
        System.out.println(fprice);

        //explicit casting: it means that changing data type from large to small datatypes it may cause lose data

        double a = 118.99;
        int b = (int) a;
        System.out.println(b);


        //CONSTANTS


        final float Pi = 3.1428F;//now it cant be changed
        System.out.println(Pi);


        //OPERATORS

        int e = 2;
        int f = 3;
        int sum = e + f;
        int diff = e - f;
        int mul = e * f;
        float div = e / f;
        int mol = e / f;

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mol);
        System.out.println(e++);
        System.out.println(f--);



        //MATHS CLASS


        System.out.println(Math.max(6,7));
        System.out.println(Math.min(60,56));
        System.out.println(Math.random());
        System.out.println((int)Math.random());
        System.out.println((int)(Math.random()*100));




        //TAKING INPUTS



        Scanner sc= new Scanner(System.in);
//        System.out.println("enter your age as integer");
//        int age1= sc.nextInt();
//        System.out.println(age1);
//
//
//        System.out.println("enter your age as float");
//        float age2= sc.nextFloat();
//        System.out.println(age2);


//        System.out.println("enter a line:");
//        String line=sc.nextLine();//for string
//        System.out.println(line);




        //COMPARISION OPERATORS

//        a==b
        //a!=b
        //a>b
        //a<d
        //a<=b
        //a>=b





        //IF ELSE STATEMENT



        Boolean issunup=true;

        if(issunup==true)
            System.out.println("its day time");
        else
            System.out.println("its night");


        int age2=30;

        if(age2>18)
            System.out.println("you can't vote");
        else
            System.out.println("you can vote");



        //LOGICAL OPERATORS


        int g=10;
        int h=20;

        if(g>5 && h>10)
            System.out.println("hy");
        else
            System.out.println("by");

        if(g>30 || h>10)
            System.out.println("hy");
        else
            System.out.println("by");



        Boolean isbaby=true;

        if(!isbaby)
            System.out.println("you are an adult");
        else
            System.out.println("you are a baby");

//        System.out.println("enter your amount: ");
//        int cash=sc.nextInt();
//
//        if(cash<10){
//            System.out.println("you can't buy anything");
//        }
//        else if (cash>10 && cash<50) {
//            System.out.println("you only buy 1 thing");
//
//        }
//        else{
//            System.out.println("you can buy both");
//        }




        //SWITCH STATEMENTS




        int day=2;

        switch(day){

            case 1:
                System.out.println("its monday");
                break;

            case 2:
                System.out.println("its tuesday");
                break;

            default:
                System.out.println("its wed - sat");


        }



        //LOOOOOOOOOOPS



//
//        for(int i=0;i<=100;i++){
//            System.out.println(i);
//        }
//
//        int k=1;
//        while(k<=100){
//            System.out.println(k);
//            k++;
//        }
//        int num3;
//
//        do{
//            System.out.println("enter a number");
//            num3= sc.nextInt();
//            System.out.println("your number is: ");
//            System.out.println(num3);
//        }
//        while (num3>=0);
//
//        System.out.println("THE END");



        //BREAK AND CONTINUE

        int m=0;

        while(true) {
            if (m==3) {
                m=m+1;
                continue;
            }
            System.out.println(m);
            m=m+1;
            if(m>6){
                break;
            }
        }




        //  EXCEPTION HANDLING




        int mar[]={23,54,6,66};
        try{
            System.out.println(mar[10]);
        }
        catch(Exception exception){
            //write things to do after catch
        }
        System.out.println("hy");







        //  FUNCTION & METHORDS




        printjava();
        name(" shayan");
        System.out.println(sum(2,3));



        










    }
    }


