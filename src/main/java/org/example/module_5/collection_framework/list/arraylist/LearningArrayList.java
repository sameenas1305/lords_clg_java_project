package org.example.module_5.collection_framework.list.arraylist;

import java.util.ArrayList;

public class LearningArrayList {
    public static void main(String[] args) {

        // ArrayList of type Integer
        ArrayList<Integer> numbers = new ArrayList<>();

        // ---- 1: add method ----
        numbers.add(1); // add element at 0th index
        numbers.add(2); // add element at 1st index

        // ---- 2: get method ----
        System.out.println("element at 2nd index: " + numbers.get(1)); // prints 2
        numbers.add(20);
        numbers.add(30);

        // ---- 3: add method with index ----
        numbers.add(1, 60); // shifts elements to the right
        System.out.println("element at 1st index: " + numbers.get(1)); // 60
        System.out.println("element at 2nd index: " + numbers.get(2)); // 2

        // ---- 4: set method ----
        numbers.set(1, 100); // replaces element at index 1
        System.out.println("element at 1st index after set: " + numbers.get(1)); // 100

        // ---- 5: remove method ----
        numbers.remove(1); // removes element at index 1

        // ---- 6: size method ----
        int arraySize = numbers.size();
        System.out.println("Size of ArrayList: " + arraySize);

        // --- 7: indexOf method ----
        int indexOf30 = numbers.indexOf(30);
        System.out.println("Index of 30: " + indexOf30);

        // --- 8: lastIndexOf method ----
        numbers.add(30);
        int lastIndexOf30 = numbers.lastIndexOf(30);
        System.out.println("Last Index of 30: " + lastIndexOf30);

        // --- 9: isEmpty ----
        boolean isArrayEmpty = numbers.isEmpty();
        System.out.println("Is ArrayList empty: " + isArrayEmpty);

        // --- 10: contains method ----
        boolean isArrayContains20 = numbers.contains(20);
        System.out.println("Is ArrayList contains 20: " + isArrayContains20);

        // --- 11: clear method ----
        numbers.clear();
        //System.out.println("Size of ArrayList after clear method: " + numbers.size());



        // ArrayList of type String
        ArrayList<String> array = new ArrayList<>();
        array.add("First");
        array.add("Second");
        array.add(null);

        // --- 12: toArray method ----
        String[] myArr = array.toArray(new String[0]);

        // Print elements of the array
        System.out.println("Contents of String array:");
        for (String s : myArr) {
            System.out.println(s);
        }
    }
}
