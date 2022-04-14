package com.ivanxc.netcracker.lab.chapter3;

public class Unemployed implements Measurable {
    private String name;
    private double benefit;

    public Unemployed(String name, double benefit) {
        this.name = name;
        this.benefit = benefit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBenefit() {
        return benefit;
    }

    public void setBenefit(double benefit) {
        this.benefit = benefit;
    }

    @Override
    public double getMeasure() {
        return benefit;
    }
}
