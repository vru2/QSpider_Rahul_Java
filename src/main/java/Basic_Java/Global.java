package Basic_Java;

public class Global {
    static int a= 10;

    public static void main(String[] args) {
        add();
        System.out.println(a);

    }
    public static void add(){
        a=a+10;
        System.out.println(a);
    }

}
