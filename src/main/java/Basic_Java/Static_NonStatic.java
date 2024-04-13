package Basic_Java;

public class Static_NonStatic {
    static int age = 27;
    static int phone = 234234;
    String address = "Maharashtra";
    String Name = "Vrushabh";

    static void walk(){
        System.out.println("I am walking");
    }
    static void run(){
        System.out.println("I am running");
    }
    void disp(){
        System.out.println("Displying");
    }
    void add(){
        System.out.println("adding the numbers");
    }

    public static void main(String[] args) {
        System.out.println(Static_NonStatic.age);
        System.out.println(Static_NonStatic.phone);
        Static_NonStatic.walk();
        Static_NonStatic.run();

        Static_NonStatic a = new Static_NonStatic();
        System.out.println(a.address);
        System.out.println(a.Name);
        a.disp();
        a.add();
    }

}
