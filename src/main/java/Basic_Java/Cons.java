package Basic_Java;

public class Cons {
    int mobile;
    String pass;
    String Email;

    int a;
    {
        a=10;  // initializer of non-static variable
    }

    static int b;
    static {
        b=10;  // initializer of static variable
    }
    {
        b=40; // // initializer of static variable
    }
    // Note: Here for the static variable we can initialise with both static and no-static variable
    // While for non-static variable we cannot initialise with both static and no-static variable, only we can use non-static

    Cons(int mobile, String pass){
        this.mobile = mobile;
        this.pass = pass;
    }

    Cons(String Email, String pass){
        this.Email = Email;
        this.pass = pass;
    }

    public static void main(String[] args) {
        Cons F1 = new Cons(123,"qwerty");
        System.out.println(F1);
        Cons F2 = new Cons("abc@gmail.com","qwerty");
        System.out.println(F2);

    }
}
