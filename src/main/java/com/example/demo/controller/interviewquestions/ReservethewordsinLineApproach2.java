package com.example.demo.controller.interviewquestions;

public class ReservethewordsinLineApproach2
{

    public static void main(String[] args) {
        String input = "This is line you need to reverse the words fully in reverse order and display the output";;
        char[] charArray = input.toCharArray();

        // Reverse the entire character array
        reverse(charArray, 0, charArray.length - 1);

        // Reverse each word in the character array
        int start = 0;
        for (int end = 0; end < charArray.length; end++) {
            if (charArray[end] == ' ') {
                reverse(charArray, start, end - 1);
                start = end + 1;
            }
        }

        // Reverse the last word
        reverse(charArray, start, charArray.length - 1);

        // Convert the character array back to a string
        String reversedLine = new String(charArray);
        System.out.println(reversedLine);
    }

    // Helper method to reverse a portion of the character array
    private static void reverse(char[] charArray, int start, int end) {
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
    }
}
