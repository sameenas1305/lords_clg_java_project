package org.example.module_5.collection_framework.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    ArrayList<Integer> myArr1=new ArrayList<>();
    public static void main(String[] args) {
        ArrayListSorting obj=new ArrayListSorting();
        obj.addElements();

        System.out.println("original array list");
        obj.printArray();

        System.out.println("sorted array list");
        Collections.sort(obj.myArr1);
        obj.printArray();

        System.out.println("sorted array list in reverse");
        Collections.sort(obj.myArr1,Collections.reverseOrder());
        obj.printArray();


    }
    public void addElements(){
        myArr1.add(5);
        myArr1.add(7);
        myArr1.add(1);
        myArr1.add(3);
        myArr1.add(9);

    }
    public void printArray(){
        for(Integer i:myArr1){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
