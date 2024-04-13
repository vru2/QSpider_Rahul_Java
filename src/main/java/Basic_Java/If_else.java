package Basic_Java;

public class If_else {
    public static void main(String[] args) {

        // sum of 3 numbers, if the that number not equal to 0

        int a = 0;
        int b= 3;
        int c= 5;
        if (a !=0 && b !=0 && c!=0){
            System.out.println("Sum of 3 numbers is: " +(a+b+c));
        }

        // Smallest of the 2 number
        int d=5;
        int e= 1;
        if (d<e){
            System.out.println("D is smallest: "+d);
        }else{
            System.out.println("e is smallest: "+e);
        }

        // find even or odd number
        int x = 11;
        if (x%2 == 0){
            System.out.println("given number is even");
        }else{
            System.out.println("Given number is odd");
        }


    }
}
