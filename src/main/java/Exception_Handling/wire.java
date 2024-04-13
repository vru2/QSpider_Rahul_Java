package Exception_Handling;

public class wire {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            }

            catch(InterruptedException e){
                System.out.println("Thread Exception");
            }
        }
    }
}
