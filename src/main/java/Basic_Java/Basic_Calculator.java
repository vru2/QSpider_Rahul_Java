package Basic_Java;

public class Basic_Calculator {

    // Addition
    public static void add(int a, int b){
        int c= a+b;
        System.out.println(c);
    }
    public static void add(int a, int b, int c){
        int d= a+b+c;
        System.out.println(d);
    }
    public static void add(double a, double b){
        double c= a+b;
        System.out.println(c);
    }
    public static void add(double a, int b){
        double c= a+b;
        System.out.println(c);
    }
    public static void add(int a, double b){
        double c= a+b;
        System.out.println(c);
    }

    // subtraction
    public static void sub(int a, int b){
        int c= a-b;
        System.out.println(c);
    }
    public static void sub(int a, int b, int c){
        int d= a-b-c;
        System.out.println(d);
    }
    public static void sub(double a, double b){
        double c= a-b;
        System.out.println(c);
    }
    public static void sub(double a, int b){
        double c= a-b;
        System.out.println(c);
    }
    public static void sub(int a, double b){
        double c= a-b;
        System.out.println(c);
    }

    //Multiplication
    public static void mult(int a, int b){
        int c= a*b;
        System.out.println(c);
    }
    public static void mult(int a, int b, int c){
        int d= a*b*c;
        System.out.println(d);
    }
    public static void mult(double a, double b){
        double c= a*b;
        System.out.println(c);
    }
    public static void mult(double a, int b){
        double c= a*b;
        System.out.println(c);
    }
    public static void mult(int a, double b){
        double c= a*b;
        System.out.println(c);
    }

    // Division
    public static void div(int a, int b){
        int c= a/b;
        System.out.println(c);
    }
    public static void div(int a, int b, int c){
        int d= (a/b)/c;
        System.out.println(d);
    }
    public static void div(double a, double b){
        double c= a/b;
        System.out.println(c);
    }
    public static void div(double a, int b){
        double c= a/b;
        System.out.println(c);
    }
    public static void div(int a, double b){
        double c= a/b;
        System.out.println(c);
    }

    //Modulas
    public static void mod(int a, int b){
        int c= a%b;
        System.out.println(c);
    }
    public static void mod(int a, int b, int c){
        int d= (a%b)%c;
        System.out.println(d);
    }
    public static void mod(double a, double b){
        double c= a%b;
        System.out.println(c);
    }
    public static void mod(double a, int b){
        double c= a%b;
        System.out.println(c);
    }
    public static void mod(int a, double b){
        double c= a%b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        add(4,5);
        add(4.5,7);
        sub(8,3.5);
        sub(9,3,5);
        mult(4,5);
        mult(4.5,6);
        div(6,4);
        div(89,5);
        mod(8,2);
        mod(8.6,3);
    }

}
