package Basic_Java;

public class Operators_1 {
    public static void main(String[] args) {

        // largest among the 2 numbers
        int a=10;
        int b= 25;
        if(a>b){
            System.out.println("A is largest");
        }
        else{
            System.out.println("B is largest");
        }

        // Find the Number is even or odd
        int c=21;
        if((c%2) ==0){
            System.out.println("Given number is even");
        }
        else {
            System.out.println("Given number is odd");
        }

        // Check eligibility for voting
        int age = 17;
        if(age>=18){
            System.out.println("You are eligible for voting");
        }
        else{
            System.out.println("You are not eligible for voting");
        }

        // Number is divisible by 5 or not
        int num = 88;
        if (num%5 == 0){
            System.out.println("Given number is divisible by 5");
        }
        else{
            System.out.println("Given number is not divisible by 5");
        }

        // Number divisible by 5 but not by 2 and 3
        int n = 35;
        if((n%5==0)&&(n%3==0)&&(n%2==0)){
            System.out.println("Number is either divisible by 3 or 2 ");
        }
        else{
            System.out.println("Number is not divisible by 3 or 2");
        }
    }
}
