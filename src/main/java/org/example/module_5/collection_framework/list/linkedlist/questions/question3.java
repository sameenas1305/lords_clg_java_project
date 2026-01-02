//package org.example.module_5.list.linkedlist.questions;
//
//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.LinkedList;
//
//public class question3 {
//    public static void main(String[] args) {
//
//        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5)); // expected output = 3
//
//        LinkedList<Integer> ll2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4)); // expected output = 2,3
//        result=getMiddle(ll);
//    }
//
//    public static int[] getMiddle(LinkedList<Integer> ll) {
//        Iterator<Integer> slowitr = ll.iterator();
//        Iterator<Integer> fastitr = ll.iterator();
//
//        Integer middle = null;
//        Integer middleleft=null;
//        while (fastitr.hasNext() &&) {
//            middleleft=middle;
//            middle= slowitr.next();
//
//            fastitr.next();
//            if(fastitr.hasNext()){
//                fastitr.next();
//            }
//        }
//        return new int[]{middleleft,middle};
//    }
//}
