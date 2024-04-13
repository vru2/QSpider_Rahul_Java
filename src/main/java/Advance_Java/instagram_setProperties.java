package Advance_Java;

public class instagram_setProperties {

    public static void main(String[] args) {

        instagram i = new instagram();
        System.out.println(i.getpwd());
        System.out.println(i.getMno());
        System.out.println(i.getemail());

        i.setpwd(54321);
        i.setMno(987654321);
        i.setemail("xyz@gmail.com");

        System.out.println(i.getpwd());
        System.out.println(i.getMno());
        System.out.println(i.getemail());
    }
}
