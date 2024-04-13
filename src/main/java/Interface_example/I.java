package Interface_example;

public class I implements C,D{

    public void I_Method(){
        System.out.println("I Method Example");
    }
    @Override
    public void A_Method() {
        System.out.println("A Method Example");
    }

    @Override
    public void D_Method() {
        System.out.println("D Method Example");
    }

    @Override
    public void C_Method() {
        System.out.println("C Method Example");
    }

    public static void main(String[] args) {
        C c= new I();
        D d = new I();
        I i = new I();
        c.C_Method();
        d.D_Method();
        c.A_Method();
        i.I_Method();

    }


}
