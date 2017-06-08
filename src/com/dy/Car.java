package com.dy;

/**
 * Created by dongyan on 08/06/17.
 */
public class Car extends AbstractVehicle{

    // String fuel; // bensin, gasoil
//    String type; // car, truck,
//    String color;

    // Encapsulation
    // Declare private variable. Provide public setter and getter method to access variable
    private int seats;

    public void setSeats(int seats){
        this.seats = seats;
    }

    public int getSeats(){
        return this.seats;
    }

    public String getFuel(){
        return this.fuel;
    }

    public void setFuel(String fuel){
        this.fuel = fuel;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean hasDiskBrake(){
        System.out.println("I have disk brake");
        return true;
    }

    public int getNumberOfGears(){
        System.out.println("I have 4 gears");
        return 4;
    }

    public static void main(String avgs[]){
        Car newCar = new Car();
        newCar.setFuel("bension");
        System.out.println("new car needs " + newCar.getFuel());
        newCar.hasDiskBrake();
        newCar.getNumberOfGears();
        newCar.setSeats(7);
        System.out.println("seats=" + newCar.getSeats());
    }

}
