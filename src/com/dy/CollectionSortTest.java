package com.dy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by dongyan on 20/06/17.
 */
public class CollectionSortTest {
    public static void main(String args[]) {
        // both List and ArrayList work
        ArrayList<Integer> list = new ArrayList<Integer>();
        // List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(9);
        list.add(5);
        list.add(3);
        list.add(9);

        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println("###");
        Collections.reverse(list);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
