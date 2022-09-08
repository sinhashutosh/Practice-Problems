package org.example;

public class StringCompare {
    public static void main(String[] args) {
        String string1 = new String("Ashutosh12");
        String string2 = new String("Singh");
        String string3 = new String("INDIA");
        String string4 = new String("INDIA");
        if(string1.equals(string2)) {
            System.out.println("Both String Are Equal: ");
        }else {
            System.out.println("Both String Are NOT Equal: ");
        }
        if(string3.equals(string4)) {
            System.out.println("Both String Are Equal: ");
        }else {
            System.out.println("Both String Are NOT Equal: ");
        }


        String s1 = "HELLO";
        String s2 = "HELLO";

        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));
    }
}