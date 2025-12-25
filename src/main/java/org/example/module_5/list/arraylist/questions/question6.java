package org.example.module_5.list.arraylist.questions;

import java.util.ArrayList;
import java.util.Collections;

public class question6 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        arr2.add(4);

        // Combine both lists
        ArrayList<Integer> combined = new ArrayList<>();
        combined.addAll(arr1);
        combined.addAll(arr2);

        // Print unique elements only
        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer ele : combined) {
            if (!unique.contains(ele)) {
                unique.add(ele);
            }
        }

        // Output
        System.out.println(unique);  // [1, 2, 3, 4, 5]
    }
}
