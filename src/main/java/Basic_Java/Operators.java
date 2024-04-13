package Basic_Java;

public class Operators {
    public static void main(String[] args) {

        // Find area of circle
        int r = 5;
        double area = (Math.PI*r*r);
        System.out.println("Area of circle is: "+area);

        // Perimeter of square
        int l = 10;
        double perimeter = 4*l;
        System.out.println("Perimeter of Square is: " +perimeter);

        // Area of Rectangle
        int b = 5;
        double rectangle = l*b;
        System.out.println("Area of Rectangle is: " +rectangle);

        // Area of square
        double square = l*l;
        System.out.println("Area of Square is: "+square);

        // Number of chocolate
        int m=300;
        int c= 19;
        int nc = m/c;
        System.out.println("Number of chocolate bought is: "+nc);

        // Average of given numbers
        int x=10;
        int y=5;
        int z=30;
        int w=15;
        int u=20;
        double average= (x+y+z+w+u)/5;
        System.out.println("Average of given numbers is: "+average);

    }
}
