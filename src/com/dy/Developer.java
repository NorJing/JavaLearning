package com.dy;

import java.math.BigDecimal;

/**
 * Created by dongyan on 09/06/17.
 */
public class Developer {
    private String name;
    private BigDecimal salary;
    private int age;

    public Developer(String name, BigDecimal salary, int age){
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public BigDecimal getSalary(){
        return salary;
    }

    public String toString(){
            return "Name=" + name + " salary=" + salary + " age=" + age;
    }
}
