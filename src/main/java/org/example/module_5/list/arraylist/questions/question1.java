package org.example.module_5.list.arraylist.questions;

import java.util.ArrayList;

public class question1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(10);
        input.add(20);
        input.add(10);
        input.add(30);
        input.add(20);
        ArrayList<Integer> output = new ArrayList<>();
        for (Integer num : input) {
            if (!output.contains(num)) {
                output.add(num);
            }
        }
        System.out.println(output);

        }
}
