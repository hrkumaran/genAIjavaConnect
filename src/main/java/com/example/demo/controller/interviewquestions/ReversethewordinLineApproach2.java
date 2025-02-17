package com.example.demo.controller.interviewquestions;
import java.util.Stack;

public class ReversethewordinLineApproach2 {

    public static void main(String[] args) {
        String inputString = "This is line you need to reverse the words fully in reverse order and display the output";

        char [] inputStringArray = inputString.toCharArray();

        int length = inputStringArray.length;
        char [] outputString =new  char[length];
        char [] output =new  char[length];

        for(int i=inputStringArray.length-1,j=0;i>=0 || j<=inputStringArray.length-1;i--,j++ ) {
     //     System.out.println("i="+i+", char= "+inputStringArray[i]);
            if (i == 0) {

                outputString[j] = inputStringArray[i];
            } else if (inputStringArray[i] == ' ') {
                outputString[j] = inputStringArray[i];
            } else {
                outputString[j] = inputStringArray[i];

            }
        }
        for(int i=outputString.length-1,j=0;i>=0 || j<=outputString.length-1;i--,j++ ) {
                output[i] = outputString[i];
        }
        System.out.println(outputString);
        System.out.println(output);
        System.out.println(inputString.length());
        System.out.println(output.length);


    }
}
