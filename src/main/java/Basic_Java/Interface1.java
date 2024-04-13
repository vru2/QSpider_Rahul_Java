package Basic_Java;

public class Interface1 implements Interface{

    @Override
    public void abc() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Interface a = new Interface1();
        a.abc();
        System.out.println(a.a);
    }
}
