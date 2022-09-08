package org.example;

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The value of n : ");
        int sum=0;
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            sum+=i;
        }
        System.out.println("Sum of "+n+" natural number =  "+sum);
    }
}