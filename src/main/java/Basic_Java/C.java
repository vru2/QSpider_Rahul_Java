package Basic_Java;

    public class C extends B{
        int c=30;

        public static void main(String[] args) {
            B a = new C();
            A b = new C();
            C c = (C)a;
            System.out.println(a.b);
            System.out.println(b.a);
            System.out.println(c.c);

        }
    }

