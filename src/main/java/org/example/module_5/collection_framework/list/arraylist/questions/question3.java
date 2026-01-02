package org.example.module_5.collection_framework.list.arraylist.questions;

import java.util.ArrayList;

public class question3 {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        input.add("Java");
        input.add("Spring");
        input.add("SQL");

        System.out.println(input);

        ArrayList<String> output = new ArrayList<>();

        for (int i = input.size() - 1; i >= 0; i--) {
            output.add(input.get(i));
        }

        System.out.println(output); // Output: [SQL, Spring, Java]
    }
}
