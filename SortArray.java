package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of An Array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the Element of An Array ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter Array Element are ...");
        System.out.println(Arrays.toString(array));
      int temp=0;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {

                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[i + 1] = temp;
                }
            }
        }
       // Arrays.sort(array); we can use Arrays.sort() function to sort array in  ascending order this is available in java
        System.out.println("Sorted Array  ...");
        System.out.println(Arrays.toString(array));
    }
}
