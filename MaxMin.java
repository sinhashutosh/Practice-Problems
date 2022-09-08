package org.example;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the First number ");
        float a=sc.nextFloat();
        System.out.println("Enter the Second number ");
        float b=sc.nextFloat();
        System.out.println("Enter the Third number ");
        float c=sc.nextFloat();
        float result1;
        float result2;
        float result3;
        float result4;
        result1=a+(b*c);
        result2=c+(a/b);
        result3=(a%b)+c;
        result4=(a*b)+c;
        System.out.println("Result1= "+result1);
        System.out.println("Result2= "+result2);
        System.out.println("Result3= "+result3);
        System.out.println("Result4= "+result4);
       /* if(result1>result2){
            if(result1>result3) {
                if(result1>result4) {
                    System.out.println("max= "+result1);
                } else {
                    System.out.println("max= "+result4);
                }

                } else if(result3>result4) {
                         System.out.println("max= "+result1);
                }else if(result4>result3){
                         System.out.println("max= "+result4);

            }
            }
        }*/
    }
}
