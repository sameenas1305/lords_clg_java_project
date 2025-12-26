package org.example.module_5.list.linkedlist.questions;

import java.util.Arrays;
import java.util.LinkedList;

public class question4 {
    public static void main(String[] args) {
        LinkedList<String> input = new LinkedList<>(Arrays.asList("r","a","d","a","r"));
        System.out.println("the input is :\n" +input);
        LinkedList<String> output = new LinkedList<>();
        for (int j = input.size() - 1; j >= 0; j--) {
            output.add(input.get(j));
        }
        System.out.println("The reversed output is : " + output); // Check palindrome
        if (input.equals(output)) {
            System.out.println("It is a palindrome!");
        } else { System.out.println("It is NOT a palindrome!");
        }

    }
}
