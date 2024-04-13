package Basic_Java;

public class If_else_If_block {
    public static void main(String[] args) {

        // person is eligible for IAS exam or not (24-34)

        int age = 27;
        if (age<24){
            System.out.println("You are to young for the IAS exam");
        } else if (age>=24 && age<=34) {
            System.out.println("You are eligible for IAS exam");
        }else{
            System.out.println("You cross the age barrier for IAS exam");
        }

        // largest amoung 3 numbers
        int a= 10;
        int b = 19;
        int c= 38;

        if (a>b&&a>c){
            System.out.println("A is largest");
        } else if (b>a&&b>c) {
            System.out.println("B is largest");
        }else{
            System.out.println("C is largest");
        }

        // represent the grade of student based on marks
        int marks= 55;
        if (marks<35){
            System.out.println("Grade is D");
        } else if (marks>=35 && marks<=60) {
            System.out.println("Grade is C");
        } else if (marks>60 && marks<=80) {
            System.out.println("Grade is B");
        }else{
            System.out.println("Grade is A");
        }

        // allocate the location to employee based on gender and age
        // male and age>40- native place
        // male and age < 40 - anywhere
        // female - native place

        String gender = "Male";
        String gender1 = "Female";
        int years = 45;
        if ( years<40){
            System.out.println("Deploy male employee to anywhere");
        } else if (years>=40) {
            System.out.println("Deploy male employee to native place");
        }else{
            System.out.println("gender is female, Deploy to native place ");
        }
    }
}
