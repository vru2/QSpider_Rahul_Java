package Basic_Java;

public class Constructor1 {
    String name;
    int age;
    int id;
    double salary;

    Constructor1(String name, int id, int age, double salary){
        this.name = name;
        this.id = id;
        this.age =age;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Constructor1 e1 = new Constructor1("Vru", 12, 26,40000);
        System.out.println(e1.name);
        System.out.println(e1.id);
        System.out.println(e1.age);
        System.out.println(e1.salary);
        System.out.println("Name: "+e1.name + " Salary: " +e1.salary +" ID: "+e1.id+ " Age: " +e1.age);
    }
}
