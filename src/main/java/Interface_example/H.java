package Interface_example;

public class H implements C{

    public void H_Method(){
        System.out.println("H Method Example");
    }
    @Override
    public void A_Method() {
        System.out.println("A Method Example");
    }

    @Override
    public void C_Method() {
        System.out.println("C Method Example");
    }

    public static void main(String[] args) {
        C c = new H();
        H h = new H();
        c.A_Method();
        c.C_Method();
        h.H_Method();
    }
}
