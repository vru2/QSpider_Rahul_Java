package Basic_Java;

public class Prime_number {
    public static void main(String[] args) {
        int n = 8;
        int count = 0;

        for (int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("Prime Number");
        } else if (count ==1) {
            System.out.println("1 is not prime not composite");
        }
        else{
            System.out.println("Not a prime");
        }
    }
}
