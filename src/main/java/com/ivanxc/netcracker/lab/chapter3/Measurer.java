package com.ivanxc.netcracker.lab.chapter3;

public class Measurer {
    public static double average(Measurable[] objects) {
        double sum = 0;

        for (Measurable object : objects) {
            sum += object.getMeasure();
        }
        return sum / objects.length;
    }

    public static String largest(Measurable[] objects) {
        double maxSalary = 0;
        Employee employeeWithLargestSalary = null;

        for(Measurable object : objects) {
            if (object instanceof Employee &&
                Double.compare(((Employee) object).getSalary(), maxSalary) >= 0) {
                employeeWithLargestSalary = (Employee) object;
                maxSalary = employeeWithLargestSalary.getSalary();
            }
        }
        return employeeWithLargestSalary.getName();
    }
}
