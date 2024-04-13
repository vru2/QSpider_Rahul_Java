package Advance_Java;

import java.sql.SQLOutput;

public class array {
    public static void main(String[] args) {
        double []a = new double[4];
        a[0]=90.45;
        a[1]=89.90;
        a[2]=78.65;
        a[3]=81.35;

        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

        // Reverse the String
        String []s = {"Apple","Mangoes","Watermelon","banana"};

        for(int j=s.length-1; j>=0; j--){
            System.out.println(s[j]);
        }
        for (double i:a){
            System.out.println(i);
        }
    }
}
