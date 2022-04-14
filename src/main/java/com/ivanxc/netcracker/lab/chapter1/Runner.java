package com.ivanxc.netcracker.lab.chapter1;

import java.util.Arrays;

    /*
    Exercise 2:     MathUtils.normalizeAngle(int angle);
    Exercise 6:     MathUtils.factorial(int n);
    Exercise 8:     StringUtils.nonemptySubstrings(String str);
    Exercise 13:    MathUtils.randomLotteryCombination();
    Exercise 14:    MathUtils.isMagicSquare();
    */

public class Runner {

    public static void main(String[] args) {
//        normalizeAngleTest();
//        factorialTest();
//        nonemptySubstringsTest();
//        randomLotteryCombinationTest();
//        isMagicSquareTest();
    }

    public static void normalizeAngleTest() {
        System.out.println(MathUtils.normalizeAngle(1));
        System.out.println(MathUtils.normalizeAngle(-1));
        System.out.println(MathUtils.normalizeAngle(360));
        System.out.println(MathUtils.normalizeAngle(0));
        System.out.println(MathUtils.normalizeAngle(-360));
        System.out.println(MathUtils.normalizeAngle(-0));
        System.out.println(MathUtils.normalizeAngle(721));
        System.out.println(MathUtils.normalizeAngle(-721));
        System.out.println(MathUtils.normalizeAngle(420));
        System.out.println(MathUtils.normalizeAngle(-420));
        System.out.println(MathUtils.normalizeAngle(910));
        System.out.println(MathUtils.normalizeAngle(-910));
    }

    public static void factorialTest() {
        System.out.println(MathUtils.factorial(0));
        System.out.println(MathUtils.factorial(1));
        System.out.println(MathUtils.factorial(2));
        System.out.println(MathUtils.factorial(3));
        System.out.println(MathUtils.factorial(4));
        System.out.println(MathUtils.factorial(5));
        System.out.println(MathUtils.factorial(10));
        System.out.println(MathUtils.factorial(1000));
    }

    public static void nonemptySubstringsTest() {
        StringUtils.nonemptySubstrings("Hello");
    }

    public static void randomLotteryCombinationTest() {
        System.out.println(Arrays.toString(MathUtils.randomLotteryCombination()));
        System.out.println(Arrays.toString(MathUtils.randomLotteryCombination()));
        System.out.println(Arrays.toString(MathUtils.randomLotteryCombination()));
    }

    public static void isMagicSquareTest() {
        System.out.println(MathUtils.isMagicSquare());
    }
}
