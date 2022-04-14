package com.ivanxc.netcracker.lab.chapter2;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

    /*
    Exercise 5:     Point.java
    Exercise 9:     Car.java
    Exercise 13:    csvTest();
    */

public class Runner {

    public static void main(String[] args) throws Exception {
//        pointTest();
//        carTest();
//        csvTest();
    }

    public static void pointTest() {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p.getX());
        System.out.println(p.getY());
    }

    public static void carTest() {
        Car car = new Car(10, 2);
        System.out.println(car);
        car.refuel(5);
        System.out.println(car);
        car.drive(5);
        System.out.println(car);
        car.drive(5);
        System.out.println(car);
        try {
            car.drive(1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void csvTest() throws IOException, CsvException {
        CSVReader reader = new CSVReader(
            new FileReader("src/main/resources/my-csv-file.csv"));

        List<String[]> myEntries = reader.readAll();

        for(String[] strings : myEntries) {
            for(String string : strings) {
                System.out.print(string + "\t");
            }
            System.out.println();
        }
    }
}
