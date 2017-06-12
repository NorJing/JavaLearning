package com.dy;

/**
 * Created by dongyan on 11/06/17.
 */
public class PolymorphismDemo extends Animal {
    // age
    private double height;

    public PolymorphismDemo(){

    }

    public PolymorphismDemo(double height, int age){
        this.height = height;
        super.setAge(age);
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public String toString(){
        System.out.println("in polymorphisem!");
        return "Age=" + this.getAge() + " Height=" + this.getHeight();
    }

    public static void main(String avgs[]){
        PolymorphismDemo polymorphismDemo = new PolymorphismDemo(200.6, 6);
//        polymorphismDemo.setHeight(200.6);
//        polymorphismDemo.setAge(6);
        System.out.println(polymorphismDemo.toString());

        // We can use all son class to control father class Animal
        Animal polymorphismDemo1 = new PolymorphismDemo(100.4, 8);
//        polymorphismDemo1.setAge(8);
        System.out.println(polymorphismDemo1.toString());

        Animal polymorphismDemo2 = new PolymorphismDemo();
        polymorphismDemo2.setAge(8);
        System.out.println(polymorphismDemo2.toString());
    }
}
