package Basic_Java;

public class Method_overloading {

    public static void display(){
        System.out.println("M1");
    }
    public static void display(byte a){
        System.out.println("M2");
    }
    public static void display(int a){
        System.out.println("M3");
    }
    public static void display(float a){
        System.out.println("M4");
    }
    public static void display(double a){
        System.out.println("M5");
    }
    public static void display(char a){
        System.out.println("M6");
    }
    public static void display(short a){
        System.out.println("M7");
    }
    public static void display(long a){
        System.out.println("M8");
    }

    public static void main(String[] args) {
        display(10.1f);
        display('A');
        display(1);
        display(1.1);
        display(127);
    }
}
