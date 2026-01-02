package org.example.module_5.collection_framework.list.linkedlist.questions;

import java.util.Arrays;
import java.util.LinkedList;

public class question1 {
    public static void main(String[] args) {
        LinkedList<Integer> input = new LinkedList<>(Arrays.asList(1,2,1,3,2));
        System.out.println("the input is :\n" +input);
        LinkedList<Integer> output = new LinkedList<>();
        for(Integer i : input){
            if(!output.contains(i)){
                output.add(i);
            }
        }
        System.out.println("the output is :\n" +output);
    }
}
