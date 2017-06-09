package com.dy;

import java.util.Comparator;

/**
 * Created by dongyan on 09/06/17.
 */
public class CompareDemo {

    public static Comparator<Animal> AnimalAgeComparator = new Comparator<Animal>() {
        @Override
        public int compare(Animal o1, Animal o2) {
            return o1.compareTo(o2);
        }
    };

    public static void main(String avgs[]){
        Animal one = new Animal(10);
        Animal another = new Animal(5);
        System.out.println("animal one compares animal two=" + one.compareTo(another));
        // test null return -100
        // System.out.println("animal two compares animal one=" + another.compareTo(null));
        System.out.println("animal two compares animal one=" + CompareDemo.AnimalAgeComparator.compare(another, one));
    }
}
