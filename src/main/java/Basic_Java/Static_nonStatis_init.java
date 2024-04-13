package Basic_Java;

public class Static_nonStatis_init {

    static {
        System.out.println("SB1");
    }
    static {
        System.out.println("SB2");
    }

    public static void main(String[] args) {
        System.out.println("Start");
    }
    static {
        System.out.println("SB3");
    }
}
