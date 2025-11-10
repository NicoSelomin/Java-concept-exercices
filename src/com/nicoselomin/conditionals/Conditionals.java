package com.nicoselomin.conditionals;

public class Conditionals {
    // QUESTION 1

    public static void main(String[] args) {
        // create an integer variable
        int number1 = 25;
        // create a second integer variable
        int number2 = 25;
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        if (number1 == number2){
            System.out.println("The two variables are equal.");
        }


        // Question 2

        // create a string variable
        String firstString = "Toto";
        // create a second string variable which has the same value as the first
        String secondString = "Toto";
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        if (firstString == secondString){
            System.out.println("The two variables are equal.");
        }

        // Question 3

        // create a string variable
        String firstStringO = new String("Toto");
        // create a second string variable which has the same value as the first
        String secondStringO = new String("Toto");
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        if (firstStringO.equals(secondStringO)){
            System.out.println("The two variables are equal.");
        }

        // Create a String variable
        String myString = "Hello, World!";

        // Specify the character to check for
        char specifiedCharacter = 'H'; // You can change this character to test different cases

        // Check if myString starts with the specifiedCharacter
        if (myString.charAt(0) == specifiedCharacter) {
            System.out.println("The string starts with the specified character '" + specifiedCharacter + "'.");
        } else {
            System.out.println("The string does not start with the specified character '" + specifiedCharacter + "'.");
        }


        // Create a String variable
        String word = "Hello, World!";

        // Specify the character to check for (convert to lowercase for case-insensitive check)
        char specifiedCharacter = 'o'; // You can change this character to test different cases

        // Convert the specified character to lowercase for case-insensitive check
        char specifiedCharLowercase = Character.toLowerCase(specifiedCharacter);

        // Use a for loop to check if the specified character is present in the word
        boolean characterFound = false;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = Character.toLowerCase(word.charAt(i));
            if (currentChar == specifiedCharLowercase) {
                characterFound = true;
                break; // Exit the loop early as soon as the character is found
            }
        }

        // Check if the character was found and print the result
        if (characterFound) {
            System.out.println("The word contains the specified character '" + specifiedCharacter + "' (case-insensitive).");
        } else {
            System.out.println("The word does not contain the specified character '" + specifiedCharacter + "' (case-insensitive).");
        }
    }
}
