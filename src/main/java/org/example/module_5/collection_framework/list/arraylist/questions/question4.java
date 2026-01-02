package org.example.module_5.collection_framework.list.arraylist.questions;

import java.util.ArrayList;
import java.util.Collections;

public class question4 {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        input.add("apple");
        input.add("banana");
        input.add("apple");
        input.add("orange");
        input.add("banana");

        // Print frequency of each unique element
        ArrayList<String> unique = new ArrayList<>();

        for (String ele : input) {
            if (!unique.contains(ele)) {
                unique.add(ele);
                System.out.println(ele + " -> " + Collections.frequency(input, ele));
            }
        }
    }
}
