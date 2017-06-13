package com.dy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongyan on 13/06/17.
 */
public class BulbSort {
    public static void main(String args[]){
        // both List and ArrayList work
        ArrayList<Integer> list = new ArrayList<Integer>();
        // List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(8);
        list.add(5);
        list.add(3);
        list.add(8);

        // bulb sort to return a desc list
        for(int i=0; i<list.size() - 1; i++){
            for(int j=1; j<list.size() - i; j++){
                Integer temp;
                // if(list.get(j-1).compareTo(list.get(j)) > 0){
                if(list.get(j-1) > list.get(j)){
                    temp = list.get(j-1);
                    list.set(j-1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for(Integer i : list){
            System.out.println(i);
        }
    }
}
