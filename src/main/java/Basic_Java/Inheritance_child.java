package Basic_Java;

public class Inheritance_child extends Inheritance_parent {
    static int Wheels = 4;
    static int CC = 10000;
    public static void main(String[] args) {
        System.out.println(Inheritance_child.Wheels);
        System.out.println(Inheritance_child.CC);
        System.out.println(Inheritance_child.Brand);
        System.out.println(Inheritance_child.Fuel);
    }
}
