package com.dy;

import java.util.Comparator;

/**
 * Created by dongyan on 09/06/17.
 */
public class Animal implements Comparable<Animal>{
    private int age;

    public Animal(){

    }

    public Animal(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        System.out.println("in animal!");
        String s = "Animal age=" + this.age;
        return s;
    }

    @Override
    public int compareTo(Animal other) {
        try{
            return Integer.compare(this.age, other.age);
        }catch (Exception e){
            return -100;
        }
    }
}
