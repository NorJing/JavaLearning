package com.dy;

/**
 * Created by dongyan on 12/06/17.
 */
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String args[]) {
//        int count[] = {34,20,10,60,30,22};
//        Set<Integer> set = new HashSet<Integer>();
//        try{
//            for(int i = 0; i < 6; i++){
//                set.add(count[i]);
//            }
//            System.out.println(set);
//
//            TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
//            System.out.println("Sort list=" + sortedSet);
//            int first = (Integer) sortedSet.first();
//            System.out.println("first=" + first);
//            int last = (Integer) sortedSet.last();
//            System.out.println("last=" + last);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        Set<Integer> set = new TreeSet<Integer>();
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(5);
        set.add(1);
        set.add(2);

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            Integer setElement = iterator.next();
            System.out.println(setElement);
//            if(setElement==2) {
//                iterator.remove();
//            }
        }
    }

}
