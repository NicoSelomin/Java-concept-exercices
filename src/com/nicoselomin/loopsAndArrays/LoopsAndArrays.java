package com.nicoselomin.loopsAndArrays;

import java.util.Arrays;

public class LoopsAndArrays {
    static void main(String[] args) {
        /*
        Exercice :  // declare an empty integer array of length = 3
                    // print the contents to the console
        */
        int[] intArray = new int[3];

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index" + i + ": " + intArray[i]);
        }
    }
}
