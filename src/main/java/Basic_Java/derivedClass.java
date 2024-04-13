package Basic_Java;

public class derivedClass extends SuperClass {
    int b=20;
    derivedClass(){
        System.out.println("Sub-class");
        int c=50;
        System.out.println(c);
    }


    public static void main(String[] args) {
        SuperClass d = new derivedClass();
        System.out.println(d.a);

        derivedClass c = (derivedClass) d;
        System.out.println(c.b);
    }
}
