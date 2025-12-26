package org.example.module_5.list.linkedlist.questions;

import org.example.module_5.list.linkedlist.LinkedListSpecificMethods;

import java.util.Arrays;
import java.util.LinkedList;

public class question2 {
    public static void main(String[] args) {
        LinkedList<String> input = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        System.out.println(input);
        LinkedList<String> output = new LinkedList<>();
        for(int j = input.size()-1; j>=0; j--){
            output.add(input.get(j));
        }
        LinkedListSpecificMethods.printLL(input);
        System.out.println(output);
        LinkedListSpecificMethods.printLL(output);
    }
}
