package Exception_Handling;

public class throws_Excpt {
    void div()
    {
        System.out.println(10/0);
    }

    public static void main(String[] args) throws Exception {
    throws_Excpt e = new throws_Excpt();
    e.div();
    System.out.println("Handle Exception");

    }
}
