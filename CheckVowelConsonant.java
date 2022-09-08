package org.example;

import java.util.Scanner;

public class CheckVowelConsonant {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter ONLY Alphabet Character ");
        char ch=sc.next().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Enter Character  are vowel ");
                break;
            default:
                System.out.println("Enter Character  are Consonant ");
                break;

        }

    }
}
