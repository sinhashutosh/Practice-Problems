package org.example;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("\nEnter the value of n ");
        int n= sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n) {
            sum+=i;
            i++;
        }
        System.out.println("\nSum of Natural number = "+sum);
    }

}
