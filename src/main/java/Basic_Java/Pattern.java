package Basic_Java;

public class Pattern {
    public static void main(String[] args) {
       /* int n=9;
        for (int i=1; i<=n; i++){
            for (int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
            }
        */

        // For Pyramid, if number of rows is n then number of column should be 2*n-1

        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n*2-1); j++){
                if(i+j>=n+1 && j-i<=n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        int m=5;
        for(int i=m; i>=1;i--){
            for (int j=1; j<=(n*2-1); j++){
                if(i+j>=n+1 && j-i<=n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}