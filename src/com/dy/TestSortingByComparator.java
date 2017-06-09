package com.dy;

/**
 * Created by dongyan on 09/06/17.
 */
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSortingByComparator {
    public static void main(String[] args) {

        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer.toString());
        }

        //sort by age
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("After Sort by age");
        for(Developer developer : listDevs){
            System.out.println(developer.toString());
        }

    }

    private static List<Developer> getDevelopers() {
        // usually we use private final static to provide constants
        // public: be able to access out of class
        // private: not be able to access out of class. But it
        // is able to access within the class
        // for example
        // private final static String JDBC_URL = "jdbc:mysql://localhost/shopdb";
        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));

        return result;
    }
}
