package org.example.module_5.collection_framework.list.arraylist.questions;

import java.util.ArrayList;

public class question2 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(4);
        input.add(9);
        input.add(1);
        input.add(7);
        input.add(9);

        Integer l=Integer.MIN_VALUE;
        Integer sl=Integer.MIN_VALUE;
        for (Integer ele : input) {
            if(ele >l){
                sl=l;
                l= ele;
            } else if (ele >sl && ele != l){
                sl= ele;
            }
        }
        System.out.println(sl);
    }
}
