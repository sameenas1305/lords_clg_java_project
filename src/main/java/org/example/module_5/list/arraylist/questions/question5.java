package org.example.module_5.list.arraylist.questions;

import java.util.ArrayList;

public class question5 {
     public static void main(String[] args) {
         ArrayList<Integer> input = new ArrayList<>();
         input.add(1);
         input.add(2);
         input.add(3);
         input.add(4);
         input.add(5);
         input.add(6);
         System.out.println(input);

         ArrayList<Integer> output = new ArrayList<>();
         for (int i = 0; i < input.size(); i += 2) {
             output.add(input.get(i));
         }
         System.out.println(output);
     }
}