package Basic_Java;

public class Wa_MO1 extends Wa_MO{
    void message(){
        System.out.println("Double tick");
    }
    void call(){
        System.out.println("Video Call");
        System.out.println("Demo call");
    }

    public static void main(String[] args) {
        Wa_MO1 mv = new Wa_MO1();
        mv.call();
        mv.message();
    }
}
