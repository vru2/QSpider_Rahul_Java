package Basic_Java;

public class Wa_MO2 extends Wa_MO1 {
    void message(){
        System.out.println("Double blue tick");
    }
    void call(){
        System.out.println("Group video call");
    }

    public static void main(String[] args) {
        Wa_MO2 mv =new Wa_MO2();
        mv.message();
        mv.call();
        Wa_MO1 mv1 = new Wa_MO2();
        mv1.call();
    }
}
