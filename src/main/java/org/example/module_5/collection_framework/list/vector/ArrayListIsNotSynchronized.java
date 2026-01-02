package org.example.module_5.collection_framework.list.vector;

import java.util.ArrayList;

public class ArrayListIsNotSynchronized {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> arrayList = new ArrayList<>();

        Thread t1 = new Thread(() -> {
            synchronized (arrayList) {
                for (int i = 0; i <= 1000; i++) {
                    arrayList.add(i);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (arrayList) {
                for (int i = 0; i <= 1000; i++) {
                    arrayList.add(i);
                }
            }
        });

        System.out.println("Initial size: " + arrayList.size()); // 0

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final size: " + arrayList.size()); // 2002 (Guaranteed)
    }
}