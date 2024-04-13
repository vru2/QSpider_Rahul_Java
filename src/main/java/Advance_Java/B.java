package Advance_Java;

public class B {
    public B(char c){
    }
    public static void main(String[] args) {
        B c= new B('A');
        System.out.println(c);
        String s= new String("A");
        System.out.println(s);

        String a= "java";
        String b="Java";
        String d="java";

        System.out.println(a.equals(b));
        System.out.println(a.equals(d));
        System.out.println(a.equalsIgnoreCase(b));
    }
}
