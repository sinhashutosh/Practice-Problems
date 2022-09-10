package org.example;

import java.util.Arrays;

public class DisplayArrayElement {
    public static void main(String[] args) {
        int[] array = {5, 1, 2, 5, 6, 7, 2, 3, 4, 6, 7, 8, 4, 3, 2, 4, 6, 78, 8, 5, 344, 2, 2, 4, 5, 6,};
        System.out.println("Array Element Are....");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        System.out.println("\n Second Way to print array using predefined function..");
        System.out.println(Arrays.toString(array));
    }
}
