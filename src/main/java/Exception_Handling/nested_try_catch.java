package Exception_Handling;

public class nested_try_catch {
    public static void main(String[] args) {

        int a[] = {10,20,30};

        try {
            try {
                System.out.println(a[5]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                System.out.println("Array Exception");
            }

            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("Arithmetic");
        }

    }
}
