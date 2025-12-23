package org.example.module_5.list.arraylist.questions;

import java.util.ArrayList;

public class question4 {
    public static void main(String args[]){
        ArrayList<String> input=new ArrayList<>();
        input.add("apple");
        input.add("banana");
        input.add("apple");
        input.add("orange");
        input.add("banana");

        ArrayList<String> array1 =new ArrayList<>();
        ArrayList<String> array2 =new ArrayList<>();

        for(int i=0;i<input.size();i++){
            String ele=input.get(i);

            if(array1.contains(ele)==false){
                array1.add(ele);
                array2.add(ele);
            }else{
                int index= array1.indexOf(ele);
                int precount= array2.indexOf(ele);

            }
        }
//        for (String s : input) {
//            System.out.println(s + " -> " + Collections.frequency(input, s));
//        }
    }
}
