package Exception_Handling;

public class except {
    public static void main(String[] args) {
    String fruits[]={"apple","banana","Watermellon","mango","Cherry"};
        try {
            for (int i =0 ; i<=20; i++){
                System.out.println("Fruit Name: "+fruits[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Out of bound");
        }

    }
}
