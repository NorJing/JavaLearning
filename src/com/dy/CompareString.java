package com.dy;

/**
 * Created by dongyan on 20/06/17.
 */
public class CompareString {
    public static void main(String avgs[]){
        String s1 = "2013/01/14 20:45:00";
        String s2 = "2013/01/13 19:45:00";
        if(s1.compareTo(s2) > 0){
            System.out.println("big");
        }
    }

}
