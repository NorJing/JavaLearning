package com.dy;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by dongyan on 10/06/17.
 */
public class HashTableDemo {
    public static void main(String[] args) {

        Enumeration<Integer> names;
        int key;

        // Creating a Hashtable
//        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        Hashtable<Integer, String> hashtable1 = new Hashtable<Integer, String>();
        // Adding Key and Value pairs to Hashtable
//        hashtable.put("Key1","Chaitanya");
//        hashtable.put("Key2","Ajeet");
//        hashtable.put("Key3","Peter");
//        hashtable.put("Key4","Ricky");
//        hashtable.put("Key5","Mona");

        hashtable1.put(1, "bob");
        hashtable1.put(2, "susan");
        hashtable1.put(3, "percy");

//        List<'your_type'> tmp = Collections.list('your_hashtable'.keys());
//        Collections.sort(tmp);
//        Iterator<'your_type'> it = tmp.iterator();
//
//        while(it.hasNext()){
//            'your_type' element =it.next();
//            //here you can get ordered things: 'your_hashtable'.get(element);
//        }

        // HashTable provides iterator on key by Enumeration?
        List<Integer> tmp = Collections.list(hashtable1.keys());
        Collections.sort(tmp);
        Iterator<Integer> iterator = tmp.iterator();
        while (iterator.hasNext()){
            key = iterator.next();
            System.out.println("key=" + key + " value=" + hashtable1.get(key));

        }

        // when modify value in iterator, use ConcurrentHashMap?

        // HashMap provides iterator on key Set
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        Map<Integer, String> sortedMap = new TreeMap<Integer, String>(map);
        Set<Integer> set = sortedMap.keySet();
        iterator = set.iterator();
        while (iterator.hasNext()){
            key = iterator.next();
            System.out.println("key=" + key + " value=" + sortedMap.get(key));
        }

        // get a list of hash table keys and values
//        names = hashtable1.keys();
//        while(names.hasMoreElements()) {
//            key = (Integer) names.nextElement();
//            System.out.println("Key: " +key+ " & Value: " + hashtable1.get(key));
//        }
    }
}
