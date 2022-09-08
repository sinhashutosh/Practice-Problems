package org.example;
import java.util.Scanner;
public class StringCompare {
    public static void main(String[] args) {
        /*String string1 = new String("Ashutosh12");
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
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String s1 = sc.next();
        System.out.println("Enter Second String");
        String s2 = sc.next();
        if (s1.equals(s2)) {
            System.out.println("Both String are Equal ");
        } else {
            System.out.println("Both String are NOT Equal ");
        }
    }
}