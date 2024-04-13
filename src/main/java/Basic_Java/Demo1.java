package Basic_Java;

public class Demo1 extends Demo{
    String name="Vru";

    @Override
    void start() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Demo a= new Demo1();
        a.start();

    }
}
