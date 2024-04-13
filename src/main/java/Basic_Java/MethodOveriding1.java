package Basic_Java;

public class MethodOveriding1 extends MethodOveriding{
    void bike(){
        System.out.println("Modified bike");
    }

    public static void main(String[] args) {
        MethodOveriding1 b = new MethodOveriding1();
        b.bike();
        MethodOveriding a = new MethodOveriding();
        a.bike();
        MethodOveriding c = new MethodOveriding1();
        c.bike();
    }
}
