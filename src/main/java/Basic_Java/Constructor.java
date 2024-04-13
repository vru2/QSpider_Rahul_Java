package Basic_Java;

public class Constructor {
    String name = "Vrushabh";
    int age = 27;

    void walk(){

        System.out.println("I am walking");
    }

    public static void main(String[] args) {
        Constructor a = new Constructor();
        System.out.println(a.name);
        System.out.println(a.age);
        a.walk();
    }
}
