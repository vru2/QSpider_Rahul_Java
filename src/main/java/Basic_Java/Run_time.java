package Basic_Java;

public class Run_time extends Run_time_poly {
    void run(){
        System.out.println("Running at 60kmpl");
    }

    public static void main(String[] args) {
        Run_time_poly r = new Run_time();
        r.run();
        r.walk();
    }

}
