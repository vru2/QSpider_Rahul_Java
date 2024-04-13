package Interface_example2;

public class K implements J{
    @Override
    public void A_Method() {
        System.out.println("A Method Example");
    }

    @Override
    public void B_Method() {
        System.out.println("B Method Example");
    }

    @Override
    public void C_Method() {
        System.out.println("C Method Example");
    }

    @Override
    public void D_Method() {
        System.out.println("D Method Example");

    }

    @Override
    public void E_Method() {
        System.out.println("E Method Example");
    }

    @Override
    public void F_Method() {
        System.out.println("F Method Example");
    }

    @Override
    public void G_Method() {
        System.out.println("G Method Example");
    }

    @Override
    public void H_Method() {
        System.out.println("H Method Example");
    }

    @Override
    public void I_Method() {
        System.out.println("I Method Example");
    }

    @Override
    public void J_Method() {
        System.out.println("J Method Example");
    }

    public void K_Method(){
        System.out.println("K Method Example");
    }

    public static void main(String[] args) {
        J j = new K();
        K k = new K();
        j.A_Method();
        j.B_Method();
        j.C_Method();
        j.D_Method();
        j.E_Method();
        j.F_Method();
        j.G_Method();
        j.H_Method();
        j.I_Method();
        k.K_Method();
    }
}
