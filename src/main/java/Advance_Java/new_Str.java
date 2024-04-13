package Advance_Java;

public class new_Str {


    public static void main(String[] args) {
        String a= "Java";
        a="ABC";
        System.out.println(a);
        String s= "Software Developer";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.startsWith("Soft"));
        System.out.println(s.startsWith("soft"));
        System.out.println(s.endsWith("per"));
        System.out.println(s.contains("r"));
        System.out.println(s.concat(" in testYantra"));
        System.out.println(s.charAt(4));
        System.out.println(s.indexOf('e'));

        System.out.println(s.substring(3));
        System.out.println(s.substring(3,18));
    }
}
