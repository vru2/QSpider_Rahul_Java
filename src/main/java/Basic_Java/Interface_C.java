package Basic_Java;

public class Interface_C implements Interface_A,Interface_B {
    public void add(){
        System.out.println("Multiple Inheritance");
    }

    public static void main(String[] args) {
        Interface_A a = new Interface_C();
        a.add();
        Interface_B b = new Interface_C();
        b.add();
    }
}
