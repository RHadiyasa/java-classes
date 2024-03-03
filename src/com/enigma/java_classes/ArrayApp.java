package com.enigma.java_classes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        int[] numbers = {
                1,23,5,6,7,83,5,7,4,35,35,6,73,3,8,546,8,46,4,63,523,532,4
        };



        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int searched1 = Arrays.binarySearch(numbers, 23);
        System.out.println(searched1);
    }
}
