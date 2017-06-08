package com.dy;

/**
 * Created by dongyan on 08/06/17.
 */
abstract class AbstractVehicle {
    final int wheels = 4;
    String fuel; // bensin, gasoil
    String type; // car, truck,
    String color;
    abstract boolean hasDiskBrake();
    abstract int getNumberOfGears();
}
