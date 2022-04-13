package com.ivanxc.netcracker.lab.chapter1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MathUtils {
    public static int normalizeAngle(int angle) {
        if (angle < 0) {
            int mod = angle % 360;
            if (mod < 0) {
                mod += 360;
            }
            return mod;
        } else {
            return angle % 360;
        }
        /*
        Comment out the code above and uncomment the code below
        to normalize the angle using the Math.floorMod method.
         */
//       return Math.floorMod(angle, 360);
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for(int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static int[] randomLotteryCombination() {
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] result = new int[6];
        Random random = new Random();

        for(int i = 1; i <= 49; i++){
            numbers.add(i);
        }

        for(int i = 0; i < 6; i++) {
            int randomIndex = (int)(Math.random() * (49 - i));
            result[i] = numbers.get(randomIndex);
            numbers.remove(randomIndex);
        }

        Arrays.sort(result);
        return result;
    }

    public static boolean isMagicSquare() {
        Scanner scanner = new Scanner(System.in);
        String currentLine = scanner.nextLine();
        int dimension = currentLine.split(" ").length;
        int[] sumOfRows = new int[dimension];
        int[] sumOfColumns = new int[dimension];
        int sumOfDiagonal1 = 0;
        int sumOfDiagonal2 = 0;
        int row = 0;
        while(!currentLine.isEmpty()) {
            String[] currentNums = currentLine.split(" ");
            sumOfDiagonal1 += Integer.parseInt(currentNums[row]);
            sumOfDiagonal2 += Integer.parseInt(currentNums[dimension - 1 - row]);
            for(int i = 0; i < dimension; i++) {
                sumOfColumns[i] += Integer.parseInt(currentNums[i]);
                sumOfRows[row] += Integer.parseInt(currentNums[i]);
            }
            row++;
            currentLine = scanner.nextLine();
        }
        for(int i = 1; i < dimension; i++) {
            if (sumOfColumns[i] != sumOfColumns[0] || sumOfRows[i] != sumOfRows[0]) {
                return false;
            }
        }
        if (sumOfDiagonal1 != sumOfDiagonal2) {
            return false;
        }
        return true;
    }
}
