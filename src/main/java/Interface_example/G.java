package Interface_example;

public class G implements E,F{

    public void G_Method(){
        System.out.println("G Method Example");
    }

    @Override
    public void A_Method() {
        System.out.println("A Method Example");
    }

    @Override
    public void B_Method() {
        System.out.println("B Method Example");
    }

    @Override
    public void E_Method() {
        System.out.println("E Method Example");
    }

    @Override
    public void F_Method() {
        System.out.println("F Method Example");
    }


    public static void main(String[] args) {

        E e = new G();
        F f = new G();
        G g = new G();
        e.E_Method();
        e.A_Method();
        e.B_Method();
        f.F_Method();
        g.G_Method();

    }
}
