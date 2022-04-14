package com.ivanxc.netcracker.lab.chapter3;

public class Runner {

    /*
    Exercise 1:     Measurable.java, Measurer.java, Employee.java
    Exercise 2:     Measurer.java, Unemployed.java
    Exercise 3:     IntSequence.java
    Exercise 5:     IntSequence.java
    */

    public static void main(String[] args) {
//        averageTest();
//        largestTest();
//        intSequenceTest();
//        intSequenceTest();
    }

    public static void averageTest() {
        Employee employee1 = new Employee("Nikolay", 1000);
        Employee employee2 = new Employee("Ivan", 1200);
        Employee employee3 = new Employee("Alex", 1400);
        Employee employee4 = new Employee("John", 1600);
        Measurable[] employees = new Measurable[] {employee1, employee2, employee3, employee4};
        System.out.println(Measurer.average(employees));
    }

    public static void largestTest() {
        Employee employee1 = new Employee("Nikolay", 1000);
        Employee employee2 = new Employee("Ivan", 1200);
        Employee employee3 = new Employee("Alex", 1400);
        Unemployed unemployed1 = new Unemployed("John", 400);
        Unemployed unemployed2 = new Unemployed("Donald", 1000);
        Unemployed unemployed3 = new Unemployed("Mike", 2000);
        Measurable[] employees = new Measurable[] {employee1, employee2, employee3, unemployed1, unemployed2, unemployed3};
        System.out.println(Measurer.largest(employees));
    }

    public static void intSequenceTest() {
        IntSequence intSequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        while(intSequence.hasNext()) {
            System.out.println(intSequence.next());
        }

        System.out.println("==========");

        IntSequence infinitiveSequence = IntSequence.constant(1);
        System.out.println(infinitiveSequence.next());
        System.out.println(infinitiveSequence.next());
        System.out.println(infinitiveSequence.next());
    }
}
