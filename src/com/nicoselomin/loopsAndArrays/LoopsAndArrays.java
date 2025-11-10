package com.nicoselomin.loopsAndArrays;

import java.util.Arrays;

public class LoopsAndArrays {
    static void main(String[] args) {
        /*
        Exercice :  // declare an empty integer array of length = 3
                    // print the contents to the console
        */
        int[] intArray = new int[3];
        int[] numbers = {1,2,3,4,5};
        // declare and initialize a String array which holds the values "a", "b", "c" and "d"
        String[] stringArray = {"a","b","c","d"};
        String[] newArray2 = Arrays.copyOf(stringArray, stringArray.length);


        newArray2[0] = "z";

        // print the array to the console
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Element at index " + i + " : " + stringArray[i]);
        }

        //Print new Array 2
        for (int i = 0; i < newArray2.length; i++) {
            System.out.println("Element at index " + i + " : " + stringArray[i]);
        }
        // fill it with the number `4`
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = 4;
        }

        // reassign the second value in the array to the number `17`
        intArray[1] = 17;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index" + i + ": " + intArray[i]);
        }

        // Create a for loop from 0 to 10 (inclusive)
        for (int i = 0; i <= 10; i++) {
            System.out.println("Value: " + i);
        }

        // Create a for loop from 10 down to 0 (inclusive)
        for (int i = 10; i >= 0; i--) {
            System.out.println("Value: " + i);
        }


        // create an array. Remember to manually set the size
        int[]emptyArray = new int[11];
        // create a for loop which goes from 0 to 10, adding each value to an array
        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = i;
        }
        // print our array
        for (int i = 0; i < emptyArray.length; i++) {
            System.out.println("Element at index "+ i +" : " +emptyArray[i]);
        }

        // Create an array of n numbers
        int[] numbers1 = {10, 5, 7, 3, 8};

        // Create a sum variable
        int sum = 0;

        // Add each item to the sum value using a loop
        for (final int number : numbers1) {
            sum += number;
        }

        // Print the total sum
        System.out.println("Total sum: " + sum);

        // Original array
        String[] words = {"i", "sure", "do", "love", "bees"};

        // Capitalize each word in the array
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // Capitalize the first letter and keep the rest unchanged
            words[i] = Character.toUpperCase(word.charAt(0)) + word.substring(1);
        }

        // Print the contents of the new array
        System.out.println("Capitalized Array Words:");
        for (String word : words) {
            System.out.println(word);
        }

        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0.0;

        // Convert the string to an array of numbers
        String[] numbers2 = input.split(", ");

        // Loop through the array and convert each string to a double and add to the result
        for (String numberStr : numbers2) {
            double num = Double.parseDouble(numberStr);
            result += num;
        }

        System.out.println("Total amount: " + result);
    }
}
