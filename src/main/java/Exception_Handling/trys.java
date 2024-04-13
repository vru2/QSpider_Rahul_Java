package Exception_Handling;

public class trys {
    public static void main(String[] args) {

        try {
            System.out.println(10/0);
            System.out.println();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array");
        }
        catch (ArithmeticException e){
            //System.out.println(e.getMessage());
            //e.printStackTrace();
            System.out.println("Hi");
        }
        catch(RuntimeException e){
            System.out.println("Run Time");
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}
