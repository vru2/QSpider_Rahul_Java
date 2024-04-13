package Exception_Handling;

public class try_catch {

    public static void main(String[] args) {

        System.out.println("Start");
        System.out.println(10/2);
        System.out.println(10/1);

        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        System.out.println(10/5);
        System.out.println("End");
    }
}
