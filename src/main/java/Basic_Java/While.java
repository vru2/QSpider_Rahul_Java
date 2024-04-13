package Basic_Java;

public class While {
    public static void main(String[] args) {

        int count = 1;
        while(count<51){
            System.out.println(count);
            count ++;
        }

        // Print even numbers
        System.out.println("Even numbers");
        int i=1;
        int n= 50;
        while(i<=n){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }

        System.out.println("Odd numbers");
        int j=1;
        int m = 50;
        while(j<=m){
            if(j%2!=0){
                System.out.println(j);
            }
            j++;
        }
        System.out.println("Table of 5");
        int k =1;
        int x =10;
        while(k<=x){
            int z= 5*k;
            System.out.println(5+ " * "+ k+ " = "+ z);
            k++;
        }
    }
}
