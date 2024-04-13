package Basic_Java;

public class Ploymorphism {
    void disp(){
        System.out.println("M1");
    }
    void disp(int a){
        System.out.println("M2");
    }
    void disp(double a){
        System.out.println("M3");
    }
    void disp(int a, int b){
        System.out.println("M4");
    }

    public static void main(String[] args) {
        Ploymorphism p = new Ploymorphism();
        p.disp('A');
        p.disp('N');
        p.disp('c');
        p.disp('!');

    }
}
