package Basic_Java;

public class Extend_Abstract2 extends Extend_Abstract{
    void sub(){
        System.out.println("Subtracting");
    }
    void add(){
        System.out.println("Adding numbers");
    }

    public static void main(String[] args) {
        Abstract_A a = new Extend_Abstract2();
        Extend_Abstract b= new Extend_Abstract2();
        a.add();
        b.sub();
        a.run();

    }
}
