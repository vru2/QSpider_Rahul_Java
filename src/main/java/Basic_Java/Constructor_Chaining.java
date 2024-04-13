package Basic_Java;

public class Constructor_Chaining {
    Constructor_Chaining(){
        this(10);
        System.out.println("C1");
    }
    Constructor_Chaining(int a){
        this(20.3);
        System.out.println("C2");
    }
    Constructor_Chaining(double a){
        this(20,30);
        System.out.println("C3");
    }
    Constructor_Chaining(int a, int b){
        System.out.println("C4");
    }

    public static void main(String[] args) {

        Constructor_Chaining d = new Constructor_Chaining();
    }
}
