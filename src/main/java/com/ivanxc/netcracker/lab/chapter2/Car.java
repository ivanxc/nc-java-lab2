package com.ivanxc.netcracker.lab.chapter2;

/*
Класс Car не должен быть неизменяемым, т.к. у него меняется состояние -
текущая координата и уровень топлива и при изменении состояния это все тот же автомобиль.
*/

public class Car {
    private double initialCoordinate;
    private double currentCoordinate;
    private double fuelLevel;
    private double fuelEfficiency;

    public Car(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public Car(double initialCoordinate, double fuelEfficiency) {
        currentCoordinate = initialCoordinate;
        this.initialCoordinate = initialCoordinate;
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void refuel(double amount) {
        fuelLevel += amount;
    }

    public double getDistanceTraveled() {
        return currentCoordinate - initialCoordinate;
    }

    public void drive(double miles) throws IllegalArgumentException {
        if (Double.compare(fuelEfficiency * fuelLevel, miles) >= 0) {
            currentCoordinate += miles;
            fuelLevel -= miles / fuelEfficiency;
        } else {
            throw new IllegalArgumentException("There is not enough fuel level.");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
            "initialCoordinate=" + initialCoordinate +
            ", currentCoordinate=" + currentCoordinate +
            ", fuelLevel=" + fuelLevel +
            ", fuelEfficiency=" + fuelEfficiency +
            '}';
    }
}
