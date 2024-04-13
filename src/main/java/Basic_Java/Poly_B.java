package Basic_Java;

public class Poly_B extends Poly_A {
    void display(){
        System.out.println("B class method");
    }

    public static void main(String[] args) {
        Poly_A a = new Poly_B();
        Poly_B b = (Poly_B) a;
        Poly_A c= new Poly_A();
        a.display();
        b.display();
        c.display();
    }
}
