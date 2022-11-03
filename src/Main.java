public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
       fun();
       compare();
    }
    public static void fun(){
        int a,b,c;
        a=12;
        b=15;
        c=a+b;
        System.out.println(c);
        System.out.println("你好");

    }
    public static boolean compare(){
        double a= 12.2;
       if (a>1){
           return true;
       }
       else{
           return false;
       }
    }
}