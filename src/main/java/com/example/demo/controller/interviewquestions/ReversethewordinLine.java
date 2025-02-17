package com.example.demo.controller.interviewquestions;
import java.util.Stack;

public class ReversethewordinLine {

    public static void main(String[] args) {
        String inputString = "This is line you need to reverse the words fully in reverse order and display the output";

        String [] inputStringArray = inputString.split(" ");
        Stack stack = new Stack();
        String outputString="";
        for(String inputStringiternate : inputStringArray ) {
            System.out.print(inputStringiternate + " ");
            stack.push(inputStringiternate);
        }
        for(int i=0;i<inputStringArray.length;i++ ) {
            System.out.println("i="+i);
            outputString = outputString  + " " + stack.pop();
        }
        outputString = outputString.trim();
        System.out.println(outputString);
        System.out.println(inputString.length());
        System.out.println(outputString.length());


    }
}
